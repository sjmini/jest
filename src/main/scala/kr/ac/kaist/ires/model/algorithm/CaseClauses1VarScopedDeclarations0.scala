package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CaseClauses1VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""CaseClauses1VarScopedDeclarations0""", List(Id("""this"""), Id("""CaseClauses"""), Id("""CaseClause""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""CaseClauses"""))), EStr("""VarScopedDeclarations""")).setId(35345), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(35346), IAccess(Id("""__x1__"""), ERef(RefId(Id("""CaseClause"""))), EStr("""VarScopedDeclarations""")).setId(35348), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(35350), ILet(Id("""__x3__"""), EINum(0L)).setId(35351), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(35352), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(35349), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(35353))).setId(35369)).setId(35355), IReturn(ERef(RefId(Id("""declarations""")))).setId(35358))).setId(35372))
  val instToStepMap: Map[Int, Int] = HashMap(35345 -> 0, 35357 -> 1, 35358 -> 2, 35348 -> 1, 35355 -> 1, 35359 -> 2, 35347 -> 0, 35346 -> 0, 35351 -> 1, 35350 -> 1, 35356 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(35345, 35347, 35346), 1 -> HashSet(35357, 35348, 35355, 35351, 35350, 35356), 2 -> HashSet(35358, 35359))
  /* Beautified form:
  "CaseClauses1VarScopedDeclarations0" (this, CaseClauses, CaseClause) => {
    access __x0__ = (CaseClauses "VarScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (CaseClause "VarScopedDeclarations")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> declarations
      __x3__ = (+ __x3__ 1i)
    }
    return declarations
  }
  */
}
