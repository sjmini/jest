package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassElementList1ConstructorMethod0 {
  val length: Int = 0
  val func: Func = Func("""ClassElementList1ConstructorMethod0""", List(Id("""this"""), Id("""ClassElementList"""), Id("""ClassElement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ClassElementList"""))), EStr("""ConstructorMethod""")).setId(42256), ILet(Id("""head"""), ERef(RefId(Id("""__x0__""")))).setId(42257), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""head"""))), ERef(RefId(Id("""CONST_empty"""))))), IReturn(ERef(RefId(Id("""head""")))).setId(42259), ISeq(List()).setId(42285)).setId(42262), IIf(EIsInstanceOf(ERef(RefId(Id("""ClassElement"""))), """ClassElement2"""), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42264), ISeq(List()).setId(42288)).setId(42268), IAccess(Id("""__x1__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""IsStatic""")).setId(42269), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42270), ISeq(List()).setId(42292)).setId(42272), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ClassElement"""))), EStr("""PropName""")).setId(42274), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EStr("""constructor"""))), IReturn(ERef(RefId(Id("""CONST_empty""")))).setId(42275), ISeq(List()).setId(42296)).setId(42277), IReturn(ERef(RefId(Id("""ClassElement""")))).setId(42279))).setId(42299))
  val instToStepMap: Map[Int, Int] = HashMap(42272 -> 5, 42259 -> 1, 42278 -> 7, 42263 -> 2, 42268 -> 3, 42273 -> 5, 42271 -> 4, 42275 -> 6, 42260 -> 1, 42279 -> 8, 42264 -> 3, 42274 -> 7, 42257 -> 0, 42270 -> 4, 42276 -> 6, 42265 -> 3, 42256 -> 0, 42262 -> 2, 42277 -> 7, 42269 -> 5, 42258 -> 0, 42280 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(42257, 42258, 42256), 5 -> HashSet(42272, 42273, 42269), 1 -> HashSet(42259, 42260), 6 -> HashSet(42275, 42276), 2 -> HashSet(42263, 42262), 7 -> HashSet(42278, 42274, 42277), 3 -> HashSet(42268, 42264, 42265), 8 -> HashSet(42279, 42280), 4 -> HashSet(42271, 42270))
  /* Beautified form:
  "ClassElementList1ConstructorMethod0" (this, ClassElementList, ClassElement) => {
    access __x0__ = (ClassElementList "ConstructorMethod")
    let head = __x0__
    if (! (= head CONST_empty)) return head else {}
    if (is-instance-of ClassElement ClassElement2) return CONST_empty else {}
    access __x1__ = (ClassElement "IsStatic")
    if (= __x1__ true) return CONST_empty else {}
    access __x2__ = (ClassElement "PropName")
    if (! (= __x2__ "constructor")) return CONST_empty else {}
    return ClassElement
  }
  */
}
