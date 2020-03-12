package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SingleNameBinding0IteratorBindingInitialization1 {
  val length: Int = 0
  val func: Func = Func("""SingleNameBinding0IteratorBindingInitialization1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(29089), ILet(Id("""bindingId"""), ERef(RefId(Id("""__x0__""")))).setId(29090), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""bindingId"""))), ERef(RefId(Id("""environment"""))))).setId(29092), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(29093), IReturn(ERef(RefId(Id("""__x1__""")))).setId(29094)).setId(29095), ISeq(List()).setId(29184)).setId(29097), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(29098), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(29100), ILet(Id("""next"""), ERef(RefId(Id("""__x2__""")))).setId(29101), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(29103), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29104), ISeq(List()).setId(29191)).setId(29106), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(29108), IReturn(ERef(RefId(Id("""next""")))).setId(29109)).setId(29110), ISeq(List()).setId(29196)).setId(29111), IExpr(ERef(RefId(Id("""next""")))).setId(29112), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29114), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(29116), ILet(Id("""v"""), ERef(RefId(Id("""__x4__""")))).setId(29117), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(29119), IIf(ERef(RefId(Id("""__x5__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29120), ISeq(List()).setId(29204)).setId(29122), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(29124), IReturn(ERef(RefId(Id("""v""")))).setId(29125)).setId(29126), ISeq(List()).setId(29209)).setId(29127), IExpr(ERef(RefId(Id("""v""")))).setId(29128))).setId(29212)).setId(29131))).setId(29214), ISeq(List()).setId(29215)).setId(29134), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(29136), ISeq(List()).setId(29218)).setId(29138), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(29140), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x7__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(29141), IApp(Id("""__x8__"""), ERef(RefId(Id("""__x7__"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(29142), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x8__""")))).setId(29143))).setId(29224), ISeq(List(IAccess(Id("""__x9__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(29147), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x9__""")))).setId(29148), IApp(Id("""__x10__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(29150), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(29151), IReturn(ERef(RefId(Id("""__x10__""")))).setId(29152)).setId(29153), ISeq(List()).setId(29231)).setId(29154), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x10__""")))).setId(29155))).setId(29234)).setId(29158))).setId(29236), ISeq(List()).setId(29237)).setId(29161), IIf(EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""v"""))))).setId(29163), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(29164), IReturn(ERef(RefId(Id("""__x11__""")))).setId(29165)).setId(29166), ISeq(List()).setId(29243)).setId(29167), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(29168), IReturn(ERef(RefId(Id("""__x12__""")))).setId(29169))).setId(29247), ISeq(List()).setId(29248)).setId(29171), IApp(Id("""__x13__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""v"""))))).setId(29173), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(29174), IReturn(ERef(RefId(Id("""__x14__""")))).setId(29175))).setId(29253))
  val instToStepMap: Map[Int, Int] = HashMap(29155 -> 26, 29097 -> 1, 29100 -> 14, 29176 -> 30, 29163 -> 28, 29103 -> 14, 29144 -> 22, 29131 -> 14, 29172 -> 29, 29159 -> 26, 29091 -> 0, 29140 -> 26, 29127 -> 14, 29112 -> 14, 29123 -> 14, 29150 -> 26, 29167 -> 28, 29118 -> 14, 29099 -> 1, 29135 -> 15, 29102 -> 14, 29137 -> 16, 29169 -> 28, 29105 -> 5, 29160 -> 26, 29128 -> 14, 29173 -> 30, 29141 -> 22, 29156 -> 26, 29092 -> 1, 29113 -> 14, 29114 -> 8, 29117 -> 14, 29134 -> 15, 29149 -> 26, 29116 -> 14, 29089 -> 0, 29121 -> 12, 29138 -> 17, 29170 -> 28, 29148 -> 26, 29098 -> 1, 29101 -> 14, 29174 -> 30, 29142 -> 22, 29157 -> 26, 29130 -> 14, 29162 -> 27, 29145 -> 22, 29120 -> 12, 29106 -> 14, 29133 -> 14, 29132 -> 14, 29147 -> 26, 29115 -> 8, 29122 -> 14, 29104 -> 5, 29175 -> 30, 29154 -> 26, 29143 -> 22, 29107 -> 14, 29171 -> 29, 29158 -> 26, 29111 -> 14, 29168 -> 28, 29129 -> 14, 29161 -> 27, 29139 -> 17, 29119 -> 14, 29090 -> 0, 29136 -> 16)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(29091, 29089, 29090), 5 -> HashSet(29105, 29104), 25 -> HashSet(29149, 29148, 29147), 14 -> HashSet(29127, 29118, 29102, 29128, 29113, 29117, 29116, 29101, 29130, 29132, 29122, 29107, 29119, 29100, 29103, 29131, 29112, 29123, 29106, 29133, 29111, 29129), 29 -> HashSet(29172, 29171), 1 -> HashSet(29099, 29092, 29098, 29097), 6 -> HashSet(29103, 29106, 29107), 28 -> HashSet(29163, 29167, 29169, 29170, 29168), 13 -> HashSet(29123, 29122, 29119), 17 -> HashSet(29138, 29139), 12 -> HashSet(29121, 29120), 7 -> HashSet(29112, 29113, 29111), 16 -> HashSet(29137, 29136), 11 -> HashSet(29118, 29117, 29116), 26 -> HashSet(29159, 29140, 29155, 29150, 29160, 29156, 29149, 29148, 29157, 29147, 29154, 29158), 8 -> HashSet(29114, 29115), 30 -> HashSet(29176, 29173, 29174, 29175), 4 -> HashSet(29102, 29101, 29100), 15 -> HashSet(29135, 29134), 22 -> HashSet(29144, 29141, 29142, 29145, 29143), 27 -> HashSet(29162, 29161))
  /* Beautified form:
  "SingleNameBinding0IteratorBindingInitialization1" (this, BindingIdentifier, Initializer, iteratorRecord, environment) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    if (= iteratorRecord["Done"] false) {
      app __x2__ = (IteratorStep iteratorRecord)
      let next = __x2__
      app __x3__ = (IsAbruptCompletion next)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
      next
      if (= next false) iteratorRecord["Done"] = true else {
        app __x4__ = (IteratorValue next)
        let v = __x4__
        app __x5__ = (IsAbruptCompletion v)
        if __x5__ iteratorRecord["Done"] = true else {}
        if (= (typeof v) "Completion") if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
        v
      }
    } else {}
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    if (&& (! (= Initializer absent)) (= v undefined)) {
      app __x6__ = (IsAnonymousFunctionDefinition Initializer)
      if (= __x6__ true) {
        access __x7__ = (Initializer "NamedEvaluation")
        app __x8__ = (__x7__ bindingId)
        v = __x8__
      } else {
        access __x9__ = (Initializer "Evaluation")
        let defaultValue = __x9__
        app __x10__ = (GetValue defaultValue)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        v = __x10__
      }
    } else {}
    if (= environment undefined) {
      app __x11__ = (PutValue lhs v)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (WrapCompletion __x11__)
      return __x12__
    } else {}
    app __x13__ = (InitializeReferencedBinding lhs v)
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }
  */
}
