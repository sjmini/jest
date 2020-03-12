package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsInTailPosition {
  val length: Int = 1
  val func: Func = Func("""IsInTailPosition""", List(Id("""call""")), None, ISeq(List(IIf(EBool(true), IReturn(EBool(false)).setId(44659), ISeq(List()).setId(44678)).setId(44661), IExpr(ENotSupported("""Etc""")).setId(44663), ILet(Id("""body"""), ENotSupported("""ParentNode""")).setId(44664), IIf(EBOp(OEq, ERef(RefId(Id("""body"""))), ENotSupported("""ParentNode""")), IReturn(EBool(false)).setId(44666), ISeq(List()).setId(44683)).setId(44668), IExpr(ENotSupported("""Etc""")).setId(44663), IExpr(ENotSupported("""Etc""")).setId(44663), IExpr(ENotSupported("""Etc""")).setId(44663), IAccess(Id("""__x0__"""), ERef(RefId(Id("""body"""))), EStr("""HasCallInTailPosition""")).setId(44672), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""call"""))))).setId(44673), IReturn(ERef(RefId(Id("""__x1__""")))).setId(44674))).setId(44691))
  val instToStepMap: Map[Int, Int] = HashMap(44661 -> 2, 44668 -> 6, 44673 -> 10, 44674 -> 10, 44664 -> 4, 44658 -> 0, 44675 -> 10, 44659 -> 1, 44665 -> 4, 44669 -> 6, 44660 -> 1, 44662 -> 2, 44672 -> 10, 44667 -> 5, 44666 -> 5, 44663 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(44658), 5 -> HashSet(44667, 44666), 10 -> HashSet(44673, 44672, 44674, 44675), 1 -> HashSet(44659, 44660), 6 -> HashSet(44668, 44669), 9 -> HashSet(44663), 2 -> HashSet(44661, 44662), 7 -> HashSet(44663), 3 -> HashSet(44663), 8 -> HashSet(44663), 4 -> HashSet(44664, 44665))
  /* Beautified form:
  "IsInTailPosition" (call) => {
    if true return false else {}
    !!! "Etc"
    let body = !!! "ParentNode"
    if (= body !!! "ParentNode") return false else {}
    !!! "Etc"
    !!! "Etc"
    !!! "Etc"
    access __x0__ = (body "HasCallInTailPosition")
    app __x1__ = (__x0__ call)
    return __x1__
  }
  */
}
