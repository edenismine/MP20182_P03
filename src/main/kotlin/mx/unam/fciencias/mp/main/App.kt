package mx.unam.fciencias.mp.main
import mx.unam.fciencias.mp.menus.BurgerQueenRestaurant
import mx.unam.fciencias.mp.menus.McDouglasRestaurant
import mx.unam.fciencias.mp.menus.NekoCafe
import mx.unam.fciencias.mp.menus.Waitress

/**
 * This is the demo's main function. It instantiates a waitress that knows
 * two menus, prints them, adds an extra menu and prints them again.
 */
fun main(args: Array<String>) {
    val sally = Waitress(arrayListOf(
            McDouglasRestaurant,
            BurgerQueenRestaurant
    ))
    sally.printAllMenuItems()
    sally.addMenu(NekoCafe)
    println()
    sally.printAllMenuItems()
}
