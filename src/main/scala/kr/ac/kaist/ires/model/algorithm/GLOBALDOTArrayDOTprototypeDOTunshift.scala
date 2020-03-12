package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTunshift {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.unshift""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(83301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(83302), IReturn(ERef(RefId(Id("""__x0__""")))).setId(83303)).setId(83304), ISeq(List()).setId(83416)).setId(83306), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(83307), IApp(Id("""__x1__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(83309), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(83310), IReturn(ERef(RefId(Id("""__x1__""")))).setId(83311)).setId(83312), ISeq(List()).setId(83423)).setId(83313), ILet(Id("""len"""), ERef(RefId(Id("""__x1__""")))).setId(83314), ILet(Id("""argCount"""), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))).setId(83316), IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""argCount""")))), ISeq(List(IIf(EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""argCount"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(83318), IReturn(ERef(RefId(Id("""__x2__""")))).setId(83319))).setId(83429), ISeq(List()).setId(83430)).setId(83321), ILet(Id("""k"""), ERef(RefId(Id("""len""")))).setId(83323), IWhile(EBOp(OLt, EINum(0L), ERef(RefId(Id("""k""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L)))).setId(83325), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(83326), IReturn(ERef(RefId(Id("""__x3__""")))).setId(83327)).setId(83328), ISeq(List()).setId(83437)).setId(83329), ILet(Id("""from"""), ERef(RefId(Id("""__x3__""")))).setId(83330), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""argCount""")))), EINum(1L)))).setId(83332), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(83333), IReturn(ERef(RefId(Id("""__x4__""")))).setId(83334)).setId(83335), ISeq(List()).setId(83444)).setId(83336), ILet(Id("""to"""), ERef(RefId(Id("""__x4__""")))).setId(83337), IApp(Id("""__x5__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(83339), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(83340), IReturn(ERef(RefId(Id("""__x5__""")))).setId(83341)).setId(83342), ISeq(List()).setId(83451)).setId(83343), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x5__""")))).setId(83344), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(83346), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(83347), IReturn(ERef(RefId(Id("""__x6__""")))).setId(83348)).setId(83349), ISeq(List()).setId(83458)).setId(83350), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x6__""")))).setId(83351), IApp(Id("""__x7__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))), ERef(RefId(Id("""fromValue"""))), EBool(true))).setId(83353), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(83354), IReturn(ERef(RefId(Id("""__x7__""")))).setId(83355)).setId(83356), ISeq(List()).setId(83465)).setId(83357), IExpr(ERef(RefId(Id("""__x7__""")))).setId(83358))).setId(83468), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))))).setId(83361), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(83362), IReturn(ERef(RefId(Id("""__x8__""")))).setId(83363)).setId(83364), ISeq(List()).setId(83473)).setId(83365), IExpr(ERef(RefId(Id("""__x8__""")))).setId(83366))).setId(83476)).setId(83369), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L))).setId(83371))).setId(83479)).setId(83374), ILet(Id("""j"""), EINum(0L)).setId(83376), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(83378), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), ISeq(List(ILet(Id("""E"""), EPop(ERef(RefId(Id("""items"""))), EINum(0L))).setId(83380), IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""j"""))))).setId(83381), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(83382), IReturn(ERef(RefId(Id("""__x9__""")))).setId(83383)).setId(83384), ISeq(List()).setId(83488)).setId(83385), IApp(Id("""__x10__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""E"""))), EBool(true))).setId(83386), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(83387), IReturn(ERef(RefId(Id("""__x10__""")))).setId(83388)).setId(83389), ISeq(List()).setId(83494)).setId(83390), IExpr(ERef(RefId(Id("""__x10__""")))).setId(83391), IAssign(RefId(Id("""j""")), EBOp(OPlus, ERef(RefId(Id("""j"""))), EINum(1L))).setId(83393))).setId(83498)).setId(83396))).setId(83500), ISeq(List()).setId(83501)).setId(83399), IApp(Id("""__x11__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""argCount""")))), EBool(true))).setId(83401), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(83402), IReturn(ERef(RefId(Id("""__x11__""")))).setId(83403)).setId(83404), ISeq(List()).setId(83507)).setId(83405), IExpr(ERef(RefId(Id("""__x11__""")))).setId(83406), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""argCount""")))))).setId(83408), IReturn(ERef(RefId(Id("""__x12__""")))).setId(83409))).setId(83512))
  val instToStepMap: Map[Int, Int] = HashMap(83398 -> 24, 83393 -> 24, 83378 -> 24, 83301 -> 0, 83381 -> 24, 83332 -> 16, 83379 -> 24, 83331 -> 16, 83306 -> 0, 83359 -> 11, 83338 -> 16, 83374 -> 24, 83320 -> 0, 83407 -> 26, 83392 -> 24, 83358 -> 11, 83352 -> 11, 83330 -> 16, 83345 -> 16, 83366 -> 15, 83316 -> 2, 83309 -> 1, 83375 -> 24, 83377 -> 24, 83399 -> 25, 83373 -> 16, 83323 -> 24, 83390 -> 24, 83360 -> 11, 83367 -> 15, 83409 -> 27, 83343 -> 16, 83394 -> 24, 83319 -> 0, 83406 -> 26, 83370 -> 16, 83339 -> 16, 83315 -> 1, 83395 -> 24, 83380 -> 24, 83361 -> 15, 83351 -> 11, 83391 -> 24, 83329 -> 16, 83350 -> 11, 83368 -> 15, 83318 -> 0, 83400 -> 25, 83344 -> 16, 83307 -> 0, 83353 -> 11, 83410 -> 27, 83324 -> 24, 83386 -> 24, 83372 -> 16, 83369 -> 16, 83405 -> 26, 83321 -> 24, 83401 -> 26, 83396 -> 24, 83397 -> 24, 83313 -> 1, 83308 -> 0, 83337 -> 16, 83317 -> 2, 83322 -> 24, 83385 -> 24, 83357 -> 11, 83376 -> 24, 83305 -> 15, 83408 -> 27, 83371 -> 16, 83365 -> 15, 83336 -> 16, 83346 -> 11, 83325 -> 16, 83314 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(83306, 83320, 83319, 83318, 83307, 83301, 83308), 5 -> HashSet(83331, 83330, 83329, 83325), 10 -> HashSet(83352, 83351, 83350, 83346), 14 -> HashSet(83305), 1 -> HashSet(83309, 83315, 83321, 83313, 83322, 83314), 6 -> HashSet(83338, 83332, 83337, 83336), 2 -> HashSet(83316, 83323, 83324, 83317), 17 -> HashSet(83377, 83376), 7 -> HashSet(83345, 83343, 83339, 83344), 18 -> HashSet(83379, 83378), 16 -> HashSet(83331, 83375, 83373, 83343, 83329, 83344, 83332, 83337, 83371, 83336, 83325, 83338, 83374, 83330, 83345, 83370, 83339, 83372, 83369), 11 -> HashSet(83359, 83358, 83352, 83360, 83351, 83350, 83353, 83357, 83346), 15 -> HashSet(83366, 83367, 83370, 83361, 83368, 83369, 83305, 83365), 24 -> HashSet(83398, 83379, 83393, 83374, 83392, 83375, 83377, 83394, 83395, 83378, 83324, 83386, 83321, 83381, 83396, 83397, 83322, 83385, 83376, 83323, 83390, 83380, 83391), 25 -> HashSet(83399, 83400), 22 -> HashSet(83380), 27 -> HashSet(83409, 83410, 83408), 26 -> HashSet(83407, 83406, 83405, 83401), 23 -> HashSet(83392, 83390, 83391, 83386, 83381, 83385))
  /* Beautified form:
  "GLOBAL.Array.prototype.unshift" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    let argCount = argumentsList["length"]
    if (< 0i argCount) {
      if (< (- 9007199254740992i 1i) (+ len argCount)) {
        app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x2__
      } else {}
      let k = len
      while (< 0i k) {
        app __x3__ = (ToString (- k 1i))
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        let from = __x3__
        app __x4__ = (ToString (- (+ k argCount) 1i))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        let to = __x4__
        app __x5__ = (HasProperty O from)
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        let fromPresent = __x5__
        if (= fromPresent true) {
          app __x6__ = (Get O from)
          if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
          let fromValue = __x6__
          app __x7__ = (Set O to fromValue true)
          if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          __x7__
        } else {
          app __x8__ = (DeletePropertyOrThrow O to)
          if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          __x8__
        }
        k = (- k 1i)
      }
      let j = 0i
      let items = argumentsList
      while (< 0i items["length"]) {
        let E = (pop items 0i)
        app __x9__ = (ToString j)
        if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
        app __x10__ = (Set O __x9__ E true)
        if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
        __x10__
        j = (+ j 1i)
      }
    } else {}
    app __x11__ = (Set O "length" (+ len argCount) true)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    __x11__
    app __x12__ = (WrapCompletion (+ len argCount))
    return __x12__
  }
  */
}
