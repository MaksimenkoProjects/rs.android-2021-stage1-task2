package subtask3

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import kotlin.reflect.KClass

class Blocks {

    // TODO: Complete the following function
    fun getData(blockA: Array<*>, blockB: KClass<*>): Any {
        return when (blockB) {
            Int::class -> blockA.filterIsInstance<Int>().sum()
            String::class -> blockA.filterIsInstance<String>().joinToString("")
            LocalDate::class -> {
                var date = blockA.filterIsInstance<LocalDate>().sorted().last()
                val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy")
                date.format(formatter)
            }
            else -> "Class is not supported"
        }
    }
}
