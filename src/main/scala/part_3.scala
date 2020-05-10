object part_3 {

  def getMaxLengthString(list: List[String]): String = {
    list.reduce({(a: String, b: String) => if (a.length > b.length) a else b})
  }

  def main(args: Array[String]): Unit = {
    val list=List[String]("I","You","We")
    print(getMaxLengthString(list))
  }
}
