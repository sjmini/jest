package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseBlock1LexicallyDeclaredNames3 {
  val length: Int = 0
  val func: Func = Func("""CaseBlock1LexicallyDeclaredNames3""", List(Id("""this"""), Id("""CaseClauses0"""), Id("""DefaultClause"""), Id("""CaseClauses1""")), None, ISeq(List(IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""CaseClauses0"""))), EAbsent)), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses0"""))), EStr("""LexicallyDeclaredNames""")).setId(34812), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(34813))).setId(34838), ILet(Id("""names"""), EList(List())).setId(34815)).setId(34817), IAccess(Id("""__x1__"""), ERef(RefId(Id("""DefaultClause"""))), EStr("""LexicallyDeclaredNames""")).setId(34819), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(34821), ILet(Id("""__x3__"""), EINum(0L)).setId(34822), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(34823), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(34820), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(34824))).setId(34847)).setId(34826), IIf(EBOp(OEq, ERef(RefId(Id("""CaseClauses1"""))), EAbsent), IReturn(ERef(RefId(Id("""names""")))).setId(34829), ISeq(List()).setId(34850)).setId(34832), IExpr(ENotSupported("""Etc""")).setId(34834))).setId(34853))
  val instToStepMap: Map[Int, Int] = HashMap(34829 -> 3, 34812 -> 0, 34813 -> 0, 34830 -> 3, 34826 -> 2, 34817 -> 1, 34834 -> 5, 34828 -> 2, 34815 -> 1, 34832 -> 4, 34816 -> 1, 34833 -> 4, 34822 -> 2, 34819 -> 2, 34821 -> 2, 34818 -> 1, 34827 -> 2, 34814 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(34812, 34813, 34814), 5 -> HashSet(34834), 1 -> HashSet(34818, 34817, 34815, 34816), 2 -> HashSet(34826, 34821, 34827, 34828, 34822, 34819), 3 -> HashSet(34829, 34830), 4 -> HashSet(34832, 34833))
  /* Beautified form:
  "CaseBlock1LexicallyDeclaredNames3" (this, CaseClauses0, DefaultClause, CaseClauses1) => {
    if (! (= CaseClauses0 absent)) {
      access __x0__ = (CaseClauses0 "LexicallyDeclaredNames")
      let names = __x0__
    } else let names = (new [])
    access __x1__ = (DefaultClause "LexicallyDeclaredNames")
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
