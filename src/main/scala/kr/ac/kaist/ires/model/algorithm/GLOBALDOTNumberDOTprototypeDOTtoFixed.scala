package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTNumberDOTprototypeDOTtoFixed {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Number.prototype.toFixed""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(69401), ILet(Id("""fractionDigits"""), ERef(RefId(Id("""__x0__""")))).setId(69402), IApp(Id("""__x1__"""), ERef(RefId(Id("""thisNumberValue"""))), List(ERef(RefId(Id("""this"""))))).setId(69404), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(69405), IReturn(ERef(RefId(Id("""__x1__""")))).setId(69406)).setId(69407), ISeq(List()).setId(69482)).setId(69409), ILet(Id("""x"""), ERef(RefId(Id("""__x1__""")))).setId(69410), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""fractionDigits"""))))).setId(69412), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(69413), IReturn(ERef(RefId(Id("""__x2__""")))).setId(69414)).setId(69415), ISeq(List()).setId(69489)).setId(69416), ILet(Id("""f"""), ERef(RefId(Id("""__x2__""")))).setId(69417), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""f"""))), EINum(0L)), EBOp(OLt, EINum(100L), ERef(RefId(Id("""f"""))))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_RangeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(69419), IReturn(ERef(RefId(Id("""__x3__""")))).setId(69420))).setId(69494), ISeq(List()).setId(69495)).setId(69422), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""NaN"""))).setId(69424), IReturn(ERef(RefId(Id("""__x4__""")))).setId(69425))).setId(69499), ISeq(List()).setId(69500)).setId(69427), ILet(Id("""s"""), EStr("""""")).setId(69429), IIf(EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(0L)), ISeq(List(IAssign(RefId(Id("""s""")), EStr("""-""")).setId(69431), IAssign(RefId(Id("""x""")), EUOp(ONeg, ERef(RefId(Id("""x"""))))).setId(69433))).setId(69505), ISeq(List()).setId(69506)).setId(69436), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""x"""))), EINum(9223372036854775807L))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""x"""))))).setId(69438), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(69439), IReturn(ERef(RefId(Id("""__x5__""")))).setId(69440)).setId(69441), ISeq(List()).setId(69512)).setId(69442), ILet(Id("""m"""), ERef(RefId(Id("""__x5__""")))).setId(69443))).setId(69515), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(69446), IIf(EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(0L)), ILet(Id("""m"""), EStr("""0""")).setId(69447), ILet(Id("""m"""), ENotSupported("""StringOp""")).setId(69449)).setId(69451), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""f"""))), EINum(0L))), ISeq(List(ILet(Id("""k"""), ERef(RefProp(RefId(Id("""m""")), EStr("""length""")))).setId(69453), IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""f"""))), ERef(RefId(Id("""k"""))))), ISeq(List(ILet(Id("""z"""), ENotSupported("""StringOp""")).setId(69455), IAssign(RefId(Id("""m""")), EBOp(OPlus, ERef(RefId(Id("""z"""))), ERef(RefId(Id("""m"""))))).setId(69457), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""f"""))), EINum(1L))).setId(69459))).setId(69524), ISeq(List()).setId(69525)).setId(69462), IExpr(ENotSupported("""Etc""")).setId(69446), IAssign(RefId(Id("""m""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""a"""))), EStr(""".""")), ERef(RefId(Id("""b"""))))).setId(69464))).setId(69529), ISeq(List()).setId(69530)).setId(69467))).setId(69532)).setId(69470), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, ERef(RefId(Id("""s"""))), ERef(RefId(Id("""m""")))))).setId(69472), IReturn(ERef(RefId(Id("""__x6__""")))).setId(69473))).setId(69536))
  val instToStepMap: Map[Int, Int] = HashMap(69431 -> 12, 69469 -> 17, 69443 -> 2, 69437 -> 13, 69468 -> 17, 69404 -> 1, 69449 -> 6, 69417 -> 2, 69426 -> 6, 69452 -> 17, 69429 -> 8, 69409 -> 1, 69458 -> 14, 69471 -> 17, 69473 -> 18, 69420 -> 4, 69462 -> 17, 69408 -> 3, 69403 -> 0, 69467 -> 17, 69412 -> 2, 69444 -> 2, 69435 -> 12, 69430 -> 8, 69472 -> 18, 69470 -> 17, 69423 -> 5, 69459 -> 14, 69445 -> 2, 69416 -> 2, 69442 -> 2, 69474 -> 18, 69427 -> 7, 69455 -> 14, 69438 -> 2, 69410 -> 1, 69448 -> 6, 69451 -> 17, 69424 -> 6, 69419 -> 4, 69434 -> 12, 69463 -> 17, 69466 -> 17, 69402 -> 0, 69446 -> 17, 69456 -> 14, 69432 -> 12, 69454 -> 17, 69411 -> 1, 69464 -> 17, 69465 -> 17, 69447 -> 6, 69422 -> 5, 69450 -> 6, 69418 -> 2, 69401 -> 0, 69433 -> 12, 69436 -> 13, 69457 -> 14, 69425 -> 6, 69421 -> 4, 69460 -> 14, 69461 -> 14, 69453 -> 17, 69428 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(69403, 69402, 69401), 5 -> HashSet(69423, 69446, 69422), 14 -> HashSet(69458, 69459, 69455, 69456, 69457, 69460, 69461), 1 -> HashSet(69409, 69410, 69411, 69404), 6 -> HashSet(69448, 69447, 69450, 69425, 69449, 69426, 69452, 69451, 69424), 9 -> HashSet(69454, 69453), 13 -> HashSet(69458, 69437, 69436, 69457), 2 -> HashSet(69438, 69443, 69418, 69417, 69412, 69444, 69445, 69416, 69442), 17 -> HashSet(69452, 69471, 69470, 69451, 69446, 69454, 69469, 69464, 69465, 69468, 69453, 69462, 69467, 69463, 69466), 12 -> HashSet(69435, 69455, 69431, 69434, 69456, 69432, 69433), 7 -> HashSet(69427, 69428), 3 -> HashSet(69408), 18 -> HashSet(69473, 69472, 69474), 16 -> HashSet(69446), 11 -> HashSet(69431, 69432), 8 -> HashSet(69429, 69430), 4 -> HashSet(69420, 69419, 69421), 15 -> HashSet(69462, 69463))
  /* Beautified form:
  "GLOBAL.Number.prototype.toFixed" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let fractionDigits = __x0__
    app __x1__ = (thisNumberValue this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let x = __x1__
    app __x2__ = (ToInteger fractionDigits)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let f = __x2__
    if (|| (< f 0i) (< 100i f)) {
      app __x3__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_RangeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x3__
    } else {}
    if (= x NaN) {
      app __x4__ = (WrapCompletion "NaN")
      return __x4__
    } else {}
    let s = ""
    if (< x 0i) {
      s = "-"
      x = (- x)
    } else {}
    if (! (< x 9223372036854775807i)) {
      app __x5__ = (ToString x)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let m = __x5__
    } else {
      !!! "Etc"
      if (= n 0i) let m = "0" else let m = !!! "StringOp"
      if (! (= f 0i)) {
        let k = m["length"]
        if (! (< f k)) {
          let z = !!! "StringOp"
          m = (+ z m)
          k = (+ f 1i)
        } else {}
        !!! "Etc"
        m = (+ (+ a ".") b)
      } else {}
    }
    app __x6__ = (WrapCompletion (+ s m))
    return __x6__
  }
  */
}
