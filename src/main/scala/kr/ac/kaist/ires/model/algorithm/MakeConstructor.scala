package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MakeConstructor {
  val length: Int = 1
  val func: Func = Func("""MakeConstructor""", List(Id("""F"""), Id("""writablePrototype"""), Id("""prototype""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""writablePrototype"""))), EAbsent), IAssign(RefId(Id("""writablePrototype""")), EBool(true)).setId(52342), ISeq(List()).setId(52372)).setId(52344), IIf(EBOp(OEq, ERef(RefId(Id("""prototype"""))), EAbsent), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(52346), IAssign(RefId(Id("""prototype""")), ERef(RefId(Id("""__x0__""")))).setId(52347), IApp(Id("""__x1__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""prototype"""))), EStr("""constructor"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""F""")))), (EStr("""Writable"""), ERef(RefId(Id("""writablePrototype""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(52349), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52350), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52351)).setId(52352), ISeq(List()).setId(52380)).setId(52353), IExpr(ERef(RefId(Id("""__x1__""")))).setId(52354))).setId(52383), ISeq(List()).setId(52384)).setId(52357), IApp(Id("""__x2__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), ERef(RefId(Id("""writablePrototype""")))), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(52359), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(52360), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52361)).setId(52362), ISeq(List()).setId(52390)).setId(52363), IExpr(ERef(RefId(Id("""__x2__""")))).setId(52364), IApp(Id("""__x3__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(52366), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(52367), IReturn(ERef(RefId(Id("""__x4__""")))).setId(52368))).setId(52396))
  val instToStepMap: Map[Int, Int] = HashMap(52355 -> 8, 52348 -> 8, 52345 -> 4, 52366 -> 11, 52347 -> 8, 52356 -> 8, 52364 -> 10, 52367 -> 11, 52342 -> 3, 52363 -> 10, 52368 -> 11, 52358 -> 9, 52344 -> 4, 52349 -> 8, 52365 -> 10, 52341 -> 2, 52369 -> 11, 52354 -> 8, 52357 -> 9, 52343 -> 3, 52353 -> 8, 52346 -> 8, 52359 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(52341), 10 -> HashSet(52364, 52363, 52365, 52359), 1 -> HashSet(52341), 9 -> HashSet(52358, 52357), 2 -> HashSet(52341), 7 -> HashSet(52348, 52346, 52347), 3 -> HashSet(52342, 52343), 11 -> HashSet(52367, 52368, 52369, 52366), 8 -> HashSet(52355, 52348, 52349, 52354, 52347, 52356, 52353, 52346), 4 -> HashSet(52344, 52345))
  /* Beautified form:
  "MakeConstructor" (F, writablePrototype, prototype) => {
    if (= writablePrototype absent) writablePrototype = true else {}
    if (= prototype absent) {
      app __x0__ = (ObjectCreate INTRINSIC_ObjectPrototype)
      prototype = __x0__
      app __x1__ = (DefinePropertyOrThrow prototype "constructor" (new PropertyDescriptor("Value" -> F, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> true)))
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      __x1__
    } else {}
    app __x2__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> writablePrototype, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (NormalCompletion undefined)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
