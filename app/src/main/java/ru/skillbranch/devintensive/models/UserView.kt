package ru.skillbranch.devintensive
class UserView (
    val id: String,
    var nickName: String,
    val fullName: String,
    var avatar:String? = null,
    var status: String? = "offline",
    var initials: String
)