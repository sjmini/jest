package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object YieldExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""YieldExpression0Evaluation0""", List(Id("""this""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetGeneratorKind"""))), List()).setId(40454), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(40455), IReturn(ERef(RefId(Id("""__x0__""")))).setId(40456)).setId(40457), ISeq(List()).setId(40486)).setId(40459), ILet(Id("""generatorKind"""), ERef(RefId(Id("""__x0__""")))).setId(40460), IIf(EBOp(OEq, ERef(RefId(Id("""generatorKind"""))), ERef(RefId(Id("""CONST_async""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorYield"""))), List(EUndef)).setId(40462), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(40463), IReturn(ERef(RefId(Id("""__x1__""")))).setId(40464)).setId(40465), ISeq(List()).setId(40493)).setId(40466), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(40467), IReturn(ERef(RefId(Id("""__x2__""")))).setId(40468))).setId(40497), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(false))).setId(40470), IApp(Id("""__x4__"""), ERef(RefId(Id("""GeneratorYield"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(40471), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(40472), IReturn(ERef(RefId(Id("""__x4__""")))).setId(40473)).setId(40474), ISeq(List()).setId(40503)).setId(40475), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(40476), IReturn(ERef(RefId(Id("""__x5__""")))).setId(40477))).setId(40507)).setId(40479))).setId(40509))
  val instToStepMap: Map[Int, Int] = HashMap(40466 -> 1, 40478 -> 2, 40469 -> 1, 40475 -> 2, 40480 -> 2, 40468 -> 1, 40460 -> 0, 40477 -> 2, 40467 -> 1, 40470 -> 2, 40461 -> 0, 40462 -> 1, 40479 -> 2, 40476 -> 2, 40459 -> 0, 40454 -> 0, 40471 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(40461, 40459, 40454, 40460), 1 -> HashSet(40466, 40469, 40462, 40468, 40467), 2 -> HashSet(40470, 40478, 40475, 40479, 40476, 40480, 40471, 40477))
  /* Beautified form:
  "YieldExpression0Evaluation0" (this) => {
    app __x0__ = (GetGeneratorKind )
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let generatorKind = __x0__
    if (= generatorKind CONST_async) {
      app __x1__ = (AsyncGeneratorYield undefined)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {
      app __x3__ = (CreateIterResultObject undefined false)
      app __x4__ = (GeneratorYield __x3__)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    }
  }
  */
}
