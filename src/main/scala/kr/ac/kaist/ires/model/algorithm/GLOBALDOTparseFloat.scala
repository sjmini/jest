package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTparseFloat {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.parseFloat""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(62868), ILet(Id("""string"""), ERef(RefId(Id("""__x0__""")))).setId(62869), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""string"""))))).setId(62871), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(62872), IReturn(ERef(RefId(Id("""__x1__""")))).setId(62873)).setId(62874), ISeq(List()).setId(62897)).setId(62876), ILet(Id("""inputString"""), ERef(RefId(Id("""__x1__""")))).setId(62877), IApp(Id("""__x2__"""), ERef(RefId(Id("""TrimString"""))), List(ERef(RefId(Id("""inputString"""))), EStr("""start"""))).setId(62879), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(62880), IReturn(ERef(RefId(Id("""__x2__""")))).setId(62881)).setId(62882), ISeq(List()).setId(62904)).setId(62883), ILet(Id("""trimmedString"""), ERef(RefId(Id("""__x2__""")))).setId(62884), IExpr(ENotSupported("""Etc""")).setId(62886), IExpr(ENotSupported("""Etc""")).setId(62886), IAccess(Id("""__x3__"""), ERef(RefId(Id("""numberString"""))), EStr("""MV""")).setId(62887), ILet(Id("""mathFloat"""), ERef(RefId(Id("""__x3__""")))).setId(62888), IExpr(ENotSupported("""Etc""")).setId(62886), IExpr(ENotSupported("""Etc""")).setId(62886))).setId(62913))
  val instToStepMap: Map[Int, Int] = HashMap(62868 -> 0, 62883 -> 2, 62887 -> 5, 62877 -> 1, 62878 -> 1, 62888 -> 5, 62870 -> 0, 62876 -> 1, 62885 -> 2, 62889 -> 5, 62879 -> 2, 62869 -> 0, 62884 -> 2, 62871 -> 1, 62886 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(62868, 62869, 62870), 5 -> HashSet(62887, 62888, 62889), 1 -> HashSet(62877, 62878, 62876, 62871), 9 -> HashSet(62886), 2 -> HashSet(62883, 62884, 62885, 62879), 3 -> HashSet(62886), 8 -> HashSet(62886), 4 -> HashSet(62886))
  /* Beautified form:
  "GLOBAL.parseFloat" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let string = __x0__
    app __x1__ = (ToString string)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let inputString = __x1__
    app __x2__ = (TrimString inputString "start")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let trimmedString = __x2__
    !!! "Etc"
    !!! "Etc"
    access __x3__ = (numberString "MV")
    let mathFloat = __x3__
    !!! "Etc"
    !!! "Etc"
  }
  */
}
