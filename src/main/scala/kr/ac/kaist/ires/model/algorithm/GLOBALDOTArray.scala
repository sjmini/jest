package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArray {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(0L)), ISeq(List(ILet(Id("""numberOfArgs"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(74674), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(74677), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(74679)).setId(74681), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ArrayPrototype%"""))).setId(74683), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74684), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74685)).setId(74686), ISeq(List()).setId(74676)).setId(74687), ILet(Id("""proto"""), ERef(RefId(Id("""__x0__""")))).setId(74688), IApp(Id("""__x1__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L), ERef(RefId(Id("""proto"""))))).setId(74690), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(74691), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74692)).setId(74693), ISeq(List()).setId(74676)).setId(74694), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(74695), IReturn(ERef(RefId(Id("""__x2__""")))).setId(74696))).setId(74698), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(1L)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(74699), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(74700), ILet(Id("""numberOfArgs"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(74702), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(74704), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(74706)).setId(74708), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ArrayPrototype%"""))).setId(74710), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(74711), IReturn(ERef(RefId(Id("""__x4__""")))).setId(74712)).setId(74713), ISeq(List()).setId(74676)).setId(74714), ILet(Id("""proto"""), ERef(RefId(Id("""__x4__""")))).setId(74715), IApp(Id("""__x5__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L), ERef(RefId(Id("""proto"""))))).setId(74717), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(74718), IReturn(ERef(RefId(Id("""__x5__""")))).setId(74719)).setId(74720), ISeq(List()).setId(74676)).setId(74721), ILet(Id("""array"""), ERef(RefId(Id("""__x5__""")))).setId(74722), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""len"""))))).setId(74724), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Number"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), EStr("""0"""), ERef(RefId(Id("""len"""))))).setId(74725), ILet(Id("""defineStatus"""), ERef(RefId(Id("""__x7__""")))).setId(74726), ILet(Id("""intLen"""), EINum(1L)).setId(74728))).setId(74730), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""len"""))))).setId(74731), ILet(Id("""intLen"""), ERef(RefId(Id("""__x8__""")))).setId(74732), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""intLen"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(74734), IReturn(ERef(RefId(Id("""__x9__""")))).setId(74735))).setId(74736), ISeq(List()).setId(74676)).setId(74737))).setId(74739)).setId(74740), IApp(Id("""__x10__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""array"""))), EStr("""length"""), ERef(RefId(Id("""intLen"""))), EBool(true))).setId(74742), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(74743), IReturn(ERef(RefId(Id("""__x10__""")))).setId(74744)).setId(74745), ISeq(List()).setId(74676)).setId(74746), IExpr(ERef(RefId(Id("""__x10__""")))).setId(74747), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))).setId(74749), IReturn(ERef(RefId(Id("""__x11__""")))).setId(74750))).setId(74752), ISeq(List(ILet(Id("""numberOfArgs"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(74753), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(74755), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(74757)).setId(74759), IApp(Id("""__x12__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ArrayPrototype%"""))).setId(74761), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(74762), IReturn(ERef(RefId(Id("""__x12__""")))).setId(74763)).setId(74764), ISeq(List()).setId(74676)).setId(74765), ILet(Id("""proto"""), ERef(RefId(Id("""__x12__""")))).setId(74766), IApp(Id("""__x13__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""numberOfArgs"""))), ERef(RefId(Id("""proto"""))))).setId(74768), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(74769), IReturn(ERef(RefId(Id("""__x13__""")))).setId(74770)).setId(74771), ISeq(List()).setId(74676)).setId(74772), ILet(Id("""array"""), ERef(RefId(Id("""__x13__""")))).setId(74773), ILet(Id("""k"""), EINum(0L)).setId(74775), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(74777), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""numberOfArgs""")))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(74779), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(74780), IReturn(ERef(RefId(Id("""__x14__""")))).setId(74781)).setId(74782), ISeq(List()).setId(74676)).setId(74783), ILet(Id("""Pk"""), ERef(RefId(Id("""__x14__""")))).setId(74784), ILet(Id("""itemK"""), ERef(RefProp(RefId(Id("""items""")), ERef(RefId(Id("""k""")))))).setId(74786), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""array"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""itemK"""))))).setId(74788), ILet(Id("""defineStatus"""), ERef(RefId(Id("""__x15__""")))).setId(74789), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(74791))).setId(74793)).setId(74794), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""array"""))))).setId(74796), IReturn(ERef(RefId(Id("""__x16__""")))).setId(74797))).setId(74799)).setId(74800)).setId(74802))
  /* Beautified form:
  "GLOBAL.Array" (this, argumentsList, NewTarget) => if (= argumentsList["length"] 0i) {
    let numberOfArgs = argumentsList["length"]
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x0__ = (GetPrototypeFromConstructor newTarget "%ArrayPrototype%")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let proto = __x0__
    app __x1__ = (ArrayCreate 0i proto)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  } else if (= argumentsList["length"] 1i) {
    app __x3__ = (GetArgument argumentsList 0i)
    let len = __x3__
    let numberOfArgs = argumentsList["length"]
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x4__ = (GetPrototypeFromConstructor newTarget "%ArrayPrototype%")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let proto = __x4__
    app __x5__ = (ArrayCreate 0i proto)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let array = __x5__
    app __x6__ = (Type len)
    if (! (= __x6__ Number)) {
      app __x7__ = (CreateDataProperty array "0" len)
      let defineStatus = __x7__
      let intLen = 1i
    } else {
      app __x8__ = (ToUint32 len)
      let intLen = __x8__
      if (! (= intLen len)) {
        app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x9__
      } else {}
    }
    app __x10__ = (Set array "length" intLen true)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    __x10__
    app __x11__ = (WrapCompletion array)
    return __x11__
  } else {
    let numberOfArgs = argumentsList["length"]
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x12__ = (GetPrototypeFromConstructor newTarget "%ArrayPrototype%")
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    let proto = __x12__
    app __x13__ = (ArrayCreate numberOfArgs proto)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let array = __x13__
    let k = 0i
    let items = argumentsList
    while (< k numberOfArgs) {
      app __x14__ = (ToString k)
      if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
      let Pk = __x14__
      let itemK = items[k]
      app __x15__ = (CreateDataProperty array Pk itemK)
      let defineStatus = __x15__
      k = (+ k 1i)
    }
    app __x16__ = (WrapCompletion array)
    return __x16__
  }
  */
}
