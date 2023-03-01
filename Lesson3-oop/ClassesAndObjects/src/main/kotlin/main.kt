import Products.ProductManager

fun main() {
    val productManager: ProductManager = ProductManager()

    while (true) {
        print("\nPlease choose an option - `help` for more information: ")
        val args: List<String>? = readLine()?.split(" ")

        if (args == null) {
            println("No option found")
            continue
        }

        when (args[0]) {
            "list" -> productManager.listProducts()
            "add" -> productManager.add(args[1])
            "edit" -> productManager.edit(args[1], args[2])
            "del" -> productManager.delete(args[1])
            "help" -> help()
            "exit" -> break
            else -> println("No option found")
        }
    }
}



val helpText: String = """
        You can use this options:
        -list: List all products.
        -add {name}: To create a new product.
        -edit {name} {new_name}: To update a product.
        -del {name}: To delete a product.
        -exit: Exit the program.
    """.trimIndent()

fun help() {
    println(helpText)
}

