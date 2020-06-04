package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArraySpeciesCreate {
  val length: Int = 2
  val func: Func = Func("""ArraySpeciesCreate""", List(Id("""originalArray"""), Id("""length""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""length"""))), ENum(-0.0)), IAssign(RefId(Id("""length""")), EINum(0L)).setId(54327), ISeq(List()).setId(54326)).setId(54329), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""originalArray"""))))).setId(54331), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(54332), IReturn(ERef(RefId(Id("""__x0__""")))).setId(54333)).setId(54334), ISeq(List()).setId(54326)).setId(54335), ILet(Id("""isArray"""), ERef(RefId(Id("""__x0__""")))).setId(54336), IIf(EBOp(OEq, ERef(RefId(Id("""isArray"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""length"""))))).setId(54338), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(54339), IReturn(ERef(RefId(Id("""__x1__""")))).setId(54340)).setId(54341), ISeq(List()).setId(54326)).setId(54342), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(54343), IReturn(ERef(RefId(Id("""__x2__""")))).setId(54344))).setId(54345), ISeq(List()).setId(54326)).setId(54346), IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""originalArray"""))), EStr("""constructor"""))).setId(54348), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(54349), IReturn(ERef(RefId(Id("""__x3__""")))).setId(54350)).setId(54351), ISeq(List()).setId(54326)).setId(54352), ILet(Id("""C"""), ERef(RefId(Id("""__x3__""")))).setId(54353), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(54355), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(true)), ISeq(List(ILet(Id("""thisRealm"""), ERef(RefId(Id("""REALM""")))).setId(54356), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetFunctionRealm"""))), List(ERef(RefId(Id("""C"""))))).setId(54358), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(54359), IReturn(ERef(RefId(Id("""__x5__""")))).setId(54360)).setId(54361), ISeq(List()).setId(54326)).setId(54362), ILet(Id("""realmC"""), ERef(RefId(Id("""__x5__""")))).setId(54363), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""thisRealm"""))), ERef(RefId(Id("""realmC"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""C"""))), ERef(RefProp(RefProp(RefId(Id("""realmC""")), EStr("""Intrinsics""")), EStr("""INTRINSIC_Array"""))))).setId(54365), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), IAssign(RefId(Id("""C""")), EUndef).setId(54366), ISeq(List()).setId(54326)).setId(54368))).setId(54370), ISeq(List()).setId(54326)).setId(54371))).setId(54373), ISeq(List()).setId(54326)).setId(54374), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""C"""))))).setId(54376), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object""")))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""SYMBOL_species"""))))).setId(54377), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(54378), IReturn(ERef(RefId(Id("""__x8__""")))).setId(54379)).setId(54380), ISeq(List()).setId(54326)).setId(54381), IAssign(RefId(Id("""C""")), ERef(RefId(Id("""__x8__""")))).setId(54382), IIf(EBOp(OEq, ERef(RefId(Id("""C"""))), ENull), IAssign(RefId(Id("""C""")), EUndef).setId(54384), ISeq(List()).setId(54326)).setId(54386))).setId(54388), ISeq(List()).setId(54326)).setId(54389), IIf(EBOp(OEq, ERef(RefId(Id("""C"""))), EUndef), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""length"""))))).setId(54391), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(54392), IReturn(ERef(RefId(Id("""__x9__""")))).setId(54393)).setId(54394), ISeq(List()).setId(54326)).setId(54395), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(54396), IReturn(ERef(RefId(Id("""__x10__""")))).setId(54397))).setId(54398), ISeq(List()).setId(54326)).setId(54399), IApp(Id("""__x11__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(54401), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(false)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(54402), IReturn(ERef(RefId(Id("""__x12__""")))).setId(54403))).setId(54404), ISeq(List()).setId(54326)).setId(54405), IApp(Id("""__x13__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""length"""))))))).setId(54407), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(54408), IReturn(ERef(RefId(Id("""__x13__""")))).setId(54409)).setId(54410), ISeq(List()).setId(54326)).setId(54411), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(54412), IReturn(ERef(RefId(Id("""__x14__""")))).setId(54413))).setId(-1))
  /* Beautified form:
  "ArraySpeciesCreate" (originalArray, length) => {
    if (= length -0.0) length = 0i else {}
    app __x0__ = (IsArray originalArray)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let isArray = __x0__
    if (= isArray false) {
      app __x1__ = (ArrayCreate length)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (Get originalArray "constructor")
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let C = __x3__
    app __x4__ = (IsConstructor C)
    if (= __x4__ true) {
      let thisRealm = REALM
      app __x5__ = (GetFunctionRealm C)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let realmC = __x5__
      if (! (= thisRealm realmC)) {
        app __x6__ = (SameValue C realmC["Intrinsics"]["INTRINSIC_Array"])
        if (= __x6__ true) C = undefined else {}
      } else {}
    } else {}
    app __x7__ = (Type C)
    if (= __x7__ Object) {
      app __x8__ = (Get C SYMBOL_species)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      C = __x8__
      if (= C null) C = undefined else {}
    } else {}
    if (= C undefined) {
      app __x9__ = (ArrayCreate length)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (WrapCompletion __x9__)
      return __x10__
    } else {}
    app __x11__ = (IsConstructor C)
    if (= __x11__ false) {
      app __x12__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x12__
    } else {}
    app __x13__ = (Construct C (new [length]))
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    app __x14__ = (WrapCompletion __x13__)
    return __x14__
  }
  */
}
