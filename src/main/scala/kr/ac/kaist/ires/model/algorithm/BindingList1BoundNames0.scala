package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingList1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingList1BoundNames0""", List(Id("""this"""), Id("""BindingList"""), Id("""LexicalBinding""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingList"""))), EStr("""BoundNames""")).setId(27117), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(27118), IAccess(Id("""__x1__"""), ERef(RefId(Id("""LexicalBinding"""))), EStr("""BoundNames""")).setId(27120), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(27122), ILet(Id("""__x3__"""), EINum(0L)).setId(27123), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(27124), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(27121), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(27125))).setId(27141)).setId(27127), IReturn(ERef(RefId(Id("""names""")))).setId(27130))).setId(27144))
  val instToStepMap: Map[Int, Int] = HashMap(27119 -> 0, 27127 -> 1, 27118 -> 0, 27130 -> 2, 27117 -> 0, 27129 -> 1, 27131 -> 2, 27123 -> 1, 27120 -> 1, 27128 -> 1, 27122 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27119, 27118, 27117), 1 -> HashSet(27127, 27129, 27123, 27120, 27128, 27122), 2 -> HashSet(27130, 27131))
  /* Beautified form:
  "BindingList1BoundNames0" (this, BindingList, LexicalBinding) => {
    access __x0__ = (BindingList "BoundNames")
    let names = __x0__
    access __x1__ = (LexicalBinding "BoundNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }
  */
}
