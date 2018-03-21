object McDouglasRestaurant : Iterable<MenuItem> {
    override fun iterator(): Iterator<MenuItem> {
        return object : Iterator<MenuItem> {
            private var current = 0

            override fun next(): MenuItem {
                return menu[current++]
            }

            override fun hasNext(): Boolean {
                return current < menu.size
            }

        }
    }

    private val menu = arrayOf(
            MenuItem(
                    "McDoug Burger",
                    "The classic McDouglas's burger.",
                    1 * 100,
                    false
                    ),
            MenuItem(
                    "Big Doug",
                    "Universally loved, two-story burger.",
                    15 * 10,
                    false
                    ),
            MenuItem(
                    "McVeggies",
                    "Cruelty-free burger.",
                    14 * 10,
                    true
                    )
    )
}