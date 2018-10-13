package org.scala.test

import java.text.SimpleDateFormat
import java.util.Date

/**
  * Created by sgr on 2017/12/7/007.
  */
object FunctionTest {

  def main(args: Array[String]) {
    println(add(1,3)) //调用必须传值
    callByName(add(1,3))
    printStrings("a","b","c")
    println(add_d()) //调用可不传值
    println(factorial(4))

    val date = new Date()
    //偏应用函数，固定某些参数
    val logWithDate = log(date, _:String)
    logWithDate("aaaaa")
    logWithDate("bbbbb")

    log(date,"sssss")
    //指定函数参数名
    log(message = "ccccc",date = date)

    //高阶函数
    println(exec(add, 1,3))
    println(exec(this.-, 1,3))
    println(exec(*,1,4))


    //匿名函数
    val mul = (x: Int, y: Int) => {x*y}
    println(mul(3,7))

    val userDir = () => System.getProperty("user.dir")
    println(userDir())

    /**
      * 闭包函数
      * 函数引用到函数外面定义的变量，定义这个函数的过程是将这个自由变量捕获而构成一个封闭的函数。
      */
    val factor = 3
    val multiplier = (i:Int) => i * factor
    println(multiplier(3))

  }

  def add( a:Int, b:Int ) : Int = {
    printf("%d + %d = ", a, b)
    var sum:Int = 0
    sum = a + b
    sum
  }

  def -( a:Int, b:Int ) : Int = {
    printf("%d - %d = ", a, b)
    var result:Int = 0
    result = a - b
    result
  }

  def *( a:Int, b:Int ) : Int = {
    printf("%d * %d = ", a, b)
    var result:Int = 0
    result = a * b
    result
  }

  //函数传名调用(Call-by-Name)
  def callByName(e: => Int) = {
    println(e)//每次取e都要重新执行add方法
    print("\""); print(e == 4); print("\"\n")
  }

  //高阶函数
  def exec(f: (Int,Int) => Int, a:Int, b:Int) = f(a,b)


  //可变参数
  def printStrings( args:String* ) = {
    var i : Int = 0
    for( arg <- args ){
      println("Arg value[" + i + "] = " + arg )
      i += 1
    }
  }
  //具备默认值
  def add_d(a:Int=0, b:Int=0):Int = {
     a+b
  }
  //函数嵌套
  def factorial(i: Int): Int = {
    //递归函数
    def fact(i: Int, accumulator: Int): Int = {
      if (i <= 1)
        accumulator
      else
        fact(i - 1, i * accumulator)
    }
    fact(i, 1)
  }
  def log(date:Date, message:String) = {
    val dateFormat = new SimpleDateFormat("yyyy-MM-dd H:mm:ss")
    val dateFormated = dateFormat.format(date)
    printf("[%s]:%s\n", dateFormated , message)
  }
}
