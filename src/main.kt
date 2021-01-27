class List<T>(vararg mas:T)
{
    private var items:MutableList<T> = mas.toMutableList()
    //2. function add (el: T): Bool вставляет элемент в конец списка;
    fun add(el:T):Boolean{
        items.add(el)
        return true
    }
    //3 fun delete (n: Int): Bool удаляет элемент с позиции n
    fun delete(n: Int): Boolean {
        items.removeAt(n)
        return true
    }
    //5. fun print(count: Int,n: Int): Unit печатает count элементов списка, начиная с позиции n
    fun print(count: Int,n: Int)
    {
        if (n >= items.size || n + count >= items.size)
            return
        for(i in n..count + n)
            println(items[i].toString())
    }
    //функция eraseAll, которая очищает весь список.
    fun eraseAll()
    {
        items = mutableListOf()
    }
}