package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrowParameters0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ArrowParameters0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(39188), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(39189), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(39191), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39192), ISeq(List()).setId(39235)).setId(39194), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(39196), IReturn(ERef(RefId(Id("""next""")))).setId(39197)).setId(39198), ISeq(List()).setId(39240)).setId(39199), IExpr(ERef(RefId(Id("""next""")))).setId(39200), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39202), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(39204), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(39205), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(39207), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39208), ISeq(List()).setId(39248)).setId(39210), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(39212), IReturn(ERef(RefId(Id("""v""")))).setId(39213)).setId(39214), ISeq(List()).setId(39253)).setId(39215), IExpr(ERef(RefId(Id("""v""")))).setId(39216))).setId(39256)).setId(39219), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(39221), ISeq(List()).setId(39259)).setId(39223), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")).setId(39225), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(39226), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(39227), IReturn(ERef(RefId(Id("""__x6__""")))).setId(39228))).setId(39265))
  val instToStepMap: Map[Int, Int] = HashMap(39194 -> 3, 39225 -> 14, 39221 -> 12, 39208 -> 9, 39217 -> 11, 39227 -> 14, 39195 -> 3, 39219 -> 11, 39223 -> 13, 39220 -> 11, 39188 -> 1, 39203 -> 5, 39207 -> 11, 39224 -> 13, 39192 -> 2, 39215 -> 11, 39193 -> 2, 39204 -> 11, 39189 -> 1, 39228 -> 14, 39211 -> 11, 39229 -> 14, 39222 -> 12, 39205 -> 11, 39218 -> 11, 39190 -> 1, 39201 -> 4, 39200 -> 4, 39210 -> 11, 39206 -> 11, 39187 -> 0, 39202 -> 5, 39191 -> 3, 39226 -> 14, 39209 -> 9, 39216 -> 11, 39199 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(39187), 5 -> HashSet(39203, 39202), 10 -> HashSet(39207, 39211, 39210), 14 -> HashSet(39225, 39227, 39226, 39228, 39229), 1 -> HashSet(39188, 39189, 39190), 9 -> HashSet(39208, 39209), 13 -> HashSet(39224, 39223), 2 -> HashSet(39192, 39193), 12 -> HashSet(39221, 39222), 3 -> HashSet(39194, 39195, 39191), 11 -> HashSet(39220, 39207, 39215, 39204, 39217, 39211, 39205, 39218, 39210, 39219, 39206, 39216), 8 -> HashSet(39204, 39205, 39206), 4 -> HashSet(39201, 39200, 39199))
  /* Beautified form:
  "ArrowParameters0IteratorBindingInitialization0" (this, BindingIdentifier, iteratorRecord, environment) => {
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
