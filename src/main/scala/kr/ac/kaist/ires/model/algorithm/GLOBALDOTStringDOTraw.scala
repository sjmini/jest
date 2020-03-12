package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTraw {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.raw""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(70431), ILet(Id("""template"""), ERef(RefId(Id("""__x0__""")))).setId(70432), IExpr(ENotSupported("""Etc""")).setId(70434), ILet(Id("""numberOfSubstitutions"""), ERef(RefProp(RefId(Id("""substitutions""")), EStr("""length""")))).setId(70435), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""template"""))))).setId(70437), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(70438), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70439)).setId(70440), ISeq(List()).setId(70524)).setId(70442), ILet(Id("""cooked"""), ERef(RefId(Id("""__x1__""")))).setId(70443), IApp(Id("""__x2__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""cooked"""))), EStr("""raw"""))).setId(70445), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(70446), IReturn(ERef(RefId(Id("""__x2__""")))).setId(70447)).setId(70448), ISeq(List()).setId(70531)).setId(70449), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(70450), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(70451), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70452)).setId(70453), ISeq(List()).setId(70537)).setId(70454), ILet(Id("""raw"""), ERef(RefId(Id("""__x3__""")))).setId(70455), IApp(Id("""__x4__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""raw"""))))).setId(70457), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(70458), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70459)).setId(70460), ISeq(List()).setId(70544)).setId(70461), ILet(Id("""literalSegments"""), ERef(RefId(Id("""__x4__""")))).setId(70462), IIf(EUOp(ONot, EBOp(OLt, EINum(0L), ERef(RefId(Id("""literalSegments"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr(""""""))).setId(70464), IReturn(ERef(RefId(Id("""__x5__""")))).setId(70465))).setId(70549), ISeq(List()).setId(70550)).setId(70467), ILet(Id("""stringElements"""), EList(List())).setId(70469), ILet(Id("""nextIndex"""), EINum(0L)).setId(70471), IWhile(EBool(true), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""nextIndex"""))))).setId(70473), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(70474), IReturn(ERef(RefId(Id("""__x6__""")))).setId(70475)).setId(70476), ISeq(List()).setId(70558)).setId(70477), ILet(Id("""nextKey"""), ERef(RefId(Id("""__x6__""")))).setId(70478), IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""raw"""))), ERef(RefId(Id("""nextKey"""))))).setId(70480), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(70481), IReturn(ERef(RefId(Id("""__x7__""")))).setId(70482)).setId(70483), ISeq(List()).setId(70565)).setId(70484), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(70485), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(70486), IReturn(ERef(RefId(Id("""__x8__""")))).setId(70487)).setId(70488), ISeq(List()).setId(70571)).setId(70489), ILet(Id("""nextSeg"""), ERef(RefId(Id("""__x8__""")))).setId(70490), IExpr(ENotSupported("""Etc""")).setId(70434), IIf(EBOp(OEq, EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L)), ERef(RefId(Id("""literalSegments""")))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(70492), IReturn(ERef(RefId(Id("""__x9__""")))).setId(70493))).setId(70577), ISeq(List()).setId(70578)).setId(70496), IIf(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""numberOfSubstitutions""")))), ILet(Id("""next"""), ERef(RefProp(RefId(Id("""substitutions""")), ERef(RefId(Id("""nextIndex""")))))).setId(70498), ILet(Id("""next"""), EStr("""""")).setId(70500)).setId(70502), IApp(Id("""__x10__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""next"""))))).setId(70504), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(70505), IReturn(ERef(RefId(Id("""__x10__""")))).setId(70506)).setId(70507), ISeq(List()).setId(70587)).setId(70508), ILet(Id("""nextSub"""), ERef(RefId(Id("""__x10__""")))).setId(70509), IExpr(ENotSupported("""Etc""")).setId(70434), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L))).setId(70511))).setId(70592)).setId(70514))).setId(70594))
  val instToStepMap: Map[Int, Int] = HashMap(70493 -> 17, 70470 -> 8, 70478 -> 23, 70498 -> 19, 70436 -> 2, 70445 -> 4, 70513 -> 23, 70504 -> 23, 70473 -> 23, 70433 -> 0, 70443 -> 3, 70502 -> 23, 70442 -> 3, 70455 -> 4, 70461 -> 5, 70510 -> 23, 70466 -> 6, 70434 -> 23, 70471 -> 9, 70477 -> 23, 70492 -> 17, 70456 -> 4, 70503 -> 23, 70485 -> 23, 70484 -> 23, 70499 -> 19, 70432 -> 0, 70435 -> 2, 70467 -> 7, 70464 -> 6, 70496 -> 23, 70509 -> 23, 70491 -> 23, 70449 -> 4, 70508 -> 23, 70472 -> 9, 70463 -> 5, 70500 -> 20, 70444 -> 3, 70512 -> 23, 70468 -> 7, 70495 -> 17, 70469 -> 8, 70437 -> 3, 70480 -> 23, 70431 -> 0, 70465 -> 6, 70497 -> 23, 70454 -> 4, 70490 -> 23, 70501 -> 20, 70457 -> 5, 70450 -> 4, 70494 -> 17, 70479 -> 23, 70462 -> 5, 70511 -> 23, 70514 -> 23, 70489 -> 23)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(70432, 70431, 70433), 5 -> HashSet(70461, 70463, 70457, 70462), 14 -> HashSet(70434), 20 -> HashSet(70502, 70503, 70500, 70501), 1 -> HashSet(70434), 6 -> HashSet(70466, 70464, 70465), 21 -> HashSet(70510, 70509, 70508, 70504), 9 -> HashSet(70471, 70472), 13 -> HashSet(70491, 70480, 70490, 70489, 70485, 70484), 2 -> HashSet(70436, 70435), 17 -> HashSet(70493, 70492, 70495, 70494), 22 -> HashSet(70434), 12 -> HashSet(70478, 70477, 70473, 70479), 7 -> HashSet(70467, 70468), 3 -> HashSet(70442, 70444, 70437, 70443), 18 -> HashSet(70496, 70497), 23 -> HashSet(70502, 70478, 70477, 70503, 70513, 70504, 70473, 70512, 70480, 70497, 70490, 70510, 70434, 70485, 70484, 70496, 70509, 70491, 70508, 70479, 70511, 70514, 70489), 8 -> HashSet(70470, 70469), 19 -> HashSet(70498, 70499), 4 -> HashSet(70455, 70445, 70456, 70449, 70454, 70450))
  /* Beautified form:
  "GLOBAL.String.raw" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let template = __x0__
    !!! "Etc"
    let numberOfSubstitutions = substitutions["length"]
    app __x1__ = (ToObject template)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let cooked = __x1__
    app __x2__ = (Get cooked "raw")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (ToObject __x2__)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let raw = __x3__
    app __x4__ = (LengthOfArrayLike raw)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let literalSegments = __x4__
    if (! (< 0i literalSegments)) {
      app __x5__ = (WrapCompletion "")
      return __x5__
    } else {}
    let stringElements = (new [])
    let nextIndex = 0i
    while true {
      app __x6__ = (ToString nextIndex)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let nextKey = __x6__
      app __x7__ = (Get raw nextKey)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      app __x8__ = (ToString __x7__)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let nextSeg = __x8__
      !!! "Etc"
      if (= (+ nextIndex 1i) literalSegments) {
        app __x9__ = (WrapCompletion !!! "StringOp")
        return __x9__
      } else {}
      if (< nextIndex numberOfSubstitutions) let next = substitutions[nextIndex] else let next = ""
      app __x10__ = (ToString next)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let nextSub = __x10__
      !!! "Etc"
      nextIndex = (+ nextIndex 1i)
    }
  }
  */
}
