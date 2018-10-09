package persons

import candyBox.BoxOfChocolates

class Forrest <T>(val life: BoxOfChocolates<T>){
    fun sayTheLine():String{
        val picked = life.pickOne()

        if(picked == null)
            return "Life sucks"

        return "Life is like a Box of Chocolates"
    }
}