package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSymbolDOTprototypeDOTSYMBOL_toPrimitive {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Symbol.prototype.SYMBOL_toPrimitive""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67897), ILet(Id("""hint"""), ERef(RefId(Id("""__x0__""")))).setId(67898), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisSymbolValue"""))), List(ERef(RefId(Id("""this"""))))).setId(67900), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(67901), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67902)).setId(67903), ISeq(List()).setId(67916)).setId(67905), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(67906), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67907))).setId(67920))
  val instToStepMap: Map[Int, Int] = HashMap(67900 -> 1, 67906 -> 1, 67907 -> 1, 67899 -> 0, 67908 -> 1, 67898 -> 0, 67897 -> 0, 67905 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(67899, 67898, 67897), 1 -> HashSet(67900, 67906, 67907, 67908, 67905))
  /* Beautified form:
  "GLOBAL.Symbol.prototype.SYMBOL_toPrimitive" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let hint = __x0__
    app __x1__ = (thisSymbolValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
