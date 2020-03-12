package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSymbolDOTfor {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Symbol.for""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67634), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(67635), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""key"""))))).setId(67637), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(67638), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67639)).setId(67640), ISeq(List()).setId(67658)).setId(67642), ILet(Id("""stringKey"""), ERef(RefId(Id("""__x1__""")))).setId(67643), IExpr(ENotSupported("""Etc""")).setId(67645), ILet(Id("""newSymbol"""), ESymbol(ERef(RefId(Id("""stringKey"""))))).setId(67646), IExpr(ENotSupported("""Etc""")).setId(67645), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newSymbol"""))))).setId(67648), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67649))).setId(67666))
  val instToStepMap: Map[Int, Int] = HashMap(67649 -> 7, 67646 -> 5, 67642 -> 1, 67634 -> 0, 67643 -> 1, 67647 -> 5, 67644 -> 1, 67648 -> 7, 67645 -> 6, 67650 -> 7, 67641 -> 4, 67635 -> 0, 67636 -> 0, 67637 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67634, 67636, 67635), 5 -> HashSet(67646, 67647), 1 -> HashSet(67642, 67643, 67644, 67637), 6 -> HashSet(67645), 7 -> HashSet(67649, 67648, 67650), 3 -> HashSet(67645), 4 -> HashSet(67641))
  /* Beautified form:
  "GLOBAL.Symbol.for" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    app __x1__ = (ToString key)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let stringKey = __x1__
    !!! "Etc"
    let newSymbol = (new 'stringKey)
    !!! "Etc"
    app __x2__ = (WrapCompletion newSymbol)
    return __x2__
  }
  */
}
