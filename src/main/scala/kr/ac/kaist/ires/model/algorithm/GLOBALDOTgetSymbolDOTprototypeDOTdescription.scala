package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTgetSymbolDOTprototypeDOTdescription {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.getSymbol.prototype.description""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""s"""), ERef(RefId(Id("""this""")))).setId(67773), IApp(Id("""__x0__"""), ERef(RefId(Id("""thisSymbolValue"""))), List(ERef(RefId(Id("""s"""))))).setId(67775), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(67776), IReturn(ERef(RefId(Id("""__x0__""")))).setId(67777)).setId(67778), ISeq(List()).setId(67792)).setId(67780), ILet(Id("""sym"""), ERef(RefId(Id("""__x0__""")))).setId(67781), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""sym""")), EStr("""Description"""))))).setId(67783), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67784))).setId(67797))
  val instToStepMap: Map[Int, Int] = HashMap(67773 -> 0, 67781 -> 1, 67785 -> 2, 67782 -> 1, 67783 -> 2, 67775 -> 1, 67780 -> 1, 67774 -> 0, 67784 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(67773, 67774), 1 -> HashSet(67781, 67782, 67775, 67780), 2 -> HashSet(67785, 67783, 67784))
  /* Beautified form:
  "GLOBAL.getSymbol.prototype.description" (this, argumentsList, NewTarget) => {
    let s = this
    app __x0__ = (thisSymbolValue s)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let sym = __x0__
    app __x1__ = (WrapCompletion sym["Description"])
    return __x1__
  }
  */
}
