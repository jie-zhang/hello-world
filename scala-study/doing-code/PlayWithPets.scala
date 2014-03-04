class Pet(val name: String) {
    override def toString() = name
}

class Dog(override val name: String) extends Pet(name)

class Cat(override val name: String) extends Pet(name)

//def workWithPets(pets: Array[Pet]){}
def workWithPets[T <: Pet](pets: Array[T]) = 
    println("Play with Pets: " + pets.mkString(", ")) 

val dogs = Array(new Dog("Kalo"), new Dog("Flower"))
workWithPets(dogs)  

val cats = Array(new Cat("Neko1"), new Cat("Neko2"))
workWithPets(cats)

def copyPets[S, D >: S](fromPets: Array[S], toPets: Array[D]) = {
}

val pets = new Array[Pet](10)
copyPets(dogs, pets)


