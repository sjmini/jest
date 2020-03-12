package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTstartsWith {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.startsWith""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(73838), ILet(Id("""searchString"""), ERef(RefId(Id("""__x0__""")))).setId(73839), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(73841), ILet(Id("""position"""), ERef(RefId(Id("""__x1__""")))).setId(73842), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(73844), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(73845), IReturn(ERef(RefId(Id("""__x2__""")))).setId(73846)).setId(73847), ISeq(List()).setId(73908)).setId(73849), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(73850), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(73852), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(73853), IReturn(ERef(RefId(Id("""__x3__""")))).setId(73854)).setId(73855), ISeq(List()).setId(73915)).setId(73856), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(73857), IApp(Id("""__x4__"""), ERef(RefId(Id("""IsRegExp"""))), List(ERef(RefId(Id("""searchString"""))))).setId(73859), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(73860), IReturn(ERef(RefId(Id("""__x4__""")))).setId(73861)).setId(73862), ISeq(List()).setId(73922)).setId(73863), ILet(Id("""isRegExp"""), ERef(RefId(Id("""__x4__""")))).setId(73864), IIf(EBOp(OEq, ERef(RefId(Id("""isRegExp"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(73866), IReturn(ERef(RefId(Id("""__x5__""")))).setId(73867))).setId(73927), ISeq(List()).setId(73928)).setId(73869), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchString"""))))).setId(73871), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(73872), IReturn(ERef(RefId(Id("""__x6__""")))).setId(73873)).setId(73874), ISeq(List()).setId(73934)).setId(73875), ILet(Id("""searchStr"""), ERef(RefId(Id("""__x6__""")))).setId(73876), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""position"""))))).setId(73878), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(73879), IReturn(ERef(RefId(Id("""__x7__""")))).setId(73880)).setId(73881), ISeq(List()).setId(73941)).setId(73882), ILet(Id("""pos"""), ERef(RefId(Id("""__x7__""")))).setId(73883), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(73885), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""pos"""))), EINum(0L))).setId(73887), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""len"""))))).setId(73888), ILet(Id("""start"""), ERef(RefId(Id("""__x9__""")))).setId(73889), ILet(Id("""searchLength"""), ERef(RefProp(RefId(Id("""searchStr""")), EStr("""length""")))).setId(73891), IIf(EBOp(OLt, ERef(RefId(Id("""len"""))), EBOp(OPlus, ERef(RefId(Id("""searchLength"""))), ERef(RefId(Id("""start"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(73893), IReturn(ERef(RefId(Id("""__x10__""")))).setId(73894))).setId(73951), ISeq(List()).setId(73952)).setId(73896), IExpr(ENotSupported("""Etc""")).setId(73898), IExpr(ENotSupported("""Etc""")).setId(73898))).setId(73956))
  val instToStepMap: Map[Int, Int] = HashMap(73893 -> 13, 73887 -> 11, 73890 -> 11, 73894 -> 13, 73869 -> 6, 73844 -> 2, 73866 -> 5, 73851 -> 2, 73843 -> 1, 73871 -> 7, 73852 -> 3, 73857 -> 3, 73878 -> 8, 73864 -> 4, 73898 -> 16, 73842 -> 1, 73849 -> 2, 73889 -> 11, 73868 -> 5, 73840 -> 0, 73884 -> 8, 73841 -> 1, 73897 -> 14, 73848 -> 9, 73875 -> 7, 73863 -> 4, 73865 -> 4, 73886 -> 10, 73883 -> 8, 73850 -> 2, 73891 -> 12, 73876 -> 7, 73859 -> 4, 73895 -> 13, 73870 -> 6, 73838 -> 0, 73885 -> 10, 73882 -> 8, 73858 -> 3, 73892 -> 12, 73877 -> 7, 73896 -> 14, 73856 -> 3, 73839 -> 0, 73867 -> 5, 73888 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(73840, 73838, 73839), 5 -> HashSet(73868, 73866, 73867), 10 -> HashSet(73886, 73885), 14 -> HashSet(73897, 73896), 1 -> HashSet(73842, 73841, 73843), 6 -> HashSet(73869, 73870), 9 -> HashSet(73848), 13 -> HashSet(73893, 73894, 73895), 2 -> HashSet(73849, 73850, 73844, 73851), 12 -> HashSet(73891, 73892), 7 -> HashSet(73875, 73876, 73877, 73871), 3 -> HashSet(73857, 73858, 73856, 73852), 16 -> HashSet(73898), 11 -> HashSet(73889, 73887, 73890, 73888), 8 -> HashSet(73878, 73884, 73883, 73882), 4 -> HashSet(73864, 73863, 73865, 73859), 15 -> HashSet(73898))
  /* Beautified form:
  "GLOBAL.String.prototype.startsWith" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchString = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let position = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    app __x4__ = (IsRegExp searchString)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let isRegExp = __x4__
    if (= isRegExp true) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    app __x6__ = (ToString searchString)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let searchStr = __x6__
    app __x7__ = (ToInteger position)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let pos = __x7__
    let len = S["length"]
    app __x8__ = (max pos 0i)
    app __x9__ = (min __x8__ len)
    let start = __x9__
    let searchLength = searchStr["length"]
    if (< len (+ searchLength start)) {
      app __x10__ = (WrapCompletion false)
      return __x10__
    } else {}
    !!! "Etc"
    !!! "Etc"
  }
  */
}
