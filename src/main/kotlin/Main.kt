fun main(){
    var result=string()
    println(result)
    arrays()
    split()
    var stmt=join()
    println(stmt)
    var calculator=Calculator(200,756,789,46)
    println(calculator.sum)
    println(calculator.sub)
    println(calculator.div)
    println(calculator.mult)

}

fun string():Char{
    var a="women"
    var b="men"
    var long=a[0]
    return long

}
fun arrays() {
    val nums = arrayOf(300,400,45,67,98)
    println(nums.minOrNull())
    println(nums.maxOrNull())
    println(nums.average())

}
fun split(){
    var text="happy"
    var split=text.split(' ')
    println(split)

}
fun join():String {
    var text1 = arrayOf("am", "here", "now")
    var full = "$text1[0] $text1[1]"
    return full
    println(full.toString())
}
class Calculator(var num1:Int,var num2:Int, var num3:Int, var num4:Int){
   var sum=num2+num3
    var sub=num3-num1
    var div=num2%num4
    var mult=num1*num2

}