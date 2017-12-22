
fun main(args : Array<String>)
{

   // immutable variables or read only variables
    val a = 20
    //println(a)

    //a = 40 is illegal

    //mutable variable or read and write variables
    var b = 30
    //println(b)
    b = 70
    //println(b)

    //Specfying the type of variable even if not needed
    val name: String = "milan"
    var age: Int = 23
    //println(name + " " + age)

    //way to specify variable inside " "
    //println("my name is $name and my age is $age")

    //Different data types in kotlin: Long,Double,Float,Boolean,Short,Byte,Char
    //Note precision fells after fifteen digit in kotlin

    //is : used to check whether a data is of certain datatype
    if(a is Int){
        //println(a)
    }
    //println("a is Int : ${a is Int}")

    //casting
    //println("A to Int: " + ('A'.toInt()))
    //println("65 to Char: "+ 65.toChar())

    //String
    var shortname = "milan"
    var lname = "ands"
    var longname = """milan
        |ands""".trimMargin()
    /*
    println(shortname)
    println(longname)
    println(longname.length)
    println("$shortname  $lname")
    */
    //string equality test

    var str1 = "Milan"
    var str2 = "Milan"
    println("String Equal: ${str1.equals(str2)}")
    println("String compare: ${str1.compareTo(str2)}")

    //indexing, Substring
    var str3 = "milan is a hero"
    println("index 3 is: ${str3.get(3)}")

    println("index 3-8: ${str3.subSequence(3,8)}")

    println("contains milan : ${str3.contains("milan")}")



}