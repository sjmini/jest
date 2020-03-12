package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CodePointAt {
  val length: Int = 2
  val func: Func = Func("""CodePointAt""", List(Id("""string"""), Id("""position""")), None, ISeq(List(ILet(Id("""size"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))).setId(8903), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IApp(Id("""__x0__"""), ERef(RefId(Id("""UTF16Decode"""))), List(ERef(RefId(Id("""first"""))), ERef(RefId(Id("""second"""))))).setId(8907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(8908), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8909)).setId(8910), ISeq(List()).setId(8928)).setId(8911), IAssign(RefId(Id("""cp""")), ERef(RefId(Id("""__x0__""")))).setId(8912), IReturn(EMap(Ty("""Record"""), List((EStr("""CodePoint"""), ERef(RefId(Id("""cp""")))), (EStr("""CodeUnitCount"""), EINum(2L)), (EStr("""IsUnpairedSurrogate"""), EBool(false))))).setId(8914))).setId(8932))
  val instToStepMap: Map[Int, Int] = HashMap(8911 -> 11, 8907 -> 11, 8914 -> 12, 8912 -> 11, 8913 -> 11, 8915 -> 12, 8903 -> 0, 8906 -> 10, 8905 -> 1, 8904 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8903, 8904), 5 -> HashSet(8906), 10 -> HashSet(8906), 1 -> HashSet(8905), 2 -> HashSet(8906), 12 -> HashSet(8915, 8914), 7 -> HashSet(8906), 3 -> HashSet(8906), 11 -> HashSet(8913, 8911, 8907, 8912), 8 -> HashSet(8906))
  /* Beautified form:
  "CodePointAt" (string, position) => {
    let size = string["length"]
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    app __x0__ = (UTF16Decode first second)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    cp = __x0__
    return (new Record("CodePoint" -> cp, "CodeUnitCount" -> 2i, "IsUnpairedSurrogate" -> false))
  }
  */
}
