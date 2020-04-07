package ru.skillbranch.devintensive.utils


object Utils {
    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")

        val firstName = parts?.getOrNull(0)
        val lastName = parts?.getOrNull(1)
        return when (fullName) {
            " ", "" -> Pair(null, null)
            else -> Pair(firstName, lastName)
        }

    }

    fun transliteration(payload: String?, divider: String = " "): String {
        return ""
    }

    fun toInitials(payload: String?, divider: String = " "): String {
        var (firstName, lastName) = parseFullName(
            payload
        )
        return when {
            firstName == "null" && lastName == "null" -> "null"
            firstName != "null" && lastName == "null" -> "null" + "${lastName?.get(0)}"
            firstName == "null" && lastName != "null" -> "${firstName?.get(0)}" + "null"
            else -> "${firstName?.get(0)}" + "${lastName?.get(0)}"
        }

    }
}