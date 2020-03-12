package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DebuggerStatement0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""DebuggerStatement0Evaluation0""", List(Id("""this""")), None, ISeq(List(IIf(ENotSupported("""ImplDependent"""), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(37668), IExpr(ENotSupported("""Etc""")).setId(37668))).setId(37682), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(37670), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(37671))).setId(37685)).setId(37674), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(37676), IReturn(ERef(RefId(Id("""__x1__""")))).setId(37677))).setId(37689))
  val instToStepMap: Map[Int, Int] = HashMap(37672 -> 6, 37676 -> 7, 37673 -> 6, 37668 -> 3, 37670 -> 6, 37678 -> 7, 37674 -> 6, 37671 -> 6, 37677 -> 7, 37669 -> 3, 37675 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(2 -> HashSet(37668), 3 -> HashSet(37668, 37669), 6 -> HashSet(37672, 37673, 37675, 37670, 37674, 37671), 7 -> HashSet(37676, 37678, 37677))
  /* Beautified form:
  "DebuggerStatement0Evaluation0" (this) => {
    if !!! "ImplDependent" {
      !!! "Etc"
      !!! "Etc"
    } else {
      app __x0__ = (NormalCompletion CONST_empty)
      let result = __x0__
    }
    app __x1__ = (WrapCompletion result)
    return __x1__
  }
  */
}
