package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList0PrototypePropertyNameList0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0PrototypePropertyNameList0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42607), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""CONST_empty""")))), IReturn(EList(List())).setId(42608), ISeq(List()).setId(42624)).setId(42611), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42613), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EList(List())).setId(42614), ISeq(List()).setId(42628)).setId(42616), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42618), IReturn(EList(List(ERef(RefId(Id("""__x2__""")))))).setId(42619))).setId(42632))
  val instToStepMap: Map[Int, Int] = HashMap(42608 -> 0, 42615 -> 2, 42609 -> 0, 42607 -> 1, 42620 -> 4, 42616 -> 3, 42618 -> 4, 42611 -> 1, 42613 -> 3, 42619 -> 4, 42612 -> 1, 42614 -> 2, 42617 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(42608, 42609), 1 -> HashSet(42607, 42612, 42611), 2 -> HashSet(42615, 42614), 3 -> HashSet(42616, 42613, 42617), 4 -> HashSet(42619, 42620, 42618))
  /* Beautified form:
  "ClassElementList0PrototypePropertyNameList0" (this, ClassElement) => {
    access __x0__ = (ClassElement "PropName")
    if (= __x0__ CONST_empty) return (new []) else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return (new []) else {}
    access __x2__ = (ClassElement "PropName")
    return (new [__x2__])
  }
  */
}
