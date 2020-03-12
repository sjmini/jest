package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumberDOTprototypeDOTtoExponential {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toExponential""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69181), ILet(Id("""fractionDigits"""), ERef(RefId(Id("""__x0__""")))).setId(69182), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(69184), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69185), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69186)).setId(69187), ISeq(List()).setId(69275)).setId(69189), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(69190), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fractionDigits"""))))).setId(69192), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(69193), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69194)).setId(69195), ISeq(List()).setId(69282)).setId(69196), ILet(Id("""f"""), ERef(RefId(Id("""__x2__""")))).setId(69197), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(69199), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69200))).setId(69287), ISeq(List()).setId(69288)).setId(69202), ILet(Id("""s"""), EStr("""""")).setId(69204), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")).setId(69206), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))).setId(69208))).setId(69293), ISeq(List()).setId(69294)).setId(69211), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), EStr("""Infinity""")))).setId(69213), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69214))).setId(69298), ISeq(List()).setId(69299)).setId(69217), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""f"""))), EINum(0L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""f"""))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69219), IReturn(ERef(RefId(Id("""__x5__""")))).setId(69220))).setId(69303), ISeq(List()).setId(69304)).setId(69222), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69224), ILet(Id("""e"""), EINum(0L)).setId(69226))).setId(69308), ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""fractionDigits"""))), EUndef)), IExpr(ENotSupported("""Etc""")).setId(69229), IExpr(ENotSupported("""Etc""")).setId(69229)).setId(69232), ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69234))).setId(69313)).setId(69237), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""f"""))), EINum(0L))), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69229), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))).setId(69239))).setId(69317), ISeq(List()).setId(69318)).setId(69242), IIf(EBOp(OEq, ERef(RefId(Id("""e"""))), EINum(0L)), ISeq(List(ILet(Id("""c"""), EStr("""+""")).setId(69244), ILet(Id("""d"""), EStr("""0""")).setId(69246))).setId(69322), ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""e""")))), ILet(Id("""c"""), EStr("""+""")).setId(69249), ISeq(List(ILet(Id("""c"""), EStr("""-""")).setId(69251), IAssign(RefId(Id("""e""")), EUOp(ONeg, ERef(RefId(Id("""e"""))))).setId(69253))).setId(69326)).setId(69256), ILet(Id("""d"""), ENotSupported("""StringOp""")).setId(69258))).setId(69329)).setId(69261), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""m"""))), EStr("""e""")), ERef(RefId(Id("""c""")))), ERef(RefId(Id("""d"""))))).setId(69263), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69265), IReturn(ERef(RefId(Id("""__x6__""")))).setId(69266))).setId(69334))
  val instToStepMap: Map[Int, Int] = HashMap(69205 -> 6, 69211 -> 11, 69215 -> 14, 69202 -> 5, 69260 -> 48, 69237 -> 30, 69226 -> 21, 69188 -> 47, 69241 -> 34, 69209 -> 10, 69252 -> 47, 69198 -> 2, 69230 -> 26, 69245 -> 39, 69201 -> 4, 69213 -> 14, 69212 -> 11, 69266 -> 50, 69233 -> 30, 69220 -> 16, 69267 -> 50, 69204 -> 6, 69181 -> 0, 69227 -> 21, 69191 -> 1, 69264 -> 49, 69242 -> 35, 69210 -> 10, 69259 -> 48, 69223 -> 17, 69246 -> 39, 69255 -> 47, 69214 -> 14, 69263 -> 49, 69219 -> 16, 69256 -> 48, 69199 -> 4, 69251 -> 47, 69236 -> 30, 69231 -> 29, 69182 -> 0, 69232 -> 30, 69258 -> 48, 69222 -> 17, 69243 -> 35, 69207 -> 10, 69250 -> 42, 69190 -> 1, 69228 -> 21, 69239 -> 34, 69200 -> 4, 69183 -> 0, 69254 -> 47, 69240 -> 34, 69235 -> 30, 69203 -> 5, 69218 -> 15, 69262 -> 48, 69208 -> 10, 69247 -> 39, 69238 -> 30, 69206 -> 10, 69184 -> 1, 69248 -> 39, 69257 -> 48, 69221 -> 16, 69225 -> 21, 69189 -> 1, 69244 -> 39, 69249 -> 42, 69216 -> 14, 69265 -> 50, 69229 -> 34, 69224 -> 21, 69196 -> 2, 69253 -> 47, 69197 -> 2, 69234 -> 30, 69217 -> 15, 69192 -> 2, 69261 -> 48)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(69181, 69182, 69183), 5 -> HashSet(69203, 69202), 10 -> HashSet(69209, 69210, 69207, 69208, 69206), 42 -> HashSet(69250, 69249), 14 -> HashSet(69213, 69214, 69215, 69216), 1 -> HashSet(69191, 69190, 69184, 69189), 6 -> HashSet(69205, 69204), 9 -> HashSet(69207, 69206), 2 -> HashSet(69198, 69192, 69196, 69197), 49 -> HashSet(69264, 69263), 39 -> HashSet(69245, 69246, 69247, 69248, 69244), 48 -> HashSet(69260, 69259, 69256, 69258, 69262, 69257, 69261), 11 -> HashSet(69212, 69211), 26 -> HashSet(69230, 69229), 30 -> HashSet(69237, 69233, 69236, 69232, 69235, 69238, 69234), 4 -> HashSet(69201, 69199, 69200), 20 -> HashSet(69225, 69224), 46 -> HashSet(69252, 69251), 29 -> HashSet(69233, 69231, 69232, 69229), 38 -> HashSet(69245, 69244), 21 -> HashSet(69226, 69227, 69228, 69225, 69224), 33 -> HashSet(69229), 34 -> HashSet(69241, 69239, 69240, 69229), 45 -> HashSet(69188), 17 -> HashSet(69223, 69222), 3 -> HashSet(69188), 35 -> HashSet(69242, 69243), 50 -> HashSet(69266, 69267, 69265), 16 -> HashSet(69220, 69219, 69221), 47 -> HashSet(69188, 69252, 69255, 69254, 69257, 69253, 69256, 69251), 15 -> HashSet(69218, 69217))
  /* Beautified form:
  "GLOBAL.Number.prototype.toExponential" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (= x NaN) {
      app __x3__ = (WrapCompletion "NaN")
      return __x3__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (= x Infinity) {
      app __x4__ = (WrapCompletion (+ s "Infinity"))
      return __x4__
    } else {}
    if (|| (< f 0i) (< 100i f)) {
      app __x5__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x5__
    } else {}
    if (= x 0i) {
      let m = !!! "StringOp"
      let e = 0i
    } else {
      if (! (= fractionDigits undefined)) !!! "Etc" else !!! "Etc"
      let m = !!! "StringOp"
    }
    if (! (= f 0i)) {
      !!! "Etc"
      m = (+ (+ a ".") b)
    } else {}
    if (= e 0i) {
      let c = "+"
      let d = "0"
    } else {
      if (< 0i e) let c = "+" else {
        let c = "-"
        e = (- e)
      }
      let d = !!! "StringOp"
    }
    m = (+ (+ (+ m "e") c) d)
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }
  */
}
