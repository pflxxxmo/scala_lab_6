object part_1 {

  def trans(list: List[List[String]]):List[List[String]]= {
    list.transpose
  }

  def myTranspose[T](matrix: List[List[T]]): List[List[T]] = matrix.filter(_.nonEmpty) match{
    case Nil => Nil
    case (ys: List[List[T]]) => ys.map(_.head)::myTranspose(ys.map(_.tail))
  }

def main(args: Array[String]): Unit = {
  val list = List(List("a1", "a2", "a3", "a4"), List("b1", "b2", "b3", "b4"), List("c1", "c2", "c3", "c4"))
  val list_2 = List(List("a1", "a2", "a3", "a"), List("b1", "b2", "b3", "b"), List("c1", "c2", "c3", "c"))
  val q=trans(list)
  val w=myTranspose(list_2)
  println(q)
  println(w)
}
}
