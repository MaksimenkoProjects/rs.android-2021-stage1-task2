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
