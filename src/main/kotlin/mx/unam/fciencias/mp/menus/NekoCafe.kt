package mx.unam.fciencias.mp.menus

/**
 * A singleton that represents mx.unam.fciencias.mp.menus.NekoCafe, the cafe.
 *
 * @property menu The cafe's menu.
 * @author Luis Daniel Aragon Bermudez
 */
object NekoCafe : Iterable<MenuItem> {
    /**
     * @return an iterator over the elements of this object.
     */
    override fun iterator(): Iterator<MenuItem> {
        return menu.values.iterator()
    }

    /**
     * The cafe's menu.
     */
    private val menu = hashMapOf(
            "Chai Tea Latte" to MenuItem(
                    "Chai Tea Latte",
                    "Freshly brewed chai tea.",
                    1 * 100,
                    true
            ),
            "Espresso" to MenuItem(
                    "Espresso",
                    "Smooth espresso with rich flavor.",
                    15 * 10,
                    true
            ),
            "Iced Tea" to MenuItem(
                    "Iced Tea",
                    "High quality black iced tea.",
                    14 * 10,
                    true
            )
    )
}