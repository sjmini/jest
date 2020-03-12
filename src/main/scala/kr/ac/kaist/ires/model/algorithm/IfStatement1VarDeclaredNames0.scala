package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IfStatement1VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""IfStatement1VarDeclaredNames0""", List(Id("""this"""), Id("""Expression"""), Id("""Statement0"""), Id("""Statement1""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Statement0"""))), EStr("""VarDeclaredNames""")).setId(30326), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(30327), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Statement1"""))), EStr("""VarDeclaredNames""")).setId(30329), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(30331), ILet(Id("""__x3__"""), EINum(0L)).setId(30332), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(30333), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(30330), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(30334))).setId(30350)).setId(30336), IReturn(ERef(RefId(Id("""names""")))).setId(30339))).setId(30353))
  val instToStepMap: Map[Int, Int] = HashMap(30340 -> 2, 30329 -> 1, 30339 -> 2, 30328 -> 0, 30338 -> 1, 30327 -> 0, 30337 -> 1, 30336 -> 1, 30331 -> 1, 30326 -> 0, 30332 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(30328, 30327, 30326), 1 -> HashSet(30329, 30338, 30337, 30336, 30331, 30332), 2 -> HashSet(30340, 30339))
  /* Beautified form:
  "IfStatement1VarDeclaredNames0" (this, Expression, Statement0, Statement1) => {
    access __x0__ = (Statement0 "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (Statement1 "VarDeclaredNames")
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
