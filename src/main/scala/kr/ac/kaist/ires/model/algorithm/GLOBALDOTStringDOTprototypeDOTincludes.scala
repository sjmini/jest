package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTincludes {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.includes""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(71329), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(71330), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(71332), ILet(Id("""position"""), ERef(RefId(Id("""__x1__""")))).setId(71333), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(71335), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(71336), IReturn(ERef(RefId(Id("""__x2__""")))).setId(71337)).setId(71338), ISeq(List()).setId(71394)).setId(71340), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(71341), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(71343), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(71344), IReturn(ERef(RefId(Id("""__x3__""")))).setId(71345)).setId(71346), ISeq(List()).setId(71401)).setId(71347), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(71348), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsRegExp"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71350), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(71351), IReturn(ERef(RefId(Id("""__x4__""")))).setId(71352)).setId(71353), ISeq(List()).setId(71408)).setId(71354), ILet(Id("""isRegExp"""), ERef(RefId(Id("""__x4__""")))).setId(71355), IIf(EBOp(OEq, ERef(RefId(Id("""isRegExp"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(71357), IReturn(ERef(RefId(Id("""__x5__""")))).setId(71358))).setId(71413), ISeq(List()).setId(71414)).setId(71360), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(71362), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(71363), IReturn(ERef(RefId(Id("""__x6__""")))).setId(71364)).setId(71365), ISeq(List()).setId(71420)).setId(71366), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x6__""")))).setId(71367), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""position"""))))).setId(71369), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(71370), IReturn(ERef(RefId(Id("""__x7__""")))).setId(71371)).setId(71372), ISeq(List()).setId(71427)).setId(71373), ILet(Id("""pos"""), ERef(RefId(Id("""__x7__""")))).setId(71374), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(71376), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(71378), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""len"""))))).setId(71379), ILet(Id("""start"""), ERef(RefId(Id("""__x9__""")))).setId(71380), ILet(Id("""searchLen"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(71382), IExpr(ENotSupported("""NumberOp""")).setId(71384))).setId(71436))
  val instToStepMap: Map[Int, Int] = HashMap(71341 -> 2, 71377 -> 10, 71361 -> 6, 71354 -> 4, 71369 -> 8, 71366 -> 7, 71331 -> 0, 71374 -> 8, 71332 -> 1, 71368 -> 7, 71360 -> 6, 71373 -> 8, 71355 -> 4, 71350 -> 4, 71376 -> 10, 71382 -> 12, 71333 -> 1, 71356 -> 4, 71329 -> 0, 71378 -> 11, 71359 -> 5, 71334 -> 1, 71347 -> 3, 71383 -> 12, 71330 -> 0, 71340 -> 2, 71379 -> 11, 71358 -> 5, 71384 -> 13, 71362 -> 7, 71375 -> 8, 71380 -> 11, 71348 -> 3, 71343 -> 3, 71367 -> 7, 71335 -> 2, 71342 -> 2, 71339 -> 9, 71357 -> 5, 71349 -> 3, 71381 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(71329, 71330, 71331), 5 -> HashSet(71359, 71358, 71357), 10 -> HashSet(71377, 71376), 1 -> HashSet(71333, 71334, 71332), 6 -> HashSet(71360, 71361), 9 -> HashSet(71339), 13 -> HashSet(71384), 2 -> HashSet(71341, 71340, 71335, 71342), 12 -> HashSet(71382, 71383), 7 -> HashSet(71366, 71362, 71367, 71368), 3 -> HashSet(71347, 71349, 71348, 71343), 11 -> HashSet(71378, 71379, 71380, 71381), 8 -> HashSet(71373, 71369, 71375, 71374), 4 -> HashSet(71355, 71350, 71356, 71354))
  /* Beautified form:
  "GLOBAL.String.prototype.includes" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let position = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (IsRegExp searchString)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let isRegExp = __x4__
    if (= isRegExp true) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (ToString searchString)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let searchStr = __x6__
    app __x7__ = (ToInteger position)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let pos = __x7__
    let len = S["length"]
    app __x8__ = (max pos 0i)
    app __x9__ = (min __x8__ len)
    let start = __x9__
    let searchLen = searchStr["length"]
    !!! "NumberOp"
  }
  */
}
