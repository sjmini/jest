package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SymbolDescriptiveString {
  val length: Int = 1
  val func: Func = Func("""SymbolDescriptiveString""", List(Id("""sym""")), None, ISeq(List(ILet(Id("""desc"""), ERef(RefProp(RefId(Id("""sym""")), EStr("""Description""")))).setId(67845), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), IAssign(RefId(Id("""desc""")), EStr("""""")).setId(67847), ISeq(List()).setId(67857)).setId(67849), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EStr("""Symbol("""), ERef(RefId(Id("""desc""")))), EStr(""")""")))).setId(67851), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67852))).setId(67861))
  val instToStepMap: Map[Int, Int] = HashMap(67849 -> 3, 67848 -> 2, 67845 -> 1, 67852 -> 5, 67853 -> 5, 67851 -> 5, 67846 -> 1, 67844 -> 4, 67850 -> 3, 67847 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67844), 5 -> HashSet(67852, 67853, 67851), 1 -> HashSet(67845, 67846), 2 -> HashSet(67848, 67847), 3 -> HashSet(67849, 67850), 4 -> HashSet(67844))
  /* Beautified form:
  "SymbolDescriptiveString" (sym) => {
    let desc = sym["Description"]
    if (= desc undefined) desc = "" else {}
    app __x0__ = (WrapCompletion (+ (+ "Symbol(" desc) ")"))
    return __x0__
  }
  */
}
