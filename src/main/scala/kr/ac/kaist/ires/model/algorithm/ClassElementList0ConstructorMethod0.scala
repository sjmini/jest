package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList0ConstructorMethod0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList0ConstructorMethod0""", List(Id("""this"""), Id("""ClassElement""")), None, ISeq(List(IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42211), ISeq(List()).setId(42231)).setId(42215), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42216), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42217), ISeq(List()).setId(42235)).setId(42220), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42222), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EStr("""constructor"""))), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42223), ISeq(List()).setId(42239)).setId(42225), IReturn(ERef(RefId(Id("""ClassElement""")))).setId(42227))).setId(42242))
  val instToStepMap: Map[Int, Int] = HashMap(42218 -> 1, 42222 -> 4, 42221 -> 2, 42211 -> 0, 42215 -> 0, 42228 -> 5, 42225 -> 4, 42220 -> 2, 42216 -> 2, 42224 -> 3, 42226 -> 4, 42227 -> 5, 42217 -> 1, 42212 -> 0, 42223 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(42211, 42215, 42212), 5 -> HashSet(42227, 42228), 1 -> HashSet(42218, 42217), 2 -> HashSet(42221, 42220, 42216), 3 -> HashSet(42223, 42224), 4 -> HashSet(42222, 42225, 42226))
  /* Beautified form:
  "ClassElementList0ConstructorMethod0" (this, ClassElement) => {
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x0__ = (ClassElement "IsStatic")
    if (= __x0__ true) return CONST_empty else {}
    access __x1__ = (ClassElement "PropName")
    if (! (= __x1__ "constructor")) return CONST_empty else {}
    return ClassElement
  }
  */
}
