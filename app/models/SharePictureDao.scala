package models

object SharePictureDao:
  var detail: Seq[SharePicture] = Seq.empty

  def findPictureDetails: List[SharePicture] = detail.toList

  def findEachPicDetails(id:Long): SharePicture = {
    detail.foreach { element => {
        if(id == element.id)
         return element
     }
    }
    return new SharePicture(-1,"","","","",0,null,null)
  }

  def likePicture(id: Long,username:String): SharePicture = {
    //traverses through the list of pictures and matches the selected picture id with id of each picture in the list
    for (element <- detail) {
      if (id == element.id) {
        //If the id matches, it checks if the username already exists in the likedBy array for this picture
        //If it's present meaning the user has already liked the picture, the number of likes will be decremented
        //This ensures that the same user can't like a picture twice
        if(element.likedBy.contains(username)){
          element.likedBy = element.likedBy.filterNot(_ == username)
          element.likes = element.likes - 1
        }
        //If the username is not present in the likedBy array for that picture, the number of likes will be incremented
        else{
          element.likes = element.likes + 1
          element.likedBy = element.likedBy :+ username
        }
        return element
      }
    }
    // When no matching element is found
    new SharePicture(-1, "", "", "", "", 0, Array.empty[Comment],Array.empty[String])
  }

  def commentPicture(id: Long, comment: Comment): SharePicture = {
    for (element <- detail) {
      if (id == element.id) {
        //Adds the new comment to the list of comments
        element.comments :+= comment
        return element
      }
    }
    // When no matching element is found
    new SharePicture(-1, "", "", "", "", 0, Array.empty[Comment],Array.empty[String])
  }
