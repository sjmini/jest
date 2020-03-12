package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryObjectDOTDelete {
  val length: Int = 1
  val func: Func = Func("""OrdinaryObject.Delete""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryDelete"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50857), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50858), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50859)).setId(50860), ISeq(List()).setId(50871)).setId(50862), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(50863), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50864))).setId(50875))
  val instToStepMap: Map[Int, Int] = HashMap(50864 -> 0, 50857 -> 0, 50865 -> 0, 50862 -> 0, 50863 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(50864, 50857, 50865, 50862, 50863))
  /* Beautified form:
  "OrdinaryObject.Delete" (O, P) => {
    app __x0__ = (OrdinaryDelete O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
