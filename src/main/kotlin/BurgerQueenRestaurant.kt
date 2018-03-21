object BurgerQueenRestaurant : Iterable<MenuItem> {
    override fun iterator(): Iterator<MenuItem> {
        return menu.iterator()
    }

    private val menu = arrayListOf(
            MenuItem(
                    "Whipper Burger",
                    "The classic Burger Queen's burger.",
                    1 * 100,
                    false
            ),
            MenuItem(
                    "Big Queen",
                    "Universally loved, two-story burger.",
                    15 * 10,
                    false
            ),
            MenuItem(
                    "Whipper Angry",
                    "The classic you know and love, but sexier.",
                    14 * 10,
                    false
            )
    )
}