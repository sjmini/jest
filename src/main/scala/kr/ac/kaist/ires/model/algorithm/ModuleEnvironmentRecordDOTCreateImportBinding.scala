package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleEnvironmentRecordDOTCreateImportBinding {
  val length: Int = 3
  val func: Func = Func("""ModuleEnvironmentRecord.CreateImportBinding""", List(Id("""this"""), Id("""N"""), Id("""M"""), Id("""N2""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(49152), IExpr(ENotSupported("""Etc""")).setId(49152), IApp(Id("""__x0__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""CONST_empty"""))))).setId(49154), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(49155), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49156))).setId(49164))
  val instToStepMap: Map[Int, Int] = HashMap(49153 -> 3, 49152 -> 4, 49157 -> 5, 49156 -> 5, 49155 -> 5, 49154 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(49152), 5 -> HashSet(49157, 49156, 49155, 49154), 1 -> HashSet(49153), 2 -> HashSet(49153), 3 -> HashSet(49153), 4 -> HashSet(49152))
  /* Beautified form:
  "ModuleEnvironmentRecord.CreateImportBinding" (this, N, M, N2) => {
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (NormalCompletion CONST_empty)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
