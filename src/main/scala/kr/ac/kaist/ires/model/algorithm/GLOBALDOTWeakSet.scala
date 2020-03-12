package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakSet {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.WeakSet""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87145), ILet(Id("""iterable"""), ERef(RefId(Id("""__x0__""")))).setId(87146), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87148), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87149))).setId(87232), ISeq(List()).setId(87233)).setId(87152), IApp(Id("""__x2__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""NewTarget"""))), EStr("""%WeakSetPrototype%"""), EList(List(EStr("""WeakSetData"""))))).setId(87154), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(87155), IReturn(ERef(RefId(Id("""__x2__""")))).setId(87156)).setId(87157), ISeq(List()).setId(87239)).setId(87158), ILet(Id("""set"""), ERef(RefId(Id("""__x2__""")))).setId(87159), IAssign(RefProp(RefId(Id("""set""")), EStr("""WeakSetData""")), EList(List())).setId(87161), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L))), EAbsent), IAssign(RefId(Id("""iterable""")), EUndef).setId(87163), ISeq(List()).setId(87244)).setId(87165), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""iterable"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""iterable"""))), ENull)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(87167), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87168))).setId(87248), ISeq(List()).setId(87249)).setId(87170), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""set"""))), EStr("""add"""))).setId(87172), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(87173), IReturn(ERef(RefId(Id("""__x4__""")))).setId(87174)).setId(87175), ISeq(List()).setId(87255)).setId(87176), ILet(Id("""adder"""), ERef(RefId(Id("""__x4__""")))).setId(87177), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""adder"""))))).setId(87179), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(87180), IReturn(ERef(RefId(Id("""__x6__""")))).setId(87181))).setId(87261), ISeq(List()).setId(87262)).setId(87183), IApp(Id("""__x7__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""iterable"""))))).setId(87185), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(87186), IReturn(ERef(RefId(Id("""__x7__""")))).setId(87187)).setId(87188), ISeq(List()).setId(87268)).setId(87189), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x7__""")))).setId(87190), IWhile(EBool(true), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(87192), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(87193), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87194)).setId(87195), ISeq(List()).setId(87275)).setId(87196), ILet(Id("""next"""), ERef(RefId(Id("""__x8__""")))).setId(87197), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""set"""))))).setId(87199), IReturn(ERef(RefId(Id("""__x9__""")))).setId(87200))).setId(87280), ISeq(List()).setId(87281)).setId(87202), IApp(Id("""__x10__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(87204), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(87205), IReturn(ERef(RefId(Id("""__x10__""")))).setId(87206)).setId(87207), ISeq(List()).setId(87287)).setId(87208), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x10__""")))).setId(87209), IApp(Id("""__x11__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""adder"""))), ERef(RefId(Id("""set"""))), EList(List(ERef(RefId(Id("""nextValue"""))))))).setId(87211), ILet(Id("""status"""), ERef(RefId(Id("""__x11__""")))).setId(87212), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(87214), IIf(ERef(RefId(Id("""__x12__"""))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(87215), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(87216), IReturn(ERef(RefId(Id("""__x13__""")))).setId(87217)).setId(87218), ISeq(List()).setId(87297)).setId(87219), IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x13__"""))))).setId(87220), IReturn(ERef(RefId(Id("""__x14__""")))).setId(87221))).setId(87301), ISeq(List()).setId(87302)).setId(87223))).setId(87304)).setId(87226))).setId(87306))
  val instToStepMap: Map[Int, Int] = HashMap(87224 -> 20, 87179 -> 11, 87148 -> 1, 87183 -> 11, 87215 -> 20, 87145 -> 0, 87211 -> 20, 87167 -> 7, 87213 -> 20, 87170 -> 8, 87185 -> 12, 87180 -> 10, 87202 -> 20, 87162 -> 4, 87220 -> 20, 87149 -> 1, 87189 -> 12, 87166 -> 6, 87165 -> 6, 87154 -> 3, 87197 -> 20, 87184 -> 11, 87214 -> 20, 87196 -> 20, 87190 -> 12, 87146 -> 0, 87152 -> 2, 87161 -> 4, 87219 -> 20, 87210 -> 20, 87178 -> 9, 87223 -> 20, 87171 -> 8, 87203 -> 20, 87158 -> 3, 87200 -> 16, 87191 -> 12, 87176 -> 9, 87225 -> 20, 87168 -> 7, 87208 -> 20, 87172 -> 9, 87164 -> 5, 87177 -> 9, 87222 -> 20, 87209 -> 20, 87147 -> 0, 87199 -> 16, 87159 -> 3, 87182 -> 10, 87204 -> 20, 87169 -> 7, 87201 -> 16, 87150 -> 1, 87226 -> 20, 87192 -> 20, 87163 -> 5, 87221 -> 20, 87212 -> 20, 87160 -> 3, 87198 -> 20, 87181 -> 10, 87153 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87146, 87145, 87147), 5 -> HashSet(87164, 87163), 10 -> HashSet(87180, 87182, 87181), 20 -> HashSet(87213, 87202, 87220, 87224, 87197, 87219, 87203, 87215, 87225, 87208, 87204, 87211, 87221, 87214, 87196, 87210, 87223, 87222, 87209, 87226, 87192, 87212, 87198), 1 -> HashSet(87149, 87148, 87150), 6 -> HashSet(87166, 87165), 9 -> HashSet(87178, 87176, 87172, 87177), 2 -> HashSet(87152, 87153), 17 -> HashSet(87202, 87203), 12 -> HashSet(87185, 87189, 87190, 87191), 7 -> HashSet(87168, 87169, 87167), 3 -> HashSet(87154, 87158, 87159, 87160), 18 -> HashSet(87210, 87208, 87209, 87204), 16 -> HashSet(87200, 87199, 87201), 11 -> HashSet(87184, 87179, 87183), 8 -> HashSet(87170, 87171), 19 -> HashSet(87213, 87211, 87212), 4 -> HashSet(87162, 87161), 15 -> HashSet(87197, 87196, 87192, 87198))
  /* Beautified form:
  "GLOBAL.WeakSet" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let iterable = __x0__
    if (= NewTarget undefined) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (OrdinaryCreateFromConstructor NewTarget "%WeakSetPrototype%" (new ["WeakSetData"]))
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let set = __x2__
    set["WeakSetData"] = (new [])
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
