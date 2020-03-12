package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsArray {
  val length: Int = 1
  val func: Func = Func("""IsArray""", List(Id("""argument""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""argument"""))))).setId(3330), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3331), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3332))).setId(3367), ISeq(List()).setId(3368)).setId(3335), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""argument""")))), EStr("""ArrayExoticObject""")), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3337), IReturn(ERef(RefId(Id("""__x2__""")))).setId(3338))).setId(3372), ISeq(List()).setId(3373)).setId(3340), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""argument""")))), EStr("""ProxyExoticObject""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argument""")), EStr("""ProxyHandler"""))), ENull), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(3342), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3343))).setId(3377), ISeq(List()).setId(3378)).setId(3345), ILet(Id("""target"""), ERef(RefProp(RefId(Id("""argument""")), EStr("""ProxyTarget""")))).setId(3347), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""target"""))))).setId(3349), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(3350), IReturn(ERef(RefId(Id("""__x4__""")))).setId(3351)).setId(3352), ISeq(List()).setId(3385)).setId(3353), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(3354), IReturn(ERef(RefId(Id("""__x5__""")))).setId(3355))).setId(3389), ISeq(List()).setId(3390)).setId(3358), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(3360), IReturn(ERef(RefId(Id("""__x6__""")))).setId(3361))).setId(3394))
  val instToStepMap: Map[Int, Int] = HashMap(3345 -> 9, 3335 -> 1, 3357 -> 9, 3361 -> 11, 3339 -> 2, 3349 -> 9, 3348 -> 9, 3356 -> 9, 3346 -> 9, 3337 -> 2, 3347 -> 9, 3332 -> 0, 3338 -> 2, 3342 -> 6, 3353 -> 9, 3354 -> 9, 3333 -> 0, 3358 -> 10, 3343 -> 6, 3330 -> 1, 3340 -> 3, 3355 -> 9, 3344 -> 6, 3359 -> 10, 3336 -> 1, 3331 -> 0, 3362 -> 11, 3360 -> 11, 3341 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3332, 3333, 3331), 10 -> HashSet(3358, 3359), 1 -> HashSet(3335, 3330, 3336), 6 -> HashSet(3342, 3343, 3344), 9 -> HashSet(3345, 3353, 3357, 3349, 3354, 3355, 3348, 3356, 3346, 3347), 2 -> HashSet(3338, 3339, 3337), 7 -> HashSet(3345, 3346), 3 -> HashSet(3340, 3341), 11 -> HashSet(3361, 3362, 3360), 8 -> HashSet(3348, 3347))
  /* Beautified form:
  "IsArray" (argument) => {
    app __x0__ = (Type argument)
    if (! (= __x0__ Object)) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (= (typeof argument) "ArrayExoticObject") {
      app __x2__ = (WrapCompletion true)
      return __x2__
    } else {}
    if (= (typeof argument) "ProxyExoticObject") {
      if (= argument["ProxyHandler"] null) {
        app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x3__
      } else {}
      let target = argument["ProxyTarget"]
      app __x4__ = (IsArray target)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (WrapCompletion __x4__)
      return __x5__
    } else {}
    app __x6__ = (WrapCompletion false)
    return __x6__
  }
  */
}
