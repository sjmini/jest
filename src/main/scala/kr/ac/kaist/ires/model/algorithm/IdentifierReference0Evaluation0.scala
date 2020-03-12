package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IdentifierReference0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""IdentifierReference0Evaluation0""", List(Id("""this"""), Id("""Identifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Identifier"""))), EStr("""StringValue""")).setId(13359), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(13360), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(13361), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13362)).setId(13363), ISeq(List()).setId(13375)).setId(13365), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(13366), IReturn(ERef(RefId(Id("""__x2__""")))).setId(13367))).setId(13379))
  val instToStepMap: Map[Int, Int] = HashMap(13360 -> 0, 13365 -> 0, 13359 -> 0, 13366 -> 0, 13368 -> 0, 13367 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13360, 13365, 13359, 13366, 13368, 13367))
  /* Beautified form:
  "IdentifierReference0Evaluation0" (this, Identifier) => {
    access __x0__ = (Identifier "StringValue")
    app __x1__ = (ResolveBinding __x0__)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
