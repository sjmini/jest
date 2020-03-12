package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTBoolean {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Boolean""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67364), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(67365), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToBoolean"""))), List(ERef(RefId(Id("""value"""))))).setId(67367), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(67368), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67369)).setId(67370), ISeq(List()).setId(67399)).setId(67372), ILet(Id("""b"""), ERef(RefId(Id("""__x1__""")))).setId(67373), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""b"""))))).setId(67375), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67376))).setId(67404), ISeq(List()).setId(67405)).setId(67378), IApp(Id("""__x3__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%BooleanPrototype%"""), EList(List(EStr("""BooleanData"""))))).setId(67380), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(67381), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67382)).setId(67383), ISeq(List()).setId(67411)).setId(67384), ILet(Id("""O"""), ERef(RefId(Id("""__x3__""")))).setId(67385), IAssign(RefProp(RefId(Id("""O""")), EStr("""BooleanData""")), ERef(RefId(Id("""b""")))).setId(67387), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(67389), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67390))).setId(67417))
  val instToStepMap: Map[Int, Int] = HashMap(67373 -> 1, 67387 -> 5, 67372 -> 1, 67379 -> 3, 67364 -> 0, 67386 -> 4, 67391 -> 6, 67365 -> 0, 67384 -> 4, 67390 -> 6, 67385 -> 4, 67366 -> 0, 67377 -> 2, 67389 -> 6, 67374 -> 1, 67378 -> 3, 67376 -> 2, 67367 -> 1, 67388 -> 5, 67375 -> 2, 67380 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67364, 67365, 67366), 5 -> HashSet(67388, 67387), 1 -> HashSet(67367, 67373, 67372, 67374), 6 -> HashSet(67391, 67390, 67389), 2 -> HashSet(67376, 67375, 67377), 3 -> HashSet(67378, 67379), 4 -> HashSet(67386, 67384, 67385, 67380))
  /* Beautified form:
  "GLOBAL.Boolean" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    app __x1__ = (ToBoolean value)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let b = __x1__
    if (= NewTarget undefined) {
      app __x2__ = (WrapCompletion b)
      return __x2__
    } else {}
    app __x3__ = (OrdinaryCreateFromConstructor NewTarget "%BooleanPrototype%" (new ["BooleanData"]))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let O = __x3__
    O["BooleanData"] = b
    app __x4__ = (WrapCompletion O)
    return __x4__
  }
  */
}
