package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetTemplateObject {
  val length: Int = 1
  val func: Func = Func("""GetTemplateObject""", List(Id("""templateLiteral""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""templateLiteral"""))), EStr("""TemplateStrings""")).setId(15443), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EBool(true))).setId(15444), ILet(Id("""rawStrings"""), ERef(RefId(Id("""__x1__""")))).setId(15445), ILet(Id("""realm"""), ERef(RefId(Id("""REALM""")))).setId(15447), ILet(Id("""templateRegistry"""), ERef(RefProp(RefId(Id("""realm""")), EStr("""TemplateMap""")))).setId(15449), ILet(Id("""__x2__"""), ERef(RefId(Id("""templateRegistry""")))).setId(15453), ILet(Id("""__x3__"""), EINum(0L)).setId(15454), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(15455), IExpr(ENotSupported("""Etc""")).setId(15451), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(15456))).setId(15525)).setId(15458), IAccess(Id("""__x4__"""), ERef(RefId(Id("""templateLiteral"""))), EStr("""TemplateStrings""")).setId(15461), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(EBool(false))).setId(15462), ILet(Id("""cookedStrings"""), ERef(RefId(Id("""__x5__""")))).setId(15463), IExpr(ENotSupported("""Etc""")).setId(15451), IApp(Id("""__x6__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""count"""))))).setId(15466), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(15467), IReturn(ERef(RefId(Id("""__x6__""")))).setId(15468)).setId(15469), ISeq(List()).setId(15535)).setId(15470), ILet(Id("""template"""), ERef(RefId(Id("""__x6__""")))).setId(15471), IApp(Id("""__x7__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""count"""))))).setId(15473), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(15474), IReturn(ERef(RefId(Id("""__x7__""")))).setId(15475)).setId(15476), ISeq(List()).setId(15542)).setId(15477), ILet(Id("""rawObj"""), ERef(RefId(Id("""__x7__""")))).setId(15478), ILet(Id("""index"""), EINum(0L)).setId(15480), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""count""")))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""index"""))))).setId(15482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(15483), IReturn(ERef(RefId(Id("""__x8__""")))).setId(15484)).setId(15485), ISeq(List()).setId(15550)).setId(15486), ILet(Id("""prop"""), ERef(RefId(Id("""__x8__""")))).setId(15487), IExpr(ENotSupported("""Etc""")).setId(15451), IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""template""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""template"""))), ERef(RefId(Id("""prop"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""cookedValue""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(15489), IExpr(ERef(RefId(Id("""__x9__""")))).setId(15490), IExpr(ENotSupported("""Etc""")).setId(15451), IApp(Id("""__x10__"""), ERef(RefProp(RefId(Id("""rawObj""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""rawObj"""))), ERef(RefId(Id("""prop"""))), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""rawValue""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(true)), (EStr("""Configurable"""), EBool(false)))))).setId(15492), IExpr(ERef(RefId(Id("""__x10__""")))).setId(15493), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(15495))).setId(15560)).setId(15498), IApp(Id("""__x11__"""), ERef(RefId(Id("""SetIntegrityLevel"""))), List(ERef(RefId(Id("""rawObj"""))), EStr("""frozen"""))).setId(15500), IExpr(ERef(RefId(Id("""__x11__""")))).setId(15501), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""template""")), EStr("""DefineOwnProperty"""))), List(ERef(RefId(Id("""template"""))), EStr("""raw"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""rawObj""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(15503), IExpr(ERef(RefId(Id("""__x12__""")))).setId(15504), IApp(Id("""__x13__"""), ERef(RefId(Id("""SetIntegrityLevel"""))), List(ERef(RefId(Id("""template"""))), EStr("""frozen"""))).setId(15506), IExpr(ERef(RefId(Id("""__x13__""")))).setId(15507), IAppend(EMap(Ty("""Record"""), List((EStr("""Site"""), ERef(RefId(Id("""templateLiteral""")))), (EStr("""Array"""), ERef(RefId(Id("""template""")))))), ERef(RefId(Id("""templateRegistry""")))).setId(15509), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""template"""))))).setId(15511), IReturn(ERef(RefId(Id("""__x14__""")))).setId(15512))).setId(15571))
  val instToStepMap: Map[Int, Int] = HashMap(15472 -> 10, 15482 -> 21, 15446 -> 0, 15502 -> 22, 15470 -> 10, 15447 -> 1, 15479 -> 11, 15443 -> 0, 15501 -> 22, 15444 -> 0, 15489 -> 21, 15490 -> 21, 15450 -> 2, 15504 -> 23, 15477 -> 11, 15509 -> 25, 15462 -> 7, 15500 -> 22, 15445 -> 0, 15494 -> 21, 15473 -> 11, 15458 -> 6, 15505 -> 23, 15503 -> 23, 15449 -> 2, 15486 -> 21, 15488 -> 21, 15471 -> 10, 15491 -> 21, 15498 -> 21, 15481 -> 12, 15454 -> 6, 15513 -> 26, 15466 -> 10, 15459 -> 6, 15495 -> 21, 15510 -> 25, 15478 -> 11, 15463 -> 7, 15499 -> 21, 15506 -> 24, 15492 -> 21, 15460 -> 6, 15452 -> 6, 15507 -> 24, 15453 -> 6, 15465 -> 9, 15497 -> 21, 15487 -> 21, 15496 -> 21, 15464 -> 7, 15511 -> 26, 15451 -> 21, 15508 -> 24, 15448 -> 1, 15480 -> 12, 15461 -> 7, 15512 -> 26, 15493 -> 21)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(15445, 15446, 15443, 15444), 10 -> HashSet(15472, 15471, 15466, 15470), 20 -> HashSet(15494, 15492, 15493), 1 -> HashSet(15447, 15448), 6 -> HashSet(15458, 15451, 15454, 15459, 15460, 15452, 15453), 21 -> HashSet(15490, 15482, 15494, 15495, 15499, 15492, 15496, 15451, 15493, 15489, 15486, 15488, 15491, 15498, 15497, 15487), 9 -> HashSet(15465), 2 -> HashSet(15450, 15449), 17 -> HashSet(15451), 22 -> HashSet(15500, 15502, 15501), 12 -> HashSet(15481, 15480), 7 -> HashSet(15462, 15463, 15464, 15461), 18 -> HashSet(15490, 15491, 15489), 16 -> HashSet(15482, 15487, 15486, 15488), 11 -> HashSet(15477, 15473, 15478, 15479), 8 -> HashSet(15451), 19 -> HashSet(15451), 24 -> HashSet(15506, 15507, 15508), 25 -> HashSet(15509, 15510), 26 -> HashSet(15513, 15511, 15512), 23 -> HashSet(15504, 15505, 15503))
  /* Beautified form:
  "GetTemplateObject" (templateLiteral) => {
    access __x0__ = (templateLiteral "TemplateStrings")
    app __x1__ = (__x0__ true)
    let rawStrings = __x1__
    let realm = REALM
    let templateRegistry = realm["TemplateMap"]
    let __x2__ = templateRegistry
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let e = __x2__[__x3__]
      !!! "Etc"
      __x3__ = (+ __x3__ 1i)
    }
    access __x4__ = (templateLiteral "TemplateStrings")
    app __x5__ = (__x4__ false)
    let cookedStrings = __x5__
    !!! "Etc"
    app __x6__ = (ArrayCreate count)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let template = __x6__
    app __x7__ = (ArrayCreate count)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let rawObj = __x7__
    let index = 0i
    while (< index count) {
      app __x8__ = (ToString index)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let prop = __x8__
      !!! "Etc"
      app __x9__ = (template["DefineOwnProperty"] template prop (new PropertyDescriptor("Value" -> cookedValue, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
      __x9__
      !!! "Etc"
      app __x10__ = (rawObj["DefineOwnProperty"] rawObj prop (new PropertyDescriptor("Value" -> rawValue, "Writable" -> false, "Enumerable" -> true, "Configurable" -> false)))
      __x10__
      index = (+ index 1i)
    }
    app __x11__ = (SetIntegrityLevel rawObj "frozen")
    __x11__
    app __x12__ = (template["DefineOwnProperty"] template "raw" (new PropertyDescriptor("Value" -> rawObj, "Writable" -> false, "Enumerable" -> false, "Configurable" -> false)))
    __x12__
    app __x13__ = (SetIntegrityLevel template "frozen")
    __x13__
    append (new Record("Site" -> templateLiteral, "Array" -> template)) -> templateRegistry
    app __x14__ = (WrapCompletion template)
    return __x14__
  }
  */
}
