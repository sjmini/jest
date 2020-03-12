package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryHasProperty {
  val length: Int = 2
  val func: Func = Func("""OrdinaryHasProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(50233), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(50234), IReturn(ERef(RefId(Id("""__x0__""")))).setId(50235)).setId(50236), ISeq(List()).setId(50271)).setId(50237), ILet(Id("""hasOwn"""), ERef(RefId(Id("""__x0__""")))).setId(50238), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""hasOwn"""))), EUndef)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(50240), IReturn(ERef(RefId(Id("""__x1__""")))).setId(50241))).setId(50276), ISeq(List()).setId(50277)).setId(50243), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetPrototypeOf"""))), List(ERef(RefId(Id("""O"""))))).setId(50245), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(50246), IReturn(ERef(RefId(Id("""__x2__""")))).setId(50247)).setId(50248), ISeq(List()).setId(50283)).setId(50249), ILet(Id("""parent"""), ERef(RefId(Id("""__x2__""")))).setId(50250), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""parent"""))), ENull)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""parent""")), EStr("""HasProperty"""))), List(ERef(RefId(Id("""parent"""))), ERef(RefId(Id("""P"""))))).setId(50252), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(50253), IReturn(ERef(RefId(Id("""__x3__""")))).setId(50254)).setId(50255), ISeq(List()).setId(50290)).setId(50256), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(50257), IReturn(ERef(RefId(Id("""__x4__""")))).setId(50258))).setId(50294), ISeq(List()).setId(50295)).setId(50261), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(50263), IReturn(ERef(RefId(Id("""__x5__""")))).setId(50264))).setId(50299))
  val instToStepMap: Map[Int, Int] = HashMap(50249 -> 4, 50259 -> 7, 50238 -> 1, 50243 -> 3, 50252 -> 7, 50240 -> 2, 50262 -> 8, 50245 -> 4, 50258 -> 7, 50251 -> 4, 50239 -> 1, 50250 -> 4, 50241 -> 2, 50263 -> 9, 50237 -> 1, 50265 -> 9, 50256 -> 7, 50261 -> 8, 50233 -> 1, 50260 -> 7, 50244 -> 3, 50242 -> 2, 50232 -> 0, 50257 -> 7, 50264 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(50232), 1 -> HashSet(50239, 50238, 50237, 50233), 9 -> HashSet(50263, 50265, 50264), 2 -> HashSet(50241, 50242, 50240), 7 -> HashSet(50259, 50256, 50260, 50257, 50252, 50258), 3 -> HashSet(50243, 50244), 8 -> HashSet(50261, 50262), 4 -> HashSet(50250, 50249, 50245, 50251))
  /* Beautified form:
  "OrdinaryHasProperty" (O, P) => {
    app __x0__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let hasOwn = __x0__
    if (! (= hasOwn undefined)) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (O["GetPrototypeOf"] O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let parent = __x2__
    if (! (= parent null)) {
      app __x3__ = (parent["HasProperty"] parent P)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    app __x5__ = (WrapCompletion false)
    return __x5__
  }
  */
}
