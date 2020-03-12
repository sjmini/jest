package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTfromCharCode {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.fromCharCode""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(70230), ILet(Id("""length"""), ERef(RefProp(RefId(Id("""codeUnits""")), EStr("""length""")))).setId(70231), ILet(Id("""elements"""), EList(List())).setId(70233), ILet(Id("""nextIndex"""), EINum(0L)).setId(70235), IWhile(EBOp(OLt, ERef(RefId(Id("""nextIndex"""))), ERef(RefId(Id("""length""")))), ISeq(List(ILet(Id("""next"""), ERef(RefProp(RefId(Id("""codeUnits""")), ERef(RefId(Id("""nextIndex""")))))).setId(70237), IApp(Id("""__x0__"""), ERef(RefId(Id("""ToUint16"""))), List(ERef(RefId(Id("""next"""))))).setId(70239), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(70240), IReturn(ERef(RefId(Id("""__x0__""")))).setId(70241)).setId(70242), ISeq(List()).setId(70267)).setId(70244), ILet(Id("""nextCU"""), ERef(RefId(Id("""__x0__""")))).setId(70245), IAppend(ERef(RefId(Id("""nextCU"""))), ERef(RefId(Id("""elements""")))).setId(70247), IAssign(RefId(Id("""nextIndex""")), EBOp(OPlus, ERef(RefId(Id("""nextIndex"""))), EINum(1L))).setId(70249))).setId(70272)).setId(70252), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(70254), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70255))).setId(70276))
  val instToStepMap: Map[Int, Int] = HashMap(70238 -> 10, 70246 -> 10, 70251 -> 10, 70245 -> 10, 70244 -> 10, 70248 -> 10, 70254 -> 11, 70233 -> 2, 70247 -> 10, 70255 -> 11, 70249 -> 10, 70234 -> 2, 70231 -> 1, 70256 -> 11, 70239 -> 10, 70230 -> 0, 70252 -> 10, 70235 -> 3, 70253 -> 10, 70236 -> 3, 70237 -> 10, 70232 -> 1, 70250 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(70230), 10 -> HashSet(70238, 70249, 70246, 70251, 70245, 70239, 70244, 70237, 70248, 70247, 70250, 70252, 70253), 1 -> HashSet(70231, 70232), 9 -> HashSet(70248, 70247), 2 -> HashSet(70234, 70233), 7 -> HashSet(70238, 70237), 3 -> HashSet(70235, 70236), 11 -> HashSet(70255, 70256, 70254), 8 -> HashSet(70246, 70245, 70239, 70244))
  /* Beautified form:
  "GLOBAL.String.fromCharCode" (this, argumentsList, NewTarget) => {
    !!! "Etc"
    let length = codeUnits["length"]
    let elements = (new [])
    let nextIndex = 0i
    while (< nextIndex length) {
      let next = codeUnits[nextIndex]
      app __x0__ = (ToUint16 next)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let nextCU = __x0__
      append nextCU -> elements
      nextIndex = (+ nextIndex 1i)
    }
    app __x1__ = (WrapCompletion !!! "StringOp")
    return __x1__
  }
  */
}
