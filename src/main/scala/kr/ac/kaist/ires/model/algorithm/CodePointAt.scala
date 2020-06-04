package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object CodePointAt {
  val length: Int = 2
  val func: Func = Func("""CodePointAt""", List(Id("""string"""), Id("""position""")), None, ISeq(List(ILet(Id("""size"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))).setId(8903), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IExpr(ENotSupported("""Etc""")).setId(8906), IApp(Id("""__x0__"""), ERef(RefId(Id("""UTF16Decode"""))), List(ERef(RefId(Id("""first"""))), ERef(RefId(Id("""second"""))))).setId(8907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(8908), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8909)).setId(8910), ISeq(List()).setId(8905)).setId(8911), IAssign(RefId(Id("""cp""")), ERef(RefId(Id("""__x0__""")))).setId(8912), IReturn(EMap(Ty("""Record"""), List((EStr("""CodePoint"""), ERef(RefId(Id("""cp""")))), (EStr("""CodeUnitCount"""), EINum(2L)), (EStr("""IsUnpairedSurrogate"""), EBool(false))))).setId(8914))).setId(-1))
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
