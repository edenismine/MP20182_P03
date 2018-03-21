class Waitress(
        var menus: ArrayList<Iterable<MenuItem>> = ArrayList(10)) {
    fun printMenu(){
        menus.forEach {
            val iterator = it.iterator()
            while (iterator.hasNext())
                println(iterator.next())
        }
    }
    fun addMenu(menu: Iterable<MenuItem>) : Boolean {
        return menus.add(menu)
    }
}
