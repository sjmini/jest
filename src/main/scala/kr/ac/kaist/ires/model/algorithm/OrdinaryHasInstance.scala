package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryHasInstance {
  val length: Int = 2
  val func: Func = Func("""OrdinaryHasInstance""", List(Id("""C"""), Id("""O""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""C"""))))).setId(6254), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(6255), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6256))).setId(6317), ISeq(List()).setId(6318)).setId(6259), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""C""")), EStr("""BoundTargetFunction"""))), EAbsent)), ISeq(List(ILet(Id("""BC"""), ERef(RefProp(RefId(Id("""C""")), EStr("""BoundTargetFunction""")))).setId(6261), IApp(Id("""__x2__"""), ERef(RefId(Id("""InstanceofOperator"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""BC"""))))).setId(6263), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(6264), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6265)).setId(6266), ISeq(List()).setId(6325)).setId(6267), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(6268), IReturn(ERef(RefId(Id("""__x3__""")))).setId(6269))).setId(6329), ISeq(List()).setId(6330)).setId(6272), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(6274), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(6275), IReturn(ERef(RefId(Id("""__x5__""")))).setId(6276))).setId(6335), ISeq(List()).setId(6336)).setId(6278), IApp(Id("""__x6__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""C"""))), EStr("""prototype"""))).setId(6280), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(6281), IReturn(ERef(RefId(Id("""__x6__""")))).setId(6282)).setId(6283), ISeq(List()).setId(6342)).setId(6284), ILet(Id("""P"""), ERef(RefId(Id("""__x6__""")))).setId(6285), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(6287), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(6288), IReturn(ERef(RefId(Id("""__x8__""")))).setId(6289))).setId(6348), ISeq(List()).setId(6349)).setId(6291), IWhile(EBool(true), ISeq(List(IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(6293), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(6294), IReturn(ERef(RefId(Id("""__x9__""")))).setId(6295)).setId(6296), ISeq(List()).setId(6355)).setId(6297), IAssign(RefId(Id("""O""")), ERef(RefId(Id("""__x9__""")))).setId(6298), IIf(EBOp(OEq, ERef(RefId(Id("""O"""))), ENull), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(6300), IReturn(ERef(RefId(Id("""__x10__""")))).setId(6301))).setId(6360), ISeq(List()).setId(6361)).setId(6303), IApp(Id("""__x11__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""P"""))), ERef(RefId(Id("""O"""))))).setId(6305), IIf(EBOp(OEq, ERef(RefId(Id("""__x11__"""))), EBool(true)), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(6306), IReturn(ERef(RefId(Id("""__x12__""")))).setId(6307))).setId(6366), ISeq(List()).setId(6367)).setId(6309))).setId(6369)).setId(6312))).setId(6371))
  val instToStepMap: Map[Int, Int] = HashMap(6278 -> 8, 6274 -> 8, 6307 -> 17, 6312 -> 17, 6276 -> 7, 6285 -> 9, 6263 -> 5, 6268 -> 5, 6306 -> 17, 6291 -> 11, 6310 -> 17, 6272 -> 6, 6259 -> 1, 6300 -> 15, 6303 -> 17, 6292 -> 11, 6267 -> 5, 6299 -> 17, 6304 -> 17, 6256 -> 0, 6275 -> 7, 6271 -> 5, 6311 -> 17, 6260 -> 1, 6279 -> 8, 6302 -> 15, 6261 -> 5, 6308 -> 17, 6289 -> 10, 6255 -> 0, 6293 -> 17, 6288 -> 10, 6270 -> 5, 6280 -> 9, 6298 -> 17, 6262 -> 5, 6301 -> 15, 6284 -> 9, 6286 -> 9, 6257 -> 0, 6305 -> 17, 6290 -> 10, 6277 -> 7, 6287 -> 11, 6269 -> 5, 6273 -> 6, 6309 -> 17, 6297 -> 17, 6254 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(6256, 6255, 6257), 5 -> HashSet(6263, 6268, 6267, 6271, 6261, 6270, 6262, 6269), 10 -> HashSet(6289, 6288, 6290), 14 -> HashSet(6299, 6293, 6298, 6297), 1 -> HashSet(6259, 6260, 6254), 6 -> HashSet(6272, 6273), 9 -> HashSet(6285, 6280, 6284, 6286), 17 -> HashSet(6306, 6310, 6307, 6303, 6311, 6312, 6308, 6293, 6298, 6305, 6309, 6297, 6299, 6304), 7 -> HashSet(6275, 6276, 6277), 16 -> HashSet(6303, 6304), 11 -> HashSet(6291, 6292, 6287), 8 -> HashSet(6278, 6274, 6279), 4 -> HashSet(6261, 6262), 15 -> HashSet(6300, 6302, 6301))
  /* Beautified form:
  "OrdinaryHasInstance" (C, O) => {
    app __x0__ = (IsCallable C)
    if (= __x0__ false) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {}
    if (! (= C["BoundTargetFunction"] absent)) {
      let BC = C["BoundTargetFunction"]
      app __x2__ = (InstanceofOperator O BC)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    app __x4__ = (Type O)
    if (! (= __x4__ Object)) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    app __x6__ = (Get C "prototype")
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let P = __x6__
    app __x7__ = (Type P)
    if (! (= __x7__ Object)) {
      app __x8__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x8__
    } else {}
    while true {
      app __x9__ = (O["GetPrototypeOf"] O)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      O = __x9__
      if (= O null) {
        app __x10__ = (WrapCompletion false)
        return __x10__
      } else {}
      app __x11__ = (SameValue P O)
      if (= __x11__ true) {
        app __x12__ = (WrapCompletion true)
        return __x12__
      } else {}
    }
  }
  */
}
