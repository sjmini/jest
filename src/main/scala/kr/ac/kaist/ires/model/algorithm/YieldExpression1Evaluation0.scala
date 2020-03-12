package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object YieldExpression1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""YieldExpression1Evaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()).setId(40538), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(40539), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40540)).setId(40541), ISeq(List()).setId(40581)).setId(40543), ILet(Id("""generatorKind"""), ERef(RefId(Id("""__x0__""")))).setId(40544), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(40547), ILet(Id("""exprRef"""), ERef(RefId(Id("""__x1__""")))).setId(40548), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""exprRef"""))))).setId(40550), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(40551), IReturn(ERef(RefId(Id("""__x2__""")))).setId(40552)).setId(40553), ISeq(List()).setId(40590)).setId(40554), ILet(Id("""value"""), ERef(RefId(Id("""__x2__""")))).setId(40555), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(ERef(RefId(Id("""value"""))))).setId(40557), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(40558), IReturn(ERef(RefId(Id("""__x3__""")))).setId(40559)).setId(40560), ISeq(List()).setId(40597)).setId(40561), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(40562), IReturn(ERef(RefId(Id("""__x4__""")))).setId(40563))).setId(40601), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), EBool(false))).setId(40565), IApp(Id("""__x6__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(40566), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(40567), IReturn(ERef(RefId(Id("""__x6__""")))).setId(40568)).setId(40569), ISeq(List()).setId(40607)).setId(40570), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(40571), IReturn(ERef(RefId(Id("""__x7__""")))).setId(40572))).setId(40611)).setId(40574))).setId(40613))
  val instToStepMap: Map[Int, Int] = HashMap(40556 -> 2, 40563 -> 3, 40564 -> 3, 40573 -> 4, 40572 -> 4, 40548 -> 1, 40544 -> 0, 40555 -> 2, 40561 -> 3, 40549 -> 1, 40566 -> 4, 40575 -> 4, 40543 -> 0, 40571 -> 4, 40554 -> 2, 40545 -> 0, 40562 -> 3, 40550 -> 2, 40570 -> 4, 40557 -> 3, 40565 -> 4, 40547 -> 1, 40574 -> 4, 40538 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(40544, 40543, 40545, 40538), 1 -> HashSet(40547, 40548, 40549), 2 -> HashSet(40556, 40555, 40554, 40550), 3 -> HashSet(40563, 40564, 40561, 40562, 40557), 4 -> HashSet(40573, 40572, 40565, 40566, 40575, 40571, 40570, 40574))
  /* Beautified form:
  "YieldExpression1Evaluation0" (this, AssignmentExpression) => {
    app __x0__ = (GetGeneratorKind )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    access __x1__ = (AssignmentExpression "Evaluation")
    let exprRef = __x1__
    app __x2__ = (GetValue exprRef)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let value = __x2__
    if (= generatorKind CONST_async) {
      app __x3__ = (AsyncGeneratorYield value)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {
      app __x5__ = (CreateIterResultObject value false)
      app __x6__ = (GeneratorYield __x5__)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
  }
  */
}
