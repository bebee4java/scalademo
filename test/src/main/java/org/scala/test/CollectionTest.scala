package org.scala.test

import scala.collection.immutable.Nil
import java.util

/**
  * Created by sgr on 2017/12/11/011.
  */
object CollectionTest {
  def main(args: Array[String]) {
    val a = List(1,2,3); println(a)
    val b = 0 :: a; println(b)
    val c = "x" :: "y" :: "z" :: Nil; println(c)
    val d = a ::: c;println(d)

    println(a.head)
    println(a.tail)

    val l = List.fill(100000)(1)
    println(foreach1(l))



    println("99 red heat".toList.filter(x => Character.isDigit(x)))
    println("99 red heat".toList.takeWhile( x => x != 'h'))

    println("xyz".toList.map(_.toUpper))

    var m = Map("a" ->1 , "b" -> 2)
    m += ("c" ->1)
    print(m("a"))

  }

//  有递归栈溢出问题
  def foreach(l:List[_]) : String = {
    if (l.isEmpty) ""
    else l.head + foreach(l.tail)
  }

  def foreach1(l:List[_]) : String = {
    @annotation.tailrec
    def loop(t:List[_], str:String) : String = {
      if (t.isEmpty) str
      else loop(t.tail, str+t.head)
    }
    loop(l,"")
  }

}
