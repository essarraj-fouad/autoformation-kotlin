
var ListProduit = mutableListOf<String>()

fun main() {
    var i = 0
    while (i != 4) {
        println("Gestion des produits")
        println("1. Ajouter")
        println("2. Afficher")
        println("3. Supprimer")
        println("4. Sortie")
        println("-----------")
        print("Choisir un nombre : ")
        var value = readLine()!!.toInt()
        println("-----------")
        when (value) {
            1 -> Ajouter()
            2 -> Afficher()
            3 -> Supprimer()
            4 -> break
            else -> {
                println("Vous devez choisir un ordre entre 1 et 4 ")
                println("-----------")
            }
        }
    }
}
fun Ajouter(){
    print("Nom du produit: ")
    var nom= readLine()!!.toString()
    ListProduit.add(nom)
}

fun Afficher(){
    println("List des produits : ")
    for(nom in ListProduit){
        println(nom)
    }
    println("-----------")
}
fun Supprimer(){
    println("Le nom du produit que vous voullez supprimer : ")
    var name = readLine()!!.toString()
    ListProduit.remove(name)
}
