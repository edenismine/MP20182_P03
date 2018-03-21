object NekoCafe : Iterable<MenuItem> {
    override fun iterator(): Iterator<MenuItem> {
        return menu.values.iterator()
    }

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