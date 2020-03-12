package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression5Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression5Evaluation0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(21194), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(21195), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(21197), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(21198), IReturn(ERef(RefId(Id("""__x1__""")))).setId(21199)).setId(21200), ISeq(List()).setId(21231)).setId(21202), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(21203), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(21206), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(21207), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(21209), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(21210), IReturn(ERef(RefId(Id("""__x3__""")))).setId(21211)).setId(21212), ISeq(List()).setId(21240)).setId(21213), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(21214), IApp(Id("""__x4__"""), ERef(RefId(Id("""InstanceofOperator"""))), List(ERef(RefId(Id("""lval"""))), ERef(RefId(Id("""rval"""))))).setId(21216), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(21217), IReturn(ERef(RefId(Id("""__x4__""")))).setId(21218)).setId(21219), ISeq(List()).setId(21247)).setId(21220), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(21221), IReturn(ERef(RefId(Id("""__x5__""")))).setId(21222))).setId(21251))
  val instToStepMap: Map[Int, Int] = HashMap(21203 -> 1, 21220 -> 4, 21213 -> 3, 21206 -> 2, 21194 -> 0, 21222 -> 4, 21215 -> 3, 21195 -> 0, 21208 -> 2, 21209 -> 3, 21216 -> 4, 21207 -> 2, 21196 -> 0, 21202 -> 1, 21223 -> 4, 21214 -> 3, 21197 -> 1, 21204 -> 1, 21221 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(21196, 21194, 21195), 1 -> HashSet(21203, 21202, 21197, 21204), 2 -> HashSet(21207, 21206, 21208), 3 -> HashSet(21213, 21214, 21215, 21209), 4 -> HashSet(21220, 21223, 21222, 21221, 21216))
  /* Beautified form:
  "RelationalExpression5Evaluation0" (this, RelationalExpression, ShiftExpression) => {
    access __x0__ = (RelationalExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (ShiftExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (InstanceofOperator lval rval)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
