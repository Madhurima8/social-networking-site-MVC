package models

import java.time.LocalDate
case class Comment(username: String, lines: String)

case class SharePicture(id: Long,var image: String, var description: String, addedBy: String, date: String, var likes: Int, var comments: Array[Comment],var likedBy:Array[String])


