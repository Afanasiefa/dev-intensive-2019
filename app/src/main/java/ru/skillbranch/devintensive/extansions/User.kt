package ru.skillbranch.devintensive.extansions

import ru.skillbranch.devintensive.User
import ru.skillbranch.devintensive.UserView
import ru.skillbranch.devintensive.utils.Utils
import java.util.*

fun User.toUserView(): UserView {
    var status =
        if (lastVisit == null) "ни разу не был" else if (isOnline) "online" else "последний раз был ${lastVisit?.humanizeDiff()}"
    var nickname = Utils.transliteration("$firstName $lastName")
    var initials = Utils.toInitials("$firstName $lastName")

    return UserView(
        id,
        fullName = "$firstName $lastName",
        nickName = nickname,
        avatar = avatar,
        status = status,
        initials = initials
    )
}

fun Date.humanizeDiff(): String {
    return ""
}
