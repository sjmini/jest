package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1KeyedBindingInitialization1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1KeyedBindingInitialization1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer"""), Id("""value"""), Id("""environment"""), Id("""propertyName""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""propertyName"""))))).setId(29904), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(29905), IReturn(ERef(RefId(Id("""__x0__""")))).setId(29906)).setId(29907), ISeq(List()).setId(29936)).setId(29909), ILet(Id("""v"""), ERef(RefId(Id("""__x0__""")))).setId(29910), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IAccess(Id("""__x1__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(29913), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x1__""")))).setId(29914), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(29916), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(29917), IReturn(ERef(RefId(Id("""__x2__""")))).setId(29918)).setId(29919), ISeq(List()).setId(29945)).setId(29920), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x2__""")))).setId(29921))).setId(29948), ISeq(List()).setId(29949)).setId(29924), IAccess(Id("""__x3__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")).setId(29926), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(29927), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(29928), IReturn(ERef(RefId(Id("""__x5__""")))).setId(29929))).setId(29955))
  val instToStepMap: Map[Int, Int] = HashMap(29929 -> 6, 29920 -> 4, 29911 -> 0, 29930 -> 6, 29922 -> 4, 29925 -> 5, 29910 -> 0, 29927 -> 6, 29924 -> 5, 29916 -> 4, 29914 -> 4, 29923 -> 4, 29926 -> 6, 29921 -> 4, 29928 -> 6, 29904 -> 0, 29909 -> 0, 29915 -> 4, 29913 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(29911, 29910, 29904, 29909), 5 -> HashSet(29925, 29924), 6 -> HashSet(29929, 29926, 29930, 29928, 29927), 3 -> HashSet(29914, 29915, 29913), 4 -> HashSet(29920, 29923, 29922, 29921, 29916, 29914, 29915, 29913))
  /* Beautified form:
  "BindingElement1KeyedBindingInitialization1" (this, BindingPattern, Initializer, value, environment, propertyName) => {
    app __x0__ = (GetV value propertyName)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let v = __x0__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      access __x1__ = (Initializer "Evaluation")
      let defaultValue = __x1__
      app __x2__ = (GetValue defaultValue)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      v = __x2__
    } else {}
    access __x3__ = (BindingPattern "BindingInitialization")
    app __x4__ = (__x3__ v environment)
    app __x5__ = (WrapCompletion __x4__)
    return __x5__
  }
  */
}
