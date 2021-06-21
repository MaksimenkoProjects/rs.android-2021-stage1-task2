package subtask1

import java.text.SimpleDateFormat
import java.util.*

class DateFormatter {

    // TODO: Complete the following function
    fun toTextDay(day: String, month: String, year: String): String {
        val calendar = Calendar.getInstance()
        calendar.set(year.toInt(), month.toInt()-1, day.toInt())
        calendar.isLenient = false
        val formatter = SimpleDateFormat("dd MMMM, EEEE", Locale("ru"))
        return try {
            formatter.format(calendar.time)
        }catch (e: Exception){
            "Такого дня не существует"
        }
    }
}

//when(month){
//    "1" -> monthText = "января"
//    "2" -> monthText = "февраля"
//    "3" -> monthText = "марта"
//    "4" -> monthText = "апреля"
//    "5" -> monthText = "мая"
//    "6" -> monthText = "июня"
//    "7" -> monthText = "июля"
//    "8" -> monthText = "августа"
//    "9" -> monthText = "сентября"
//    "10" -> monthText = "октября"
//    "11" -> monthText = "ноября"
//    "12" -> monthText = "декабря"
//}
