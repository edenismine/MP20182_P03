fun main(args: Array<String>) {
    val sally = Waitress(arrayListOf(
            McDouglasRestaurant,
            BurgerQueenRestaurant
    ))
    sally.printMenu()
    sally.addMenu(NekoCafe)
    println()
    sally.printMenu()
}
