package com.example.new_project
import java.lang.Class
fun main (){
    var t:Any?=4
    var r= t as? String
    println(r?.length)
    var x=true
    var bg:Array<Any?> = arrayOf(null,4,true,6.8755,true)
    println(bg[1] is Int)
    if (bg[1] is Int){
        bg[1] as Int // WHY THIS LINE ONLY WILL NOT WORK COZ as & is operator are expression not standalone stm
// if you want to use as operator use is AS THE RHS side of a statment
        var uuu= bg[1] as Int
        uuu.plus(9)
    }
    var uu = bg[1] as? Int
    println(uu?.plus(6))
    var gh= bg as? Boolean
    println(gh?.xor(x))
    var qqq:Array<Any?> = arrayOf(null,4,true,6.8755,true)
    if (qqq[1] is Int ){
        println("yes")
        var e=qqq[1] as? String
        println(e?.length)
        var tt:Int? = null

var cc= tt ?: Any()
        println(cc)
        cc?.let { println("$it") }
    }
    else println("no")
var b:Int?=9
    if (b ==null){b=8}
    else b=2
    /*b = if (b ==null){
        8
    }
    else 2*/  // Assignment' can be lifted out of 'if'

    val name: String?
    val apiResult = "getNameFromApi()"
    if (apiResult != null) {
        name = apiResult
    } else {
        name = "Unknown"
    }

}

fun m():Int{
    var t=4
    return if (t>=5) 6
    else 8
}