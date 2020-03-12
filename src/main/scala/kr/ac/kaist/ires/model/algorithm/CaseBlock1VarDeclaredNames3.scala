package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1VarDeclaredNames3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1VarDeclaredNames3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""VarDeclaredNames""")).setId(35124), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(35125))).setId(35150), ILet(Id("""names"""), EList(List())).setId(35127)).setId(35129), IAccess(Id("""__x1__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""VarDeclaredNames""")).setId(35131), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(35133), ILet(Id("""__x3__"""), EINum(0L)).setId(35134), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(35135), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(35132), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(35136))).setId(35159)).setId(35138), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(ERef(RefId(Id("""names""")))).setId(35141), ISeq(List()).setId(35162)).setId(35144), IExpr(ENotSupported("""Etc""")).setId(35146))).setId(35165))
  val instToStepMap: Map[Int, Int] = HashMap(35134 -> 2, 35130 -> 1, 35125 -> 0, 35133 -> 2, 35129 -> 1, 35126 -> 0, 35142 -> 3, 35138 -> 2, 35127 -> 1, 35141 -> 3, 35124 -> 0, 35144 -> 4, 35128 -> 1, 35131 -> 2, 35146 -> 5, 35140 -> 2, 35145 -> 4, 35139 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(35125, 35126, 35124), 5 -> HashSet(35146), 1 -> HashSet(35130, 35129, 35127, 35128), 2 -> HashSet(35140, 35134, 35133, 35138, 35139, 35131), 3 -> HashSet(35142, 35141), 4 -> HashSet(35145, 35144))
  /* Beautified form:
  "CaseBlock1VarDeclaredNames3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "VarDeclaredNames")
      let names = __x0__
    } else let names = (new [])
    access __x1__ = (DefaultClause "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    if (= CaseClauses1 absent) return names else {}
    !!! "Etc"
  }
  */
}
