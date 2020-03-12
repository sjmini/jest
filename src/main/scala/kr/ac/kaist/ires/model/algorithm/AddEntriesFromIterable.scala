package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AddEntriesFromIterable {
  val length: Int = 3
  val func: Func = Func("""AddEntriesFromIterable""", List(Id("""target"""), Id("""iterable"""), Id("""adder""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""adder"""))))).setId(9224), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(9225), IReturn(ERef(RefId(Id("""__x1__""")))).setId(9226))).setId(9320), ISeq(List()).setId(9321)).setId(9229), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(9231), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(9232), IReturn(ERef(RefId(Id("""__x2__""")))).setId(9233)).setId(9234), ISeq(List()).setId(9327)).setId(9235), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(9236), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(9238), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(9239), IReturn(ERef(RefId(Id("""__x3__""")))).setId(9240)).setId(9241), ISeq(List()).setId(9334)).setId(9242), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(9243), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))).setId(9245), IReturn(ERef(RefId(Id("""__x4__""")))).setId(9246))).setId(9339), ISeq(List()).setId(9340)).setId(9248), IApp(Id("""__x5__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(9250), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(9251), IReturn(ERef(RefId(Id("""__x5__""")))).setId(9252)).setId(9253), ISeq(List()).setId(9346)).setId(9254), ILet(Id("""nextItem"""), ERef(RefId(Id("""__x5__""")))).setId(9255), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""nextItem"""))))).setId(9257), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(9258), ILet(Id("""error"""), ERef(RefId(Id("""__x7__""")))).setId(9259), IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""error"""))))).setId(9261), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(9262), IReturn(ERef(RefId(Id("""__x8__""")))).setId(9263)).setId(9264), ISeq(List()).setId(9356)).setId(9265), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(9266), IReturn(ERef(RefId(Id("""__x9__""")))).setId(9267))).setId(9360), ISeq(List()).setId(9361)).setId(9270), IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""nextItem"""))), EStr("""0"""))).setId(9272), ILet(Id("""k"""), ERef(RefId(Id("""__x10__""")))).setId(9273), IApp(Id("""__x11__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""k"""))))).setId(9275), IIf(ERef(RefId(Id("""__x11__"""))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""k"""))))).setId(9276), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(9277), IReturn(ERef(RefId(Id("""__x12__""")))).setId(9278)).setId(9279), ISeq(List()).setId(9370)).setId(9280), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(9281), IReturn(ERef(RefId(Id("""__x13__""")))).setId(9282))).setId(9374), ISeq(List()).setId(9375)).setId(9284), IApp(Id("""__x14__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""nextItem"""))), EStr("""1"""))).setId(9286), ILet(Id("""v"""), ERef(RefId(Id("""__x14__""")))).setId(9287), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(9289), IIf(ERef(RefId(Id("""__x15__"""))), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""v"""))))).setId(9290), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(9291), IReturn(ERef(RefId(Id("""__x16__""")))).setId(9292)).setId(9293), ISeq(List()).setId(9384)).setId(9294), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))).setId(9295), IReturn(ERef(RefId(Id("""__x17__""")))).setId(9296))).setId(9388), ISeq(List()).setId(9389)).setId(9298), IApp(Id("""__x18__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""adder"""))), ERef(RefId(Id("""target"""))), EList(List(ERef(RefProp(RefId(Id("""k""")), EStr("""Value"""))), ERef(RefProp(RefId(Id("""v""")), EStr("""Value"""))))))).setId(9300), ILet(Id("""status"""), ERef(RefId(Id("""__x18__""")))).setId(9301), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(9303), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(9304), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(9305), IReturn(ERef(RefId(Id("""__x20__""")))).setId(9306)).setId(9307), ISeq(List()).setId(9398)).setId(9308), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x20__"""))))).setId(9309), IReturn(ERef(RefId(Id("""__x21__""")))).setId(9310))).setId(9402), ISeq(List()).setId(9403)).setId(9312))).setId(9405)).setId(9315))).setId(9407))
  val instToStepMap: Map[Int, Int] = HashMap(9273 -> 22, 9268 -> 13, 9266 -> 13, 9308 -> 22, 9296 -> 19, 9301 -> 22, 9295 -> 19, 9229 -> 1, 9261 -> 13, 9246 -> 7, 9300 -> 22, 9287 -> 22, 9315 -> 22, 9230 -> 1, 9283 -> 16, 9225 -> 0, 9309 -> 22, 9304 -> 22, 9298 -> 22, 9255 -> 22, 9236 -> 3, 9272 -> 22, 9245 -> 7, 9244 -> 22, 9288 -> 22, 9260 -> 13, 9269 -> 13, 9284 -> 22, 9226 -> 0, 9256 -> 22, 9237 -> 3, 9231 -> 3, 9285 -> 22, 9290 -> 19, 9258 -> 13, 9248 -> 22, 9224 -> 1, 9243 -> 22, 9312 -> 22, 9302 -> 22, 9275 -> 22, 9280 -> 16, 9228 -> 2, 9294 -> 19, 9249 -> 22, 9227 -> 0, 9259 -> 13, 9276 -> 16, 9238 -> 22, 9270 -> 22, 9281 -> 16, 9313 -> 22, 9247 -> 7, 9257 -> 22, 9242 -> 22, 9274 -> 22, 9289 -> 22, 9311 -> 22, 9271 -> 22, 9265 -> 13, 9282 -> 16, 9299 -> 22, 9250 -> 22, 9235 -> 3, 9314 -> 22, 9267 -> 13, 9310 -> 22, 9286 -> 22, 9254 -> 22, 9303 -> 22, 9297 -> 19)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(9225, 9226, 9227), 14 -> HashSet(9270, 9257, 9271), 20 -> HashSet(9298, 9289, 9299), 1 -> HashSet(9230, 9224, 9229), 6 -> HashSet(9244, 9243, 9238, 9242), 21 -> HashSet(9300, 9301, 9302), 9 -> HashSet(9255, 9256, 9250, 9254), 13 -> HashSet(9268, 9261, 9266, 9260, 9269, 9258, 9259, 9265, 9267), 2 -> HashSet(9228), 17 -> HashSet(9284, 9285, 9275), 22 -> HashSet(9273, 9308, 9301, 9244, 9288, 9249, 9313, 9314, 9300, 9287, 9315, 9309, 9304, 9298, 9255, 9272, 9284, 9256, 9285, 9248, 9243, 9312, 9302, 9275, 9238, 9270, 9257, 9242, 9274, 9289, 9311, 9271, 9299, 9250, 9310, 9303, 9286, 9254), 12 -> HashSet(9260, 9258, 9259), 7 -> HashSet(9246, 9245, 9247), 3 -> HashSet(9236, 9235, 9237, 9231), 18 -> HashSet(9287, 9288, 9286), 16 -> HashSet(9283, 9280, 9276, 9281, 9282), 8 -> HashSet(9248, 9249), 19 -> HashSet(9296, 9295, 9290, 9294, 9297), 15 -> HashSet(9273, 9272, 9274))
  /* Beautified form:
  "AddEntriesFromIterable" (target, iterable, adder) => {
    app __x0__ = (IsCallable adder)
    if (= __x0__ false) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (GetIterator iterable)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let iteratorRecord = __x2__
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let next = __x3__
      if (= next false) {
        app __x4__ = (WrapCompletion target)
        return __x4__
      } else {}
      app __x5__ = (IteratorValue next)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextItem = __x5__
      app __x6__ = (Type nextItem)
      if (! (= __x6__ Object)) {
        app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        let error = __x7__
        app __x8__ = (IteratorClose iteratorRecord error)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        app __x9__ = (WrapCompletion __x8__)
        return __x9__
      } else {}
      app __x10__ = (Get nextItem "0")
      let k = __x10__
      app __x11__ = (IsAbruptCompletion k)
      if __x11__ {
        app __x12__ = (IteratorClose iteratorRecord k)
        if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
        app __x13__ = (WrapCompletion __x12__)
        return __x13__
      } else {}
      app __x14__ = (Get nextItem "1")
      let v = __x14__
      app __x15__ = (IsAbruptCompletion v)
      if __x15__ {
        app __x16__ = (IteratorClose iteratorRecord v)
        if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        app __x17__ = (WrapCompletion __x16__)
        return __x17__
      } else {}
      app __x18__ = (Call adder target (new [k["Value"], v["Value"]]))
      let status = __x18__
      app __x19__ = (IsAbruptCompletion status)
      if __x19__ {
        app __x20__ = (IteratorClose iteratorRecord status)
        if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        app __x21__ = (WrapCompletion __x20__)
        return __x21__
      } else {}
    }
  }
  */
}
