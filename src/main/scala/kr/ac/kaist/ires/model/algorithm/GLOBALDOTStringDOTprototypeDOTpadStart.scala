package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTpadStart {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.padStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72356), ILet(Id("""maxLength"""), ERef(RefId(Id("""__x0__""")))).setId(72357), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(72359), ILet(Id("""fillString"""), ERef(RefId(Id("""__x1__""")))).setId(72360), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72362), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72363), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72364)).setId(72365), ISeq(List()).setId(72387)).setId(72367), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(72368), IApp(Id("""__x3__"""), ERef(RefId(Id("""StringPad"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""maxLength"""))), ERef(RefId(Id("""fillString"""))), EStr("""start"""))).setId(72370), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72371), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72372)).setId(72373), ISeq(List()).setId(72394)).setId(72374), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(72375), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72376))).setId(72398))
  val instToStepMap: Map[Int, Int] = HashMap(72369 -> 2, 72360 -> 1, 72362 -> 2, 72374 -> 3, 72368 -> 2, 72370 -> 3, 72361 -> 1, 72375 -> 3, 72358 -> 0, 72367 -> 2, 72377 -> 3, 72376 -> 3, 72359 -> 1, 72356 -> 0, 72357 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(72358, 72356, 72357), 1 -> HashSet(72359, 72360, 72361), 2 -> HashSet(72367, 72369, 72362, 72368), 3 -> HashSet(72377, 72376, 72374, 72370, 72375))
  /* Beautified form:
  "GLOBAL.String.prototype.padStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let maxLength = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let fillString = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (StringPad O maxLength fillString "start")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
