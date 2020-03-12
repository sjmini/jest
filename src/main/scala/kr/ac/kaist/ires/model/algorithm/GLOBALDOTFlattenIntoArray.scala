package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTFlattenIntoArray {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.FlattenIntoArray""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(78067), ILet(Id("""target"""), ERef(RefId(Id("""__x0__""")))).setId(78068), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(78070), ILet(Id("""source"""), ERef(RefId(Id("""__x1__""")))).setId(78071), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(78073), ILet(Id("""sourceLen"""), ERef(RefId(Id("""__x2__""")))).setId(78074), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(3L))).setId(78076), ILet(Id("""start"""), ERef(RefId(Id("""__x3__""")))).setId(78077), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(4L))).setId(78079), ILet(Id("""depth"""), ERef(RefId(Id("""__x4__""")))).setId(78080), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(5L))).setId(78082), ILet(Id("""mapperFunction"""), ERef(RefId(Id("""__x5__""")))).setId(78083), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(6L))).setId(78085), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x6__""")))).setId(78086), ILet(Id("""targetIndex"""), ERef(RefId(Id("""start""")))).setId(78089), ILet(Id("""sourceIndex"""), EINum(0L)).setId(78091), IWhile(EBOp(OLt, ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""sourceLen""")))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""sourceIndex"""))))).setId(78093), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(78094), IReturn(ERef(RefId(Id("""__x7__""")))).setId(78095)).setId(78096), ISeq(List()).setId(78205)).setId(78097), ILet(Id("""P"""), ERef(RefId(Id("""__x7__""")))).setId(78098), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))).setId(78100), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(78101), IReturn(ERef(RefId(Id("""__x8__""")))).setId(78102)).setId(78103), ISeq(List()).setId(78212)).setId(78104), ILet(Id("""exists"""), ERef(RefId(Id("""__x8__""")))).setId(78105), IIf(EBOp(OEq, ERef(RefId(Id("""exists"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""source"""))), ERef(RefId(Id("""P"""))))).setId(78107), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(78108), IReturn(ERef(RefId(Id("""__x9__""")))).setId(78109)).setId(78110), ISeq(List()).setId(78219)).setId(78111), ILet(Id("""element"""), ERef(RefId(Id("""__x9__""")))).setId(78112), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(5L))), EAbsent)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapperFunction"""))), ERef(RefId(Id("""thisArg"""))), EList(List(ERef(RefId(Id("""element"""))), ERef(RefId(Id("""sourceIndex"""))), ERef(RefId(Id("""source"""))))))).setId(78114), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(78115), IReturn(ERef(RefId(Id("""__x10__""")))).setId(78116)).setId(78117), ISeq(List()).setId(78226)).setId(78118), IAssign(RefId(Id("""element""")), ERef(RefId(Id("""__x10__""")))).setId(78119))).setId(78229), ISeq(List()).setId(78230)).setId(78122), ILet(Id("""shouldFlatten"""), EBool(false)).setId(78124), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""depth""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""element"""))))).setId(78126), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(78127), IReturn(ERef(RefId(Id("""__x11__""")))).setId(78128)).setId(78129), ISeq(List()).setId(78237)).setId(78130), IAssign(RefId(Id("""shouldFlatten""")), ERef(RefId(Id("""__x11__""")))).setId(78131))).setId(78240), ISeq(List()).setId(78241)).setId(78134), IIf(EBOp(OEq, ERef(RefId(Id("""shouldFlatten"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""element"""))))).setId(78136), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(78137), IReturn(ERef(RefId(Id("""__x12__""")))).setId(78138)).setId(78139), ISeq(List()).setId(78247)).setId(78140), ILet(Id("""elementLen"""), ERef(RefId(Id("""__x12__""")))).setId(78141), IApp(Id("""__x13__"""), ERef(RefId(Id("""FlattenIntoArray"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""element"""))), ERef(RefId(Id("""elementLen"""))), ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, ERef(RefId(Id("""depth"""))), EINum(1L)))).setId(78143), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(78144), IReturn(ERef(RefId(Id("""__x13__""")))).setId(78145)).setId(78146), ISeq(List()).setId(78254)).setId(78147), IAssign(RefId(Id("""targetIndex""")), ERef(RefId(Id("""__x13__""")))).setId(78148))).setId(78257), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""targetIndex"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(78151), IReturn(ERef(RefId(Id("""__x14__""")))).setId(78152))).setId(78260), ISeq(List()).setId(78261)).setId(78154), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""targetIndex"""))))).setId(78156), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(78157), IReturn(ERef(RefId(Id("""__x15__""")))).setId(78158)).setId(78159), ISeq(List()).setId(78267)).setId(78160), IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""element"""))))).setId(78161), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(78162), IReturn(ERef(RefId(Id("""__x16__""")))).setId(78163)).setId(78164), ISeq(List()).setId(78273)).setId(78165), IExpr(ERef(RefId(Id("""__x16__""")))).setId(78166), IAssign(RefId(Id("""targetIndex""")), EBOp(OPlus, ERef(RefId(Id("""targetIndex"""))), EINum(1L))).setId(78168))).setId(78277)).setId(78171))).setId(78279), ISeq(List()).setId(78280)).setId(78174), IAssign(RefId(Id("""sourceIndex""")), EBOp(OPlus, ERef(RefId(Id("""sourceIndex"""))), EINum(1L))).setId(78176))).setId(78283)).setId(78179), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""targetIndex"""))))).setId(78181), IReturn(ERef(RefId(Id("""__x17__""")))).setId(78182))).setId(78287))
  val instToStepMap: Map[Int, Int] = HashMap(78181 -> 6, 78113 -> 3, 78104 -> 5, 78155 -> 3, 78126 -> 30, 78081 -> 4, 78123 -> 3, 78079 -> 4, 78140 -> 35, 78172 -> 3, 78100 -> 5, 78143 -> 35, 78085 -> 6, 78175 -> 5, 78111 -> 3, 78075 -> 2, 78177 -> 5, 78071 -> 1, 78171 -> 3, 78154 -> 3, 78132 -> 30, 78136 -> 35, 78168 -> 3, 78068 -> 0, 78149 -> 35, 78091 -> 14, 78161 -> 3, 78097 -> 5, 78074 -> 2, 78082 -> 5, 78107 -> 3, 78174 -> 5, 78125 -> 3, 78122 -> 3, 78142 -> 35, 78078 -> 3, 78178 -> 5, 78086 -> 6, 78121 -> 25, 78118 -> 25, 78090 -> 13, 78153 -> 0, 78072 -> 1, 78182 -> 6, 78133 -> 30, 78093 -> 5, 78114 -> 25, 78150 -> 35, 78170 -> 3, 78165 -> 3, 78073 -> 2, 78179 -> 5, 78098 -> 5, 78173 -> 3, 78087 -> 6, 78130 -> 30, 78077 -> 3, 78106 -> 5, 78141 -> 35, 78160 -> 3, 78083 -> 5, 78134 -> 3, 78147 -> 35, 78105 -> 5, 78089 -> 13, 78151 -> 0, 78183 -> 6, 78166 -> 3, 78119 -> 25, 78069 -> 0, 78169 -> 3, 78088 -> 12, 78176 -> 5, 78080 -> 4, 78124 -> 3, 78156 -> 3, 78076 -> 3, 78084 -> 5, 78112 -> 3, 78099 -> 5, 78131 -> 30, 78148 -> 35, 78167 -> 3, 78092 -> 14, 78180 -> 5, 78070 -> 1, 78067 -> 0, 78135 -> 3, 78120 -> 25, 78152 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(78068, 78153, 78151, 78069, 78067, 78152), 5 -> HashSet(78104, 78177, 78097, 78178, 78093, 78179, 78098, 78106, 78083, 78105, 78176, 78084, 78099, 78180, 78100, 78175, 78174, 78082), 10 -> HashSet(78088), 25 -> HashSet(78114, 78119, 78120, 78121, 78118), 14 -> HashSet(78091, 78092), 1 -> HashSet(78155, 78072, 78070, 78071, 78154), 6 -> HashSet(78085, 78181, 78086, 78182, 78087, 78183), 9 -> HashSet(78088), 13 -> HashSet(78090, 78089), 2 -> HashSet(78075, 78161, 78074, 78165, 78073, 78160, 78166, 78156, 78167), 34 -> HashSet(78140, 78136, 78142, 78141), 12 -> HashSet(78088), 7 -> HashSet(78088), 18 -> HashSet(78097, 78093, 78098, 78099), 31 -> HashSet(78134, 78135), 11 -> HashSet(78088), 26 -> HashSet(78123, 78122), 8 -> HashSet(78088), 4 -> HashSet(78081, 78079, 78175, 78174, 78080), 22 -> HashSet(78113, 78111, 78107, 78112), 27 -> HashSet(78125, 78124), 3 -> HashSet(78123, 78172, 78111, 78168, 78161, 78107, 78078, 78173, 78077, 78160, 78134, 78166, 78169, 78076, 78112, 78167, 78135, 78113, 78155, 78171, 78154, 78125, 78122, 78170, 78165, 78124, 78156), 35 -> HashSet(78140, 78143, 78142, 78150, 78141, 78147, 78148, 78136, 78149), 30 -> HashSet(78126, 78132, 78133, 78130, 78131), 19 -> HashSet(78104, 78100, 78106, 78105))
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
