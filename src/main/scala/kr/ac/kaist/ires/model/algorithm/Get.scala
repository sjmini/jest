package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Get {
  val length: Int = 2
  val func: Func = Func("""Get""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""O"""))))).setId(4966), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(4967), IReturn(ERef(RefId(Id("""__x0__""")))).setId(4968)).setId(4969), ISeq(List()).setId(4979)).setId(4970), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(4971), IReturn(ERef(RefId(Id("""__x1__""")))).setId(4972))).setId(4983))
  val instToStepMap: Map[Int, Int] = HashMap(4973 -> 2, 4970 -> 2, 4966 -> 2, 4965 -> 1, 4971 -> 2, 4972 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(4965), 1 -> HashSet(4965), 2 -> HashSet(4973, 4970, 4966, 4971, 4972))
  /* Beautified form:
  "Get" (O, P) => {
    app __x0__ = (O["Get"] O P O)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
