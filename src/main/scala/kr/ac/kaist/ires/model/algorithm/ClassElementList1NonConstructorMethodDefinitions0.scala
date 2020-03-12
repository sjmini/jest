package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList1NonConstructorMethodDefinitions0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList1NonConstructorMethodDefinitions0""", List(Id("""this"""), Id("""ClassElementList"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElementList"""))), EStr("""NonConstructorMethodDefinitions""")).setId(42545), ILet(Id("""list"""), ERef(RefId(Id("""__x0__""")))).setId(42546), IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(ERef(RefId(Id("""list""")))).setId(42548), ISeq(List()).setId(42574)).setId(42552), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42553), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false))).setId(42560), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42554), IAssign(RefId(Id("""__x2__""")), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EStr("""constructor"""))).setId(42557))).setId(42580), ISeq(List()).setId(42581)).setId(42561), IIf(ERef(RefId(Id("""__x2__"""))), IReturn(ERef(RefId(Id("""list""")))).setId(42562), ISeq(List()).setId(42584)).setId(42564), IAppend(ERef(RefId(Id("""ClassElement"""))), ERef(RefId(Id("""list""")))).setId(42566), IReturn(ERef(RefId(Id("""list""")))).setId(42568))).setId(42588))
  val instToStepMap: Map[Int, Int] = HashMap(42561 -> 3, 42564 -> 3, 42568 -> 5, 42569 -> 5, 42563 -> 2, 42567 -> 4, 42560 -> 3, 42548 -> 1, 42562 -> 2, 42545 -> 0, 42566 -> 4, 42553 -> 3, 42565 -> 3, 42549 -> 1, 42547 -> 0, 42546 -> 0, 42552 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(42547, 42546, 42545), 5 -> HashSet(42568, 42569), 1 -> HashSet(42549, 42552, 42548), 2 -> HashSet(42563, 42562), 3 -> HashSet(42561, 42564, 42560, 42553, 42565), 4 -> HashSet(42567, 42566))
  /* Beautified form:
  "ClassElementList1NonConstructorMethodDefinitions0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "NonConstructorMethodDefinitions")
    let list = __x0__
    if (is-instance-of ClassElement ClassElement2) return list else {}
    access __x1__ = (ClassElement "IsStatic")
    let __x2__ = (= __x1__ false)
    if __x2__ {
      access __x3__ = (ClassElement "PropName")
      __x2__ = (= __x3__ "constructor")
    } else {}
    if __x2__ return list else {}
    append ClassElement -> list
    return list
  }
  */
}
