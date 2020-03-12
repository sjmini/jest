package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentsExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ArgumentsExoticObject.DefineOwnProperty""", List(Id("""args"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(ILet(Id("""args"""), ERef(RefId(Id("""args""")))).setId(55439), ILet(Id("""map"""), ERef(RefProp(RefId(Id("""args""")), EStr("""ParameterMap""")))).setId(55441), IApp(Id("""__x0__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55443), ILet(Id("""isMapped"""), ERef(RefId(Id("""__x0__""")))).setId(55444), ILet(Id("""newArgDesc"""), ERef(RefId(Id("""Desc""")))).setId(55446), ILet(Id("""__x1__"""), EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true))).setId(55454), IIf(ERef(RefId(Id("""__x1__"""))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(55448), IAssign(RefId(Id("""__x1__""")), EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true))).setId(55451))).setId(55514), ISeq(List()).setId(55515)).setId(55455), IIf(ERef(RefId(Id("""__x1__"""))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IAssign(RefId(Id("""newArgDesc""")), ECopy(ERef(RefId(Id("""Desc"""))))).setId(55456), IApp(Id("""__x3__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55458), IAssign(RefProp(RefId(Id("""newArgDesc""")), EStr("""Value""")), ERef(RefId(Id("""__x3__""")))).setId(55459))).setId(55520), ISeq(List()).setId(55521)).setId(55462), ISeq(List()).setId(55523)).setId(55465), IApp(Id("""__x4__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""args"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""newArgDesc"""))))).setId(55467), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(55468), IReturn(ERef(RefId(Id("""__x4__""")))).setId(55469)).setId(55470), ISeq(List()).setId(55529)).setId(55471), ILet(Id("""allowed"""), ERef(RefId(Id("""__x4__""")))).setId(55472), IIf(EBOp(OEq, ERef(RefId(Id("""allowed"""))), EBool(false)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(55474), IReturn(ERef(RefId(Id("""__x5__""")))).setId(55475))).setId(55534), ISeq(List()).setId(55535)).setId(55477), IIf(EBOp(OEq, ERef(RefId(Id("""isMapped"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(55479), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""Delete"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55480), IExpr(ERef(RefId(Id("""__x7__""")))).setId(55481))).setId(55540), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EBool(false))).setId(55484), ILet(Id("""setStatus"""), ERef(RefId(Id("""__x8__""")))).setId(55485))).setId(55543), ISeq(List()).setId(55544)).setId(55488), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefProp(RefId(Id("""map""")), EStr("""Delete"""))), List(ERef(RefId(Id("""map"""))), ERef(RefId(Id("""P"""))))).setId(55490), IExpr(ERef(RefId(Id("""__x9__""")))).setId(55491))).setId(55548), ISeq(List()).setId(55549)).setId(55494))).setId(55551)).setId(55497))).setId(55553), ISeq(List()).setId(55554)).setId(55500), IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(55502), IReturn(ERef(RefId(Id("""__x10__""")))).setId(55503))).setId(55558))
  val instToStepMap: Map[Int, Int] = HashMap(55501 -> 29, 55483 -> 18, 55487 -> 24, 55455 -> 10, 55481 -> 18, 55472 -> 11, 55462 -> 9, 55453 -> 24, 55504 -> 30, 55500 -> 29, 55480 -> 18, 55444 -> 2, 55493 -> 28, 55457 -> 9, 55461 -> 9, 55489 -> 28, 55476 -> 12, 55479 -> 28, 55465 -> 10, 55502 -> 30, 55484 -> 24, 55497 -> 28, 55447 -> 3, 55464 -> 9, 55471 -> 11, 55492 -> 28, 55488 -> 28, 55443 -> 2, 55460 -> 9, 55496 -> 28, 55475 -> 12, 55439 -> 0, 55456 -> 9, 55503 -> 30, 55466 -> 10, 55463 -> 9, 55498 -> 28, 55478 -> 13, 55442 -> 1, 55459 -> 9, 55491 -> 28, 55474 -> 12, 55440 -> 0, 55485 -> 24, 55446 -> 3, 55495 -> 28, 55482 -> 18, 55499 -> 28, 55467 -> 11, 55441 -> 1, 55454 -> 10, 55477 -> 13, 55494 -> 28, 55445 -> 2, 55458 -> 9, 55486 -> 24, 55490 -> 28, 55473 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(55439, 55440), 10 -> HashSet(55455, 55465, 55466, 55454), 29 -> HashSet(55500, 55501), 1 -> HashSet(55442, 55441), 28 -> HashSet(55493, 55489, 55479, 55497, 55496, 55498, 55491, 55495, 55499, 55494, 55490, 55492, 55488), 9 -> HashSet(55457, 55461, 55464, 55460, 55456, 55463, 55459, 55462, 55458), 13 -> HashSet(55478, 55477), 2 -> HashSet(55444, 55443, 55445), 12 -> HashSet(55476, 55475, 55474), 3 -> HashSet(55447, 55446), 18 -> HashSet(55480, 55483, 55481, 55482), 11 -> HashSet(55471, 55472, 55467, 55473), 23 -> HashSet(55484, 55485, 55486), 8 -> HashSet(55457, 55456), 30 -> HashSet(55502, 55503, 55504), 24 -> HashSet(55487, 55484, 55485, 55453, 55486), 25 -> HashSet(55489, 55488))
  /* Beautified form:
  "ArgumentsExoticObject.DefineOwnProperty" (args, P, Desc) => {
    let args = args
    let map = args["ParameterMap"]
    app __x0__ = (HasOwnProperty map P)
    let isMapped = __x0__
    let newArgDesc = Desc
    let __x1__ = (= isMapped true)
    if __x1__ {
      app __x2__ = (IsDataDescriptor Desc)
      __x1__ = (= __x2__ true)
    } else {}
    if __x1__ if (&& (= Desc["Value"] absent) (= Desc["Writable"] false)) {
      newArgDesc = (copy-obj Desc)
      app __x3__ = (Get map P)
      newArgDesc["Value"] = __x3__
    } else {} else {}
    app __x4__ = (OrdinaryDefineOwnProperty args P newArgDesc)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let allowed = __x4__
    if (= allowed false) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {}
    if (= isMapped true) {
      app __x6__ = (IsAccessorDescriptor Desc)
      if (= __x6__ true) {
        app __x7__ = (map["Delete"] map P)
        __x7__
      } else {
        if (! (= Desc["Value"] absent)) {
          app __x8__ = (Set map P Desc["Value"] false)
          let setStatus = __x8__
        } else {}
        if (= Desc["Writable"] false) {
          app __x9__ = (map["Delete"] map P)
          __x9__
        } else {}
      }
    } else {}
    app __x10__ = (WrapCompletion true)
    return __x10__
  }
  */
}
