package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingPropertyList1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""BindingPropertyList1BoundNames0""", List(Id("""this"""), Id("""BindingPropertyList"""), Id("""BindingProperty""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingPropertyList"""))), EStr("""BoundNames""")).setId(27857), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(27858), IAccess(Id("""__x1__"""), ERef(RefId(Id("""BindingProperty"""))), EStr("""BoundNames""")).setId(27860), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(27862), ILet(Id("""__x3__"""), EINum(0L)).setId(27863), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(27864), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(27861), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(27865))).setId(27881)).setId(27867), IReturn(ERef(RefId(Id("""names""")))).setId(27870))).setId(27884))
  val instToStepMap: Map[Int, Int] = HashMap(27868 -> 1, 27860 -> 1, 27869 -> 1, 27870 -> 2, 27858 -> 0, 27863 -> 1, 27871 -> 2, 27867 -> 1, 27857 -> 0, 27859 -> 0, 27862 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27859, 27858, 27857), 1 -> HashSet(27868, 27860, 27869, 27862, 27863, 27867), 2 -> HashSet(27870, 27871))
  /* Beautified form:
  "BindingPropertyList1BoundNames0" (this, BindingPropertyList, BindingProperty) => {
    access __x0__ = (BindingPropertyList "BoundNames")
    let names = __x0__
    access __x1__ = (BindingProperty "BoundNames")
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
