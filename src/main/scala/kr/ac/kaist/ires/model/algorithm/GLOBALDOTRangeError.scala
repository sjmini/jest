package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTRangeError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.RangeError""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68311), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(68312), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(68314), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(68316)).setId(68318), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%RangeErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(68320), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68321), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68322)).setId(68323), ISeq(List()).setId(68360)).setId(68325), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(68326), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(68328), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68329), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68330)).setId(68331), ISeq(List()).setId(68367)).setId(68332), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(68333), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(68335), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(68337), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68338), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68339)).setId(68340), ISeq(List()).setId(68375)).setId(68341), IExpr(ERef(RefId(Id("""__x3__""")))).setId(68342))).setId(68378), ISeq(List()).setId(68379)).setId(68345), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68347), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68348))).setId(68383))
  val instToStepMap: Map[Int, Int] = HashMap(68335 -> 7, 68318 -> 1, 68317 -> 1, 68349 -> 9, 68334 -> 7, 68341 -> 7, 68313 -> 0, 68345 -> 8, 68347 -> 9, 68343 -> 7, 68327 -> 2, 68342 -> 7, 68320 -> 2, 68346 -> 8, 68314 -> 1, 68316 -> 1, 68337 -> 7, 68348 -> 9, 68326 -> 2, 68333 -> 7, 68332 -> 7, 68315 -> 1, 68328 -> 7, 68325 -> 2, 68311 -> 0, 68312 -> 0, 68344 -> 7, 68336 -> 7, 68319 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(68313, 68311, 68312), 5 -> HashSet(68334, 68333, 68332, 68328), 1 -> HashSet(68318, 68317, 68316, 68315, 68314, 68319), 6 -> HashSet(68335, 68336), 9 -> HashSet(68349, 68348, 68347), 2 -> HashSet(68326, 68325, 68327, 68320), 7 -> HashSet(68335, 68337, 68334, 68341, 68333, 68332, 68343, 68328, 68342, 68344, 68336), 8 -> HashSet(68345, 68346))
  /* Beautified form:
  "GLOBAL.RangeError" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%RangeErrorPrototype%" (new ["ErrorData"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (= message undefined)) {
      app __x2__ = (ToString message)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let msg = __x2__
      let msgDesc = (new PropertyDescriptor("Value" -> msg, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true))
      app __x3__ = (DefinePropertyOrThrow O "message" msgDesc)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    app __x4__ = (WrapCompletion O)
    return __x4__
  }
  */
}
