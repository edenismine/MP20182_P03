package mx.unam.fciencias.mp.menus

/**
 * A singleton that represents McDouglas, the restaurant.
 *
 * @property menu The restaurant's menu.
 * @author Luis Daniel Aragon Bermudez
 */
object McDouglasRestaurant : Iterable<MenuItem> {
    /**
     * @return an iterator over the elements of this object.
     */
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

    /**
     * The restaurant's menu.
     */
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