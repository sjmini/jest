package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElementList1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingElementList1BoundNames0""", List(Id("""this"""), Id("""BindingElementList"""), Id("""BindingElisionElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""BoundNames""")).setId(27897), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(27898), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingElisionElement"""))), EStr("""BoundNames""")).setId(27900), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(27902), ILet(Id("""__x3__"""), EINum(0L)).setId(27903), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(27904), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(27901), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(27905))).setId(27921)).setId(27907), IReturn(ERef(RefId(Id("""names""")))).setId(27910))).setId(27924))
  val instToStepMap: Map[Int, Int] = HashMap(27897 -> 0, 27909 -> 1, 27902 -> 1, 27898 -> 0, 27908 -> 1, 27911 -> 2, 27903 -> 1, 27907 -> 1, 27899 -> 0, 27910 -> 2, 27900 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27897, 27898, 27899), 1 -> HashSet(27900, 27909, 27902, 27908, 27903, 27907), 2 -> HashSet(27910, 27911))
  /* Beautified form:
  "BindingElementList1BoundNames0" (this, BindingElementList, BindingElisionElement) => {
    access __x0__ = (BindingElementList "BoundNames")
    let names = __x0__
    access __x1__ = (BindingElisionElement "BoundNames")
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
