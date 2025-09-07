package models

object ProfileDetailsDao:
    var detail: Seq[Profile] = Seq(
      Profile("user", "Belgium"),
      Profile("user1", "Germany"),
      Profile("user2", "USA"),
      Profile("admin", "France"))
    
   //Here, findAll method returns a list of Profile objects. Details is a sequence of profile objects 
   // and toList converts it into a list of profile objects
    def findAll: List[Profile] = detail.toList

    def lookupContact(name: String): Seq[Profile] = detail.filter(_.name == name)
