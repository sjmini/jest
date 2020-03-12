package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement1Evaluation0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement0"""), Id("""Statement1""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Expression"""))), EStr("""Evaluation""")).setId(30427), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x0__""")))).setId(30428), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(30430), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(30431), IReturn(ERef(RefId(Id("""__x1__""")))).setId(30432)).setId(30433), ISeq(List()).setId(30467)).setId(30435), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(30436), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(30437), IReturn(ERef(RefId(Id("""__x2__""")))).setId(30438)).setId(30439), ISeq(List()).setId(30473)).setId(30440), ILet(Id("""exprValue"""), ERef(RefId(Id("""__x2__""")))).setId(30441), IIf(EBOp(OEq, ERef(RefId(Id("""exprValue"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""Statement0"""))), EStr("""Evaluation""")).setId(30444), ILet(Id("""stmtCompletion"""), ERef(RefId(Id("""__x3__""")))).setId(30445))).setId(30478), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""Statement1"""))), EStr("""Evaluation""")).setId(30449), ILet(Id("""stmtCompletion"""), ERef(RefId(Id("""__x4__""")))).setId(30450))).setId(30481)).setId(30453), IApp(Id("""__x5__"""), ERef(RefId(Id("""UpdateEmpty"""))), List(ERef(RefId(Id("""stmtCompletion"""))), EUndef)).setId(30455), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(30456), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(30457), IReturn(ERef(RefId(Id("""__x7__""")))).setId(30458))).setId(30487))
  val instToStepMap: Map[Int, Int] = HashMap(30427 -> 0, 30446 -> 4, 30436 -> 1, 30449 -> 7, 30430 -> 1, 30455 -> 8, 30435 -> 1, 30452 -> 7, 30447 -> 4, 30451 -> 7, 30454 -> 7, 30458 -> 8, 30441 -> 1, 30428 -> 0, 30450 -> 7, 30442 -> 1, 30459 -> 8, 30453 -> 7, 30429 -> 0, 30456 -> 8, 30444 -> 4, 30457 -> 8, 30440 -> 1, 30445 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(30427, 30429, 30428), 1 -> HashSet(30442, 30436, 30430, 30435, 30441, 30440), 7 -> HashSet(30453, 30449, 30452, 30451, 30454, 30450), 8 -> HashSet(30459, 30456, 30455, 30457, 30458), 4 -> HashSet(30446, 30447, 30444, 30445))
  /* Beautified form:
  "IfStatement1Evaluation0" (this, Expression, Statement0, Statement1) => {
    access __x0__ = (Expression "Evaluation")
    let exprRef = __x0__
    app __x1__ = (GetValue exprRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (ToBoolean __x1__)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let exprValue = __x2__
    if (= exprValue true) {
      access __x3__ = (Statement0 "Evaluation")
      let stmtCompletion = __x3__
    } else {
      access __x4__ = (Statement1 "Evaluation")
      let stmtCompletion = __x4__
    }
    app __x5__ = (UpdateEmpty stmtCompletion undefined)
    app __x6__ = (Completion __x5__)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
