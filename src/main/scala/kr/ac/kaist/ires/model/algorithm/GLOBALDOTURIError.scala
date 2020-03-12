package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTURIError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.URIError""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68735), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(68736), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(68738), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(68740)).setId(68742), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%URIErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(68744), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68745), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68746)).setId(68747), ISeq(List()).setId(68784)).setId(68749), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(68750), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(68752), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68753), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68754)).setId(68755), ISeq(List()).setId(68791)).setId(68756), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(68757), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(68759), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(68761), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68762), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68763)).setId(68764), ISeq(List()).setId(68799)).setId(68765), IExpr(ERef(RefId(Id("""__x3__""")))).setId(68766))).setId(68802), ISeq(List()).setId(68803)).setId(68769), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68771), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68772))).setId(68807))
  val instToStepMap: Map[Int, Int] = HashMap(68736 -> 0, 68772 -> 9, 68766 -> 7, 68761 -> 7, 68773 -> 9, 68750 -> 2, 68738 -> 1, 68765 -> 7, 68770 -> 8, 68737 -> 0, 68741 -> 1, 68749 -> 2, 68735 -> 0, 68760 -> 7, 68757 -> 7, 68739 -> 1, 68767 -> 7, 68752 -> 7, 68758 -> 7, 68769 -> 8, 68751 -> 2, 68743 -> 1, 68742 -> 1, 68759 -> 7, 68744 -> 2, 68768 -> 7, 68740 -> 1, 68771 -> 9, 68756 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(68736, 68737, 68735), 5 -> HashSet(68757, 68752, 68758, 68756), 1 -> HashSet(68739, 68738, 68741, 68740, 68743, 68742), 6 -> HashSet(68759, 68760), 9 -> HashSet(68772, 68773, 68771), 2 -> HashSet(68751, 68750, 68749, 68744), 7 -> HashSet(68757, 68766, 68761, 68758, 68765, 68759, 68768, 68756, 68760, 68767, 68752), 8 -> HashSet(68769, 68770))
  /* Beautified form:
  "GLOBAL.URIError" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%URIErrorPrototype%" (new ["ErrorData"]))
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
