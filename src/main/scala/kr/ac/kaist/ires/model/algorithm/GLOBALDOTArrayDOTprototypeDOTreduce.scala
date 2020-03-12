package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTreduce {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.reduce""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(80282), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(80283), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(80285), ILet(Id("""initialValue"""), ERef(RefId(Id("""__x1__""")))).setId(80286), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(80288), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(80289), IReturn(ERef(RefId(Id("""__x2__""")))).setId(80290)).setId(80291), ISeq(List()).setId(80408)).setId(80293), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(80294), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(80296), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(80297), IReturn(ERef(RefId(Id("""__x3__""")))).setId(80298)).setId(80299), ISeq(List()).setId(80415)).setId(80300), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(80301), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(80303), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80304), IReturn(ERef(RefId(Id("""__x5__""")))).setId(80305))).setId(80421), ISeq(List()).setId(80422)).setId(80307), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80309), IReturn(ERef(RefId(Id("""__x6__""")))).setId(80310))).setId(80426), ISeq(List()).setId(80427)).setId(80312), ILet(Id("""k"""), EINum(0L)).setId(80314), ILet(Id("""accumulator"""), EUndef).setId(80316), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), IAssign(RefId(Id("""accumulator""")), ERef(RefId(Id("""initialValue""")))).setId(80318), ISeq(List(ILet(Id("""kPresent"""), EBool(false)).setId(80321), IWhile(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(false)), EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(80323), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(80324), IReturn(ERef(RefId(Id("""__x7__""")))).setId(80325)).setId(80326), ISeq(List()).setId(80437)).setId(80327), ILet(Id("""Pk"""), ERef(RefId(Id("""__x7__""")))).setId(80328), IApp(Id("""__x8__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80330), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(80331), IReturn(ERef(RefId(Id("""__x8__""")))).setId(80332)).setId(80333), ISeq(List()).setId(80444)).setId(80334), IAssign(RefId(Id("""kPresent""")), ERef(RefId(Id("""__x8__""")))).setId(80335), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80337), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(80338), IReturn(ERef(RefId(Id("""__x9__""")))).setId(80339)).setId(80340), ISeq(List()).setId(80451)).setId(80341), IAssign(RefId(Id("""accumulator""")), ERef(RefId(Id("""__x9__""")))).setId(80342))).setId(80454), ISeq(List()).setId(80455)).setId(80345), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(80347))).setId(80458)).setId(80350), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(false)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(80352), IReturn(ERef(RefId(Id("""__x10__""")))).setId(80353))).setId(80462), ISeq(List()).setId(80463)).setId(80355))).setId(80465)).setId(80358), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(80360), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(80361), IReturn(ERef(RefId(Id("""__x11__""")))).setId(80362)).setId(80363), ISeq(List()).setId(80471)).setId(80364), ILet(Id("""Pk"""), ERef(RefId(Id("""__x11__""")))).setId(80365), IApp(Id("""__x12__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80367), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(80368), IReturn(ERef(RefId(Id("""__x12__""")))).setId(80369)).setId(80370), ISeq(List()).setId(80478)).setId(80371), ILet(Id("""kPresent"""), ERef(RefId(Id("""__x12__""")))).setId(80372), IIf(EBOp(OEq, ERef(RefId(Id("""kPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""Pk"""))))).setId(80374), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(80375), IReturn(ERef(RefId(Id("""__x13__""")))).setId(80376)).setId(80377), ISeq(List()).setId(80485)).setId(80378), ILet(Id("""kValue"""), ERef(RefId(Id("""__x13__""")))).setId(80379), IApp(Id("""__x14__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""callbackfn"""))), EUndef, EList(List(ERef(RefId(Id("""accumulator"""))), ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))), ERef(RefId(Id("""O"""))))))).setId(80381), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(80382), IReturn(ERef(RefId(Id("""__x14__""")))).setId(80383)).setId(80384), ISeq(List()).setId(80492)).setId(80385), IAssign(RefId(Id("""accumulator""")), ERef(RefId(Id("""__x14__""")))).setId(80386))).setId(80495), ISeq(List()).setId(80496)).setId(80389), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(80391))).setId(80499)).setId(80394), IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""accumulator"""))))).setId(80396), IReturn(ERef(RefId(Id("""__x15__""")))).setId(80397))).setId(80503))
  val instToStepMap: Map[Int, Int] = HashMap(80303 -> 5, 80311 -> 6, 80295 -> 2, 80316 -> 9, 80351 -> 26, 80348 -> 25, 80319 -> 12, 80334 -> 25, 80329 -> 25, 80353 -> 26, 80366 -> 37, 80395 -> 37, 80302 -> 3, 80380 -> 35, 80287 -> 1, 80308 -> 5, 80392 -> 37, 80354 -> 26, 80341 -> 23, 80373 -> 37, 80358 -> 26, 80388 -> 35, 80337 -> 23, 80309 -> 6, 80294 -> 2, 80322 -> 26, 80367 -> 37, 80396 -> 38, 80352 -> 26, 80345 -> 25, 80307 -> 5, 80288 -> 2, 80335 -> 25, 80320 -> 12, 80330 -> 25, 80357 -> 26, 80393 -> 37, 80313 -> 7, 80391 -> 37, 80312 -> 7, 80344 -> 23, 80321 -> 26, 80293 -> 2, 80372 -> 37, 80284 -> 0, 80387 -> 35, 80378 -> 35, 80306 -> 4, 80283 -> 0, 80381 -> 35, 80304 -> 4, 80317 -> 9, 80336 -> 25, 80285 -> 1, 80398 -> 38, 80349 -> 25, 80346 -> 25, 80314 -> 8, 80386 -> 35, 80360 -> 37, 80296 -> 3, 80328 -> 25, 80343 -> 23, 80397 -> 38, 80390 -> 37, 80371 -> 37, 80356 -> 26, 80365 -> 37, 80300 -> 3, 80394 -> 37, 80385 -> 35, 80347 -> 25, 80305 -> 4, 80318 -> 12, 80282 -> 0, 80350 -> 26, 80389 -> 37, 80379 -> 35, 80286 -> 1, 80301 -> 3, 80364 -> 37, 80359 -> 26, 80374 -> 35, 80323 -> 25, 80342 -> 23, 80315 -> 8, 80310 -> 6, 80327 -> 25, 80355 -> 26)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(80284, 80283, 80282), 5 -> HashSet(80308, 80303, 80307), 20 -> HashSet(80334, 80336, 80335, 80330), 1 -> HashSet(80287, 80285, 80286), 6 -> HashSet(80309, 80311, 80310), 38 -> HashSet(80396, 80398, 80397), 9 -> HashSet(80316, 80317), 2 -> HashSet(80294, 80288, 80293, 80295), 34 -> HashSet(80380, 80378, 80379, 80374), 12 -> HashSet(80319, 80320, 80318), 7 -> HashSet(80313, 80312), 31 -> HashSet(80373, 80367, 80372, 80371), 8 -> HashSet(80314, 80315), 4 -> HashSet(80306, 80304, 80305), 15 -> HashSet(80322, 80321), 24 -> HashSet(80345, 80346), 37 -> HashSet(80366, 80395, 80367, 80393, 80391, 80372, 80360, 80389, 80364, 80392, 80373, 80390, 80371, 80365, 80394), 25 -> HashSet(80334, 80329, 80345, 80336, 80328, 80347, 80350, 80323, 80327, 80351, 80348, 80335, 80330, 80349, 80346), 3 -> HashSet(80302, 80296, 80300, 80301), 35 -> HashSet(80380, 80388, 80387, 80378, 80381, 80386, 80385, 80379, 80374), 26 -> HashSet(80351, 80353, 80354, 80358, 80322, 80352, 80357, 80321, 80356, 80350, 80359, 80355), 23 -> HashSet(80341, 80337, 80344, 80343, 80342), 36 -> HashSet(80390, 80389), 30 -> HashSet(80366, 80360, 80365, 80364), 19 -> HashSet(80329, 80328, 80323, 80327))
  /* Beautified form:
  "GLOBAL.Array.prototype.reduce" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let initialValue = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (IsCallable callbackfn)
    if (= __x4__ false) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (&& (= len 0i) (= argumentsList[1i] absent)) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    let k = 0i
    let accumulator = undefined
    if (! (= argumentsList[1i] absent)) accumulator = initialValue else {
      let kPresent = false
      while (&& (= kPresent false) (< k len)) {
        app __x7__ = (ToString k)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let Pk = __x7__
        app __x8__ = (HasProperty O Pk)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        kPresent = __x8__
        if (= kPresent true) {
          app __x9__ = (Get O Pk)
          if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          accumulator = __x9__
        } else {}
        k = (+ k 1i)
      }
      if (= kPresent false) {
        app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x10__
      } else {}
    }
    while (< k len) {
      app __x11__ = (ToString k)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let Pk = __x11__
      app __x12__ = (HasProperty O Pk)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let kPresent = __x12__
      if (= kPresent true) {
        app __x13__ = (Get O Pk)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        let kValue = __x13__
        app __x14__ = (Call callbackfn undefined (new [accumulator, kValue, k, O]))
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        accumulator = __x14__
      } else {}
      k = (+ k 1i)
    }
    app __x15__ = (WrapCompletion accumulator)
    return __x15__
  }
  */
}
