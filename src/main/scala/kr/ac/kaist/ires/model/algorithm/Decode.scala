package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object Decode {
  val length: Int = 2
  val func: Func = Func("""Decode""", List(Id("""string"""), Id("""reservedSet""")), None, ISeq(List(ILet(Id("""strLen"""), ERef(RefProp(RefId(Id("""string""")), EStr("""length""")))).setId(63233), ILet(Id("""R"""), EStr("""""")).setId(63235), ILet(Id("""k"""), EINum(0L)).setId(63237), IWhile(EBool(true), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""strLen""")))), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(63239), IReturn(ERef(RefId(Id("""__x0__""")))).setId(63240))).setId(63241), ISeq(List()).setId(63242)).setId(63243), IExpr(ENotSupported("""Etc""")).setId(63245), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""C"""))), EStr("""%"""))), ILet(Id("""S"""), ENotSupported("""StringOp""")).setId(63246), ISeq(List(ILet(Id("""start"""), ERef(RefId(Id("""k""")))).setId(63249), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(2L))).setId(63251), IIf(ENotSupported("""NumberOp"""), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(63245), IIf(EUOp(ONot, EContains(ERef(RefId(Id("""reservedSet"""))), ERef(RefId(Id("""C"""))))), ILet(Id("""S"""), ENotSupported("""StringOp""")).setId(63253), IExpr(ENotSupported("""Etc""")).setId(63245)).setId(63257))).setId(63259), ISeq(List(IExpr(ENotSupported("""Etc""")).setId(63245), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""n"""))), EINum(1L)), EBOp(OLt, EINum(4L), ERef(RefId(Id("""n"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_URIErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(63260), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63261))).setId(63262), ISeq(List()).setId(63242)).setId(63263), IExpr(ENotSupported("""Etc""")).setId(63245), IAssign(RefProp(RefId(Id("""Octets""")), EINum(0L)), ERef(RefId(Id("""B""")))).setId(63265), IExpr(ENotSupported("""Etc""")).setId(63245), ILet(Id("""j"""), EINum(1L)).setId(63267), IWhile(EBOp(OLt, ERef(RefId(Id("""j"""))), ERef(RefId(Id("""n""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(63269), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(2L))).setId(63271), IAssign(RefProp(RefId(Id("""Octets""")), ERef(RefId(Id("""j""")))), ERef(RefId(Id("""B""")))).setId(63273), IAssign(RefId(Id("""j""")), EBOp(OPlus, ERef(RefId(Id("""j"""))), EINum(1L))).setId(63275))).setId(63277)).setId(63278), IExpr(ENotSupported("""Etc""")).setId(63245), IExpr(ENotSupported("""Etc""")).setId(63245), ILet(Id("""S"""), ENotSupported("""StringOp""")).setId(63280))).setId(63282)).setId(63283))).setId(63285)).setId(63286), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""S"""))))).setId(63288), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(63290))).setId(63292)).setId(63293))).setId(-1))
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
