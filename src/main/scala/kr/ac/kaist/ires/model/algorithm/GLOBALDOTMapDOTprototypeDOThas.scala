package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMapDOTprototypeDOThas {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Map.prototype.has""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(84838), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(84839), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84841), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""MapData"""))).setId(84843), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(84844), IReturn(ERef(RefId(Id("""__x1__""")))).setId(84845)).setId(84846), ISeq(List()).setId(84885)).setId(84848), IExpr(ERef(RefId(Id("""__x1__""")))).setId(84849), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""MapData""")))).setId(84851), ILet(Id("""__x2__"""), ERef(RefId(Id("""entries""")))).setId(84866), ILet(Id("""__x3__"""), EINum(0L)).setId(84867), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(84868), ILet(Id("""__x4__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(84858), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(84853), IAssign(RefId(Id("""__x4__""")), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true))).setId(84856))).setId(84895), ISeq(List()).setId(84896)).setId(84859), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(84860), IReturn(ERef(RefId(Id("""__x6__""")))).setId(84861))).setId(84900), ISeq(List()).setId(84901)).setId(84863), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(84869))).setId(84904)).setId(84871), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(84874), IReturn(ERef(RefId(Id("""__x7__""")))).setId(84875))).setId(84908))
  val instToStepMap: Map[Int, Int] = HashMap(84838 -> 0, 84848 -> 2, 84865 -> 6, 84841 -> 1, 84842 -> 1, 84851 -> 3, 84862 -> 6, 84875 -> 7, 84867 -> 6, 84839 -> 0, 84852 -> 3, 84871 -> 6, 84858 -> 6, 84873 -> 6, 84850 -> 2, 84874 -> 7, 84859 -> 6, 84843 -> 2, 84840 -> 0, 84872 -> 6, 84849 -> 2, 84860 -> 6, 84863 -> 6, 84876 -> 7, 84861 -> 6, 84864 -> 6, 84866 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(84838, 84840, 84839), 1 -> HashSet(84841, 84842), 6 -> HashSet(84865, 84859, 84862, 84872, 84867, 84861, 84871, 84858, 84873, 84860, 84863, 84864, 84866), 2 -> HashSet(84848, 84850, 84843, 84849), 7 -> HashSet(84874, 84875, 84876), 3 -> HashSet(84851, 84852))
  /* Beautified form:
  "GLOBAL.Map.prototype.has" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (RequireInternalSlot M "MapData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = M["MapData"]
    let __x2__ = entries
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let p = __x2__[__x3__]
      let __x4__ = (! (= p["Key"] CONST_empty))
      if __x4__ {
        app __x5__ = (SameValueZero p["Key"] key)
        __x4__ = (= __x5__ true)
      } else {}
      if __x4__ {
        app __x6__ = (WrapCompletion true)
        return __x6__
      } else {}
      __x3__ = (+ __x3__ 1i)
    }
    app __x7__ = (WrapCompletion false)
    return __x7__
  }
  */
}
