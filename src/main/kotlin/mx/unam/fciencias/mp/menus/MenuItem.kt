package mx.unam.fciencias.mp.menus

/**
 * Represents a menu item.
 *
 * @property name The name of the dish or beverage.
 * @property description A short description of the menu item.
 * @property price The cost of the dish or beverage in cents.
 * @property vegFriendly A boolean that indicates if the dish or beverage is
 *                       vegetarian.
 */
data class MenuItem(val name: String,
                    val description: String,
                    val price: Int,
                    val vegFriendly: Boolean)