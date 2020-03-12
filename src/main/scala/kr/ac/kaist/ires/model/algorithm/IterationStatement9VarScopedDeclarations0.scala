package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement9VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement9VarScopedDeclarations0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(ILet(Id("""declarations"""), EList(List(ERef(RefId(Id("""ForBinding""")))))).setId(32453), IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarScopedDeclarations""")).setId(32455), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))).setId(32457), ILet(Id("""__x2__"""), EINum(0L)).setId(32458), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x3__"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(32459), IAppend(ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""declarations""")))).setId(32456), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(32460))).setId(32475)).setId(32462), IReturn(ERef(RefId(Id("""declarations""")))).setId(32465))).setId(32478))
  val instToStepMap: Map[Int, Int] = HashMap(32465 -> 2, 32458 -> 1, 32462 -> 1, 32455 -> 1, 32463 -> 1, 32454 -> 0, 32457 -> 1, 32464 -> 1, 32453 -> 0, 32466 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32454, 32453), 1 -> HashSet(32458, 32462, 32455, 32463, 32457, 32464), 2 -> HashSet(32465, 32466))
  /* Beautified form:
  "IterationStatement9VarScopedDeclarations0" (this, ForBinding, AssignmentExpression, Statement) => {
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
