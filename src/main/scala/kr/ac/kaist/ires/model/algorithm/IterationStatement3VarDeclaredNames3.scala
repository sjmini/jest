package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IterationStatement3VarDeclaredNames3 {
  val length: Int = 0
  val func: Func = Func("""IterationStatement3VarDeclaredNames3""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""Expression0"""), Id("""Expression1"""), Id("""Statement""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""BoundNames""")).setId(31045), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(31046), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement"""))), EStr("""VarDeclaredNames""")).setId(31048), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(31050), ILet(Id("""__x3__"""), EINum(0L)).setId(31051), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(31052), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(31049), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(31053))).setId(31069)).setId(31055), IReturn(ERef(RefId(Id("""names""")))).setId(31058))).setId(31072))
  val instToStepMap: Map[Int, Int] = HashMap(31047 -> 0, 31056 -> 1, 31051 -> 1, 31058 -> 2, 31048 -> 1, 31055 -> 1, 31057 -> 1, 31045 -> 0, 31050 -> 1, 31046 -> 0, 31059 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(31047, 31045, 31046), 1 -> HashSet(31056, 31051, 31048, 31055, 31057, 31050), 2 -> HashSet(31058, 31059))
  /* Beautified form:
  "IterationStatement3VarDeclaredNames3" (this, VariableDeclarationList, Expression0, Expression1, Statement) => {
    access __x0__ = (VariableDeclarationList "BoundNames")
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
