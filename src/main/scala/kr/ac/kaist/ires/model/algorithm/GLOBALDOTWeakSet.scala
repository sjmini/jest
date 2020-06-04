package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTWeakSet {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.WeakSet""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87145), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(87146), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87148), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87149))).setId(87150), ISeq(List()).setId(87151)).setId(87152), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%WeakSetPrototype%"""), EList(List(EStr("""WeakSetData"""))))).setId(87154), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(87155), IReturn(ERef(RefId(Id("""__x2__""")))).setId(87156)).setId(87157), ISeq(List()).setId(87151)).setId(87158), ILet(Id("""set"""), ERef(RefId(Id("""__x2__""")))).setId(87159), IAssign(RefProp(RefId(Id("""set""")), EStr("""WeakSetData""")), EList(List())).setId(87161), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), IAssign(RefId(Id("""iterable""")), EUndef).setId(87163), ISeq(List()).setId(87151)).setId(87165), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""iterable"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""iterable"""))), ENull)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(87167), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87168))).setId(87169), ISeq(List()).setId(87151)).setId(87170), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""set"""))), EStr("""add"""))).setId(87172), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(87173), IReturn(ERef(RefId(Id("""__x4__""")))).setId(87174)).setId(87175), ISeq(List()).setId(87151)).setId(87176), ILet(Id("""adder"""), ERef(RefId(Id("""__x4__""")))).setId(87177), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""adder"""))))).setId(87179), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87180), IReturn(ERef(RefId(Id("""__x6__""")))).setId(87181))).setId(87182), ISeq(List()).setId(87151)).setId(87183), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(87185), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(87186), IReturn(ERef(RefId(Id("""__x7__""")))).setId(87187)).setId(87188), ISeq(List()).setId(87151)).setId(87189), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x7__""")))).setId(87190), IWhile(EBool(true), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(87192), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(87193), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87194)).setId(87195), ISeq(List()).setId(87151)).setId(87196), ILet(Id("""next"""), ERef(RefId(Id("""__x8__""")))).setId(87197), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(87199), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87200))).setId(87201), ISeq(List()).setId(87151)).setId(87202), IApp(Id("""__x10__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(87204), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(87205), IReturn(ERef(RefId(Id("""__x10__""")))).setId(87206)).setId(87207), ISeq(List()).setId(87151)).setId(87208), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x10__""")))).setId(87209), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""adder"""))), ERef(RefId(Id("""set"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(87211), ILet(Id("""status"""), ERef(RefId(Id("""__x11__""")))).setId(87212), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(87214), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(87215), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(87216), IReturn(ERef(RefId(Id("""__x13__""")))).setId(87217)).setId(87218), ISeq(List()).setId(87151)).setId(87219), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(87220), IReturn(ERef(RefId(Id("""__x14__""")))).setId(87221))).setId(87222), ISeq(List()).setId(87151)).setId(87223))).setId(87225)).setId(87226))).setId(-1))
  /* Beautified form:
  "GLOBAL.WeakSet" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%WeakSetPrototype%" (new ["WeakSetData"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let set = __x2__
    set["WeakSetData"] = (new [])
    if (= argumentsList[0i] absent) iterable = undefined else {}
    if (|| (= iterable undefined) (= iterable null)) {
      app __x3__ = (WrapCompletion set)
      return __x3__
    } else {}
    app __x4__ = (Get set "add")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let adder = __x4__
    app __x5__ = (IsCallable adder)
    if (= __x5__ false) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (GetIterator iterable)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let iteratorRecord = __x7__
    while true {
      app __x8__ = (IteratorStep iteratorRecord)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let next = __x8__
      if (= next false) {
        app __x9__ = (WrapCompletion set)
        return __x9__
      } else {}
      app __x10__ = (IteratorValue next)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let nextValue = __x10__
      app __x11__ = (Call adder set (new [nextValue]))
      let status = __x11__
      app __x12__ = (IsAbruptCompletion status)
      if __x12__ {
        app __x13__ = (IteratorClose iteratorRecord status)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        app __x14__ = (WrapCompletion __x13__)
        return __x14__
      } else {}
    }
  }
  */
}
