package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GetSubstitution {
  val length: Int = 6
  val func: Func = Func("""GetSubstitution""", List(Id("""matched"""), Id("""str"""), Id("""position"""), Id("""captures"""), Id("""namedCaptures"""), Id("""replacement""")), None, ISeq(List(ILet(Id("""matchLength"""), ERef(RefProp(RefId(Id("""matched""")), EStr("""length""")))).setId(72935), ILet(Id("""stringLength"""), ERef(RefProp(RefId(Id("""str""")), EStr("""length""")))).setId(72937), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""matchLength"""))))).setId(72939), ILet(Id("""m"""), ERef(RefProp(RefId(Id("""captures""")), EStr("""length""")))).setId(72941), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""namedCaptures"""))), EUndef)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""namedCaptures"""))))).setId(72943), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(72944), IReturn(ERef(RefId(Id("""__x0__""")))).setId(72945)).setId(72946), ISeq(List()).setId(72934)).setId(72947), IAssign(RefId(Id("""namedCaptures""")), ERef(RefId(Id("""__x0__""")))).setId(72948))).setId(72950), ISeq(List()).setId(72934)).setId(72951), IExpr(ENotSupported("""Etc""")).setId(72953), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""result"""))))).setId(72954), IReturn(ERef(RefId(Id("""__x1__""")))).setId(72955))).setId(-1))
  /* Beautified form:
  "GetSubstitution" (matched, str, position, captures, namedCaptures, replacement) => {
    let matchLength = matched["length"]
    let stringLength = str["length"]
    let tailPos = (+ position matchLength)
    let m = captures["length"]
    if (! (= namedCaptures undefined)) {
      app __x0__ = (ToObject namedCaptures)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      namedCaptures = __x0__
    } else {}
    !!! "Etc"
    app __x1__ = (WrapCompletion result)
    return __x1__
  }
  */
}
