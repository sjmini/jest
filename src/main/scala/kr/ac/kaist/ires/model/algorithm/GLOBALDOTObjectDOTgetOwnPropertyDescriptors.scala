package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTgetOwnPropertyDescriptors {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.getOwnPropertyDescriptors""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(64599), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(64600), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(64602), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(64603), IReturn(ERef(RefId(Id("""__x1__""")))).setId(64604)).setId(64605), ISeq(List()).setId(64666)).setId(64607), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))).setId(64608), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""obj"""))))).setId(64610), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(64611), IReturn(ERef(RefId(Id("""__x2__""")))).setId(64612)).setId(64613), ISeq(List()).setId(64673)).setId(64614), ILet(Id("""ownKeys"""), ERef(RefId(Id("""__x2__""")))).setId(64615), IApp(Id("""__x3__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ObjectPrototype"""))))).setId(64617), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(64618), IReturn(ERef(RefId(Id("""__x3__""")))).setId(64619)).setId(64620), ISeq(List()).setId(64680)).setId(64621), ILet(Id("""descriptors"""), ERef(RefId(Id("""__x3__""")))).setId(64622), ILet(Id("""__x4__"""), ERef(RefId(Id("""ownKeys""")))).setId(64648), ILet(Id("""__x5__"""), EINum(0L)).setId(64649), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""key"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(64650), IApp(Id("""__x6__"""), ERef(RefProp(RefId(Id("""obj""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""obj"""))), ERef(RefId(Id("""key"""))))).setId(64624), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(64625), IReturn(ERef(RefId(Id("""__x6__""")))).setId(64626)).setId(64627), ISeq(List()).setId(64690)).setId(64628), ILet(Id("""desc"""), ERef(RefId(Id("""__x6__""")))).setId(64629), IApp(Id("""__x7__"""), ERef(RefId(Id("""FromPropertyDescriptor"""))), List(ERef(RefId(Id("""desc"""))))).setId(64631), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(64632), IReturn(ERef(RefId(Id("""__x7__""")))).setId(64633)).setId(64634), ISeq(List()).setId(64697)).setId(64635), ILet(Id("""descriptor"""), ERef(RefId(Id("""__x7__""")))).setId(64636), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""descriptor"""))), EUndef)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""descriptors"""))), ERef(RefId(Id("""key"""))), ERef(RefId(Id("""descriptor"""))))).setId(64638), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(64639), IReturn(ERef(RefId(Id("""__x8__""")))).setId(64640)).setId(64641), ISeq(List()).setId(64704)).setId(64642), IExpr(ERef(RefId(Id("""__x8__""")))).setId(64643))).setId(64707), ISeq(List()).setId(64708)).setId(64645), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(64651))).setId(64711)).setId(64653), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""descriptors"""))))).setId(64656), IReturn(ERef(RefId(Id("""__x9__""")))).setId(64657))).setId(64715))
  val instToStepMap: Map[Int, Int] = HashMap(64658 -> 9, 64622 -> 3, 64656 -> 9, 64608 -> 1, 64657 -> 9, 64616 -> 2, 64638 -> 8, 64637 -> 8, 64629 -> 8, 64609 -> 1, 64654 -> 8, 64636 -> 8, 64601 -> 0, 64599 -> 0, 64631 -> 8, 64610 -> 2, 64635 -> 8, 64655 -> 8, 64645 -> 8, 64614 -> 2, 64615 -> 2, 64649 -> 8, 64600 -> 0, 64647 -> 8, 64644 -> 8, 64628 -> 8, 64648 -> 8, 64653 -> 8, 64621 -> 3, 64643 -> 8, 64607 -> 1, 64617 -> 3, 64602 -> 1, 64624 -> 8, 64623 -> 3, 64642 -> 8, 64646 -> 8, 64630 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(64599, 64600, 64601), 1 -> HashSet(64608, 64609, 64607, 64602), 6 -> HashSet(64628, 64624, 64629, 64630), 9 -> HashSet(64658, 64656, 64657), 2 -> HashSet(64610, 64614, 64615, 64616), 7 -> HashSet(64631, 64635, 64637, 64636), 3 -> HashSet(64622, 64621, 64617, 64623), 8 -> HashSet(64631, 64645, 64649, 64638, 64637, 64624, 64629, 64654, 64636, 64642, 64635, 64655, 64647, 64644, 64628, 64648, 64643, 64653, 64646, 64630))
  /* Beautified form:
  "GLOBAL.Object.getOwnPropertyDescriptors" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (obj["OwnPropertyKeys"] obj)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let ownKeys = __x2__
    app __x3__ = (ObjectCreate INTRINSIC_ObjectPrototype)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let descriptors = __x3__
    let __x4__ = ownKeys
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let key = __x4__[__x5__]
      app __x6__ = (obj["GetOwnProperty"] obj key)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let desc = __x6__
      app __x7__ = (FromPropertyDescriptor desc)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let descriptor = __x7__
      if (! (= descriptor undefined)) {
        app __x8__ = (CreateDataProperty descriptors key descriptor)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion descriptors)
    return __x9__
  }
  */
}
