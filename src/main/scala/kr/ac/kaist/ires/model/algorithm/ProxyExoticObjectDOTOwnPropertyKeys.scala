package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ProxyExoticObjectDOTOwnPropertyKeys {
  val length: Int = 0
  val func: Func = Func("""ProxyExoticObject.OwnPropertyKeys""", List(Id("""O""")), None, ISeq(List(ILet(Id("""handler"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyHandler""")))).setId(60518), IIf(EBOp(OEq, ERef(RefId(Id("""handler"""))), ENull), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60520), IReturn(ERef(RefId(Id("""__x0__""")))).setId(60521))).setId(60654), ISeq(List()).setId(60655)).setId(60524), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""O""")), EStr("""ProxyTarget""")))).setId(60526), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""handler"""))), EStr("""ownKeys"""))).setId(60528), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(60529), IReturn(ERef(RefId(Id("""__x1__""")))).setId(60530)).setId(60531), ISeq(List()).setId(60662)).setId(60532), ILet(Id("""trap"""), ERef(RefId(Id("""__x1__""")))).setId(60533), IIf(EBOp(OEq, ERef(RefId(Id("""trap"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""target"""))))).setId(60535), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(60536), IReturn(ERef(RefId(Id("""__x2__""")))).setId(60537)).setId(60538), ISeq(List()).setId(60669)).setId(60539), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(60540), IReturn(ERef(RefId(Id("""__x3__""")))).setId(60541))).setId(60673), ISeq(List()).setId(60674)).setId(60544), IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""trap"""))), ERef(RefId(Id("""handler"""))), EList(List(ERef(RefId(Id("""target"""))))))).setId(60546), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(60547), IReturn(ERef(RefId(Id("""__x4__""")))).setId(60548)).setId(60549), ISeq(List()).setId(60680)).setId(60550), ILet(Id("""trapResultArray"""), ERef(RefId(Id("""__x4__""")))).setId(60551), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateListFromArrayLike"""))), List(ERef(RefId(Id("""trapResultArray"""))), EList(List(ERef(RefId(Id("""String"""))), ERef(RefId(Id("""Symbol"""))))))).setId(60553), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(60554), IReturn(ERef(RefId(Id("""__x5__""")))).setId(60555)).setId(60556), ISeq(List()).setId(60687)).setId(60557), ILet(Id("""trapResult"""), ERef(RefId(Id("""__x5__""")))).setId(60558), IExpr(ENotSupported("""Etc""")).setId(60560), IApp(Id("""__x6__"""), ERef(RefId(Id("""IsExtensible"""))), List(ERef(RefId(Id("""target"""))))).setId(60561), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(60562), IReturn(ERef(RefId(Id("""__x6__""")))).setId(60563)).setId(60564), ISeq(List()).setId(60695)).setId(60565), ILet(Id("""extensibleTarget"""), ERef(RefId(Id("""__x6__""")))).setId(60566), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""target"""))))).setId(60568), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(60569), IReturn(ERef(RefId(Id("""__x7__""")))).setId(60570)).setId(60571), ISeq(List()).setId(60702)).setId(60572), ILet(Id("""targetKeys"""), ERef(RefId(Id("""__x7__""")))).setId(60573), ILet(Id("""targetConfigurableKeys"""), EList(List())).setId(60575), ILet(Id("""targetNonconfigurableKeys"""), EList(List())).setId(60577), ILet(Id("""__x8__"""), ERef(RefId(Id("""targetKeys""")))).setId(60595), ILet(Id("""__x9__"""), EINum(0L)).setId(60596), IWhile(EBOp(OLt, ERef(RefId(Id("""__x9__"""))), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x8__""")), ERef(RefId(Id("""__x9__""")))))).setId(60597), IApp(Id("""__x10__"""), ERef(RefProp(RefId(Id("""target""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""key"""))))).setId(60579), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(60580), IReturn(ERef(RefId(Id("""__x10__""")))).setId(60581)).setId(60582), ISeq(List()).setId(60714)).setId(60583), ILet(Id("""desc"""), ERef(RefId(Id("""__x10__""")))).setId(60584), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Configurable"""))), EBool(false))), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""targetNonconfigurableKeys""")))).setId(60586), IAppend(ERef(RefId(Id("""key"""))), ERef(RefId(Id("""targetConfigurableKeys""")))).setId(60589)).setId(60592), IAssign(RefId(Id("""__x9__""")), EBOp(OPlus, ERef(RefId(Id("""__x9__"""))), EINum(1L))).setId(60598))).setId(60721)).setId(60600), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), EBOp(OEq, ERef(RefProp(RefId(Id("""targetNonconfigurableKeys""")), EStr("""length"""))), EINum(0L))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))).setId(60603), IReturn(ERef(RefId(Id("""__x11__""")))).setId(60604))).setId(60725), ISeq(List()).setId(60726)).setId(60607), IExpr(ENotSupported("""Etc""")).setId(60560), ILet(Id("""__x12__"""), ERef(RefId(Id("""targetNonconfigurableKeys""")))).setId(60615), ILet(Id("""__x13__"""), EINum(0L)).setId(60616), IWhile(EBOp(OLt, ERef(RefId(Id("""__x13__"""))), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x12__""")), ERef(RefId(Id("""__x13__""")))))).setId(60617), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""uncheckedResultKeys"""))), ERef(RefId(Id("""key"""))))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60609), IReturn(ERef(RefId(Id("""__x14__""")))).setId(60610))).setId(60734), ISeq(List()).setId(60735)).setId(60612), IExpr(ENotSupported("""Etc""")).setId(60560), IAssign(RefId(Id("""__x13__""")), EBOp(OPlus, ERef(RefId(Id("""__x13__"""))), EINum(1L))).setId(60618))).setId(60739)).setId(60620), IIf(EBOp(OEq, ERef(RefId(Id("""extensibleTarget"""))), EBool(true)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))).setId(60623), IReturn(ERef(RefId(Id("""__x15__""")))).setId(60624))).setId(60743), ISeq(List()).setId(60744)).setId(60626), ILet(Id("""__x16__"""), ERef(RefId(Id("""targetConfigurableKeys""")))).setId(60634), ILet(Id("""__x17__"""), EINum(0L)).setId(60635), IWhile(EBOp(OLt, ERef(RefId(Id("""__x17__"""))), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x16__""")), ERef(RefId(Id("""__x17__""")))))).setId(60636), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""uncheckedResultKeys"""))), ERef(RefId(Id("""key"""))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60628), IReturn(ERef(RefId(Id("""__x18__""")))).setId(60629))).setId(60751), ISeq(List()).setId(60752)).setId(60631), IExpr(ENotSupported("""Etc""")).setId(60560), IAssign(RefId(Id("""__x17__""")), EBOp(OPlus, ERef(RefId(Id("""__x17__"""))), EINum(1L))).setId(60637))).setId(60756)).setId(60639), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""uncheckedResultKeys""")), EStr("""length""")))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(60642), IReturn(ERef(RefId(Id("""__x19__""")))).setId(60643))).setId(60760), ISeq(List()).setId(60761)).setId(60645), IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""trapResult"""))))).setId(60647), IReturn(ERef(RefId(Id("""__x20__""")))).setId(60648))).setId(60765))
  val instToStepMap: Map[Int, Int] = HashMap(60623 -> 38, 60543 -> 8, 60533 -> 5, 60648 -> 47, 60584 -> 27, 60616 -> 37, 60631 -> 44, 60526 -> 4, 60587 -> 24, 60552 -> 10, 60567 -> 13, 60574 -> 14, 60626 -> 39, 60545 -> 9, 60606 -> 30, 60641 -> 44, 60522 -> 1, 60577 -> 18, 60594 -> 27, 60609 -> 35, 60535 -> 8, 60634 -> 44, 60534 -> 5, 60559 -> 11, 60602 -> 27, 60566 -> 13, 60613 -> 37, 60644 -> 45, 60612 -> 37, 60591 -> 27, 60630 -> 42, 60542 -> 8, 60625 -> 38, 60551 -> 10, 60615 -> 37, 60525 -> 2, 60647 -> 47, 60539 -> 8, 60620 -> 37, 60635 -> 44, 60583 -> 27, 60521 -> 1, 60561 -> 13, 60603 -> 30, 60593 -> 27, 60592 -> 27, 60624 -> 38, 60639 -> 44, 60518 -> 0, 60579 -> 27, 60575 -> 17, 60560 -> 44, 60607 -> 31, 60565 -> 13, 60628 -> 42, 60588 -> 24, 60629 -> 42, 60611 -> 35, 60643 -> 45, 60528 -> 5, 60646 -> 46, 60532 -> 5, 60557 -> 11, 60589 -> 27, 60621 -> 37, 60519 -> 0, 60596 -> 27, 60540 -> 8, 60576 -> 17, 60595 -> 27, 60640 -> 44, 60604 -> 30, 60524 -> 2, 60572 -> 14, 60649 -> 47, 60527 -> 4, 60608 -> 31, 60553 -> 11, 60627 -> 39, 60585 -> 27, 60573 -> 14, 60558 -> 11, 60645 -> 46, 60568 -> 14, 60544 -> 9, 60632 -> 44, 60610 -> 35, 60590 -> 27, 60546 -> 10, 60578 -> 18, 60605 -> 30, 60642 -> 45, 60600 -> 27, 60622 -> 37, 60520 -> 1, 60550 -> 10, 60523 -> 16, 60601 -> 27, 60541 -> 8, 60633 -> 44, 60586 -> 24, 60614 -> 37)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(60518, 60519), 5 -> HashSet(60534, 60528, 60532, 60533), 10 -> HashSet(60552, 60551, 60546, 60550), 14 -> HashSet(60574, 60572, 60573, 60568), 46 -> HashSet(60646, 60645), 1 -> HashSet(60522, 60521, 60520), 9 -> HashSet(60545, 60544), 13 -> HashSet(60567, 60566, 60561, 60565), 2 -> HashSet(60525, 60524), 12 -> HashSet(60560), 39 -> HashSet(60626, 60627), 18 -> HashSet(60577, 60578), 8 -> HashSet(60535, 60542, 60539, 60543, 60540, 60541), 4 -> HashSet(60526, 60527), 42 -> HashSet(60630, 60628, 60629), 24 -> HashSet(60587, 60588, 60586), 37 -> HashSet(60616, 60615, 60620, 60560, 60621, 60622, 60614, 60613, 60612), 38 -> HashSet(60623, 60625, 60624), 21 -> HashSet(60584, 60583, 60579, 60585), 32 -> HashSet(60560), 45 -> HashSet(60644, 60643, 60642), 17 -> HashSet(60575, 60576), 44 -> HashSet(60631, 60641, 60634, 60635, 60639, 60560, 60640, 60632, 60633), 27 -> HashSet(60584, 60594, 60602, 60591, 60583, 60593, 60589, 60596, 60595, 60585, 60590, 60600, 60601, 60592, 60579), 3 -> HashSet(60523), 35 -> HashSet(60609, 60611, 60610), 16 -> HashSet(60523), 31 -> HashSet(60607, 60608), 11 -> HashSet(60559, 60557, 60553, 60558), 43 -> HashSet(60631, 60632), 36 -> HashSet(60613, 60612), 30 -> HashSet(60606, 60603, 60604, 60605), 47 -> HashSet(60648, 60647, 60649), 15 -> HashSet(60523))
  /* Beautified form:
  "ProxyExoticObject.OwnPropertyKeys" (O) => {
    let handler = O["ProxyHandler"]
    if (= handler null) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    let target = O["ProxyTarget"]
    app __x1__ = (GetMethod handler "ownKeys")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let trap = __x1__
    if (= trap undefined) {
      app __x2__ = (target["OwnPropertyKeys"] target)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Call trap handler (new [target]))
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let trapResultArray = __x4__
    app __x5__ = (CreateListFromArrayLike trapResultArray (new [String, Symbol]))
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let trapResult = __x5__
    !!! "Etc"
    app __x6__ = (IsExtensible target)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let extensibleTarget = __x6__
    app __x7__ = (target["OwnPropertyKeys"] target)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let targetKeys = __x7__
    let targetConfigurableKeys = (new [])
    let targetNonconfigurableKeys = (new [])
    let __x8__ = targetKeys
    let __x9__ = 0i
    while (< __x9__ __x8__["length"]) {
      let key = __x8__[__x9__]
      app __x10__ = (target["GetOwnProperty"] target key)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let desc = __x10__
      if (&& (! (= desc undefined)) (= desc["Configurable"] false)) append key -> targetNonconfigurableKeys else append key -> targetConfigurableKeys
      __x9__ = (+ __x9__ 1i)
    }
    if (&& (= extensibleTarget true) (= targetNonconfigurableKeys["length"] 0i)) {
      app __x11__ = (WrapCompletion trapResult)
      return __x11__
    } else {}
    !!! "Etc"
    let __x12__ = targetNonconfigurableKeys
    let __x13__ = 0i
    while (< __x13__ __x12__["length"]) {
      let key = __x12__[__x13__]
      if (! (contains uncheckedResultKeys key)) {
        app __x14__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x14__
      } else {}
      !!! "Etc"
      __x13__ = (+ __x13__ 1i)
    }
    if (= extensibleTarget true) {
      app __x15__ = (WrapCompletion trapResult)
      return __x15__
    } else {}
    let __x16__ = targetConfigurableKeys
    let __x17__ = 0i
    while (< __x17__ __x16__["length"]) {
      let key = __x16__[__x17__]
      if (! (contains uncheckedResultKeys key)) {
        app __x18__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x18__
      } else {}
      !!! "Etc"
      __x17__ = (+ __x17__ 1i)
    }
    if (< 0i uncheckedResultKeys["length"]) {
      app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x19__
    } else {}
    app __x20__ = (WrapCompletion trapResult)
    return __x20__
  }
  */
}
