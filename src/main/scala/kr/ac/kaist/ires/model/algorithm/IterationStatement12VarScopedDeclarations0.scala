package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement12VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement12VarScopedDeclarations0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(ILet(Id("""declarations"""), EList(List(ERef(RefId(Id("""ForBinding""")))))).setId(32490), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32492), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))).setId(32494), ILet(Id("""__x2__"""), EINum(0L)).setId(32495), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(32496), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""declarations""")))).setId(32493), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(32497))).setId(32512)).setId(32499), IReturn(ERef(RefId(Id("""declarations""")))).setId(32502))).setId(32515))
  val instToStepMap: Map[Int, Int] = HashMap(32501 -> 1, 32490 -> 0, 32494 -> 1, 32491 -> 0, 32495 -> 1, 32500 -> 1, 32499 -> 1, 32502 -> 2, 32492 -> 1, 32503 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32490, 32491), 1 -> HashSet(32501, 32494, 32495, 32500, 32492, 32499), 2 -> HashSet(32503, 32502))
  /* Beautified form:
  "IterationStatement12VarScopedDeclarations0" (this, ForBinding, AssignmentExpression, Statement) => {
    let declarations = (new [ForBinding])
    access __x0__ = (Statement "VarScopedDeclarations")
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let __x3__ = __x1__[__x2__]
      append __x3__ -> declarations
      __x2__ = (+ __x2__ 1i)
    }
    return declarations
  }
  */
}
