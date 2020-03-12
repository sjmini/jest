package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectEnvironmentRecordDOTWithBaseObject {
  val length: Int = 0
  val func: Func = Func("""ObjectEnvironmentRecord.WithBaseObject""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47805), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""withEnvironment"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""BindingObject"""))))).setId(47807), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47808))).setId(47819), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(47810), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47811))).setId(47822)).setId(47813))).setId(47824))
  val instToStepMap: Map[Int, Int] = HashMap(47811 -> 2, 47806 -> 0, 47812 -> 2, 47809 -> 1, 47813 -> 2, 47810 -> 2, 47808 -> 1, 47814 -> 2, 47805 -> 0, 47807 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47806, 47805), 1 -> HashSet(47809, 47808, 47807), 2 -> HashSet(47811, 47812, 47814, 47813, 47810))
  /* Beautified form:
  "ObjectEnvironmentRecord.WithBaseObject" (this) => {
    let envRec = this
    if (= envRec["withEnvironment"] true) {
      app __x0__ = (WrapCompletion envRec["BindingObject"])
      return __x0__
    } else {
      app __x1__ = (WrapCompletion undefined)
      return __x1__
    }
  }
  */
}
