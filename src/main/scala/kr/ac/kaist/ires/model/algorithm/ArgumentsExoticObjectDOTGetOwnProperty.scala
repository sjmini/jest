package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentsExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""ArgumentsExoticObject.GetOwnProperty""", List(Id("""args"""), Id("""P""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))).setId(55361), IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))))).setId(55363), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))).setId(55364), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))).setId(55366), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55367))).setId(55396), ISeq(List()).setId(55397)).setId(55370), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))).setId(55372), IApp(Id("""__x2__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55374), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(55375), IReturn(ERef(RefId(Id("""__x2__""")))).setId(55376)).setId(55377), ISeq(List()).setId(55404)).setId(55378), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x2__""")))).setId(55379), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55381), IAssign(RefProp(RefId(Id("""desc""")), EStr("""Value""")), ERef(RefId(Id("""__x3__""")))).setId(55382))).setId(55409), ISeq(List()).setId(55410)).setId(55385), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""desc"""))))).setId(55387), IReturn(ERef(RefId(Id("""__x4__""")))).setId(55388))).setId(55414))
  val instToStepMap: Map[Int, Int] = HashMap(55386 -> 9, 55389 -> 10, 55370 -> 3, 55379 -> 5, 55367 -> 2, 55388 -> 10, 55380 -> 5, 55383 -> 8, 55387 -> 10, 55365 -> 1, 55371 -> 3, 55373 -> 4, 55363 -> 1, 55366 -> 2, 55381 -> 8, 55378 -> 5, 55385 -> 9, 55382 -> 8, 55364 -> 1, 55361 -> 0, 55368 -> 2, 55374 -> 5, 55372 -> 4, 55362 -> 0, 55384 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55361, 55362), 5 -> HashSet(55378, 55379, 55380, 55374), 10 -> HashSet(55389, 55388, 55387), 1 -> HashSet(55363, 55364, 55365), 9 -> HashSet(55386, 55385), 2 -> HashSet(55366, 55367, 55368), 3 -> HashSet(55371, 55370), 8 -> HashSet(55381, 55382, 55383, 55384), 4 -> HashSet(55373, 55372))
  /* Beautified form:
  "ArgumentsExoticObject.GetOwnProperty" (args, P) => {
    let args = args
    app __x0__ = (OrdinaryGetOwnProperty args P)
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (WrapCompletion desc)
      return __x1__
    } else {}
    let map = args["ParameterMap"]
    app __x2__ = (HasOwnProperty map P)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let isMapped = __x2__
    if (= isMapped true) {
      app __x3__ = (Get map P)
      desc["Value"] = __x3__
    } else {}
    app __x4__ = (WrapCompletion desc)
    return __x4__
  }
  */
}
