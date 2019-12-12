package org.scala.test



/**
  * Created by sgr on 2018/2/20/020.
  */

class SpecialPerson(val name:String){
  def speak() = {
    println("i'm special person!call me "+ name)
  }
}
class Older(val name:String)
class Student(val name:String)
class Teacher(val name:String)

object ImplicitTest {

  //隐式转换
  implicit def person2Special(obj: Object) : SpecialPerson = {
    if (obj.getClass == classOf[Older]){
      val older = obj.asInstanceOf[Older]
      new SpecialPerson(older.name)
    }else if (obj.getClass == classOf[Student]){
      val student = obj.asInstanceOf[Student]
      new SpecialPerson(student.name)
    }else{
      println("Nil")
      null
    }
  }

  var sumTicket = 0

  def buySpecialTicket(specialPerson: SpecialPerson) = {
    sumTicket += 1
    println(sumTicket)
  }

  def main(args: Array[String]) {
    val older = new Older("老王")
    older.speak()
    buySpecialTicket(older)
    val teacher = new Teacher("王老师")
    buySpecialTicket(teacher)

  }

}
