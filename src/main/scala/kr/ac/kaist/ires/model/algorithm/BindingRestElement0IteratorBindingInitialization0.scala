package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingRestElement0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingRestElement0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(29491), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""environment"""))))).setId(29492), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(29493), IReturn(ERef(RefId(Id("""__x1__""")))).setId(29494)).setId(29495), ISeq(List()).setId(29579)).setId(29497), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(29498), IApp(Id("""__x2__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(29500), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(29501), IReturn(ERef(RefId(Id("""__x2__""")))).setId(29502)).setId(29503), ISeq(List()).setId(29586)).setId(29504), ILet(Id("""A"""), ERef(RefId(Id("""__x2__""")))).setId(29505), ILet(Id("""n"""), EINum(0L)).setId(29507), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(29509), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(29510), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(29512), IIf(ERef(RefId(Id("""__x4__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29513), ISeq(List()).setId(29594)).setId(29515), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(29517), IReturn(ERef(RefId(Id("""next""")))).setId(29518)).setId(29519), ISeq(List()).setId(29599)).setId(29520), IExpr(ERef(RefId(Id("""next""")))).setId(29521), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29523), ISeq(List()).setId(29603)).setId(29525))).setId(29605), ISeq(List()).setId(29606)).setId(29528), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""environment"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""PutValue"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""A"""))))).setId(29530), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(29531), IReturn(ERef(RefId(Id("""__x5__""")))).setId(29532)).setId(29533), ISeq(List()).setId(29612)).setId(29534), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(29535), IReturn(ERef(RefId(Id("""__x6__""")))).setId(29536))).setId(29616), ISeq(List()).setId(29617)).setId(29538), IApp(Id("""__x7__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""A"""))))).setId(29540), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(29541), IReturn(ERef(RefId(Id("""__x8__""")))).setId(29542))).setId(29622), ISeq(List()).setId(29623)).setId(29545), IApp(Id("""__x9__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(29547), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x9__""")))).setId(29548), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""nextValue"""))))).setId(29550), IIf(ERef(RefId(Id("""__x10__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(29551), ISeq(List()).setId(29629)).setId(29553), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""nextValue""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""nextValue""")), ERef(RefProp(RefId(Id("""nextValue""")), EStr("""Value""")))).setId(29555), IReturn(ERef(RefId(Id("""nextValue""")))).setId(29556)).setId(29557), ISeq(List()).setId(29634)).setId(29558), IExpr(ERef(RefId(Id("""nextValue""")))).setId(29559), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""n"""))))).setId(29561), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(29562), IReturn(ERef(RefId(Id("""__x11__""")))).setId(29563)).setId(29564), ISeq(List()).setId(29641)).setId(29565), IApp(Id("""__x12__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""nextValue"""))))).setId(29566), ILet(Id("""status"""), ERef(RefId(Id("""__x12__""")))).setId(29567), IAssign(RefId(Id("""n""")), EBOp(OPlus, ERef(RefId(Id("""n"""))), EINum(1L))).setId(29569))).setId(29646)).setId(29572))).setId(29648))
  val instToStepMap: Map[Int, Int] = HashMap(29544 -> 17, 29545 -> 25, 29508 -> 2, 29526 -> 11, 29551 -> 20, 29524 -> 11, 29505 -> 1, 29520 -> 11, 29537 -> 15, 29525 -> 11, 29513 -> 8, 29572 -> 25, 29500 -> 1, 29497 -> 0, 29540 -> 17, 29512 -> 11, 29549 -> 25, 29521 -> 11, 29558 -> 25, 29499 -> 0, 29548 -> 25, 29509 -> 11, 29516 -> 11, 29529 -> 25, 29541 -> 17, 29567 -> 25, 29561 -> 25, 29552 -> 20, 29554 -> 25, 29569 -> 25, 29522 -> 11, 29535 -> 15, 29547 -> 25, 29570 -> 25, 29492 -> 0, 29498 -> 0, 29515 -> 11, 29542 -> 17, 29510 -> 11, 29530 -> 15, 29559 -> 25, 29496 -> 25, 29527 -> 11, 29534 -> 15, 29523 -> 11, 29566 -> 25, 29538 -> 17, 29506 -> 1, 29536 -> 15, 29504 -> 1, 29553 -> 25, 29568 -> 25, 29543 -> 17, 29514 -> 8, 29511 -> 11, 29546 -> 25, 29571 -> 25, 29491 -> 0, 29528 -> 25, 29565 -> 25, 29539 -> 17, 29560 -> 25, 29507 -> 2, 29550 -> 25)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(29497, 29499, 29491, 29492, 29498), 10 -> HashSet(29520, 29521, 29522), 20 -> HashSet(29552, 29551), 1 -> HashSet(29505, 29500, 29506, 29504), 21 -> HashSet(29554, 29553, 29550), 9 -> HashSet(29512, 29516, 29515), 2 -> HashSet(29508, 29507), 17 -> HashSet(29544, 29540, 29541, 29542, 29538, 29543, 29539), 22 -> HashSet(29558, 29559, 29560), 12 -> HashSet(29529, 29528), 7 -> HashSet(29509, 29510, 29511), 18 -> HashSet(29545, 29546), 16 -> HashSet(29538, 29539), 11 -> HashSet(29520, 29525, 29512, 29521, 29526, 29522, 29527, 29523, 29511, 29524, 29509, 29516, 29515, 29510), 23 -> HashSet(29566, 29568, 29565, 29567, 29561), 8 -> HashSet(29513, 29514), 19 -> HashSet(29549, 29548, 29547), 15 -> HashSet(29537, 29535, 29530, 29534, 29536), 24 -> HashSet(29496), 25 -> HashSet(29572, 29545, 29549, 29529, 29566, 29553, 29568, 29558, 29548, 29567, 29561, 29554, 29569, 29547, 29570, 29559, 29496, 29571, 29546, 29528, 29565, 29560, 29550))
  /* Beautified form:
  "BindingRestElement0IteratorBindingInitialization0" (this, BindingIdentifier, iteratorRecord, environment) => {
    access __x0__ = (BindingIdentifier "StringValue")
    app __x1__ = (ResolveBinding __x0__ environment)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lhs = __x1__
    app __x2__ = (ArrayCreate 0i)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let A = __x2__
    let n = 0i
    while true {
      if (= iteratorRecord["Done"] false) {
        app __x3__ = (IteratorStep iteratorRecord)
        let next = __x3__
        app __x4__ = (IsAbruptCompletion next)
        if __x4__ iteratorRecord["Done"] = true else {}
        if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
        next
        if (= next false) iteratorRecord["Done"] = true else {}
      } else {}
      if (= iteratorRecord["Done"] true) {
        if (= environment undefined) {
          app __x5__ = (PutValue lhs A)
          if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
          app __x6__ = (WrapCompletion __x5__)
          return __x6__
        } else {}
        app __x7__ = (InitializeReferencedBinding lhs A)
        app __x8__ = (WrapCompletion __x7__)
        return __x8__
      } else {}
      app __x9__ = (IteratorValue next)
      let nextValue = __x9__
      app __x10__ = (IsAbruptCompletion nextValue)
      if __x10__ iteratorRecord["Done"] = true else {}
      if (= (typeof nextValue) "Completion") if (= nextValue["Type"] CONST_normal) nextValue = nextValue["Value"] else return nextValue else {}
      nextValue
      app __x11__ = (ToString n)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (CreateDataProperty A __x11__ nextValue)
      let status = __x12__
      n = (+ n 1i)
    }
  }
  */
}
