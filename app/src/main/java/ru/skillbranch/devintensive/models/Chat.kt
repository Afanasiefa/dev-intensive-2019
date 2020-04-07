package ru.skillbranch.devintensive
class Chat(
    val id: String?,
    var members: MutableList<User> = mutableListOf(),
    var messages: MutableList<BaseMessage> = mutableListOf()
)