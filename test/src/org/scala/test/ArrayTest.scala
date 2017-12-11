package org.scala.test

/**
  * Created by sgr on 2017/12/11/011.
  */
object ArrayTest {
  def main(args: Array[String]) {

    var ss = new Array[String](3)
    ss(0) = "a"; ss(1) = "b"; ss(2) = "c"

    for(s <- ss){
      println(s)
    }

    ss = Array("aa","bb","cc")
    for(s <- ss){
      println(s)
    }

    val myList1 = Array(1.9, 2.9, 3.4, 3.5)
    val myList2 = Array(8.9, 7.9, 0.4, 1.5)
    val myList3 =  Array.concat( myList1, myList2)

    // 输出所有数组元素
    for ( x <- myList3 ) {
      println( x )
    }

    var list = new Array[Int](9)
    list = Array.range(1,10)
    for(l <- list)
      println(l)

    list = Array.fill[Int](9)(99)
    for(l <- list)
      println(l)


  }

}
