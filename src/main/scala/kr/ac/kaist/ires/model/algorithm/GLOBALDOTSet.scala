package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSet {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Set""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(85419), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(85420), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(85422), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85423))).setId(85506), ISeq(List()).setId(85507)).setId(85426), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%SetPrototype%"""), EList(List(EStr("""SetData"""))))).setId(85428), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(85429), IReturn(ERef(RefId(Id("""__x2__""")))).setId(85430)).setId(85431), ISeq(List()).setId(85513)).setId(85432), ILet(Id("""set"""), ERef(RefId(Id("""__x2__""")))).setId(85433), IAssign(RefProp(RefId(Id("""set""")), EStr("""SetData""")), EList(List())).setId(85435), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), IAssign(RefId(Id("""iterable""")), EUndef).setId(85437), ISeq(List()).setId(85518)).setId(85439), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""iterable"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""iterable"""))), ENull)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(85441), IReturn(ERef(RefId(Id("""__x3__""")))).setId(85442))).setId(85522), ISeq(List()).setId(85523)).setId(85444), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""set"""))), EStr("""add"""))).setId(85446), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(85447), IReturn(ERef(RefId(Id("""__x4__""")))).setId(85448)).setId(85449), ISeq(List()).setId(85529)).setId(85450), ILet(Id("""adder"""), ERef(RefId(Id("""__x4__""")))).setId(85451), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""adder"""))))).setId(85453), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(85454), IReturn(ERef(RefId(Id("""__x6__""")))).setId(85455))).setId(85535), ISeq(List()).setId(85536)).setId(85457), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(85459), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(85460), IReturn(ERef(RefId(Id("""__x7__""")))).setId(85461)).setId(85462), ISeq(List()).setId(85542)).setId(85463), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x7__""")))).setId(85464), IWhile(EBool(true), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(85466), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(85467), IReturn(ERef(RefId(Id("""__x8__""")))).setId(85468)).setId(85469), ISeq(List()).setId(85549)).setId(85470), ILet(Id("""next"""), ERef(RefId(Id("""__x8__""")))).setId(85471), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(85473), IReturn(ERef(RefId(Id("""__x9__""")))).setId(85474))).setId(85554), ISeq(List()).setId(85555)).setId(85476), IApp(Id("""__x10__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(85478), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(85479), IReturn(ERef(RefId(Id("""__x10__""")))).setId(85480)).setId(85481), ISeq(List()).setId(85561)).setId(85482), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x10__""")))).setId(85483), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""adder"""))), ERef(RefId(Id("""set"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(85485), ILet(Id("""status"""), ERef(RefId(Id("""__x11__""")))).setId(85486), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(85488), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(85489), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(85490), IReturn(ERef(RefId(Id("""__x13__""")))).setId(85491)).setId(85492), ISeq(List()).setId(85571)).setId(85493), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(85494), IReturn(ERef(RefId(Id("""__x14__""")))).setId(85495))).setId(85575), ISeq(List()).setId(85576)).setId(85497))).setId(85578)).setId(85500))).setId(85580))
  val instToStepMap: Map[Int, Int] = HashMap(85428 -> 3, 85463 -> 12, 85489 -> 20, 85434 -> 3, 85474 -> 16, 85465 -> 12, 85458 -> 11, 85436 -> 4, 85419 -> 0, 85483 -> 20, 85445 -> 8, 85477 -> 20, 85423 -> 1, 85440 -> 6, 85451 -> 9, 85472 -> 20, 85495 -> 20, 85455 -> 10, 85500 -> 20, 85454 -> 10, 85496 -> 20, 85482 -> 20, 85432 -> 3, 85486 -> 20, 85464 -> 12, 85450 -> 9, 85422 -> 1, 85435 -> 4, 85446 -> 9, 85478 -> 20, 85499 -> 20, 85439 -> 6, 85493 -> 20, 85473 -> 16, 85441 -> 7, 85471 -> 20, 85453 -> 11, 85443 -> 7, 85498 -> 20, 85421 -> 0, 85426 -> 2, 85470 -> 20, 85488 -> 20, 85485 -> 20, 85475 -> 16, 85438 -> 5, 85466 -> 20, 85494 -> 20, 85457 -> 11, 85442 -> 7, 85476 -> 20, 85497 -> 20, 85427 -> 2, 85459 -> 12, 85437 -> 5, 85444 -> 8, 85487 -> 20, 85433 -> 3, 85452 -> 9, 85420 -> 0, 85484 -> 20, 85424 -> 1, 85456 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(85419, 85421, 85420), 5 -> HashSet(85438, 85437), 10 -> HashSet(85455, 85454, 85456), 20 -> HashSet(85472, 85486, 85493, 85471, 85498, 85470, 85466, 85489, 85494, 85487, 85484, 85483, 85477, 85495, 85500, 85496, 85482, 85478, 85499, 85488, 85485, 85476, 85497), 1 -> HashSet(85423, 85422, 85424), 6 -> HashSet(85440, 85439), 9 -> HashSet(85451, 85450, 85446, 85452), 2 -> HashSet(85426, 85427), 17 -> HashSet(85477, 85476), 12 -> HashSet(85463, 85464, 85459, 85465), 7 -> HashSet(85441, 85443, 85442), 3 -> HashSet(85428, 85432, 85434, 85433), 18 -> HashSet(85483, 85482, 85478, 85484), 16 -> HashSet(85473, 85475, 85474), 11 -> HashSet(85453, 85457, 85458), 8 -> HashSet(85445, 85444), 19 -> HashSet(85486, 85485, 85487), 4 -> HashSet(85436, 85435), 15 -> HashSet(85472, 85471, 85470, 85466))
  /* Beautified form:
  "GLOBAL.Set" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%SetPrototype%" (new ["SetData"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let set = __x2__
    set["SetData"] = (new [])
    if (= argumentsList[0i] absent) iterable = undefined else {}
    if (|| (= iterable undefined) (= iterable null)) {
      app __x3__ = (WrapCompletion set)
      return __x3__
    } else {}
    app __x4__ = (Get set "add")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let adder = __x4__
    app __x5__ = (IsCallable adder)
    if (= __x5__ false) {
      app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x6__
    } else {}
    app __x7__ = (GetIterator iterable)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let iteratorRecord = __x7__
    while true {
      app __x8__ = (IteratorStep iteratorRecord)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let next = __x8__
      if (= next false) {
        app __x9__ = (WrapCompletion set)
        return __x9__
      } else {}
      app __x10__ = (IteratorValue next)
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let nextValue = __x10__
      app __x11__ = (Call adder set (new [nextValue]))
      let status = __x11__
      app __x12__ = (IsAbruptCompletion status)
      if __x12__ {
        app __x13__ = (IteratorClose iteratorRecord status)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        app __x14__ = (WrapCompletion __x13__)
        return __x14__
      } else {}
    }
  }
  */
}
