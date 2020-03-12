package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0ContainsUndefinedContinueTarget0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0ContainsUndefinedContinueTarget0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem"""), Id("""iterationSet"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(36223), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))).setId(36224), ILet(Id("""__x1__"""), ECopy(ERef(RefId(Id("""labelSet"""))))).setId(36226), IAppend(ERef(RefId(Id("""label"""))), ERef(RefId(Id("""__x1__""")))).setId(36227), ILet(Id("""newLabelSet"""), ERef(RefId(Id("""__x1__""")))).setId(36228), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""ContainsUndefinedContinueTarget""")).setId(36230), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""iterationSet"""))), ERef(RefId(Id("""newLabelSet"""))))).setId(36231), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36232))).setId(36243))
  val instToStepMap: Map[Int, Int] = HashMap(36224 -> 0, 36226 -> 1, 36230 -> 2, 36225 -> 0, 36232 -> 2, 36229 -> 1, 36233 -> 2, 36223 -> 0, 36227 -> 1, 36228 -> 1, 36231 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(36224, 36225, 36223), 1 -> HashSet(36226, 36229, 36228, 36227), 2 -> HashSet(36230, 36232, 36233, 36231))
  /* Beautified form:
  "LabelledStatement0ContainsUndefinedContinueTarget0" (this, LabelIdentifier, LabelledItem, iterationSet, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    let __x1__ = (copy-obj labelSet)
    append label -> __x1__
    let newLabelSet = __x1__
    access __x2__ = (LabelledItem "ContainsUndefinedContinueTarget")
    app __x3__ = (__x2__ iterationSet newLabelSet)
    return __x3__
  }
  */
}
