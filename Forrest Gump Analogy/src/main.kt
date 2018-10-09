import persons.Forrest
import candyBox.BoxOfChocolates
import candyBox.Chocolate

fun main(args: Array<String>){
    val buffer = BoxOfChocolates(arrayListOf<Chocolate>(
            Chocolate("Vanilla"),
            Chocolate("Banana"),
            Chocolate("StrewBerry"),
            Chocolate("Cocoon")

    ));
    val ForrestGump = Forrest<Chocolate>(buffer);
    println(ForrestGump.sayTheLine())
    println(ForrestGump.sayTheLine())
    println(ForrestGump.sayTheLine())
    println(ForrestGump.sayTheLine())
    println(ForrestGump.sayTheLine())
    println(ForrestGump.sayTheLine())
}