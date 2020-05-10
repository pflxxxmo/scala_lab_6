import org.scalatest.funsuite.AnyFunSuite


class testOfFirstFun extends AnyFunSuite{
  test("Product of matrix transpose"){
    val list = List(List("a1", "a2", "a3", "a4"), List("b1", "b2", "b3", "b4"), List("c1", "c2", "c3", "c4"))
    val list_2 = List(List("a1", "a2", "a3", "a"), List("b1", "b2", "b3", "b"), List("c1", "c2", "c3", "c"))
    val q= part_1.trans(list)
    val w= part_1.myTranspose(list_2)
    assert(q == list.transpose)
    assert(w == list_2.transpose)
  }
}
