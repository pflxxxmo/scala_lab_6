import org.scalatest.funsuite.AnyFunSuite

class testOfThirdFun extends AnyFunSuite {
  test("Find max in List"){
    val list=List[String]("I","You","We")
    assert(part_3.getMaxLengthString(list)=="You")
  }
}
