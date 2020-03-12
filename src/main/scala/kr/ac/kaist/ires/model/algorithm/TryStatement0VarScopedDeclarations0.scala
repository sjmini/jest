package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement0VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement0VarScopedDeclarations0""", List(Id("""this"""), Id("""Block"""), Id("""Catch""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarScopedDeclarations""")).setId(37222), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(37223), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""VarScopedDeclarations""")).setId(37225), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37227), ILet(Id("""__x3__"""), EINum(0L)).setId(37228), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37229), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(37226), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37230))).setId(37246)).setId(37232), IReturn(ERef(RefId(Id("""declarations""")))).setId(37235))).setId(37249))
  val instToStepMap: Map[Int, Int] = HashMap(37233 -> 1, 37224 -> 0, 37236 -> 2, 37227 -> 1, 37223 -> 0, 37235 -> 2, 37232 -> 1, 37234 -> 1, 37225 -> 1, 37228 -> 1, 37222 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37224, 37223, 37222), 1 -> HashSet(37233, 37227, 37232, 37228, 37234, 37225), 2 -> HashSet(37236, 37235))
  /* Beautified form:
  "TryStatement0VarScopedDeclarations0" (this, Block, Catch) => {
    access __x0__ = (Block "VarScopedDeclarations")
    let declarations = __x0__
    access __x1__ = (Catch "VarScopedDeclarations")
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
