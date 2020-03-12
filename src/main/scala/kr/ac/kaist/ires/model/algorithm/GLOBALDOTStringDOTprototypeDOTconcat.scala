package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTconcat {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.concat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71043), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(71044), IReturn(ERef(RefId(Id("""__x0__""")))).setId(71045)).setId(71046), ISeq(List()).setId(71083)).setId(71048), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(71049), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71051), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(71052), IReturn(ERef(RefId(Id("""__x1__""")))).setId(71053)).setId(71054), ISeq(List()).setId(71090)).setId(71055), ILet(Id("""S"""), ERef(RefId(Id("""__x1__""")))).setId(71056), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(71058), ILet(Id("""R"""), ERef(RefId(Id("""S""")))).setId(71060), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""args""")), EStr("""length""")))), ISeq(List(ILet(Id("""next"""), EPop(ERef(RefId(Id("""args"""))), EINum(0L))).setId(71062), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""next"""))))).setId(71063), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71064), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71065)).setId(71066), ISeq(List()).setId(71100)).setId(71067), ILet(Id("""nextString"""), ERef(RefId(Id("""__x2__""")))).setId(71068), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""nextString"""))))).setId(71070))).setId(71104)).setId(71073), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(71075), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71076))).setId(71108))
  val instToStepMap: Map[Int, Int] = HashMap(71057 -> 1, 71069 -> 9, 71048 -> 0, 71051 -> 1, 71061 -> 3, 71055 -> 1, 71070 -> 9, 71076 -> 10, 71067 -> 9, 71071 -> 9, 71074 -> 9, 71056 -> 1, 71060 -> 3, 71063 -> 9, 71075 -> 10, 71059 -> 2, 71049 -> 0, 71062 -> 9, 71077 -> 10, 71068 -> 9, 71050 -> 0, 71073 -> 9, 71058 -> 2, 71072 -> 9, 71043 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(71049, 71048, 71050, 71043), 10 -> HashSet(71077, 71076, 71075), 1 -> HashSet(71057, 71051, 71055, 71056), 9 -> HashSet(71062, 71069, 71070, 71067, 71071, 71074, 71063, 71068, 71073, 71072), 2 -> HashSet(71058, 71059), 7 -> HashSet(71062), 3 -> HashSet(71061, 71060), 8 -> HashSet(71069, 71067, 71063, 71068))
  /* Beautified form:
  "GLOBAL.String.prototype.concat" (this, argumentsList, NewTarget) => {
    app __x0__ = (RequireObjectCoercible this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (ToString O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    let args = argumentsList
    let R = S
    while (< 0i args["length"]) {
      let next = (pop args 0i)
      app __x2__ = (ToString next)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let nextString = __x2__
      R = (+ R nextString)
    }
    app __x3__ = (WrapCompletion R)
    return __x3__
  }
  */
}
