package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSyntaxError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.SyntaxError""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(68523), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(68524), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(68526), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(68528)).setId(68530), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%SyntaxErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(68532), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(68533), IReturn(ERef(RefId(Id("""__x1__""")))).setId(68534)).setId(68535), ISeq(List()).setId(68572)).setId(68537), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(68538), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(68540), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(68541), IReturn(ERef(RefId(Id("""__x2__""")))).setId(68542)).setId(68543), ISeq(List()).setId(68579)).setId(68544), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(68545), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(68547), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(68549), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(68550), IReturn(ERef(RefId(Id("""__x3__""")))).setId(68551)).setId(68552), ISeq(List()).setId(68587)).setId(68553), IExpr(ERef(RefId(Id("""__x3__""")))).setId(68554))).setId(68590), ISeq(List()).setId(68591)).setId(68557), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(68559), IReturn(ERef(RefId(Id("""__x4__""")))).setId(68560))).setId(68595))
  val instToStepMap: Map[Int, Int] = HashMap(68525 -> 0, 68544 -> 7, 68531 -> 1, 68546 -> 7, 68559 -> 9, 68558 -> 8, 68560 -> 9, 68530 -> 1, 68523 -> 0, 68527 -> 1, 68538 -> 2, 68529 -> 1, 68548 -> 7, 68528 -> 1, 68545 -> 7, 68553 -> 7, 68532 -> 2, 68557 -> 8, 68547 -> 7, 68561 -> 9, 68540 -> 7, 68526 -> 1, 68554 -> 7, 68537 -> 2, 68549 -> 7, 68555 -> 7, 68524 -> 0, 68539 -> 2, 68556 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(68525, 68523, 68524), 5 -> HashSet(68540, 68544, 68546, 68545), 1 -> HashSet(68531, 68526, 68530, 68527, 68529, 68528), 6 -> HashSet(68547, 68548), 9 -> HashSet(68561, 68559, 68560), 2 -> HashSet(68532, 68537, 68538, 68539), 7 -> HashSet(68553, 68547, 68540, 68544, 68546, 68554, 68548, 68556, 68545, 68549, 68555), 8 -> HashSet(68557, 68558))
  /* Beautified form:
  "GLOBAL.SyntaxError" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%SyntaxErrorPrototype%" (new ["ErrorData"]))
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
