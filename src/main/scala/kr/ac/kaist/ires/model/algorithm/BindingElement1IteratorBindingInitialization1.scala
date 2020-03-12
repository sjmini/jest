package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElement1IteratorBindingInitialization1 {
  val length: Int = 0
  val func: Func = Func("""BindingElement1IteratorBindingInitialization1""", List(Id("""this"""), Id("""BindingPattern"""), Id("""Initializer"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(29330), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(29331), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(29333), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29334), ISeq(List()).setId(29395)).setId(29337), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(29339), IReturn(ERef(RefId(Id("""next""")))).setId(29340)).setId(29341), ISeq(List()).setId(29400)).setId(29342), IExpr(ERef(RefId(Id("""next""")))).setId(29343), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29345), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(29347), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(29348), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(29350), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29351), ISeq(List()).setId(29408)).setId(29353), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(29355), IReturn(ERef(RefId(Id("""v""")))).setId(29356)).setId(29357), ISeq(List()).setId(29413)).setId(29358), IExpr(ERef(RefId(Id("""v""")))).setId(29359))).setId(29416)).setId(29362))).setId(29418), ISeq(List()).setId(29419)).setId(29365), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(29367), ISeq(List()).setId(29422)).setId(29369), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Initializer"""))), EAbsent)), EBOp(OEq, ERef(RefId(Id("""v"""))), EUndef)), ISeq(List(IAccess(Id("""__x4__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(29372), ILet(Id("""defaultValue"""), ERef(RefId(Id("""__x4__""")))).setId(29373), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""defaultValue"""))))).setId(29375), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(29376), IReturn(ERef(RefId(Id("""__x5__""")))).setId(29377)).setId(29378), ISeq(List()).setId(29430)).setId(29379), IAssign(RefId(Id("""v""")), ERef(RefId(Id("""__x5__""")))).setId(29380))).setId(29433), ISeq(List()).setId(29434)).setId(29383), IAccess(Id("""__x6__"""), ERef(RefId(Id("""BindingPattern"""))), EStr("""BindingInitialization""")).setId(29385), IApp(Id("""__x7__"""), ERef(RefId(Id("""__x6__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(29386), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(29387), IReturn(ERef(RefId(Id("""__x8__""")))).setId(29388))).setId(29440))
  val instToStepMap: Map[Int, Int] = HashMap(29363 -> 12, 29366 -> 13, 29352 -> 10, 29348 -> 12, 29368 -> 14, 29386 -> 21, 29361 -> 12, 29358 -> 12, 29383 -> 20, 29332 -> 12, 29375 -> 19, 29349 -> 12, 29346 -> 6, 29334 -> 3, 29343 -> 12, 29388 -> 21, 29330 -> 12, 29362 -> 12, 29360 -> 12, 29369 -> 15, 29337 -> 12, 29365 -> 13, 29381 -> 19, 29333 -> 12, 29380 -> 19, 29385 -> 21, 29345 -> 6, 29372 -> 19, 29389 -> 21, 29344 -> 12, 29353 -> 12, 29384 -> 20, 29373 -> 19, 29351 -> 10, 29354 -> 12, 29364 -> 12, 29374 -> 19, 29350 -> 12, 29347 -> 12, 29338 -> 12, 29370 -> 15, 29335 -> 3, 29367 -> 14, 29387 -> 21, 29331 -> 12, 29359 -> 12, 29379 -> 19, 29382 -> 19, 29342 -> 12)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(29343, 29344, 29342), 10 -> HashSet(29352, 29351), 14 -> HashSet(29368, 29367), 20 -> HashSet(29384, 29383), 6 -> HashSet(29346, 29345), 21 -> HashSet(29388, 29385, 29389, 29386, 29387), 9 -> HashSet(29349, 29348, 29347), 13 -> HashSet(29366, 29365), 2 -> HashSet(29330, 29332, 29331), 12 -> HashSet(29349, 29363, 29337, 29333, 29344, 29353, 29348, 29361, 29358, 29332, 29350, 29343, 29330, 29362, 29360, 29354, 29364, 29347, 29338, 29331, 29359, 29342), 3 -> HashSet(29334, 29335), 18 -> HashSet(29372, 29373, 29374), 11 -> HashSet(29353, 29354, 29350), 19 -> HashSet(29375, 29372, 29373, 29374, 29381, 29380, 29379, 29382), 4 -> HashSet(29337, 29333, 29338), 15 -> HashSet(29369, 29370))
  /* Beautified form:
  "BindingElement1IteratorBindingInitialization1" (this, BindingPattern, Initializer, iteratorRecord, environment) => {
    if (= iteratorRecord["Done"] false) {
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
    } else {}
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    if (&& (! (= Initializer absent)) (= v undefined)) {
      access __x4__ = (Initializer "Evaluation")
      let defaultValue = __x4__
      app __x5__ = (GetValue defaultValue)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      v = __x5__
    } else {}
    access __x6__ = (BindingPattern "BindingInitialization")
    app __x7__ = (__x6__ v environment)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
