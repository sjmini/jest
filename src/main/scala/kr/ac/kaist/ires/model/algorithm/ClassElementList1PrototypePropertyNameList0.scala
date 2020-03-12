package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList1PrototypePropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList1PrototypePropertyNameList0""", List(Id("""this"""), Id("""ClassElementList"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElementList"""))), EStr("""PrototypePropertyNameList""")).setId(42644), ILet(Id("""list"""), ERef(RefId(Id("""__x0__""")))).setId(42645), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42647), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(ERef(RefId(Id("""list""")))).setId(42648), ISeq(List()).setId(42668)).setId(42651), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42653), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), IReturn(ERef(RefId(Id("""list""")))).setId(42654), ISeq(List()).setId(42672)).setId(42656), IAccess(Id("""__x3__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42658), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""list""")))).setId(42659), IReturn(ERef(RefId(Id("""list""")))).setId(42661))).setId(42677))
  val instToStepMap: Map[Int, Int] = HashMap(42652 -> 2, 42656 -> 4, 42658 -> 5, 42659 -> 5, 42645 -> 0, 42660 -> 5, 42654 -> 3, 42661 -> 6, 42657 -> 4, 42653 -> 4, 42662 -> 6, 42647 -> 2, 42644 -> 0, 42651 -> 2, 42655 -> 3, 42648 -> 1, 42649 -> 1, 42646 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(42644, 42645, 42646), 5 -> HashSet(42658, 42659, 42660), 1 -> HashSet(42648, 42649), 6 -> HashSet(42662, 42661), 2 -> HashSet(42652, 42647, 42651), 3 -> HashSet(42655, 42654), 4 -> HashSet(42656, 42657, 42653))
  /* Beautified form:
  "ClassElementList1PrototypePropertyNameList0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "PrototypePropertyNameList")
    let list = __x0__
    access __x1__ = (ClassElement "PropName")
    if (= __x1__ CONST_empty) return list else {}
    access __x2__ = (ClassElement "IsStatic")
    if (= __x2__ true) return list else {}
    access __x3__ = (ClassElement "PropName")
    append __x3__ -> list
    return list
  }
  */
}
