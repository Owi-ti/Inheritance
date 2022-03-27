fun main(){
   var v = Car("Toyota", "Yaris", "Black",6)
    v.identity()
    println(v.calculateParkingFees(3))
    v.carry(7)
    var b= Bus("modern coast" ,"Chinese Zhongton" ,"white and black",64)
    println( b.maxTriFare(2000.0))
    println( b.calculateParkingFees(5))


}

//1.Create a class Car with the following attributes: make, model, color, capacity.
//It has these functions:
    //-carry(people: Int) : Prints out “Carrying $people passengers” if the number of people is within its capacity
    // else it prints out “Over capacity by $x people” where x is the number of people exceeding its capacity by $x
    // people” where x is the number of people exceeding its capacity (3 points)
     //identity() : Prints out the color, make and model in the following format e.g:  “I am a white subaru legacy”
      //calculate ParkingFees(hours: Int) : Calculates and returns the parking fees by multiplying the hours by 20

//Create a class Bus with the same attributes and functions as the Car class.
//In addition, it has another method called maxTripFare(fare: Double) that
//calculates and returns the maximum amount of fare that can be collected per trip.(2 points)
//The bus’calculateParkingFees method returns the product of hours and the capacity of the bus(3 points)
//Make use of inheritance to avoid duplication. Also be sure to instantiate both classes
//and call each of the functions on the objects.


open class Car(var make:String,var model:String, var color:String,var capacity:Int){

    fun carry(People:Int){
        var x= People-capacity
        if(People <= capacity ){
            println("carrying $People passengers")
        }
        else{ println("over capacity by $x people")
        }
    }
    fun identity(){
        println("I am a $color $make $model ")
    }

    open fun calculateParkingFees(hours:Int):Int{
        var product= hours*20

        return product

    }
}

class Bus( make:String, model:String, color:String, capacity:Int):Car(make,model,color,capacity){
   fun maxTriFare(fare:Double):Double{
      var P= fare*capacity
         return P

   }

      override fun calculateParkingFees(hours: Int):Int{
        return  capacity*hours
      }

  }

