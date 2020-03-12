package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement12VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement12VarDeclaredNames0""", List(Id("""this"""), Id("""ForBinding"""), Id("""AssignmentExpression"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")).setId(32279), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(32280), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(32282), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(32284), ILet(Id("""__x3__"""), EINum(0L)).setId(32285), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(32286), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(32283), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(32287))).setId(32303)).setId(32289), IReturn(ERef(RefId(Id("""names""")))).setId(32292))).setId(32306))
  val instToStepMap: Map[Int, Int] = HashMap(32289 -> 1, 32293 -> 2, 32290 -> 1, 32279 -> 0, 32282 -> 1, 32280 -> 0, 32281 -> 0, 32292 -> 2, 32284 -> 1, 32285 -> 1, 32291 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32279, 32280, 32281), 1 -> HashSet(32289, 32290, 32282, 32284, 32285, 32291), 2 -> HashSet(32293, 32292))
  /* Beautified form:
  "IterationStatement12VarDeclaredNames0" (this, ForBinding, AssignmentExpression, Statement) => {
    access __x0__ = (ForBinding "BoundNames")
    let names = __x0__
    access __x1__ = (Statement "VarDeclaredNames")
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
