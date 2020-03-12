package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TryStatement2VarScopedDeclarations0 {
  val length: Int = 0
  val func: Func = Func("""TryStatement2VarScopedDeclarations0""", List(Id("""this"""), Id("""Block"""), Id("""Catch"""), Id("""Finally""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""Block"""))), EStr("""VarScopedDeclarations""")).setId(37302), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(37303), IAccess(Id("""__x1__"""), ERef(RefId(Id("""Catch"""))), EStr("""VarScopedDeclarations""")).setId(37305), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37307), ILet(Id("""__x3__"""), EINum(0L)).setId(37308), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37309), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""declarations""")))).setId(37306), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37310))).setId(37336)).setId(37312), IAccess(Id("""__x5__"""), ERef(RefId(Id("""Finally"""))), EStr("""VarScopedDeclarations""")).setId(37315), ILet(Id("""__x6__"""), ERef(RefId(Id("""__x5__""")))).setId(37317), ILet(Id("""__x7__"""), EINum(0L)).setId(37318), IWhile(EBOp(OLt, ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x8__"""), ERef(RefProp(RefId(Id("""__x6__""")), ERef(RefId(Id("""__x7__""")))))).setId(37319), IAppend(ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""declarations""")))).setId(37316), IAssign(RefId(Id("""__x7__""")), EBOp(OPlus, ERef(RefId(Id("""__x7__"""))), EINum(1L))).setId(37320))).setId(37344)).setId(37322), IReturn(ERef(RefId(Id("""declarations""")))).setId(37325))).setId(37347))
  val instToStepMap: Map[Int, Int] = HashMap(37317 -> 2, 37302 -> 0, 37322 -> 2, 37315 -> 2, 37323 -> 2, 37304 -> 0, 37324 -> 2, 37307 -> 1, 37325 -> 3, 37308 -> 1, 37314 -> 1, 37312 -> 1, 37326 -> 3, 37305 -> 1, 37313 -> 1, 37318 -> 2, 37303 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37302, 37304, 37303), 1 -> HashSet(37305, 37307, 37313, 37308, 37314, 37312), 2 -> HashSet(37317, 37322, 37315, 37323, 37324, 37318), 3 -> HashSet(37326, 37325))
  /* Beautified form:
  "TryStatement2VarScopedDeclarations0" (this, Block, Catch, Finally) => {
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
    access __x5__ = (Finally "VarScopedDeclarations")
    let __x6__ = __x5__
    let __x7__ = 0i
    while (< __x7__ __x6__["length"]) {
      let __x8__ = __x6__[__x7__]
      append __x8__ -> declarations
      __x7__ = (+ __x7__ 1i)
    }
    return declarations
  }
  */
}
