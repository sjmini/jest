package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object Decode {
  val length: Int = 2
  val func: Func = Func("""Decode""", List(Id("""string"""), Id("""reservedSet""")), None, ISeq(List(ILet(Id("""strLen"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))).setId(63233), ILet(Id("""R"""), EStr("""""")).setId(63235), ILet(Id("""k"""), EINum(0L)).setId(63237), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""strLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(63239), IReturn(ERef(RefId(Id("""__x0__""")))).setId(63240))).setId(63300), ISeq(List()).setId(63301)).setId(63243), IExpr(ENotSupported("""Etc""")).setId(63245), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""C"""))), EStr("""%"""))), ILet(Id("""S"""), ENotSupported("""StringOp""")).setId(63246), ISeq(List(ILet(Id("""start"""), ERef(RefId(Id("""k""")))).setId(63249), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(2L))).setId(63251), IIf(ENotSupported("""NumberOp"""), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(63245), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""reservedSet"""))), ERef(RefId(Id("""C"""))))), ILet(Id("""S"""), ENotSupported("""StringOp""")).setId(63253), IExpr(ENotSupported("""Etc""")).setId(63245)).setId(63257))).setId(63314), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(63245), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(1L)), EBOp(OLt, EINum(4L), ERef(RefId(Id("""n"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_URIErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63260), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63261))).setId(63318), ISeq(List()).setId(63319)).setId(63263), IExpr(ENotSupported("""Etc""")).setId(63245), IAssign(RefProp(RefId(Id("""Octets""")), EINum(0L)), ERef(RefId(Id("""B""")))).setId(63265), IExpr(ENotSupported("""Etc""")).setId(63245), ILet(Id("""j"""), EINum(1L)).setId(63267), IWhile(EBOp(OLt, ERef(RefId(Id("""j"""))), ERef(RefId(Id("""n""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(63269), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(2L))).setId(63271), IAssign(RefProp(RefId(Id("""Octets""")), ERef(RefId(Id("""j""")))), ERef(RefId(Id("""B""")))).setId(63273), IAssign(RefId(Id("""j""")), EBOp(OPlus, ERef(RefId(Id("""j"""))), EINum(1L))).setId(63275))).setId(63333)).setId(63278), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), ILet(Id("""S"""), ENotSupported("""StringOp""")).setId(63280))).setId(63338)).setId(63283))).setId(63340)).setId(63286), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""S"""))))).setId(63288), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(63290))).setId(63344)).setId(63293))).setId(63346))
  val instToStepMap: Map[Int, Int] = HashMap(63263 -> 50, 63250 -> 50, 63254 -> 23, 63271 -> 47, 63274 -> 47, 63243 -> 52, 63270 -> 47, 63267 -> 50, 63282 -> 50, 63233 -> 0, 63265 -> 50, 63286 -> 52, 63269 -> 47, 63237 -> 2, 63234 -> 0, 63276 -> 47, 63251 -> 50, 63244 -> 52, 63289 -> 52, 63257 -> 26, 63277 -> 47, 63272 -> 47, 63240 -> 5, 63245 -> 52, 63268 -> 50, 63236 -> 1, 63249 -> 50, 63281 -> 50, 63248 -> 10, 63280 -> 50, 63292 -> 52, 63253 -> 23, 63285 -> 50, 63260 -> 31, 63258 -> 26, 63273 -> 47, 63290 -> 52, 63241 -> 5, 63288 -> 52, 63261 -> 31, 63278 -> 50, 63256 -> 26, 63242 -> 50, 63284 -> 50, 63293 -> 52, 63259 -> 26, 63252 -> 50, 63246 -> 10, 63264 -> 50, 63291 -> 52, 63239 -> 5, 63247 -> 10, 63283 -> 50, 63262 -> 31, 63279 -> 50, 63275 -> 47, 63266 -> 50, 63238 -> 2, 63255 -> 23, 63235 -> 1, 63287 -> 52)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(63233, 63234), 5 -> HashSet(63240, 63241, 63239), 10 -> HashSet(63248, 63246, 63247), 42 -> HashSet(63245), 1 -> HashSet(63236, 63235), 6 -> HashSet(63244, 63243), 33 -> HashSet(63245), 2 -> HashSet(63237, 63238), 44 -> HashSet(63245), 49 -> HashSet(63245), 7 -> HashSet(63245), 35 -> HashSet(63245), 48 -> HashSet(63245), 43 -> HashSet(63245), 52 -> HashSet(63286, 63244, 63289, 63245, 63292, 63290, 63288, 63293, 63291, 63243, 63287), 14 -> HashSet(63245), 20 -> HashSet(63245), 46 -> HashSet(63273, 63274), 29 -> HashSet(63242), 13 -> HashSet(63250, 63249), 41 -> HashSet(63245), 45 -> HashSet(63272, 63271), 17 -> HashSet(63251, 63252), 32 -> HashSet(63263, 63264), 34 -> HashSet(63265, 63266), 50 -> HashSet(63263, 63250, 63286, 63251, 63245, 63268, 63280, 63285, 63284, 63252, 63264, 63283, 63279, 63266, 63287, 63267, 63282, 63265, 63249, 63281, 63278, 63242), 16 -> HashSet(63245), 31 -> HashSet(63260, 63261, 63262), 40 -> HashSet(63269, 63270), 26 -> HashSet(63257, 63245, 63258, 63256, 63259), 23 -> HashSet(63254, 63253, 63255), 36 -> HashSet(63268, 63267), 30 -> HashSet(63245), 51 -> HashSet(63289, 63288), 47 -> HashSet(63269, 63276, 63245, 63273, 63278, 63271, 63274, 63279, 63275, 63270, 63277, 63272), 15 -> HashSet(63245))
  /* Beautified form:
  "Decode" (string, reservedSet) => {
    let strLen = string["length"]
    let R = ""
    let k = 0i
    while true {
      if (= k strLen) {
        app __x0__ = (WrapCompletion R)
        return __x0__
      } else {}
      !!! "Etc"
      if (! (= C "%")) let S = !!! "StringOp" else {
        let start = k
        !!! "Etc"
        !!! "Etc"
        !!! "Etc"
        k = (+ k 2i)
        if !!! "NumberOp" {
          !!! "Etc"
          if (! (contains reservedSet C)) let S = !!! "StringOp" else !!! "Etc"
        } else {
          !!! "Etc"
          if (|| (= n 1i) (< 4i n)) {
            app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_URIErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x1__
          } else {}
          !!! "Etc"
          Octets[0i] = B
          !!! "Etc"
          let j = 1i
          while (< j n) {
            k = (+ k 1i)
            !!! "Etc"
            !!! "Etc"
            !!! "Etc"
            !!! "Etc"
            k = (+ k 2i)
            Octets[j] = B
            j = (+ j 1i)
          }
          !!! "Etc"
          !!! "Etc"
          let S = !!! "StringOp"
        }
      }
      R = (+ R S)
      k = (+ k 1i)
    }
  }
  */
}
