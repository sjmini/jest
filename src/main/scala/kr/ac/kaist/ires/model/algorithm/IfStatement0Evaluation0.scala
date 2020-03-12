package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement0Evaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(30516), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(30517), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(30519), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(30520), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30521)).setId(30522), ISeq(List()).setId(30556)).setId(30524), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(30525), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(30526), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30527)).setId(30528), ISeq(List()).setId(30562)).setId(30529), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x2__""")))).setId(30530), IIf(EBOp(OEq, ERef(RefId(Id("""exprValue"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(30532), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(30533), IReturn(ERef(RefId(Id("""__x4__""")))).setId(30534))).setId(30568), ISeq(List(IAccess(Id("""__x5__"""), ERef(RefId(Id("""Statement"""))), EStr("""Evaluation""")).setId(30538), ILet(Id("""stmtCompletion"""), ERef(RefId(Id("""__x5__""")))).setId(30539), IApp(Id("""__x6__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtCompletion"""))), EUndef)).setId(30541), IApp(Id("""__x7__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(30542), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(30543), IReturn(ERef(RefId(Id("""__x8__""")))).setId(30544))).setId(30575)).setId(30547))).setId(30577))
  val instToStepMap: Map[Int, Int] = HashMap(30516 -> 0, 30531 -> 1, 30534 -> 4, 30543 -> 8, 30539 -> 8, 30535 -> 4, 30545 -> 8, 30542 -> 8, 30529 -> 1, 30532 -> 4, 30518 -> 0, 30541 -> 8, 30540 -> 8, 30530 -> 1, 30547 -> 8, 30533 -> 4, 30525 -> 1, 30538 -> 8, 30519 -> 1, 30548 -> 8, 30524 -> 1, 30536 -> 4, 30546 -> 8, 30517 -> 0, 30544 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(30516, 30518, 30517), 1 -> HashSet(30531, 30529, 30524, 30530, 30519, 30525), 7 -> HashSet(30539, 30538, 30540), 8 -> HashSet(30543, 30539, 30545, 30542, 30541, 30540, 30547, 30548, 30538, 30546, 30544), 4 -> HashSet(30534, 30535, 30536, 30532, 30533))
  /* Beautified form:
  "IfStatement0Evaluation0" (this, Expression, Statement) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let exprValue = __x2__
    if (= exprValue false) {
      app __x3__ = (NormalCompletion undefined)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {
      access __x5__ = (Statement "Evaluation")
      let stmtCompletion = __x5__
      app __x6__ = (UpdateEmpty stmtCompletion undefined)
      app __x7__ = (Completion __x6__)
      app __x8__ = (WrapCompletion __x7__)
      return __x8__
    }
  }
  */
}
