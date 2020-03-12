package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StatementList1TopLevelLexicallyScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""StatementList1TopLevelLexicallyScopedDeclarations0""", List(Id("""this"""), Id("""StatementList"""), Id("""StatementListItem""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""StatementList"""))), EStr("""TopLevelLexicallyScopedDeclarations""")).setId(26476), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(26477), IAccess(Id("""__x1__"""), ERef(RefId(Id("""StatementListItem"""))), EStr("""TopLevelLexicallyScopedDeclarations""")).setId(26479), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(26481), ILet(Id("""__x3__"""), EINum(0L)).setId(26482), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(26483), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(26480), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(26484))).setId(26500)).setId(26486), IReturn(ERef(RefId(Id("""declarations""")))).setId(26489))).setId(26503))
  val instToStepMap: Map[Int, Int] = HashMap(26488 -> 1, 26489 -> 2, 26478 -> 0, 26477 -> 0, 26486 -> 1, 26481 -> 1, 26476 -> 0, 26482 -> 1, 26487 -> 1, 26479 -> 1, 26490 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(26478, 26477, 26476), 1 -> HashSet(26488, 26486, 26481, 26482, 26487, 26479), 2 -> HashSet(26489, 26490))
  /* Beautified form:
  "StatementList1TopLevelLexicallyScopedDeclarations0" (this, StatementList, StatementListItem) => {
    access __x0__ = (StatementList "TopLevelLexicallyScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (StatementListItem "TopLevelLexicallyScopedDeclarations")
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
