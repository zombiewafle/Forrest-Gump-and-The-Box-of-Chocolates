package candyBox

class Chocolate {
    var name: String

    constructor(_name:String){
        name = _name
    }

    override fun toString(): String{
        return """
            name: ${name}
            """.trimIndent()
    }
}