package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object ArraySetLength {
  val length: Int = 2
  val func: Func = Func("""ArraySetLength""", List(Id("""A"""), Id("""Desc""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""Desc"""))))).setId(54590), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(54591), IReturn(ERef(RefId(Id("""__x1__""")))).setId(54592))).setId(54594), ISeq(List()).setId(54595)).setId(54596), ILet(Id("""newLenDesc"""), ECopy(ERef(RefId(Id("""Desc"""))))).setId(54598), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))).setId(54600), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(54601), IReturn(ERef(RefId(Id("""__x2__""")))).setId(54602)).setId(54603), ISeq(List()).setId(54595)).setId(54604), ILet(Id("""newLen"""), ERef(RefId(Id("""__x2__""")))).setId(54605), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))).setId(54607), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(54608), IReturn(ERef(RefId(Id("""__x3__""")))).setId(54609)).setId(54610), ISeq(List()).setId(54595)).setId(54611), ILet(Id("""numberLen"""), ERef(RefId(Id("""__x3__""")))).setId(54612), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""numberLen"""))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(54614), IReturn(ERef(RefId(Id("""__x4__""")))).setId(54615))).setId(54616), ISeq(List()).setId(54595)).setId(54617), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Value""")), ERef(RefId(Id("""newLen""")))).setId(54619), IApp(Id("""__x5__"""), ERef(RefId(Id("""OrdinaryGetOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""))).setId(54621), ILet(Id("""oldLenDesc"""), ERef(RefId(Id("""__x5__""")))).setId(54622), ILet(Id("""oldLen"""), ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Value""")))).setId(54624), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""oldLen"""))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))).setId(54626), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(54627), IReturn(ERef(RefId(Id("""__x7__""")))).setId(54628))).setId(54630), ISeq(List()).setId(54595)).setId(54631), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""oldLenDesc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54633), IReturn(ERef(RefId(Id("""__x8__""")))).setId(54634))).setId(54635), ISeq(List()).setId(54595)).setId(54636), IIf(EBOp(OOr, EBOp(OEq, ERef(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable"""))), EBool(true))), ILet(Id("""newWritable"""), EBool(true)).setId(54638), ISeq(List(ILet(Id("""newWritable"""), EBool(false)).setId(54640), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable""")), EBool(true)).setId(54642))).setId(54644)).setId(54645), IApp(Id("""__x9__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))).setId(54647), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(54648), IReturn(ERef(RefId(Id("""__x9__""")))).setId(54649)).setId(54650), ISeq(List()).setId(54595)).setId(54651), ILet(Id("""succeeded"""), ERef(RefId(Id("""__x9__""")))).setId(54652), IIf(EBOp(OEq, ERef(RefId(Id("""succeeded"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54654), IReturn(ERef(RefId(Id("""__x10__""")))).setId(54655))).setId(54656), ISeq(List()).setId(54595)).setId(54657), IWhile(EBOp(OLt, ERef(RefId(Id("""newLen"""))), ERef(RefId(Id("""oldLen""")))), ISeq(List(IAssign(RefId(Id("""oldLen""")), EBOp(OSub, ERef(RefId(Id("""oldLen"""))), EINum(1L))).setId(54659), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""oldLen"""))))).setId(54661), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(54662), IReturn(ERef(RefId(Id("""__x11__""")))).setId(54663)).setId(54664), ISeq(List()).setId(54595)).setId(54665), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""A""")), EStr("""Delete"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))))).setId(54666), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(54667), IReturn(ERef(RefId(Id("""__x12__""")))).setId(54668)).setId(54669), ISeq(List()).setId(54595)).setId(54670), ILet(Id("""deleteSucceeded"""), ERef(RefId(Id("""__x12__""")))).setId(54671), IIf(EBOp(OEq, ERef(RefId(Id("""deleteSucceeded"""))), EBool(false)), ISeq(List(IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Value""")), EBOp(OPlus, ERef(RefId(Id("""oldLen"""))), EINum(1L))).setId(54673), IIf(EBOp(OEq, ERef(RefId(Id("""newWritable"""))), EBool(false)), IAssign(RefProp(RefId(Id("""newLenDesc""")), EStr("""Writable""")), EBool(false)).setId(54675), ISeq(List()).setId(54595)).setId(54677), IApp(Id("""__x13__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""newLenDesc"""))))).setId(54679), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(54680), IReturn(ERef(RefId(Id("""__x13__""")))).setId(54681)).setId(54682), ISeq(List()).setId(54595)).setId(54683), IExpr(ERef(RefId(Id("""__x13__""")))).setId(54684), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(54686), IReturn(ERef(RefId(Id("""__x14__""")))).setId(54687))).setId(54689), ISeq(List()).setId(54595)).setId(54690))).setId(54692)).setId(54693), IIf(EBOp(OEq, ERef(RefId(Id("""newWritable"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Writable"""), EBool(false)))))).setId(54695), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(54696), IReturn(ERef(RefId(Id("""__x16__""")))).setId(54697))).setId(54699), ISeq(List()).setId(54595)).setId(54700), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(54702), IReturn(ERef(RefId(Id("""__x17__""")))).setId(54703))).setId(-1))
  /* Beautified form:
  "ArraySetLength" (A, Desc) => {
    if (= Desc["Value"] absent) {
      app __x0__ = (OrdinaryDefineOwnProperty A "length" Desc)
      app __x1__ = (WrapCompletion __x0__)
      return __x1__
    } else {}
    let newLenDesc = (copy-obj Desc)
    app __x2__ = (ToUint32 Desc["Value"])
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let newLen = __x2__
    app __x3__ = (ToNumber Desc["Value"])
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let numberLen = __x3__
    if (! (= newLen numberLen)) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    newLenDesc["Value"] = newLen
    app __x5__ = (OrdinaryGetOwnProperty A "length")
    let oldLenDesc = __x5__
    let oldLen = oldLenDesc["Value"]
    if (! (< newLen oldLen)) {
      app __x6__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (= oldLenDesc["Writable"] false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    if (|| (= newLenDesc["Writable"] absent) (= newLenDesc["Writable"] true)) let newWritable = true else {
      let newWritable = false
      newLenDesc["Writable"] = true
    }
    app __x9__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let succeeded = __x9__
    if (= succeeded false) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    while (< newLen oldLen) {
      oldLen = (- oldLen 1i)
      app __x11__ = (ToString oldLen)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (A["Delete"] A __x11__)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let deleteSucceeded = __x12__
      if (= deleteSucceeded false) {
        newLenDesc["Value"] = (+ oldLen 1i)
        if (= newWritable false) newLenDesc["Writable"] = false else {}
        app __x13__ = (OrdinaryDefineOwnProperty A "length" newLenDesc)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        __x13__
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
    }
    if (= newWritable false) {
      app __x15__ = (OrdinaryDefineOwnProperty A "length" (new PropertyDescriptor("Writable" -> false)))
      app __x16__ = (WrapCompletion __x15__)
      return __x16__
    } else {}
    app __x17__ = (WrapCompletion true)
    return __x17__
  }
  */
}
