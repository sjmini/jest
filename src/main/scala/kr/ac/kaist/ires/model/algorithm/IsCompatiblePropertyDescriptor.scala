package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsCompatiblePropertyDescriptor {
  val length: Int = 3
  val func: Func = Func("""IsCompatiblePropertyDescriptor""", List(Id("""Extensible"""), Id("""Desc"""), Id("""Current""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ValidateAndApplyPropertyDescriptor"""))), List(EUndef, EUndef, ERef(RefId(Id("""Extensible"""))), ERef(RefId(Id("""Desc"""))), ERef(RefId(Id("""Current"""))))).setId(49600), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49601), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49602))).setId(49608))
  val instToStepMap: Map[Int, Int] = Map(49600 -> 0, 49601 -> 0, 49602 -> 0, 49603 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(49602, 49600, 49603, 49601))
  /* Beautified form:
  "IsCompatiblePropertyDescriptor" (Extensible, Desc, Current) => {
    app __x0__ = (ValidateAndApplyPropertyDescriptor undefined undefined Extensible Desc Current)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
