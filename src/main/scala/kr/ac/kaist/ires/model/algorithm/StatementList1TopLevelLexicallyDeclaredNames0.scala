package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementList1TopLevelLexicallyDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1TopLevelLexicallyDeclaredNames0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyDeclaredNames""")).setId(26399), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(26400), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""TopLevelLexicallyDeclaredNames""")).setId(26402), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26404), ILet(Id("""__x3__"""), EINum(0L)).setId(26405), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26406), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(26403), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26407))).setId(26423)).setId(26409), IReturn(ERef(RefId(Id("""names""")))).setId(26412))).setId(26426))
  val instToStepMap: Map[Int, Int] = HashMap(26413 -> 2, 26410 -> 1, 26405 -> 1, 26402 -> 1, 26411 -> 1, 26404 -> 1, 26401 -> 0, 26399 -> 0, 26412 -> 2, 26400 -> 0, 26409 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26400, 26401, 26399), 1 -> HashSet(26409, 26410, 26405, 26402, 26411, 26404), 2 -> HashSet(26413, 26412))
  /* Beautified form:
  "StatementList1TopLevelLexicallyDeclaredNames0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "TopLevelLexicallyDeclaredNames")
    let names = __x0__
    access __x1__ = (StatementListItem "TopLevelLexicallyDeclaredNames")
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
