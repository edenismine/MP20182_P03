package mx.unam.fciencias.mp.menus

/**
 * Represents a waitress. She can have multiple menus and retrieve all the
 * menu items in them.
 *
 * @property menus All the menus this waitress can access.
 * @author Luis Daniel Aragon Bermudez
 */
class Waitress(
        private var menus: ArrayList<Iterable<MenuItem>> = ArrayList(10)) {

    /**
     * Prints all menu items inside the waitress' [menus].
     */
    fun printAllMenuItems() {
        menus.forEach {
            val iterator = it.iterator()
            while (iterator.hasNext()) {
                val item = iterator.next()
                println("${item.name} $${item.price / 100.0}\n" +
                        "${item.description}\n" +
                        if (item.vegFriendly) "(Vegetarian)\n" else "")
            }
        }
    }

    /**
     * Adds a menu to the waitress' [menus].
     */
    fun addMenu(menu: Iterable<MenuItem>): Boolean {
        return menus.add(menu)
    }
}
