package org.scala.test

import java.util.Collections

/**
  * Created by sgr on 2017/12/7/007.
  */
class Test1{
  def  main(args: Array[String]) {
    println("class test")
  }
}
/*class Test{
  def main(args: Array[String]) {
  }
}*/

object Test {

   def main(args: Array[String]) {
    //常量
    val s = "ssss"//常量不能再次赋值 s = "s" error
    //变量
    var v:String = "s"
    v = "sssss"

    val x,y = "222"

    val pa = (1,"aaaa")
    println(pa)

    var a = 10
    a = 10
    val b = 20
    printf("%d + %d = %d\n" ,a,b ,a + b )
    printf("%d - %d = %d\n" ,a,b ,a - b )
    printf("%d * %d = %d\n" ,a,b ,a * b )
    printf("%d / %d = %d\n" ,a,b ,a / b )
    printf("%d %% %d = %d\n" ,a,b ,a % b )
    printf("%d %% %d = %d\n" ,b,a ,b % a )
    printf("%d == %d = %b\n",a,a,a==a)
    if (true){
      println(true)
    }
    var i = 0
    var sum = 0
    while (i <= 100){
      sum += i
      i += 1
    }
    println(sum)

    var j = 0
    // for 循环
    print(" to  :")
    for( j <- 1 to 10){
      printf("%d\t", j )
    }
    println()
    var k = 0
    // for 循环
    print("until:")
    for( k <- 1 until  10){
      printf("%d\t", k )
    }
    println()


    // 笛卡尔
    for( a <- 1 to 3; b <- 1 to 3){
      printf("(%d,%d)\t" ,a,b)
    }
    println()
    //循环集合
    var numList = List(1,2,3,4,5,6)
    for( a <- numList ){
      printf("%d\t",a)
    }
    println()

    //循环集合加过滤
     numList = List(1,2,3,4,5,6,7,8,9,10)
    for( a <- numList
         if a > 3; if a < 8 ){
      printf("%d\t" , a)
    }
    println()

    //循环集合加过滤存储到变量
    numList = List(1,2,3,4,5,6,7,8,9,10)
    val retVal = for{ a <- numList if a >= 3; if a < 8}yield a
    // 输出返回值
    for( a <- retVal){
      printf( "%d\t", a)
    }

     val buf = new StringBuilder
     buf += 'a'
     buf ++= "bcdef"
     println("\n" + buf.toString())

  }
}
