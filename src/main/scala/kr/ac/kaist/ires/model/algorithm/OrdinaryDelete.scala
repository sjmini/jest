package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryDelete {
  val length: Int = 2
  val func: Func = Func("""OrdinaryDelete""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50886), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50887), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50888)).setId(50889), ISeq(List()).setId(50913)).setId(50890), ILet(Id("""desc"""), ERef(RefId(Id("""__x0__""")))).setId(50891), IIf(EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50893), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50894))).setId(50918), ISeq(List()).setId(50919)).setId(50896), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IDelete(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P"""))))).setId(50898), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50899), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50900))).setId(50924), ISeq(List()).setId(50925)).setId(50903), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50905), IReturn(ERef(RefId(Id("""__x3__""")))).setId(50906))).setId(50929))
  val instToStepMap: Map[Int, Int] = HashMap(50896 -> 3, 50906 -> 9, 50899 -> 7, 50886 -> 1, 50907 -> 9, 50893 -> 2, 50890 -> 1, 50902 -> 7, 50885 -> 0, 50898 -> 7, 50891 -> 1, 50894 -> 2, 50904 -> 8, 50901 -> 7, 50897 -> 3, 50900 -> 7, 50895 -> 2, 50905 -> 9, 50892 -> 1, 50903 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(50885), 1 -> HashSet(50886, 50892, 50890, 50891), 6 -> HashSet(50898), 9 -> HashSet(50906, 50907, 50905), 2 -> HashSet(50893, 50894, 50895), 7 -> HashSet(50899, 50902, 50898, 50901, 50900), 3 -> HashSet(50896, 50897), 8 -> HashSet(50903, 50904))
  /* Beautified form:
  "OrdinaryDelete" (O, P) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let desc = __x0__
    if (= desc undefined) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    if (= desc["Configurable"] true) {
      delete O["SubMap"][P]
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    app __x3__ = (WrapCompletion false)
    return __x3__
  }
  */
}
