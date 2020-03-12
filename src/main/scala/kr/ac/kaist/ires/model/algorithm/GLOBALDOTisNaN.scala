package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTisNaN {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.isNaN""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(62814), ILet(Id("""number"""), ERef(RefId(Id("""__x0__""")))).setId(62815), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""number"""))))).setId(62817), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(62818), IReturn(ERef(RefId(Id("""__x1__""")))).setId(62819)).setId(62820), ISeq(List()).setId(62840)).setId(62822), ILet(Id("""num"""), ERef(RefId(Id("""__x1__""")))).setId(62823), IIf(EBOp(OEq, ERef(RefId(Id("""num"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(62825), IReturn(ERef(RefId(Id("""__x2__""")))).setId(62826))).setId(62845), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(62828), IReturn(ERef(RefId(Id("""__x3__""")))).setId(62829))).setId(62848)).setId(62831))).setId(62850))
  val instToStepMap: Map[Int, Int] = HashMap(62814 -> 0, 62824 -> 1, 62827 -> 2, 62817 -> 1, 62815 -> 0, 62823 -> 1, 62828 -> 3, 62831 -> 3, 62816 -> 0, 62829 -> 3, 62825 -> 2, 62822 -> 1, 62832 -> 3, 62830 -> 3, 62826 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(62814, 62815, 62816), 1 -> HashSet(62824, 62817, 62823, 62822), 2 -> HashSet(62827, 62825, 62826), 3 -> HashSet(62828, 62831, 62829, 62832, 62830))
  /* Beautified form:
  "GLOBAL.isNaN" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let number = __x0__
    app __x1__ = (ToNumber number)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let num = __x1__
    if (= num NaN) {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {
      app __x3__ = (WrapCompletion false)
      return __x3__
    }
  }
  */
}
