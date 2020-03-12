package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementList1TopLevelVarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1TopLevelVarScopedDeclarations0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(26651), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(26652), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""TopLevelVarScopedDeclarations""")).setId(26654), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26656), ILet(Id("""__x3__"""), EINum(0L)).setId(26657), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26658), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(26655), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26659))).setId(26675)).setId(26661), IReturn(ERef(RefId(Id("""declarations""")))).setId(26664))).setId(26678))
  val instToStepMap: Map[Int, Int] = HashMap(26661 -> 1, 26657 -> 1, 26656 -> 1, 26652 -> 0, 26663 -> 1, 26651 -> 0, 26654 -> 1, 26664 -> 2, 26653 -> 0, 26665 -> 2, 26662 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26652, 26651, 26653), 1 -> HashSet(26661, 26657, 26656, 26662, 26663, 26654), 2 -> HashSet(26665, 26664))
  /* Beautified form:
  "StatementList1TopLevelVarScopedDeclarations0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "TopLevelVarScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (StatementListItem "TopLevelVarScopedDeclarations")
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
