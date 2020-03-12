package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList0NonConstructorMethodDefinitions0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0NonConstructorMethodDefinitions0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(EList(List())).setId(42494), ISeq(List()).setId(42516)).setId(42498), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42499), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false))).setId(42506), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42500), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EStr("""constructor"""))).setId(42503))).setId(42522), ISeq(List()).setId(42523)).setId(42507), IIf(ERef(RefId(Id("""__x1__"""))), IReturn(EList(List())).setId(42508), ISeq(List()).setId(42526)).setId(42510), IReturn(EList(List(ERef(RefId(Id("""ClassElement""")))))).setId(42512))).setId(42529))
  val instToStepMap: Map[Int, Int] = HashMap(42510 -> 2, 42499 -> 2, 42511 -> 2, 42506 -> 2, 42513 -> 3, 42508 -> 1, 42498 -> 0, 42512 -> 3, 42495 -> 0, 42509 -> 1, 42494 -> 0, 42507 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(42495, 42498, 42494), 1 -> HashSet(42509, 42508), 2 -> HashSet(42510, 42499, 42511, 42506, 42507), 3 -> HashSet(42513, 42512))
  /* Beautified form:
  "ClassElementList0NonConstructorMethodDefinitions0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return (new []) else {}
    access __x0__ = (ClassElement "IsStatic")
    let __x1__ = (= __x0__ false)
    if __x1__ {
      access __x2__ = (ClassElement "PropName")
      __x1__ = (= __x2__ "constructor")
    } else {}
    if __x1__ return (new []) else {}
    return (new [ClassElement])
  }
  */
}
