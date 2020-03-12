package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTsplit {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.split""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(73329), ILet(Id("""separator"""), ERef(RefId(Id("""__x0__""")))).setId(73330), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(73332), ILet(Id("""limit"""), ERef(RefId(Id("""__x1__""")))).setId(73333), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(73335), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(73336), IReturn(ERef(RefId(Id("""__x2__""")))).setId(73337)).setId(73338), ISeq(List()).setId(73507)).setId(73340), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(73341), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""separator"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""separator"""))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""separator"""))), ERef(RefId(Id("""SYMBOL_split"""))))).setId(73343), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(73344), IReturn(ERef(RefId(Id("""__x3__""")))).setId(73345)).setId(73346), ISeq(List()).setId(73514)).setId(73347), ILet(Id("""splitter"""), ERef(RefId(Id("""__x3__""")))).setId(73348), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""splitter"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""splitter"""))), ERef(RefId(Id("""separator"""))), EList(List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""limit"""))))))).setId(73350), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(73351), IReturn(ERef(RefId(Id("""__x4__""")))).setId(73352)).setId(73353), ISeq(List()).setId(73521)).setId(73354), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(73355), IReturn(ERef(RefId(Id("""__x5__""")))).setId(73356))).setId(73525), ISeq(List()).setId(73526)).setId(73359))).setId(73528), ISeq(List()).setId(73529)).setId(73362), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(73364), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(73365), IReturn(ERef(RefId(Id("""__x6__""")))).setId(73366)).setId(73367), ISeq(List()).setId(73535)).setId(73368), ILet(Id("""S"""), ERef(RefId(Id("""__x6__""")))).setId(73369), IApp(Id("""__x7__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(73371), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(73372), IReturn(ERef(RefId(Id("""__x7__""")))).setId(73373)).setId(73374), ISeq(List()).setId(73542)).setId(73375), ILet(Id("""A"""), ERef(RefId(Id("""__x7__""")))).setId(73376), ILet(Id("""lengthA"""), EINum(0L)).setId(73378), IIf(EBOp(OEq, ERef(RefId(Id("""limit"""))), EUndef), ILet(Id("""lim"""), EBOp(OSub, EINum(4294967296L), EINum(1L))).setId(73380), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ToUint32"""))), List(ERef(RefId(Id("""limit"""))))).setId(73382), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(73383), IReturn(ERef(RefId(Id("""__x8__""")))).setId(73384)).setId(73385), ISeq(List()).setId(73551)).setId(73386), ILet(Id("""lim"""), ERef(RefId(Id("""__x8__""")))).setId(73387))).setId(73554)).setId(73389), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(73391), ILet(Id("""p"""), EINum(0L)).setId(73393), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""separator"""))))).setId(73395), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(73396), IReturn(ERef(RefId(Id("""__x9__""")))).setId(73397)).setId(73398), ISeq(List()).setId(73562)).setId(73399), ILet(Id("""R"""), ERef(RefId(Id("""__x9__""")))).setId(73400), IIf(EBOp(OEq, ERef(RefId(Id("""lim"""))), EINum(0L)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(73402), IReturn(ERef(RefId(Id("""__x10__""")))).setId(73403))).setId(73567), ISeq(List()).setId(73568)).setId(73405), IIf(EBOp(OEq, ERef(RefId(Id("""separator"""))), EUndef), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""0"""), ERef(RefId(Id("""S"""))))).setId(73407), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(73408), IReturn(ERef(RefId(Id("""__x11__""")))).setId(73409)).setId(73410), ISeq(List()).setId(73574)).setId(73411), IExpr(ERef(RefId(Id("""__x11__""")))).setId(73412), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(73414), IReturn(ERef(RefId(Id("""__x12__""")))).setId(73415))).setId(73579), ISeq(List()).setId(73580)).setId(73418), IIf(EBOp(OEq, ERef(RefId(Id("""s"""))), EINum(0L)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""SplitMatch"""))), List(ERef(RefId(Id("""S"""))), EINum(0L), ERef(RefId(Id("""R"""))))).setId(73420), ILet(Id("""z"""), ERef(RefId(Id("""__x13__""")))).setId(73421), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""z"""))), EBool(false))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(73423), IReturn(ERef(RefId(Id("""__x14__""")))).setId(73424))).setId(73586), ISeq(List()).setId(73587)).setId(73426), IApp(Id("""__x15__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), EStr("""0"""), ERef(RefId(Id("""S"""))))).setId(73428), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(73429), IReturn(ERef(RefId(Id("""__x15__""")))).setId(73430)).setId(73431), ISeq(List()).setId(73593)).setId(73432), IExpr(ERef(RefId(Id("""__x15__""")))).setId(73433), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(73435), IReturn(ERef(RefId(Id("""__x16__""")))).setId(73436))).setId(73598), ISeq(List()).setId(73599)).setId(73439), ILet(Id("""q"""), ERef(RefId(Id("""p""")))).setId(73441), IWhile(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""q"""))), ERef(RefId(Id("""s"""))))), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""SplitMatch"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""q"""))), ERef(RefId(Id("""R"""))))).setId(73443), ILet(Id("""e"""), ERef(RefId(Id("""__x17__""")))).setId(73444), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EBool(false)), IAssign(RefId(Id("""q""")), EBOp(OPlus, ERef(RefId(Id("""q"""))), EINum(1L))).setId(73446), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""p""")))), IAssign(RefId(Id("""q""")), EBOp(OPlus, ERef(RefId(Id("""q"""))), EINum(1L))).setId(73448), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(73450), IApp(Id("""__x18__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""lengthA"""))))).setId(73451), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(73452), IReturn(ERef(RefId(Id("""__x18__""")))).setId(73453)).setId(73454), ISeq(List()).setId(73611)).setId(73455), IApp(Id("""__x19__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""T"""))))).setId(73456), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))).setId(73457), IReturn(ERef(RefId(Id("""__x19__""")))).setId(73458)).setId(73459), ISeq(List()).setId(73617)).setId(73460), IExpr(ERef(RefId(Id("""__x19__""")))).setId(73461), IAssign(RefId(Id("""lengthA""")), EBOp(OPlus, ERef(RefId(Id("""lengthA"""))), EINum(1L))).setId(73463), IIf(EBOp(OEq, ERef(RefId(Id("""lengthA"""))), ERef(RefId(Id("""lim""")))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(73465), IReturn(ERef(RefId(Id("""__x20__""")))).setId(73466))).setId(73623), ISeq(List()).setId(73624)).setId(73468), IAssign(RefId(Id("""p""")), ERef(RefId(Id("""e""")))).setId(73470), IAssign(RefId(Id("""q""")), ERef(RefId(Id("""p""")))).setId(73472))).setId(73628)).setId(73475)).setId(73478))).setId(73631)).setId(73481), IExpr(ENotSupported("""Etc""")).setId(73450), IApp(Id("""__x21__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""lengthA"""))))).setId(73483), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x21__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x21__""")), ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Value""")))).setId(73484), IReturn(ERef(RefId(Id("""__x21__""")))).setId(73485)).setId(73486), ISeq(List()).setId(73638)).setId(73487), IApp(Id("""__x22__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x21__"""))), ERef(RefId(Id("""T"""))))).setId(73488), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x22__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x22__""")), ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Value""")))).setId(73489), IReturn(ERef(RefId(Id("""__x22__""")))).setId(73490)).setId(73491), ISeq(List()).setId(73644)).setId(73492), IExpr(ERef(RefId(Id("""__x22__""")))).setId(73493), IApp(Id("""__x23__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(73495), IReturn(ERef(RefId(Id("""__x23__""")))).setId(73496))).setId(73649))
  val instToStepMap: Map[Int, Int] = HashMap(73497 -> 40, 73478 -> 37, 73329 -> 0, 73386 -> 0, 73376 -> 11, 73462 -> 37, 73435 -> 17, 73418 -> 10, 73445 -> 37, 73467 -> 34, 73340 -> 2, 73472 -> 37, 73390 -> 0, 73359 -> 8, 73413 -> 9, 73481 -> 37, 73412 -> 9, 73403 -> 4, 73440 -> 18, 73371 -> 11, 73380 -> 0, 73450 -> 38, 73355 -> 8, 73407 -> 9, 73480 -> 37, 73375 -> 11, 73394 -> 2, 73488 -> 39, 73493 -> 39, 73426 -> 17, 73377 -> 11, 73332 -> 1, 73439 -> 18, 73422 -> 17, 73441 -> 19, 73471 -> 37, 73476 -> 37, 73362 -> 9, 73477 -> 37, 73360 -> 8, 73399 -> 3, 73417 -> 9, 73389 -> 0, 73347 -> 8, 73402 -> 4, 73335 -> 2, 73421 -> 17, 73446 -> 24, 73456 -> 37, 73392 -> 1, 73356 -> 8, 73382 -> 0, 73434 -> 17, 73466 -> 34, 73350 -> 8, 73463 -> 37, 73449 -> 28, 73370 -> 10, 73424 -> 14, 73414 -> 9, 73378 -> 12, 73438 -> 17, 73470 -> 37, 73381 -> 0, 73427 -> 17, 73473 -> 37, 73395 -> 3, 73341 -> 2, 73363 -> 9, 73406 -> 5, 73494 -> 39, 73442 -> 19, 73415 -> 9, 73483 -> 39, 73405 -> 5, 73447 -> 24, 73465 -> 34, 73369 -> 10, 73331 -> 0, 73349 -> 8, 73401 -> 3, 73334 -> 1, 73433 -> 17, 73469 -> 37, 73368 -> 10, 73495 -> 40, 73400 -> 3, 73443 -> 37, 73464 -> 37, 73437 -> 17, 73342 -> 2, 73420 -> 17, 73388 -> 0, 73474 -> 37, 73357 -> 8, 73411 -> 9, 73432 -> 17, 73487 -> 39, 73379 -> 12, 73460 -> 37, 73461 -> 37, 73451 -> 37, 73492 -> 39, 73428 -> 17, 73330 -> 0, 73482 -> 37, 73333 -> 1, 73496 -> 40, 73364 -> 10, 73387 -> 0, 73479 -> 37, 73468 -> 37, 73419 -> 10, 73416 -> 9, 73423 -> 14, 73354 -> 8, 73448 -> 28, 73475 -> 37, 73343 -> 8, 73348 -> 8, 73391 -> 1, 73436 -> 17, 73404 -> 4, 73455 -> 37, 73361 -> 8, 73444 -> 37, 73358 -> 8, 73393 -> 2, 73339 -> 37, 73425 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(73390, 73380, 73389, 73382, 73381, 73331, 73388, 73330, 73387, 73329, 73386), 5 -> HashSet(73347, 73406, 73405, 73349, 73343, 73348), 10 -> HashSet(73418, 73370, 73369, 73368, 73364, 73419), 14 -> HashSet(73424, 73423, 73425), 1 -> HashSet(73332, 73392, 73334, 73333, 73391), 9 -> HashSet(73407, 73362, 73417, 73414, 73363, 73415, 73411, 73416, 73413, 73412), 13 -> HashSet(73422, 73421, 73420), 2 -> HashSet(73340, 73394, 73335, 73341, 73342, 73393), 27 -> HashSet(73339), 12 -> HashSet(73378, 73379), 39 -> HashSet(73494, 73483, 73487, 73492, 73488, 73493), 18 -> HashSet(73440, 73439), 11 -> HashSet(73376, 73371, 73375, 73377), 8 -> HashSet(73356, 73350, 73349, 73354, 73359, 73413, 73412, 73355, 73407, 73347, 73360, 73357, 73411, 73343, 73348, 73361, 73358), 4 -> HashSet(73403, 73402, 73404), 15 -> HashSet(73426, 73427), 24 -> HashSet(73446, 73447), 37 -> HashSet(73462, 73481, 73450, 73480, 73477, 73456, 73463, 73470, 73473, 73478, 73464, 73474, 73460, 73482, 73475, 73339, 73445, 73472, 73471, 73476, 73443, 73469, 73461, 73451, 73479, 73468, 73455, 73444), 33 -> HashSet(73463, 73464), 28 -> HashSet(73449, 73448), 38 -> HashSet(73450), 17 -> HashSet(73435, 73426, 73422, 73421, 73434, 73433, 73437, 73420, 73432, 73428, 73436, 73438, 73427), 32 -> HashSet(73462, 73456, 73460, 73455, 73461, 73451), 34 -> HashSet(73467, 73466, 73465), 3 -> HashSet(73399, 73395, 73401, 73400), 35 -> HashSet(73469, 73468), 16 -> HashSet(73434, 73433, 73432, 73428), 31 -> HashSet(73450), 40 -> HashSet(73497, 73495, 73496), 23 -> HashSet(73445, 73443, 73444), 36 -> HashSet(73471, 73470), 19 -> HashSet(73441, 73442))
  /* Beautified form:
  "GLOBAL.String.prototype.split" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let separator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let limit = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= separator undefined) (= separator null))) {
      app __x3__ = (GetMethod separator SYMBOL_split)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let splitter = __x3__
      if (! (= splitter undefined)) {
        app __x4__ = (Call splitter separator (new [O, limit]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let S = __x6__
    app __x7__ = (ArrayCreate 0i)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let A = __x7__
    let lengthA = 0i
    if (= limit undefined) let lim = (- 4294967296i 1i) else {
      app __x8__ = (ToUint32 limit)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let lim = __x8__
    }
    let s = S["length"]
    let p = 0i
    app __x9__ = (ToString separator)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    let R = __x9__
    if (= lim 0i) {
      app __x10__ = (WrapCompletion A)
      return __x10__
    } else {}
    if (= separator undefined) {
      app __x11__ = (CreateDataProperty A "0" S)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      __x11__
      app __x12__ = (WrapCompletion A)
      return __x12__
    } else {}
    if (= s 0i) {
      app __x13__ = (SplitMatch S 0i R)
      let z = __x13__
      if (! (= z false)) {
        app __x14__ = (WrapCompletion A)
        return __x14__
      } else {}
      app __x15__ = (CreateDataProperty A "0" S)
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      __x15__
      app __x16__ = (WrapCompletion A)
      return __x16__
    } else {}
    let q = p
    while (! (= q s)) {
      app __x17__ = (SplitMatch S q R)
      let e = __x17__
      if (= e false) q = (+ q 1i) else if (= e p) q = (+ q 1i) else {
        !!! "Etc"
        app __x18__ = (ToString lengthA)
        if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        app __x19__ = (CreateDataProperty A __x18__ T)
        if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        __x19__
        lengthA = (+ lengthA 1i)
        if (= lengthA lim) {
          app __x20__ = (WrapCompletion A)
          return __x20__
        } else {}
        p = e
        q = p
      }
    }
    !!! "Etc"
    app __x21__ = (ToString lengthA)
    if (= (typeof __x21__) "Completion") if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
    app __x22__ = (CreateDataProperty A __x21__ T)
    if (= (typeof __x22__) "Completion") if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
    __x22__
    app __x23__ = (WrapCompletion A)
    return __x23__
  }
  */
}
