package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTGetOwnProperty {
  val length: Int = 1
  val func: Func = Func("""ProxyExoticObject.GetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(59091), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59093), IReturn(ERef(RefId(Id("""__x0__""")))).setId(59094))).setId(59207), ISeq(List()).setId(59208)).setId(59096), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(59098), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""getOwnPropertyDescriptor"""))).setId(59100), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(59101), IReturn(ERef(RefId(Id("""__x1__""")))).setId(59102)).setId(59103), ISeq(List()).setId(59215)).setId(59104), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(59105), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59107), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(59108), IReturn(ERef(RefId(Id("""__x2__""")))).setId(59109)).setId(59110), ISeq(List()).setId(59222)).setId(59111), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(59112), IReturn(ERef(RefId(Id("""__x3__""")))).setId(59113))).setId(59226), ISeq(List()).setId(59227)).setId(59116), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))))).setId(59118), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(59119), IReturn(ERef(RefId(Id("""__x4__""")))).setId(59120)).setId(59121), ISeq(List()).setId(59233)).setId(59122), ILet(Id("""trapResultObj"""), ERef(RefId(Id("""__x4__""")))).setId(59123), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""trapResultObj"""))))).setId(59125), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""Undefined""")))))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59126), IReturn(ERef(RefId(Id("""__x6__""")))).setId(59127))).setId(59239), ISeq(List()).setId(59240)).setId(59129), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""P"""))))).setId(59131), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(59132), IReturn(ERef(RefId(Id("""__x7__""")))).setId(59133)).setId(59134), ISeq(List()).setId(59246)).setId(59135), ILet(Id("""targetDesc"""), ERef(RefId(Id("""__x7__""")))).setId(59136), IIf(EBOp(OEq, ERef(RefId(Id("""trapResultObj"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(59138), IReturn(ERef(RefId(Id("""__x8__""")))).setId(59139))).setId(59251), ISeq(List()).setId(59252)).setId(59141), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59143), IReturn(ERef(RefId(Id("""__x9__""")))).setId(59144))).setId(59256), ISeq(List()).setId(59257)).setId(59146), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(59148), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(59149), IReturn(ERef(RefId(Id("""__x10__""")))).setId(59150)).setId(59151), ISeq(List()).setId(59263)).setId(59152), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x10__""")))).setId(59153), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(false)), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59155), IReturn(ERef(RefId(Id("""__x11__""")))).setId(59156))).setId(59268), ISeq(List()).setId(59269)).setId(59158), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(59160), IReturn(ERef(RefId(Id("""__x12__""")))).setId(59161))).setId(59273), ISeq(List()).setId(59274)).setId(59164), IApp(Id("""__x13__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(59166), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(59167), IReturn(ERef(RefId(Id("""__x13__""")))).setId(59168)).setId(59169), ISeq(List()).setId(59280)).setId(59170), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x13__""")))).setId(59171), IApp(Id("""__x14__"""), ERef(RefId(Id("""ToPropertyDescriptor"""))), List(ERef(RefId(Id("""trapResultObj"""))))).setId(59173), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(59174), IReturn(ERef(RefId(Id("""__x14__""")))).setId(59175)).setId(59176), ISeq(List()).setId(59287)).setId(59177), ILet(Id("""resultDesc"""), ERef(RefId(Id("""__x14__""")))).setId(59178), IApp(Id("""__x15__"""), ERef(RefId(Id("""CompletePropertyDescriptor"""))), List(ERef(RefId(Id("""resultDesc"""))))).setId(59180), IExpr(ERef(RefId(Id("""__x15__""")))).setId(59181), IApp(Id("""__x16__"""), ERef(RefId(Id("""IsCompatiblePropertyDescriptor"""))), List(ERef(RefId(Id("""extensibleTarget"""))), ERef(RefId(Id("""resultDesc"""))), ERef(RefId(Id("""targetDesc"""))))).setId(59183), ILet(Id("""valid"""), ERef(RefId(Id("""__x16__""")))).setId(59184), IIf(EBOp(OEq, ERef(RefId(Id("""valid"""))), EBool(false)), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59186), IReturn(ERef(RefId(Id("""__x17__""")))).setId(59187))).setId(59296), ISeq(List()).setId(59297)).setId(59189), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""resultDesc""")), EStr("""Configurable"""))), EBool(false)), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""targetDesc"""))), EUndef), EBOp(OEq, ERef(RefProp(RefId(Id("""targetDesc""")), EStr("""Configurable"""))), EBool(true))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(59191), IReturn(ERef(RefId(Id("""__x18__""")))).setId(59192))).setId(59301), ISeq(List()).setId(59302)).setId(59195), ISeq(List()).setId(59304)).setId(59198), IApp(Id("""__x19__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""resultDesc"""))))).setId(59200), IReturn(ERef(RefId(Id("""__x19__""")))).setId(59201))).setId(59308))
  val instToStepMap: Map[Int, Int] = HashMap(59129 -> 13, 59181 -> 28, 59096 -> 3, 59147 -> 24, 59183 -> 29, 59172 -> 26, 59198 -> 37, 59128 -> 12, 59123 -> 11, 59140 -> 17, 59091 -> 1, 59179 -> 27, 59135 -> 14, 59116 -> 10, 59162 -> 24, 59194 -> 36, 59124 -> 11, 59106 -> 6, 59166 -> 26, 59131 -> 14, 59154 -> 24, 59201 -> 38, 59099 -> 5, 59186 -> 30, 59137 -> 14, 59092 -> 1, 59144 -> 19, 59191 -> 36, 59163 -> 24, 59195 -> 36, 59100 -> 6, 59184 -> 29, 59090 -> 4, 59122 -> 11, 59095 -> 2, 59159 -> 24, 59199 -> 37, 59105 -> 6, 59152 -> 24, 59127 -> 12, 59104 -> 6, 59190 -> 31, 59148 -> 24, 59180 -> 28, 59117 -> 10, 59153 -> 24, 59185 -> 29, 59158 -> 24, 59113 -> 9, 59112 -> 9, 59094 -> 2, 59145 -> 19, 59200 -> 38, 59177 -> 27, 59111 -> 9, 59143 -> 19, 59118 -> 11, 59164 -> 25, 59136 -> 14, 59139 -> 17, 59189 -> 31, 59142 -> 24, 59171 -> 26, 59157 -> 22, 59114 -> 9, 59196 -> 36, 59097 -> 3, 59126 -> 12, 59156 -> 22, 59107 -> 9, 59161 -> 24, 59197 -> 36, 59178 -> 27, 59130 -> 13, 59093 -> 2, 59165 -> 25, 59193 -> 36, 59182 -> 28, 59188 -> 30, 59146 -> 24, 59138 -> 17, 59115 -> 9, 59155 -> 22, 59125 -> 13, 59192 -> 36, 59202 -> 38, 59170 -> 26, 59160 -> 24, 59187 -> 30, 59098 -> 5, 59173 -> 27, 59141 -> 24)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(59090), 5 -> HashSet(59099, 59098), 10 -> HashSet(59116, 59117), 14 -> HashSet(59135, 59131, 59137, 59136), 1 -> HashSet(59091, 59092), 6 -> HashSet(59106, 59100, 59105, 59104), 9 -> HashSet(59111, 59114, 59107, 59115, 59113, 59112), 13 -> HashSet(59129, 59130, 59125), 2 -> HashSet(59095, 59094, 59093), 17 -> HashSet(59140, 59139, 59138), 12 -> HashSet(59128, 59127, 59126), 3 -> HashSet(59096, 59097), 18 -> HashSet(59142, 59141), 31 -> HashSet(59190, 59189), 11 -> HashSet(59123, 59124, 59122, 59118), 4 -> HashSet(59090), 24 -> HashSet(59147, 59162, 59154, 59163, 59148, 59153, 59158, 59142, 59161, 59146, 59160, 59141, 59152, 59159), 37 -> HashSet(59198, 59199), 25 -> HashSet(59164, 59165), 20 -> HashSet(59147, 59146), 29 -> HashSet(59183, 59184, 59185), 21 -> HashSet(59154, 59152, 59148, 59153), 28 -> HashSet(59180, 59181, 59182), 38 -> HashSet(59201, 59200, 59202), 22 -> HashSet(59157, 59156, 59155), 27 -> HashSet(59179, 59177, 59178, 59173), 26 -> HashSet(59172, 59166, 59171, 59170), 23 -> HashSet(59159, 59158), 36 -> HashSet(59194, 59191, 59195, 59196, 59197, 59193, 59192), 30 -> HashSet(59186, 59188, 59187), 19 -> HashSet(59144, 59145, 59143))
  /* Beautified form:
  "ProxyExoticObject.GetOwnProperty" (O, P) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "getOwnPropertyDescriptor")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["GetOwnProperty"] target P)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target, P]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let trapResultObj = __x4__
    app __x5__ = (Type trapResultObj)
    if (! (|| (= __x5__ Object) (= __x5__ Undefined))) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (target["GetOwnProperty"] target P)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let targetDesc = __x7__
    if (= trapResultObj undefined) {
      if (= targetDesc undefined) {
        app __x8__ = (WrapCompletion undefined)
        return __x8__
      } else {}
      if (= targetDesc["Configurable"] false) {
        app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x9__
      } else {}
      app __x10__ = (IsExtensible target)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let extensibleTarget = __x10__
      if (= extensibleTarget false) {
        app __x11__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x11__
      } else {}
      app __x12__ = (WrapCompletion undefined)
      return __x12__
    } else {}
    app __x13__ = (IsExtensible target)
    if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
    let extensibleTarget = __x13__
    app __x14__ = (ToPropertyDescriptor trapResultObj)
    if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
    let resultDesc = __x14__
    app __x15__ = (CompletePropertyDescriptor resultDesc)
    __x15__
    app __x16__ = (IsCompatiblePropertyDescriptor extensibleTarget resultDesc targetDesc)
    let valid = __x16__
    if (= valid false) {
      app __x17__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x17__
    } else {}
    if (= resultDesc["Configurable"] false) if (|| (= targetDesc undefined) (= targetDesc["Configurable"] true)) {
      app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x18__
    } else {} else {}
    app __x19__ = (WrapCompletion resultDesc)
    return __x19__
  }
  */
}
