object part_2 {

  def toIntList(list: List[String]): List[Int] = {
    list.foldLeft(List[Int]()) { (r, c) => r :+ c.toInt }
  }


  def main(args: Array[String]): Unit = {
    val list = List[String]("0","1","2","3","4")
    println(toIntList(list))
  }

}
