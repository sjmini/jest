package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTReferenceError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.ReferenceError""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68417), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(68418), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(68420), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(68422)).setId(68424), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ReferenceErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(68426), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68427), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68428)).setId(68429), ISeq(List()).setId(68466)).setId(68431), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(68432), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(68434), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68435), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68436)).setId(68437), ISeq(List()).setId(68473)).setId(68438), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(68439), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(68441), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(68443), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68444), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68445)).setId(68446), ISeq(List()).setId(68481)).setId(68447), IExpr(ERef(RefId(Id("""__x3__""")))).setId(68448))).setId(68484), ISeq(List()).setId(68485)).setId(68451), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68453), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68454))).setId(68489))
  val instToStepMap: Map[Int, Int] = HashMap(68419 -> 0, 68440 -> 7, 68426 -> 2, 68418 -> 0, 68431 -> 2, 68441 -> 7, 68450 -> 7, 68454 -> 9, 68451 -> 8, 68425 -> 1, 68434 -> 7, 68438 -> 7, 68424 -> 1, 68439 -> 7, 68442 -> 7, 68432 -> 2, 68447 -> 7, 68422 -> 1, 68420 -> 1, 68452 -> 8, 68433 -> 2, 68423 -> 1, 68417 -> 0, 68449 -> 7, 68455 -> 9, 68448 -> 7, 68453 -> 9, 68421 -> 1, 68443 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(68419, 68418, 68417), 5 -> HashSet(68440, 68434, 68438, 68439), 1 -> HashSet(68425, 68423, 68421, 68424, 68422, 68420), 6 -> HashSet(68441, 68442), 9 -> HashSet(68454, 68455, 68453), 2 -> HashSet(68426, 68431, 68433, 68432), 7 -> HashSet(68440, 68441, 68450, 68434, 68438, 68449, 68448, 68443, 68439, 68442, 68447), 8 -> HashSet(68452, 68451))
  /* Beautified form:
  "GLOBAL.ReferenceError" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%ReferenceErrorPrototype%" (new ["ErrorData"]))
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
