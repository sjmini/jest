package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForBinding0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""ForBinding0Evaluation0""", List(Id("""this"""), Id("""BindingIdentifier""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(33869), ILet(Id("""bindingId"""), ERef(RefId(Id("""__x0__""")))).setId(33870), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(33872), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(33873), IReturn(ERef(RefId(Id("""__x1__""")))).setId(33874)).setId(33875), ISeq(List()).setId(33888)).setId(33877), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(33878), IReturn(ERef(RefId(Id("""__x2__""")))).setId(33879))).setId(33892))
  val instToStepMap: Map[Int, Int] = HashMap(33870 -> 0, 33880 -> 1, 33869 -> 0, 33877 -> 1, 33872 -> 1, 33879 -> 1, 33871 -> 0, 33878 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(33870, 33869, 33871), 1 -> HashSet(33880, 33877, 33872, 33879, 33878))
  /* Beautified form:
  "ForBinding0Evaluation0" (this, BindingIdentifier) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
