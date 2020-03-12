package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMapDOTprototypeDOTforEach {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Map.prototype.forEach""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(84649), ILet(Id("""callbackfn"""), ERef(RefId(Id("""__x0__""")))).setId(84650), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(84652), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x1__""")))).setId(84653), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84655), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(84657), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(84658), IReturn(ERef(RefId(Id("""__x2__""")))).setId(84659)).setId(84660), ISeq(List()).setId(84693)).setId(84662), IExpr(ERef(RefId(Id("""__x2__""")))).setId(84663), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""callbackfn"""))))).setId(84665), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(84666), IReturn(ERef(RefId(Id("""__x4__""")))).setId(84667))).setId(84699), ISeq(List()).setId(84700)).setId(84669), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(1L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(84671), ILet(Id("""T"""), EUndef).setId(84673)).setId(84675), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(84677), IExpr(ENotSupported("""Etc""")).setId(84679), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(84680), IReturn(ERef(RefId(Id("""__x5__""")))).setId(84681))).setId(84709))
  val instToStepMap: Map[Int, Int] = HashMap(84649 -> 0, 84653 -> 1, 84680 -> 11, 84650 -> 0, 84662 -> 3, 84681 -> 11, 84675 -> 6, 84651 -> 0, 84668 -> 4, 84671 -> 6, 84652 -> 1, 84673 -> 6, 84672 -> 6, 84669 -> 5, 84679 -> 10, 84656 -> 2, 84666 -> 4, 84663 -> 3, 84676 -> 6, 84667 -> 4, 84682 -> 11, 84670 -> 5, 84654 -> 1, 84664 -> 3, 84674 -> 6, 84657 -> 3, 84665 -> 5, 84677 -> 7, 84678 -> 7, 84655 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(84649, 84650, 84651), 5 -> HashSet(84670, 84665, 84669), 10 -> HashSet(84679), 1 -> HashSet(84653, 84654, 84652), 6 -> HashSet(84676, 84675, 84671, 84674, 84673, 84672), 2 -> HashSet(84656, 84655), 7 -> HashSet(84677, 84678), 3 -> HashSet(84663, 84662, 84664, 84657), 11 -> HashSet(84680, 84682, 84681), 4 -> HashSet(84666, 84667, 84668))
  /* Beautified form:
  "GLOBAL.Map.prototype.forEach" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let callbackfn = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let thisArg = __x1__
    let M = this
    app __x2__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    __x2__
    app __x3__ = (IsCallable callbackfn)
    if (= __x3__ false) {
      app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x4__
    } else {}
    if (! (= argumentsList[1i] absent)) let T = thisArg else let T = undefined
    let entries = M["MapData"]
    !!! "Etc"
    app __x5__ = (WrapCompletion undefined)
    return __x5__
  }
  */
}
