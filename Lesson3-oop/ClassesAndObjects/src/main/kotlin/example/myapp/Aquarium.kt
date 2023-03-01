package example.myapp

class Aquarium(var length: Int = 100,var width: Int = 20,var height: Int = 40) {


    init {
        println("aquarium initializing")
    }

    var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }

    constructor(numberOfFish: Int) : this() {
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
    }

    fun printSize(){
        println("Width: $width cm " +
        "Length: $length cm " +
        "Height: $height")

        println("Volume: $volume l")
    }


}