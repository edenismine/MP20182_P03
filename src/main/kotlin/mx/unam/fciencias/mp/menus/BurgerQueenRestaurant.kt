package mx.unam.fciencias.mp.menus

/**
 * A singleton that represents Burger Queen, the restaurant.
 *
 * @property menu The restaurant's menu.
 * @author Luis Daniel Aragon Bermudez
 */
object BurgerQueenRestaurant : Iterable<MenuItem> {
    /**
     * @return an iterator over the elements of this object.
     */
    override fun iterator(): Iterator<MenuItem> {
        return menu.iterator()
    }

    /**
     * The restaurant's menu.
     */
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