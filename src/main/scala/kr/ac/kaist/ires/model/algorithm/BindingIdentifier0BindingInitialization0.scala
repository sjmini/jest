package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier0BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier0BindingInitialization0""", List(Id("""this"""), Id("""Identifier"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Identifier"""))), EStr("""StringValue""")).setId(13204), ILet(Id("""name"""), ERef(RefId(Id("""__x0__""")))).setId(13205), IApp(Id("""__x1__"""), ERef(RefId(Id("""InitializeBoundName"""))), List(ERef(RefId(Id("""name"""))), ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(13207), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(13208), IReturn(ERef(RefId(Id("""__x1__""")))).setId(13209)).setId(13210), ISeq(List()).setId(13223)).setId(13212), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(13213), IReturn(ERef(RefId(Id("""__x2__""")))).setId(13214))).setId(13227))
  val instToStepMap: Map[Int, Int] = HashMap(13212 -> 1, 13206 -> 0, 13205 -> 0, 13213 -> 1, 13204 -> 0, 13214 -> 1, 13207 -> 1, 13215 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(13206, 13205, 13204), 1 -> HashSet(13212, 13213, 13214, 13207, 13215))
  /* Beautified form:
  "BindingIdentifier0BindingInitialization0" (this, Identifier, value, environment) => {
    access __x0__ = (Identifier "StringValue")
    let name = __x0__
    app __x1__ = (InitializeBoundName name value environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
