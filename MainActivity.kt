import kotlin.time.Duration.Companion.days

/*fun main(){
    var b:Any?=9
var arr:Any? = arrayOf(1,true)
    //val o =arr as? String
   // println( o?.length) // output null
    if (arr is Int){
        var t= arr as Int
        println(t.plus(2))}

   // else println("not a string")*/

//Big blunder LOOK WHAT KIND OF Data type HAVE YOU GIVEN TO arr . Thats not the way we give DT for collectsions or
//ds we use Parameter type and generics



open class animal{open var image=""}
class wolf:animal(){
    override var image = "wolf"
    var b=5
}
class dog:animal(){override var image = "dog"
    var what = 9}
fun main (){
    var arr :Array<animal> = arrayOf(wolf(),dog())
    var bb= arr[0] as? dog
    // println(bb?.what)
    var uu:Array<Any> = arrayOf(1,true)
    //if(uu is Int)// this line is not just a warning but an ERROR marked in red due to type incompantablity




}