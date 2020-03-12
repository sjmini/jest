package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0KeyedBindingInitialization1 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0KeyedBindingInitialization1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer"""), Id("""value"""), Id("""environment"""), Id("""propertyName""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(29980), ILet(Id("""bindingId"""), ERef(RefId(Id("""__x0__""")))).setId(29981), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""bindingId"""))), ERef(RefId(Id("""environment"""))))).setId(29983), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(29984), IReturn(ERef(RefId(Id("""__x1__""")))).setId(29985)).setId(29986), ISeq(List()).setId(30042)).setId(29988), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(29989), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetV"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""propertyName"""))))).setId(29991), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(29992), IReturn(ERef(RefId(Id("""__x2__""")))).setId(29993)).setId(29994), ISeq(List()).setId(30049)).setId(29995), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(29996), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(29998), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(29999), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(30000), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x5__""")))).setId(30001))).setId(30056), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(30005), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x6__""")))).setId(30006), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(30008), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(30009), IReturn(ERef(RefId(Id("""__x7__""")))).setId(30010)).setId(30011), ISeq(List()).setId(30063)).setId(30012), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x7__""")))).setId(30013))).setId(30066)).setId(30016))).setId(30068), ISeq(List()).setId(30069)).setId(30019), IIf(EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""v"""))))).setId(30021), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(30022), IReturn(ERef(RefId(Id("""__x8__""")))).setId(30023)).setId(30024), ISeq(List()).setId(30075)).setId(30025), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(30026), IReturn(ERef(RefId(Id("""__x9__""")))).setId(30027))).setId(30079), ISeq(List()).setId(30080)).setId(30029), IApp(Id("""__x10__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""v"""))))).setId(30031), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(30032), IReturn(ERef(RefId(Id("""__x11__""")))).setId(30033))).setId(30085))
  val instToStepMap: Map[Int, Int] = HashMap(30003 -> 7, 30007 -> 11, 29997 -> 2, 30013 -> 11, 30026 -> 13, 30025 -> 13, 30029 -> 14, 30006 -> 11, 29982 -> 0, 30032 -> 15, 30005 -> 11, 30027 -> 13, 29991 -> 2, 30008 -> 11, 30020 -> 12, 30021 -> 13, 30018 -> 11, 29980 -> 0, 29990 -> 1, 30030 -> 14, 30017 -> 11, 30000 -> 7, 30015 -> 11, 30002 -> 7, 30012 -> 11, 29998 -> 11, 29981 -> 0, 30016 -> 11, 29989 -> 1, 30028 -> 13, 30033 -> 15, 30001 -> 7, 29988 -> 1, 30019 -> 12, 29995 -> 2, 29983 -> 1, 30034 -> 15, 29996 -> 2, 30014 -> 11, 30031 -> 15, 29999 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(29980, 29981, 29982), 10 -> HashSet(30007, 30006, 30005), 14 -> HashSet(30030, 30029), 1 -> HashSet(29990, 29989, 29988, 29983), 13 -> HashSet(30021, 30026, 30025, 30028, 30027), 2 -> HashSet(29997, 29995, 29991, 29996), 12 -> HashSet(30019, 30020), 7 -> HashSet(30003, 30000, 30002, 30001, 29999), 11 -> HashSet(30018, 30007, 30013, 30017, 30015, 30006, 30016, 30005, 30008, 30014, 30012, 29998), 15 -> HashSet(30033, 30032, 30034, 30031))
  /* Beautified form:
  "SingleNameBinding0KeyedBindingInitialization1" (this, BindingIdentifier, Initializer, value, environment, propertyName) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (GetV value propertyName)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let v = __x2__
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x3__ = (IsAnonymousFunctionDefinition Initializer)
      if (= __x3__ true) {
        access __x4__ = (Initializer "NamedEvaluation")
        app __x5__ = (__x4__ bindingId)
        v = __x5__
      } else {
        access __x6__ = (Initializer "Evaluation")
        let defaultValue = __x6__
        app __x7__ = (GetValue defaultValue)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        v = __x7__
      }
    } else {}
    if (= environment undefined) {
      app __x8__ = (PutValue lhs v)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      app __x9__ = (WrapCompletion __x8__)
      return __x9__
    } else {}
    app __x10__ = (InitializeReferencedBinding lhs v)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
