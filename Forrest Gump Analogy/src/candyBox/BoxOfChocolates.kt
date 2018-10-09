package candyBox

import java.util.*

class BoxOfChocolates <T>(private val buffer: ArrayList<T>){
    fun pickOne(): T?{
        if(buffer.size > 0){
            return buffer.removeAt(Random().nextInt(buffer.size))
        }
        return null
    }
}