package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CopyDataProperties {
  val length: Int = 3
  val func: Func = Func("""CopyDataProperties""", List(Id("""target"""), Id("""source"""), Id("""excludedItems""")), None, ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""source"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""source"""))), ENull)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))).setId(6831), IReturn(ERef(RefId(Id("""__x0__""")))).setId(6832))).setId(6909), ISeq(List()).setId(6910)).setId(6834), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""source"""))))).setId(6836), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(6837), IReturn(ERef(RefId(Id("""__x1__""")))).setId(6838)).setId(6839), ISeq(List()).setId(6916)).setId(6840), ILet(Id("""from"""), ERef(RefId(Id("""__x1__""")))).setId(6841), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""from""")), EStr("""OwnPropertyKeys"""))), List(ERef(RefId(Id("""from"""))))).setId(6843), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(6844), IReturn(ERef(RefId(Id("""__x2__""")))).setId(6845)).setId(6846), ISeq(List()).setId(6923)).setId(6847), ILet(Id("""keys"""), ERef(RefId(Id("""__x2__""")))).setId(6848), ILet(Id("""__x3__"""), ERef(RefId(Id("""keys""")))).setId(6895), ILet(Id("""__x4__"""), EINum(0L)).setId(6896), IWhile(EBOp(OLt, ERef(RefId(Id("""__x4__"""))), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""length""")))), ISeq(List(ILet(Id("""nextKey"""), ERef(RefProp(RefId(Id("""__x3__""")), ERef(RefId(Id("""__x4__""")))))).setId(6897), ILet(Id("""excluded"""), EBool(false)).setId(6850), ILet(Id("""__x5__"""), ERef(RefId(Id("""excludedItems""")))).setId(6859), ILet(Id("""__x6__"""), EINum(0L)).setId(6860), IWhile(EBOp(OLt, ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""length""")))), ISeq(List(ILet(Id("""e"""), ERef(RefProp(RefId(Id("""__x5__""")), ERef(RefId(Id("""__x6__""")))))).setId(6861), IApp(Id("""__x7__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""e"""))), ERef(RefId(Id("""nextKey"""))))).setId(6852), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), EBool(true)), IAssign(RefId(Id("""excluded""")), EBool(true)).setId(6853), ISeq(List()).setId(6935)).setId(6856), IAssign(RefId(Id("""__x6__""")), EBOp(OPlus, ERef(RefId(Id("""__x6__"""))), EINum(1L))).setId(6862))).setId(6938)).setId(6864), IIf(EBOp(OEq, ERef(RefId(Id("""excluded"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""from""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""from"""))), ERef(RefId(Id("""nextKey"""))))).setId(6867), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(6868), IReturn(ERef(RefId(Id("""__x8__""")))).setId(6869)).setId(6870), ISeq(List()).setId(6944)).setId(6871), ILet(Id("""desc"""), ERef(RefId(Id("""__x8__""")))).setId(6872), IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""desc"""))), EUndef)), EBOp(OEq, ERef(RefProp(RefId(Id("""desc""")), EStr("""Enumerable"""))), EBool(true))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""from"""))), ERef(RefId(Id("""nextKey"""))))).setId(6874), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(6875), IReturn(ERef(RefId(Id("""__x9__""")))).setId(6876)).setId(6877), ISeq(List()).setId(6951)).setId(6878), ILet(Id("""propValue"""), ERef(RefId(Id("""__x9__""")))).setId(6879), IApp(Id("""__x10__"""), ERef(RefId(Id("""CreateDataProperty"""))), List(ERef(RefId(Id("""target"""))), ERef(RefId(Id("""nextKey"""))), ERef(RefId(Id("""propValue"""))))).setId(6881), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(6882), IReturn(ERef(RefId(Id("""__x10__""")))).setId(6883)).setId(6884), ISeq(List()).setId(6958)).setId(6885), IExpr(ERef(RefId(Id("""__x10__""")))).setId(6886))).setId(6961), ISeq(List()).setId(6962)).setId(6889))).setId(6964), ISeq(List()).setId(6965)).setId(6892), IAssign(RefId(Id("""__x4__""")), EBOp(OPlus, ERef(RefId(Id("""__x4__"""))), EINum(1L))).setId(6898))).setId(6968)).setId(6900), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""target"""))))).setId(6903), IReturn(ERef(RefId(Id("""__x11__""")))).setId(6904))).setId(6972))
  val instToStepMap: Map[Int, Int] = HashMap(6905 -> 21, 6860 -> 20, 6901 -> 20, 6881 -> 20, 6880 -> 20, 6889 -> 20, 6874 -> 20, 6836 -> 4, 6855 -> 13, 6900 -> 20, 6830 -> 1, 6851 -> 20, 6894 -> 20, 6872 -> 20, 6887 -> 20, 6904 -> 21, 6892 -> 20, 6878 -> 20, 6873 -> 20, 6840 -> 4, 6895 -> 20, 6841 -> 4, 6856 -> 13, 6865 -> 20, 6852 -> 13, 6848 -> 5, 6833 -> 2, 6888 -> 20, 6859 -> 20, 6891 -> 20, 6866 -> 20, 6832 -> 2, 6834 -> 3, 6849 -> 5, 6847 -> 5, 6858 -> 13, 6890 -> 20, 6853 -> 13, 6843 -> 5, 6885 -> 20, 6902 -> 20, 6850 -> 20, 6835 -> 3, 6867 -> 20, 6903 -> 21, 6831 -> 2, 6893 -> 20, 6854 -> 13, 6871 -> 20, 6864 -> 20, 6842 -> 4, 6857 -> 13, 6879 -> 20, 6896 -> 20, 6886 -> 20)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(6830), 5 -> HashSet(6848, 6843, 6849, 6847), 20 -> HashSet(6900, 6895, 6860, 6865, 6888, 6901, 6881, 6866, 6890, 6880, 6893, 6871, 6889, 6874, 6851, 6894, 6872, 6887, 6892, 6878, 6873, 6859, 6891, 6885, 6902, 6850, 6867, 6864, 6879, 6896, 6886), 1 -> HashSet(6830), 21 -> HashSet(6904, 6905, 6903), 13 -> HashSet(6855, 6860, 6852, 6859, 6866, 6854, 6856, 6865, 6858, 6853, 6864, 6857), 2 -> HashSet(6833, 6832, 6831), 3 -> HashSet(6834, 6835), 16 -> HashSet(6872, 6873, 6867, 6871), 8 -> HashSet(6851, 6850), 19 -> HashSet(6878, 6880, 6874, 6879), 4 -> HashSet(6836, 6842, 6840, 6841))
  /* Beautified form:
  "CopyDataProperties" (target, source, excludedItems) => {
    if (|| (= source undefined) (= source null)) {
      app __x0__ = (WrapCompletion target)
      return __x0__
    } else {}
    app __x1__ = (ToObject source)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let from = __x1__
    app __x2__ = (from["OwnPropertyKeys"] from)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let keys = __x2__
    let __x3__ = keys
    let __x4__ = 0i
    while (< __x4__ __x3__["length"]) {
      let nextKey = __x3__[__x4__]
      let excluded = false
      let __x5__ = excludedItems
      let __x6__ = 0i
      while (< __x6__ __x5__["length"]) {
        let e = __x5__[__x6__]
        app __x7__ = (SameValue e nextKey)
        if (= __x7__ true) excluded = true else {}
        __x6__ = (+ __x6__ 1i)
      }
      if (= excluded false) {
        app __x8__ = (from["GetOwnProperty"] from nextKey)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let desc = __x8__
        if (&& (! (= desc undefined)) (= desc["Enumerable"] true)) {
          app __x9__ = (Get from nextKey)
          if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
          let propValue = __x9__
          app __x10__ = (CreateDataProperty target nextKey propValue)
          if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
          __x10__
        } else {}
      } else {}
      __x4__ = (+ __x4__ 1i)
    }
    app __x11__ = (WrapCompletion target)
    return __x11__
  }
  */
}
