package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorReject {
  val length: Int = 2
  val func: Func = Func("""AsyncGeneratorReject""", List(Id("""generator"""), Id("""exception""")), None, ISeq(List(ILet(Id("""queue"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")))).setId(11094), ILet(Id("""next"""), EPop(ERef(RefId(Id("""queue"""))), EINum(0L))).setId(11096), ILet(Id("""promiseCapability"""), ERef(RefProp(RefId(Id("""next""")), EStr("""Capability""")))).setId(11097), IApp(Id("""__x0__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefId(Id("""exception"""))))))).setId(11099), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(11100), IReturn(ERef(RefId(Id("""__x0__""")))).setId(11101)).setId(11102), ISeq(List()).setId(11124)).setId(11103), IExpr(ERef(RefId(Id("""__x0__""")))).setId(11104), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorResumeNext"""))), List(ERef(RefId(Id("""generator"""))))).setId(11106), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(11107), IReturn(ERef(RefId(Id("""__x1__""")))).setId(11108)).setId(11109), ISeq(List()).setId(11131)).setId(11110), IExpr(ERef(RefId(Id("""__x1__""")))).setId(11111), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(11113), IReturn(ERef(RefId(Id("""__x2__""")))).setId(11114))).setId(11136))
  val instToStepMap: Map[Int, Int] = HashMap(11112 -> 6, 11111 -> 6, 11115 -> 7, 11104 -> 5, 11106 -> 6, 11096 -> 3, 11097 -> 4, 11093 -> 2, 11110 -> 6, 11105 -> 5, 11095 -> 1, 11113 -> 7, 11098 -> 4, 11094 -> 1, 11103 -> 5, 11099 -> 5, 11114 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(11093), 5 -> HashSet(11104, 11105, 11099, 11103), 1 -> HashSet(11095, 11094), 6 -> HashSet(11112, 11111, 11106, 11110), 2 -> HashSet(11093), 7 -> HashSet(11115, 11113, 11114), 3 -> HashSet(11096), 4 -> HashSet(11097, 11098))
  /* Beautified form:
  "AsyncGeneratorReject" (generator, exception) => {
    let queue = generator["AsyncGeneratorQueue"]
    let next = (pop queue 0i)
    let promiseCapability = next["Capability"]
    app __x0__ = (Call promiseCapability["Reject"] undefined (new [exception]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    app __x1__ = (AsyncGeneratorResumeNext generator)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    app __x2__ = (WrapCompletion undefined)
    return __x2__
  }
  */
}
