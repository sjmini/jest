package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTSetDOTprototypeDOTdelete {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Set.prototype.delete""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(85851), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(85852), ILet(Id("""S"""), ERef(RefId(Id("""this""")))).setId(85854), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""S"""))), EStr("""SetData"""))).setId(85856), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(85857), IReturn(ERef(RefId(Id("""__x1__""")))).setId(85858)).setId(85859), ISeq(List()).setId(85900)).setId(85861), IExpr(ERef(RefId(Id("""__x1__""")))).setId(85862), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""S""")), EStr("""SetData""")))).setId(85864), ILet(Id("""__x2__"""), ERef(RefId(Id("""entries""")))).setId(85881), ILet(Id("""__x3__"""), EINum(0L)).setId(85882), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(85883), ILet(Id("""__x4__"""), EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""e"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(85871), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""SameValueZero"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""value"""))))).setId(85866), IAssign(RefId(Id("""__x4__""")), EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true))).setId(85869))).setId(85910), ISeq(List()).setId(85911)).setId(85872), IIf(ERef(RefId(Id("""__x4__"""))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(85873), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(85874), IReturn(ERef(RefId(Id("""__x6__""")))).setId(85875))).setId(85916), ISeq(List()).setId(85917)).setId(85878), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(85884))).setId(85920)).setId(85886), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(85889), IReturn(ERef(RefId(Id("""__x7__""")))).setId(85890))).setId(85924))
  val instToStepMap: Map[Int, Int] = HashMap(85864 -> 3, 85852 -> 0, 85891 -> 10, 85877 -> 9, 85862 -> 2, 85880 -> 9, 85876 -> 9, 85888 -> 9, 85853 -> 0, 85875 -> 9, 85854 -> 1, 85879 -> 9, 85855 -> 1, 85887 -> 9, 85874 -> 9, 85863 -> 2, 85878 -> 9, 85851 -> 0, 85871 -> 9, 85873 -> 9, 85890 -> 10, 85856 -> 2, 85881 -> 9, 85886 -> 9, 85861 -> 2, 85865 -> 3, 85872 -> 9, 85882 -> 9, 85889 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(85852, 85853, 85851), 10 -> HashSet(85891, 85890, 85889), 1 -> HashSet(85854, 85855), 9 -> HashSet(85877, 85880, 85876, 85888, 85881, 85875, 85886, 85872, 85879, 85882, 85887, 85874, 85878, 85871, 85873), 2 -> HashSet(85862, 85856, 85861, 85863), 3 -> HashSet(85864, 85865), 8 -> HashSet(85873))
  /* Beautified form:
  "GLOBAL.Set.prototype.delete" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let S = this
    app __x1__ = (RequireInternalSlot S "SetData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = S["SetData"]
    let __x2__ = entries
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let e = __x2__[__x3__]
      let __x4__ = (! (= e CONST_empty))
      if __x4__ {
        app __x5__ = (SameValueZero e value)
        __x4__ = (= __x5__ true)
      } else {}
      if __x4__ {
        !!! "Etc"
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
