package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClauses1LexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1LexicallyDeclaredNames0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""LexicallyDeclaredNames""")).setId(34872), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(34873), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""LexicallyDeclaredNames""")).setId(34875), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(34877), ILet(Id("""__x3__"""), EINum(0L)).setId(34878), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(34879), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(34876), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(34880))).setId(34896)).setId(34882), IReturn(ERef(RefId(Id("""names""")))).setId(34885))).setId(34899))
  val instToStepMap: Map[Int, Int] = HashMap(34883 -> 1, 34877 -> 1, 34873 -> 0, 34882 -> 1, 34872 -> 0, 34878 -> 1, 34875 -> 1, 34886 -> 2, 34884 -> 1, 34885 -> 2, 34874 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(34873, 34872, 34874), 1 -> HashSet(34883, 34877, 34882, 34878, 34875, 34884), 2 -> HashSet(34885, 34886))
  /* Beautified form:
  "CaseClauses1LexicallyDeclaredNames0" (this, CaseClauses, CaseClause) => {
    access __x0__ = (CaseClauses "LexicallyDeclaredNames")
    let names = __x0__
    access __x1__ = (CaseClause "LexicallyDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    return names
  }
  */
}
