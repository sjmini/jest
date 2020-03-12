package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowFunction0Contains0 {
  val length: Int = 0
  val func: Func = Func("""ArrowFunction0Contains0""", List(Id("""this"""), Id("""ArrowParameters"""), Id("""ConciseBody"""), Id("""symbol""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OOr, EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """NewTarget"""), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperProperty""")), EIsInstanceOf(ERef(RefId(Id("""symbol"""))), """SuperCall""")), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""super"""))), EBOp(OEq, ERef(RefId(Id("""symbol"""))), EStr("""this""")))), IReturn(EBool(false)).setId(38683), ISeq(List()).setId(38700)).setId(38686), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ArrowParameters"""))), EStr("""Contains""")).setId(38688), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(38689), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(38690), ISeq(List()).setId(38705)).setId(38692), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ConciseBody"""))), EStr("""Contains""")).setId(38694), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""symbol"""))))).setId(38695), IReturn(ERef(RefId(Id("""__x3__""")))).setId(38696))).setId(38710))
  val instToStepMap: Map[Int, Int] = HashMap(38694 -> 4, 38690 -> 2, 38684 -> 0, 38695 -> 4, 38688 -> 3, 38683 -> 0, 38696 -> 4, 38691 -> 2, 38692 -> 3, 38687 -> 1, 38697 -> 4, 38693 -> 3, 38689 -> 3, 38686 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(38684, 38683), 1 -> HashSet(38687, 38686), 2 -> HashSet(38690, 38691), 3 -> HashSet(38688, 38692, 38693, 38689), 4 -> HashSet(38694, 38695, 38696, 38697))
  /* Beautified form:
  "ArrowFunction0Contains0" (this, ArrowParameters, ConciseBody, symbol) => {
    if (! (|| (|| (|| (|| (is-instance-of symbol NewTarget) (is-instance-of symbol SuperProperty)) (is-instance-of symbol SuperCall)) (= symbol "super")) (= symbol "this"))) return false else {}
    access __x0__ = (ArrowParameters "Contains")
    app __x1__ = (__x0__ symbol)
    if (= __x1__ true) return true else {}
    access __x2__ = (ConciseBody "Contains")
    app __x3__ = (__x2__ symbol)
    return __x3__
  }
  */
}
