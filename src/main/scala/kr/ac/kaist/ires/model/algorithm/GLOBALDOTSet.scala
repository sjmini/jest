package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTSet {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Set""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(85419), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(85420), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(85422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85423))).setId(85424), ISeq(List()).setId(85425)).setId(85426), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%SetPrototype%"""), EList(List(EStr("""SetData"""))))).setId(85428), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(85429), IReturn(ERef(RefId(Id("""__x2__""")))).setId(85430)).setId(85431), ISeq(List()).setId(85425)).setId(85432), ILet(Id("""set"""), ERef(RefId(Id("""__x2__""")))).setId(85433), IAssign(RefProp(RefId(Id("""set""")), EStr("""SetData""")), EList(List())).setId(85435), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), IAssign(RefId(Id("""iterable""")), EUndef).setId(85437), ISeq(List()).setId(85425)).setId(85439), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""iterable"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""iterable"""))), ENull)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(85441), IReturn(ERef(RefId(Id("""__x3__""")))).setId(85442))).setId(85443), ISeq(List()).setId(85425)).setId(85444), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""set"""))), EStr("""add"""))).setId(85446), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(85447), IReturn(ERef(RefId(Id("""__x4__""")))).setId(85448)).setId(85449), ISeq(List()).setId(85425)).setId(85450), ILet(Id("""adder"""), ERef(RefId(Id("""__x4__""")))).setId(85451), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""adder"""))))).setId(85453), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(85454), IReturn(ERef(RefId(Id("""__x6__""")))).setId(85455))).setId(85456), ISeq(List()).setId(85425)).setId(85457), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(85459), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(85460), IReturn(ERef(RefId(Id("""__x7__""")))).setId(85461)).setId(85462), ISeq(List()).setId(85425)).setId(85463), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x7__""")))).setId(85464), IWhile(EBool(true), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(85466), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(85467), IReturn(ERef(RefId(Id("""__x8__""")))).setId(85468)).setId(85469), ISeq(List()).setId(85425)).setId(85470), ILet(Id("""next"""), ERef(RefId(Id("""__x8__""")))).setId(85471), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(85473), IReturn(ERef(RefId(Id("""__x9__""")))).setId(85474))).setId(85475), ISeq(List()).setId(85425)).setId(85476), IApp(Id("""__x10__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(85478), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(85479), IReturn(ERef(RefId(Id("""__x10__""")))).setId(85480)).setId(85481), ISeq(List()).setId(85425)).setId(85482), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x10__""")))).setId(85483), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""adder"""))), ERef(RefId(Id("""set"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(85485), ILet(Id("""status"""), ERef(RefId(Id("""__x11__""")))).setId(85486), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(85488), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(85489), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(85490), IReturn(ERef(RefId(Id("""__x13__""")))).setId(85491)).setId(85492), ISeq(List()).setId(85425)).setId(85493), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(85494), IReturn(ERef(RefId(Id("""__x14__""")))).setId(85495))).setId(85496), ISeq(List()).setId(85425)).setId(85497))).setId(85499)).setId(85500))).setId(-1))
  /* Beautified form:
  "GLOBAL.Set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%SetPrototype%" (new ["SetData"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let set = __x2__
    set["SetData"] = (new [])
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
