package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTTypeError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.TypeError""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68629), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(68630), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(68632), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(68634)).setId(68636), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%TypeErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(68638), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68639), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68640)).setId(68641), ISeq(List()).setId(68678)).setId(68643), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(68644), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(68646), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68647), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68648)).setId(68649), ISeq(List()).setId(68685)).setId(68650), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(68651), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(68653), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(68655), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68656), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68657)).setId(68658), ISeq(List()).setId(68693)).setId(68659), IExpr(ERef(RefId(Id("""__x3__""")))).setId(68660))).setId(68696), ISeq(List()).setId(68697)).setId(68663), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68665), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68666))).setId(68701))
  val instToStepMap: Map[Int, Int] = HashMap(68660 -> 7, 68643 -> 2, 68659 -> 7, 68665 -> 9, 68664 -> 8, 68666 -> 9, 68630 -> 0, 68662 -> 7, 68638 -> 2, 68644 -> 2, 68629 -> 0, 68661 -> 7, 68651 -> 7, 68635 -> 1, 68667 -> 9, 68652 -> 7, 68650 -> 7, 68653 -> 7, 68633 -> 1, 68646 -> 7, 68632 -> 1, 68636 -> 1, 68637 -> 1, 68654 -> 7, 68634 -> 1, 68655 -> 7, 68631 -> 0, 68663 -> 8, 68645 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(68630, 68631, 68629), 5 -> HashSet(68652, 68650, 68646, 68651), 1 -> HashSet(68635, 68633, 68632, 68634, 68636, 68637), 6 -> HashSet(68653, 68654), 9 -> HashSet(68667, 68665, 68666), 2 -> HashSet(68643, 68645, 68638, 68644), 7 -> HashSet(68660, 68652, 68659, 68646, 68654, 68655, 68662, 68661, 68651, 68650, 68653), 8 -> HashSet(68664, 68663))
  /* Beautified form:
  "GLOBAL.TypeError" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%TypeErrorPrototype%" (new ["ErrorData"]))
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
