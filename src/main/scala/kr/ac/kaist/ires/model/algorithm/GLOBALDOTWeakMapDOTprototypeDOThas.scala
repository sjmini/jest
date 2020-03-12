package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTWeakMapDOTprototypeDOThas {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.WeakMap.prototype.has""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(86885), ILet(Id("""key"""), ERef(RefId(Id("""__x0__""")))).setId(86886), ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(86888), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireInternalSlot"""))), List(ERef(RefId(Id("""M"""))), EStr("""WeakMapData"""))).setId(86890), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(86891), IReturn(ERef(RefId(Id("""__x1__""")))).setId(86892)).setId(86893), ISeq(List()).setId(86938)).setId(86895), IExpr(ERef(RefId(Id("""__x1__""")))).setId(86896), ILet(Id("""entries"""), ERef(RefProp(RefId(Id("""M""")), EStr("""WeakMapData""")))).setId(86898), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""key"""))))).setId(86900), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86901), IReturn(ERef(RefId(Id("""__x3__""")))).setId(86902))).setId(86945), ISeq(List()).setId(86946)).setId(86904), ILet(Id("""__x4__"""), ERef(RefId(Id("""entries""")))).setId(86919), ILet(Id("""__x5__"""), EINum(0L)).setId(86920), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""p"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(86921), ILet(Id("""__x6__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""CONST_empty""")))))).setId(86911), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""p""")), EStr("""Key"""))), ERef(RefId(Id("""key"""))))).setId(86906), IAssign(RefId(Id("""__x6__""")), EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true))).setId(86909))).setId(86954), ISeq(List()).setId(86955)).setId(86912), IIf(ERef(RefId(Id("""__x6__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(86913), IReturn(ERef(RefId(Id("""__x8__""")))).setId(86914))).setId(86959), ISeq(List()).setId(86960)).setId(86916), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(86922))).setId(86963)).setId(86924), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(86927), IReturn(ERef(RefId(Id("""__x9__""")))).setId(86928))).setId(86967))
  val instToStepMap: Map[Int, Int] = HashMap(86925 -> 8, 86904 -> 5, 86920 -> 8, 86888 -> 1, 86926 -> 8, 86903 -> 4, 86899 -> 3, 86914 -> 8, 86927 -> 9, 86898 -> 3, 86897 -> 2, 86886 -> 0, 86924 -> 8, 86929 -> 9, 86885 -> 0, 86916 -> 8, 86900 -> 5, 86913 -> 8, 86890 -> 2, 86915 -> 8, 86889 -> 1, 86911 -> 8, 86887 -> 0, 86919 -> 8, 86902 -> 4, 86918 -> 8, 86905 -> 5, 86895 -> 2, 86912 -> 8, 86928 -> 9, 86901 -> 4, 86896 -> 2, 86917 -> 8)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(86885, 86887, 86886), 5 -> HashSet(86904, 86900, 86905), 1 -> HashSet(86888, 86889), 9 -> HashSet(86927, 86928, 86929), 2 -> HashSet(86890, 86895, 86897, 86896), 3 -> HashSet(86899, 86898), 8 -> HashSet(86916, 86925, 86913, 86920, 86926, 86915, 86911, 86919, 86914, 86918, 86912, 86924, 86917), 4 -> HashSet(86903, 86902, 86901))
  /* Beautified form:
  "GLOBAL.WeakMap.prototype.has" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let key = __x0__
    let M = this
    app __x1__ = (RequireInternalSlot M "WeakMapData")
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    __x1__
    let entries = M["WeakMapData"]
    app __x2__ = (Type key)
    if (! (= __x2__ Object)) {
      app __x3__ = (WrapCompletion false)
      return __x3__
    } else {}
    let __x4__ = entries
    let __x5__ = 0i
    while (< __x5__ __x4__["length"]) {
      let p = __x4__[__x5__]
      let __x6__ = (! (= p["Key"] CONST_empty))
      if __x6__ {
        app __x7__ = (SameValue p["Key"] key)
        __x6__ = (= __x7__ true)
      } else {}
      if __x6__ {
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      __x5__ = (+ __x5__ 1i)
    }
    app __x9__ = (WrapCompletion false)
    return __x9__
  }
  */
}
