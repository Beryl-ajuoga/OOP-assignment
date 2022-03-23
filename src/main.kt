fun main(){
    var person=human("jane" ,25,70)
    person.weight
    person.eat(3)

    var s=person.speak("she loves eating ugali")
    println(s)

    var t=person.birthday()
    println(t)

    var z=worker("epuu", "bhakita","epuubhakhita@gmail.com","123zxc",32758390)
    println(z.firstName)
    println(z.pasword)




}

class human(var name:String , var age:Int , var weight:Int ){
fun eat(foodweight:Int):Int{
    weight+=foodweight
    println("I am eating $foodweight Kgs of food")
    return weight

}
fun speak(Speech:String):String{
    return Speech
}


fun birthday() {
    age += 1
    println(age)

}

}

class worker(var firstName:String , var lastName:String ,var email:String , var pasword:String , var phoneNumber: Int)