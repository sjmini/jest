package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentsExoticObjectDOTDelete {
  val length: Int = 1
  val func: Func = Func("""ArgumentsExoticObject.Delete""", List(Id("""args"""), Id("""P""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))).setId(55777), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))).setId(55779), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55781), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(55782), IReturn(ERef(RefId(Id("""__x0__""")))).setId(55783)).setId(55784), ISeq(List()).setId(55812)).setId(55786), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x0__""")))).setId(55787), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryDelete"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))))).setId(55789), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(55790), IReturn(ERef(RefId(Id("""__x1__""")))).setId(55791)).setId(55792), ISeq(List()).setId(55819)).setId(55793), ILet(Id("""result"""), ERef(RefId(Id("""__x1__""")))).setId(55794), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""result"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""Delete"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55796), IExpr(ERef(RefId(Id("""__x2__""")))).setId(55797))).setId(55824), ISeq(List()).setId(55825)).setId(55800), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(55802), IReturn(ERef(RefId(Id("""__x3__""")))).setId(55803))).setId(55829))
  val instToStepMap: Map[Int, Int] = HashMap(55804 -> 8, 55796 -> 6, 55778 -> 0, 55793 -> 3, 55788 -> 2, 55789 -> 3, 55797 -> 6, 55801 -> 7, 55795 -> 3, 55798 -> 6, 55786 -> 2, 55800 -> 7, 55777 -> 0, 55781 -> 2, 55803 -> 8, 55802 -> 8, 55779 -> 1, 55794 -> 3, 55787 -> 2, 55780 -> 1, 55799 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55777, 55778), 1 -> HashSet(55779, 55780), 6 -> HashSet(55796, 55797, 55799, 55798), 2 -> HashSet(55781, 55788, 55787, 55786), 7 -> HashSet(55800, 55801), 3 -> HashSet(55793, 55789, 55794, 55795), 8 -> HashSet(55804, 55803, 55802))
  /* Beautified form:
  "ArgumentsExoticObject.Delete" (args, P) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isMapped = __x0__
    app __x1__ = (OrdinaryDelete args P)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let result = __x1__
    if (&& (= result true) (= isMapped true)) {
      app __x2__ = (map["Delete"] map P)
      __x2__
    } else {}
    app __x3__ = (WrapCompletion result)
    return __x3__
  }
  */
}
