package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_SetIteratorPrototypeDOTnext {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.INTRINSIC_SetIteratorPrototype.next""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(86384), IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(86386), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(86387), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86388))).setId(86445), ISeq(List()).setId(86446)).setId(86391), IExpr(ENotSupported("""Etc""")).setId(86393), ILet(Id("""s"""), ERef(RefProp(RefId(Id("""O""")), EStr("""IteratedSet""")))).setId(86394), ILet(Id("""index"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SetNextIndex""")))).setId(86396), ILet(Id("""itemKind"""), ERef(RefProp(RefId(Id("""O""")), EStr("""SetIterationKind""")))).setId(86398), IIf(EBOp(OEq, ERef(RefId(Id("""s"""))), EUndef), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(86400), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(86401), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86402))).setId(86455), ISeq(List()).setId(86456)).setId(86404), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""s""")), EStr("""SetData""")))).setId(86406), ILet(Id("""numEntries"""), ERef(RefProp(RefId(Id("""entries""")), EStr("""length""")))).setId(86408), IWhile(EBOp(OLt, ERef(RefId(Id("""index"""))), ERef(RefId(Id("""numEntries""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""entries""")), ERef(RefId(Id("""index""")))))).setId(86410), IAssign(RefId(Id("""index""")), EBOp(OPlus, ERef(RefId(Id("""index"""))), EINum(1L))).setId(86412), IAssign(RefProp(RefId(Id("""O""")), EStr("""SetNextIndex""")), ERef(RefId(Id("""index""")))).setId(86414), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty"""))))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""itemKind"""))), EStr("""key+value""")), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(EList(List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""e"""))))))).setId(86416), IApp(Id("""__x5__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""__x4__"""))), EBool(false))).setId(86417), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(86418), IReturn(ERef(RefId(Id("""__x6__""")))).setId(86419))).setId(86467), ISeq(List()).setId(86468)).setId(86422), IApp(Id("""__x7__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""e"""))), EBool(false))).setId(86424), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(86425), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86426))).setId(86473), ISeq(List()).setId(86474)).setId(86429))).setId(86476)).setId(86432), IAssign(RefProp(RefId(Id("""O""")), EStr("""IteratedSet""")), EUndef).setId(86434), IApp(Id("""__x9__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(86436), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x9__"""))))).setId(86437), IReturn(ERef(RefId(Id("""__x10__""")))).setId(86438))).setId(86482))
  val instToStepMap: Map[Int, Int] = HashMap(86435 -> 25, 86393 -> 3, 86397 -> 5, 86395 -> 4, 86437 -> 26, 86399 -> 6, 86403 -> 7, 86418 -> 22, 86429 -> 24, 86416 -> 22, 86391 -> 2, 86412 -> 24, 86387 -> 1, 86407 -> 10, 86425 -> 24, 86384 -> 0, 86439 -> 26, 86413 -> 24, 86434 -> 25, 86390 -> 12, 86422 -> 24, 86394 -> 4, 86402 -> 7, 86417 -> 22, 86398 -> 6, 86426 -> 24, 86406 -> 10, 86421 -> 22, 86386 -> 2, 86430 -> 24, 86409 -> 11, 86420 -> 22, 86414 -> 24, 86389 -> 1, 86438 -> 26, 86433 -> 24, 86401 -> 7, 86431 -> 24, 86405 -> 8, 86427 -> 24, 86424 -> 24, 86410 -> 24, 86385 -> 0, 86436 -> 26, 86396 -> 5, 86404 -> 8, 86419 -> 22, 86432 -> 24, 86415 -> 24, 86392 -> 2, 86428 -> 24, 86411 -> 24, 86388 -> 1, 86400 -> 7, 86408 -> 11, 86423 -> 24)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86384, 86385), 5 -> HashSet(86397, 86396), 10 -> HashSet(86407, 86406), 1 -> HashSet(86387, 86389, 86388), 6 -> HashSet(86398, 86399), 9 -> HashSet(86390), 2 -> HashSet(86391, 86386, 86392), 17 -> HashSet(86414, 86415), 22 -> HashSet(86418, 86416, 86417, 86421, 86420, 86419), 12 -> HashSet(86390), 7 -> HashSet(86403, 86402, 86401, 86400), 3 -> HashSet(86393), 16 -> HashSet(86412, 86413), 11 -> HashSet(86409, 86408), 8 -> HashSet(86405, 86404), 4 -> HashSet(86394, 86395), 15 -> HashSet(86410, 86411), 24 -> HashSet(86429, 86412, 86425, 86413, 86422, 86426, 86430, 86414, 86433, 86431, 86427, 86423, 86424, 86410, 86432, 86415, 86428, 86411), 25 -> HashSet(86435, 86434), 26 -> HashSet(86439, 86438, 86437, 86436), 23 -> HashSet(86422, 86423))
  /* Beautified form:
  "GLOBAL.INTRINSIC_SetIteratorPrototype.next" (this, argumentsList, NewTarget) => {
    let O = this
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    !!! "Etc"
    let s = O["IteratedSet"]
    let index = O["SetNextIndex"]
    let itemKind = O["SetIterationKind"]
    if (= s undefined) {
      app __x2__ = (CreateIterResultObject undefined true)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    let entries = s["SetData"]
    let numEntries = entries["length"]
    while (< index numEntries) {
      let e = entries[index]
      index = (+ index 1i)
      O["SetNextIndex"] = index
      if (! (= e CONST_empty)) {
        if (= itemKind "key+value") {
          app __x4__ = (CreateArrayFromList (new [e, e]))
          app __x5__ = (CreateIterResultObject __x4__ false)
          app __x6__ = (WrapCompletion __x5__)
          return __x6__
        } else {}
        app __x7__ = (CreateIterResultObject e false)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
    }
    O["IteratedSet"] = undefined
    app __x9__ = (CreateIterResultObject undefined true)
    app __x10__ = (WrapCompletion __x9__)
    return __x10__
  }
  */
}
