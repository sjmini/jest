package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameters4BoundNames0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameters4BoundNames0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FunctionRestParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""BoundNames""")).setId(37720), ILet(Id("""names"""), ERef(RefId(Id("""__x0__""")))).setId(37721), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FunctionRestParameter"""))), EStr("""BoundNames""")).setId(37723), ILet(Id("""__x2__"""), ERef(RefId(Id("""__x1__""")))).setId(37725), ILet(Id("""__x3__"""), EINum(0L)).setId(37726), IWhile(EBOp(OLt, ERef(RefId(Id("""__x3__"""))), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x4__"""), ERef(RefProp(RefId(Id("""__x2__""")), ERef(RefId(Id("""__x3__""")))))).setId(37727), IAppend(ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""names""")))).setId(37724), IAssign(RefId(Id("""__x3__""")), EBOp(OPlus, ERef(RefId(Id("""__x3__"""))), EINum(1L))).setId(37728))).setId(37744)).setId(37730), IReturn(ERef(RefId(Id("""names""")))).setId(37733))).setId(37747))
  val instToStepMap: Map[Int, Int] = HashMap(37721 -> 0, 37726 -> 1, 37722 -> 0, 37733 -> 2, 37732 -> 1, 37723 -> 1, 37731 -> 1, 37720 -> 0, 37725 -> 1, 37730 -> 1, 37734 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37721, 37722, 37720), 1 -> HashSet(37726, 37732, 37723, 37731, 37725, 37730), 2 -> HashSet(37733, 37734))
  /* Beautified form:
  "FormalParameters4BoundNames0" (this, FormalParameterList, FunctionRestParameter) => {
    access __x0__ = (FormalParameterList "BoundNames")
    let names = __x0__
    access __x1__ = (FunctionRestParameter "BoundNames")
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
