package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BindingRestElement0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(29491), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""environment"""))))).setId(29492), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(29493), IReturn(ERef(RefId(Id("""__x1__""")))).setId(29494)).setId(29495), ISeq(List()).setId(29496)).setId(29497), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(29498), IApp(Id("""__x2__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(29500), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(29501), IReturn(ERef(RefId(Id("""__x2__""")))).setId(29502)).setId(29503), ISeq(List()).setId(29496)).setId(29504), ILet(Id("""A"""), ERef(RefId(Id("""__x2__""")))).setId(29505), ILet(Id("""n"""), EINum(0L)).setId(29507), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(29509), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(29510), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(29512), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29513), ISeq(List()).setId(29496)).setId(29515), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(29517), IReturn(ERef(RefId(Id("""next""")))).setId(29518)).setId(29519), ISeq(List()).setId(29496)).setId(29520), IExpr(ERef(RefId(Id("""next""")))).setId(29521), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29523), ISeq(List()).setId(29496)).setId(29525))).setId(29527), ISeq(List()).setId(29496)).setId(29528), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""A"""))))).setId(29530), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(29531), IReturn(ERef(RefId(Id("""__x5__""")))).setId(29532)).setId(29533), ISeq(List()).setId(29496)).setId(29534), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(29535), IReturn(ERef(RefId(Id("""__x6__""")))).setId(29536))).setId(29537), ISeq(List()).setId(29496)).setId(29538), IApp(Id("""__x7__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""A"""))))).setId(29540), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(29541), IReturn(ERef(RefId(Id("""__x8__""")))).setId(29542))).setId(29544), ISeq(List()).setId(29496)).setId(29545), IApp(Id("""__x9__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(29547), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x9__""")))).setId(29548), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(29550), IIf(ERef(RefId(Id("""__x10__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29551), ISeq(List()).setId(29496)).setId(29553), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(29555), IReturn(ERef(RefId(Id("""nextValue""")))).setId(29556)).setId(29557), ISeq(List()).setId(29496)).setId(29558), IExpr(ERef(RefId(Id("""nextValue""")))).setId(29559), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(29561), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(29562), IReturn(ERef(RefId(Id("""__x11__""")))).setId(29563)).setId(29564), ISeq(List()).setId(29496)).setId(29565), IApp(Id("""__x12__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""nextValue"""))))).setId(29566), ILet(Id("""status"""), ERef(RefId(Id("""__x12__""")))).setId(29567), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(29569))).setId(29571)).setId(29572))).setId(-1))
  /* Beautified form:
  "BindingRestElement0IteratorBindingInitialization0" (this, BindingIdentifier, iteratorRecord, environment) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__ environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (ArrayCreate 0i)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let A = __x2__
    let n = 0i
    while true {
      if (= iteratorRecord["Done"] false) {
        app __x3__ = (IteratorStep iteratorRecord)
        let next = __x3__
        app __x4__ = (IsAbruptCompletion next)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
        next
        if (= next false) iteratorRecord["Done"] = true else {}
      } else {}
      if (= iteratorRecord["Done"] true) {
        if (= environment undefined) {
          app __x5__ = (PutValue lhs A)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          app __x6__ = (WrapCompletion __x5__)
          return __x6__
        } else {}
        app __x7__ = (InitializeReferencedBinding lhs A)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
      app __x9__ = (IteratorValue next)
      let nextValue = __x9__
      app __x10__ = (IsAbruptCompletion nextValue)
      if __x10__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x11__ = (ToString n)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (CreateDataProperty A __x11__ nextValue)
      let status = __x12__
      n = (+ n 1i)
    }
  }
  */
}
