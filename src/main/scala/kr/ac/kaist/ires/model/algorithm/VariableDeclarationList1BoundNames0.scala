package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object VariableDeclarationList1BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""VariableDeclarationList1BoundNames0""", List(Id("""this"""), Id("""VariableDeclarationList"""), Id("""VariableDeclaration""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""VariableDeclarationList"""))), EStr("""BoundNames""")).setId(27431), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(27432), IAccess(Id("""__x1__"""), ERef(RefId(Id("""VariableDeclaration"""))), EStr("""BoundNames""")).setId(27434), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(27436), ILet(Id("""__x3__"""), EINum(0L)).setId(27437), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(27438), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(27435), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(27439))).setId(27455)).setId(27441), IReturn(ERef(RefId(Id("""names""")))).setId(27444))).setId(27458))
  val instToStepMap: Map[Int, Int] = HashMap(27442 -> 1, 27432 -> 0, 27445 -> 2, 27436 -> 1, 27441 -> 1, 27433 -> 0, 27431 -> 0, 27434 -> 1, 27443 -> 1, 27444 -> 2, 27437 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27432, 27433, 27431), 1 -> HashSet(27442, 27436, 27441, 27437, 27434, 27443), 2 -> HashSet(27445, 27444))
  /* Beautified form:
  "VariableDeclarationList1BoundNames0" (this, VariableDeclarationList, VariableDeclaration) => {
    access __x0__ = (VariableDeclarationList "BoundNames")
    let names = __x0__
    access __x1__ = (VariableDeclaration "BoundNames")
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
