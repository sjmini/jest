package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentList0ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArgumentList0ArgumentListEvaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(17997), ILet(Id("""ref"""), ERef(RefId(Id("""__x0__""")))).setId(17998), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""ref"""))))).setId(18000), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18001), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18002)).setId(18003), ISeq(List()).setId(18018)).setId(18005), ILet(Id("""arg"""), ERef(RefId(Id("""__x1__""")))).setId(18006), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EList(List(ERef(RefId(Id("""arg"""))))))).setId(18008), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18009))).setId(18023))
  val instToStepMap: Map[Int, Int] = HashMap(18005 -> 1, 17999 -> 0, 18006 -> 1, 18000 -> 1, 18009 -> 2, 18007 -> 1, 17997 -> 0, 18010 -> 2, 18008 -> 2, 17998 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(17998, 17999, 17997), 1 -> HashSet(18005, 18006, 18000, 18007), 2 -> HashSet(18008, 18009, 18010))
  /* Beautified form:
  "ArgumentList0ArgumentListEvaluation0" (this, AssignmentExpression) => {
    access __x0__ = (AssignmentExpression "Evaluation")
    let ref = __x0__
    app __x1__ = (GetValue ref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let arg = __x1__
    app __x2__ = (WrapCompletion (new [arg]))
    return __x2__
  }
  */
}
