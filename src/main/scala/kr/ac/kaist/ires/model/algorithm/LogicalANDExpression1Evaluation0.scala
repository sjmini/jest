package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LogicalANDExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""LogicalANDExpression1Evaluation0""", List(Id("""this"""), Id("""LogicalANDExpression"""), Id("""BitwiseORExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LogicalANDExpression"""))), EStr("""Evaluation""")).setId(22293), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(22294), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(22296), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(22297), IReturn(ERef(RefId(Id("""__x1__""")))).setId(22298)).setId(22299), ISeq(List()).setId(22335)).setId(22301), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(22302), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""lval"""))))).setId(22304), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(22305), IReturn(ERef(RefId(Id("""__x2__""")))).setId(22306)).setId(22307), ISeq(List()).setId(22342)).setId(22308), ILet(Id("""lbool"""), ERef(RefId(Id("""__x2__""")))).setId(22309), IIf(EBOp(OEq, ERef(RefId(Id("""lbool"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""lval"""))))).setId(22311), IReturn(ERef(RefId(Id("""__x3__""")))).setId(22312))).setId(22347), ISeq(List()).setId(22348)).setId(22314), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BitwiseORExpression"""))), EStr("""Evaluation""")).setId(22317), ILet(Id("""rref"""), ERef(RefId(Id("""__x4__""")))).setId(22318), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(22320), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(22321), IReturn(ERef(RefId(Id("""__x5__""")))).setId(22322)).setId(22323), ISeq(List()).setId(22356)).setId(22324), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(22325), IReturn(ERef(RefId(Id("""__x6__""")))).setId(22326))).setId(22360))
  val instToStepMap: Map[Int, Int] = HashMap(22311 -> 3, 22294 -> 0, 22325 -> 6, 22314 -> 4, 22293 -> 0, 22310 -> 2, 22319 -> 5, 22296 -> 1, 22315 -> 4, 22295 -> 0, 22303 -> 1, 22308 -> 2, 22313 -> 3, 22320 -> 6, 22304 -> 2, 22326 -> 6, 22301 -> 1, 22318 -> 5, 22309 -> 2, 22312 -> 3, 22327 -> 6, 22302 -> 1, 22324 -> 6, 22317 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(22294, 22293, 22295), 5 -> HashSet(22319, 22318, 22317), 1 -> HashSet(22301, 22296, 22302, 22303), 6 -> HashSet(22320, 22325, 22326, 22327, 22324), 2 -> HashSet(22304, 22310, 22309, 22308), 3 -> HashSet(22311, 22312, 22313), 4 -> HashSet(22314, 22315))
  /* Beautified form:
  "LogicalANDExpression1Evaluation0" (this, LogicalANDExpression, BitwiseORExpression) => {
    access __x0__ = (LogicalANDExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    app __x2__ = (ToBoolean lval)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let lbool = __x2__
    if (= lbool false) {
      app __x3__ = (WrapCompletion lval)
      return __x3__
    } else {}
    access __x4__ = (BitwiseORExpression "Evaluation")
    let rref = __x4__
    app __x5__ = (GetValue rref)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
