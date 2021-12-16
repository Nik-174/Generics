import Pet.Pet

class Vetdock<T: Pet> {
    fun treat(t:T){
        println("Treat Pet ${t.name}")
    }
}