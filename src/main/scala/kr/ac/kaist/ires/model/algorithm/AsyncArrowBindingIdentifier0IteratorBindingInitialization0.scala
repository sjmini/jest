package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncArrowBindingIdentifier0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""AsyncArrowBindingIdentifier0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(44279), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(44280), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(44282), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(44283), ISeq(List()).setId(44326)).setId(44285), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(44287), IReturn(ERef(RefId(Id("""next""")))).setId(44288)).setId(44289), ISeq(List()).setId(44331)).setId(44290), IExpr(ERef(RefId(Id("""next""")))).setId(44291), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(44293), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(44295), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(44296), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(44298), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(44299), ISeq(List()).setId(44339)).setId(44301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(44303), IReturn(ERef(RefId(Id("""v""")))).setId(44304)).setId(44305), ISeq(List()).setId(44344)).setId(44306), IExpr(ERef(RefId(Id("""v""")))).setId(44307))).setId(44347)).setId(44310), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(44312), ISeq(List()).setId(44350)).setId(44314), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")).setId(44316), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(44317), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(44318), IReturn(ERef(RefId(Id("""__x6__""")))).setId(44319))).setId(44356))
  val instToStepMap: Map[Int, Int] = HashMap(44299 -> 9, 44293 -> 5, 44316 -> 14, 44320 -> 14, 44308 -> 11, 44282 -> 3, 44286 -> 3, 44306 -> 11, 44310 -> 11, 44318 -> 14, 44313 -> 12, 44300 -> 9, 44284 -> 2, 44292 -> 4, 44283 -> 2, 44298 -> 11, 44311 -> 11, 44290 -> 4, 44309 -> 11, 44315 -> 13, 44294 -> 5, 44297 -> 11, 44319 -> 14, 44314 -> 13, 44279 -> 1, 44302 -> 11, 44312 -> 12, 44281 -> 1, 44295 -> 11, 44285 -> 3, 44291 -> 4, 44296 -> 11, 44301 -> 11, 44280 -> 1, 44278 -> 0, 44307 -> 11, 44317 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(44278), 5 -> HashSet(44293, 44294), 10 -> HashSet(44298, 44302, 44301), 14 -> HashSet(44316, 44320, 44319, 44318, 44317), 1 -> HashSet(44279, 44281, 44280), 9 -> HashSet(44299, 44300), 13 -> HashSet(44315, 44314), 2 -> HashSet(44283, 44284), 12 -> HashSet(44312, 44313), 3 -> HashSet(44282, 44286, 44285), 11 -> HashSet(44298, 44308, 44311, 44309, 44297, 44302, 44306, 44310, 44295, 44296, 44301, 44307), 8 -> HashSet(44297, 44295, 44296), 4 -> HashSet(44290, 44291, 44292))
  /* Beautified form:
  "AsyncArrowBindingIdentifier0IteratorBindingInitialization0" (this, BindingIdentifier, iteratorRecord, environment) => {
    app __x0__ = (IteratorStep iteratorRecord)
    let next = __x0__
    app __x1__ = (IsAbruptCompletion next)
    if __x1__ iteratorRecord["Done"] = true else {}
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    if (= next false) iteratorRecord["Done"] = true else {
      app __x2__ = (IteratorValue next)
      let v = __x2__
      app __x3__ = (IsAbruptCompletion v)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof v) "Completion") if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
      v
    }
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    access __x4__ = (BindingIdentifier "BindingInitialization")
    app __x5__ = (__x4__ v environment)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
