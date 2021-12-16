import Pet.Cat
import Pet.Dog
import Pet.Fish
import Pet.Pet
import Retailer.CatRetailer
import Retailer.DogRetailer
import Retailer.Retailer

fun main() {
    val catF = Cat("Fuzz Lightyear")
    val catK = Cat("Katsu")
    val fishF = Fish("Finny NcGraw")

    val catVetdock = Vetdock<Cat>()
    val dogVetdock = Vetdock<Dog>()
    val petVetdock = Vetdock<Pet>()

    catVetdock.treat(catF)
    petVetdock.treat(catK)
    petVetdock.treat(fishF)


    val catContest = Contest<Cat>(catVetdock)
    catContest.addScore(catF, 50)
    catContest.addScore(catK, 45)
    val topCat = catContest.getWinners().first()
    println("Cat contest winner is ${topCat.name}")

    val petContest = Contest<Pet>(petVetdock)
    petContest.addScore(catF, 50)
    petContest.addScore(fishF, 56)
    val topPet = catContest.getWinners().first()
    println("Pet contest winner is ${topPet.name}")

    val fishContest = Contest<Fish>(petVetdock)


    val dogRetailer: Retailer<Dog> = DogRetailer()
    val catRetailer: Retailer<Cat> = CatRetailer()
    val petRetailer: Retailer<Pet> = CatRetailer()
    petRetailer.sell()


}





