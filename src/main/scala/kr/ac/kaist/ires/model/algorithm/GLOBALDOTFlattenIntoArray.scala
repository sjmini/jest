package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTFlattenIntoArray {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.FlattenIntoArray""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78067), ILet(Id("""target"""), ERef(RefId(Id("""__x0__""")))).setId(78068), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78070), ILet(Id("""source"""), ERef(RefId(Id("""__x1__""")))).setId(78071), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(78073), ILet(Id("""sourceLen"""), ERef(RefId(Id("""__x2__""")))).setId(78074), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(3L))).setId(78076), ILet(Id("""start"""), ERef(RefId(Id("""__x3__""")))).setId(78077), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(4L))).setId(78079), ILet(Id("""depth"""), ERef(RefId(Id("""__x4__""")))).setId(78080), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(5L))).setId(78082), ILet(Id("""mapperFunction"""), ERef(RefId(Id("""__x5__""")))).setId(78083), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(6L))).setId(78085), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x6__""")))).setId(78086), ILet(Id("""targetIndex"""), ERef(RefId(Id("""start""")))).setId(78089), ILet(Id("""sourceIndex"""), EINum(0L)).setId(78091), IWhile(EBOp(OLt, ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""sourceLen""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sourceIndex"""))))).setId(78093), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(78094), IReturn(ERef(RefId(Id("""__x7__""")))).setId(78095)).setId(78096), ISeq(List()).setId(78088)).setId(78097), ILet(Id("""P"""), ERef(RefId(Id("""__x7__""")))).setId(78098), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))).setId(78100), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(78101), IReturn(ERef(RefId(Id("""__x8__""")))).setId(78102)).setId(78103), ISeq(List()).setId(78088)).setId(78104), ILet(Id("""exists"""), ERef(RefId(Id("""__x8__""")))).setId(78105), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))).setId(78107), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(78108), IReturn(ERef(RefId(Id("""__x9__""")))).setId(78109)).setId(78110), ISeq(List()).setId(78088)).setId(78111), ILet(Id("""element"""), ERef(RefId(Id("""__x9__""")))).setId(78112), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(5L))), EAbsent)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapperFunction"""))), ERef(RefId(Id("""thisArg"""))), EList(List(ERef(RefId(Id("""element"""))), ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""source"""))))))).setId(78114), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(78115), IReturn(ERef(RefId(Id("""__x10__""")))).setId(78116)).setId(78117), ISeq(List()).setId(78088)).setId(78118), IAssign(RefId(Id("""element""")), ERef(RefId(Id("""__x10__""")))).setId(78119))).setId(78121), ISeq(List()).setId(78088)).setId(78122), ILet(Id("""shouldFlatten"""), EBool(false)).setId(78124), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""depth""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""element"""))))).setId(78126), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(78127), IReturn(ERef(RefId(Id("""__x11__""")))).setId(78128)).setId(78129), ISeq(List()).setId(78088)).setId(78130), IAssign(RefId(Id("""shouldFlatten""")), ERef(RefId(Id("""__x11__""")))).setId(78131))).setId(78133), ISeq(List()).setId(78088)).setId(78134), IIf(EBOp(OEq, ERef(RefId(Id("""shouldFlatten"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""element"""))))).setId(78136), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(78137), IReturn(ERef(RefId(Id("""__x12__""")))).setId(78138)).setId(78139), ISeq(List()).setId(78088)).setId(78140), ILet(Id("""elementLen"""), ERef(RefId(Id("""__x12__""")))).setId(78141), IApp(Id("""__x13__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""element"""))), ERef(RefId(Id("""elementLen"""))), ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, ERef(RefId(Id("""depth"""))), EINum(1L)))).setId(78143), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(78144), IReturn(ERef(RefId(Id("""__x13__""")))).setId(78145)).setId(78146), ISeq(List()).setId(78088)).setId(78147), IAssign(RefId(Id("""targetIndex""")), ERef(RefId(Id("""__x13__""")))).setId(78148))).setId(78150), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(78151), IReturn(ERef(RefId(Id("""__x14__""")))).setId(78152))).setId(78153), ISeq(List()).setId(78088)).setId(78154), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""targetIndex"""))))).setId(78156), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(78157), IReturn(ERef(RefId(Id("""__x15__""")))).setId(78158)).setId(78159), ISeq(List()).setId(78088)).setId(78160), IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""element"""))))).setId(78161), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(78162), IReturn(ERef(RefId(Id("""__x16__""")))).setId(78163)).setId(78164), ISeq(List()).setId(78088)).setId(78165), IExpr(ERef(RefId(Id("""__x16__""")))).setId(78166), IAssign(RefId(Id("""targetIndex""")), EBOp(OPlus, ERef(RefId(Id("""targetIndex"""))), EINum(1L))).setId(78168))).setId(78170)).setId(78171))).setId(78173), ISeq(List()).setId(78088)).setId(78174), IAssign(RefId(Id("""sourceIndex""")), EBOp(OPlus, ERef(RefId(Id("""sourceIndex"""))), EINum(1L))).setId(78176))).setId(78178)).setId(78179), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""targetIndex"""))))).setId(78181), IReturn(ERef(RefId(Id("""__x17__""")))).setId(78182))).setId(-1))
  /* Beautified form:
  "GLOBAL.FlattenIntoArray" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let target = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let source = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let sourceLen = __x2__
    app __x3__ = (GetArgument argumentsList 3i)
    let start = __x3__
    app __x4__ = (GetArgument argumentsList 4i)
    let depth = __x4__
    app __x5__ = (GetArgument argumentsList 5i)
    let mapperFunction = __x5__
    app __x6__ = (GetArgument argumentsList 6i)
    let thisArg = __x6__
    let targetIndex = start
    let sourceIndex = 0i
    while (< sourceIndex sourceLen) {
      app __x7__ = (ToString sourceIndex)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let P = __x7__
      app __x8__ = (HasProperty source P)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let exists = __x8__
      if (= exists true) {
        app __x9__ = (Get source P)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        let element = __x9__
        if (! (= argumentsList[5i] absent)) {
          app __x10__ = (Call mapperFunction thisArg (new [element, sourceIndex, source]))
          if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          element = __x10__
        } else {}
        let shouldFlatten = false
        if (< 0i depth) {
          app __x11__ = (IsArray element)
          if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          shouldFlatten = __x11__
        } else {}
        if (= shouldFlatten true) {
          app __x12__ = (LengthOfArrayLike element)
          if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
          let elementLen = __x12__
          app __x13__ = (FlattenIntoArray target element elementLen targetIndex (- depth 1i))
          if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
          targetIndex = __x13__
        } else {
          if (! (< targetIndex (- 9007199254740992i 1i))) {
            app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x14__
          } else {}
          app __x15__ = (ToString targetIndex)
          if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          app __x16__ = (CreateDataPropertyOrThrow target __x15__ element)
          if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
          __x16__
          targetIndex = (+ targetIndex 1i)
        }
      } else {}
      sourceIndex = (+ sourceIndex 1i)
    }
    app __x17__ = (WrapCompletion targetIndex)
    return __x17__
  }
  */
}
