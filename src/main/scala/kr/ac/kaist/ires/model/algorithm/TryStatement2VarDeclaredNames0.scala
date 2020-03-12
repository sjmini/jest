package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement2VarDeclaredNames0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2VarDeclaredNames0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarDeclaredNames""")).setId(37146), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(37147), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""VarDeclaredNames""")).setId(37149), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37151), ILet(Id("""__x3__"""), EINum(0L)).setId(37152), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37153), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(37150), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37154))).setId(37180)).setId(37156), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Finally"""))), EStr("""VarDeclaredNames""")).setId(37159), ILet(Id("""__x6__"""), ERef(RefId(Id("""__x5__""")))).setId(37161), ILet(Id("""__x7__"""), EINum(0L)).setId(37162), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x8__"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))).setId(37163), IAppend(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""names""")))).setId(37160), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L))).setId(37164))).setId(37188)).setId(37166), IReturn(ERef(RefId(Id("""names""")))).setId(37169))).setId(37191))
  val instToStepMap: Map[Int, Int] = HashMap(37159 -> 2, 37146 -> 0, 37167 -> 2, 37162 -> 2, 37157 -> 1, 37169 -> 3, 37156 -> 1, 37148 -> 0, 37158 -> 1, 37170 -> 3, 37147 -> 0, 37149 -> 1, 37166 -> 2, 37152 -> 1, 37161 -> 2, 37151 -> 1, 37168 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37146, 37148, 37147), 1 -> HashSet(37149, 37157, 37156, 37152, 37158, 37151), 2 -> HashSet(37159, 37167, 37166, 37162, 37161, 37168), 3 -> HashSet(37169, 37170))
  /* Beautified form:
  "TryStatement2VarDeclaredNames0" (this, Block, Catch, Finally) => {
    access __x0__ = (Block "VarDeclaredNames")
    let names = __x0__
    access __x1__ = (Catch "VarDeclaredNames")
    let __x2__ = __x1__
    let __x3__ = 0i
    while (< __x3__ __x2__["length"]) {
      let __x4__ = __x2__[__x3__]
      append __x4__ -> names
      __x3__ = (+ __x3__ 1i)
    }
    access __x5__ = (Finally "VarDeclaredNames")
    let __x6__ = __x5__
    let __x7__ = 0i
    while (< __x7__ __x6__["length"]) {
      let __x8__ = __x6__[__x7__]
      append __x8__ -> names
      __x7__ = (+ __x7__ 1i)
    }
    return names
  }
  */
}
