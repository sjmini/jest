package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTfromEntries {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.fromEntries""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64363), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(64364), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""iterable"""))))).setId(64366), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64367), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64368)).setId(64369), ISeq(List()).setId(64401)).setId(64371), IExpr(ERef(RefId(Id("""__x1__""")))).setId(64372), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(64374), ILet(Id("""obj"""), ERef(RefId(Id("""__x2__""")))).setId(64375), ILet(Id("""stepsDefine"""), ENotSupported("""Algorithms""")).setId(64377), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""stepsDefine"""))), EList(List()))).setId(64379), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(64380), IReturn(ERef(RefId(Id("""__x3__""")))).setId(64381)).setId(64382), ISeq(List()).setId(64411)).setId(64383), ILet(Id("""adder"""), ERef(RefId(Id("""__x3__""")))).setId(64384), IApp(Id("""__x4__"""), ERef(RefId(Id("""AddEntriesFromIterable"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""iterable"""))), ERef(RefId(Id("""adder"""))))).setId(64386), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(64387), IReturn(ERef(RefId(Id("""__x4__""")))).setId(64388)).setId(64389), ISeq(List()).setId(64418)).setId(64390), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(64391), IReturn(ERef(RefId(Id("""__x5__""")))).setId(64392))).setId(64422))
  val instToStepMap: Map[Int, Int] = HashMap(64386 -> 6, 64376 -> 2, 64375 -> 2, 64363 -> 0, 64377 -> 4, 64392 -> 6, 64393 -> 6, 64378 -> 4, 64373 -> 1, 64366 -> 1, 64372 -> 1, 64379 -> 5, 64390 -> 6, 64371 -> 1, 64391 -> 6, 64370 -> 3, 64364 -> 0, 64385 -> 5, 64384 -> 5, 64374 -> 2, 64365 -> 0, 64383 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(64363, 64364, 64365), 5 -> HashSet(64379, 64385, 64384, 64383), 1 -> HashSet(64371, 64373, 64366, 64372), 6 -> HashSet(64386, 64390, 64391, 64392, 64393), 2 -> HashSet(64376, 64375, 64374), 3 -> HashSet(64370), 4 -> HashSet(64377, 64378))
  /* Beautified form:
  "GLOBAL.Object.fromEntries" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    app __x1__ = (RequireObjectCoercible iterable)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    let obj = __x2__
    let stepsDefine = !!! "Algorithms"
    app __x3__ = (CreateBuiltinFunction stepsDefine (new []))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let adder = __x3__
    app __x4__ = (AddEntriesFromIterable obj iterable adder)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
