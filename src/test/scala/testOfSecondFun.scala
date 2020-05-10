import org.scalatest.funsuite.AnyFunSuite

class testOfSecondFun extends AnyFunSuite {
  test("Product of .toInt"){
    val list = List[String]("0","1","2","3","4")
    assert(part_2.toIntList(list) == list.map(_.toInt))
  }
}
