package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LabelledStatement0ContainsDuplicateLabels0 {
  val length: Int = 0
  val func: Func = Func("""LabelledStatement0ContainsDuplicateLabels0""", List(Id("""this"""), Id("""LabelIdentifier"""), Id("""LabelledItem"""), Id("""labelSet""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""LabelIdentifier"""))), EStr("""StringValue""")).setId(36142), ILet(Id("""label"""), ERef(RefId(Id("""__x0__""")))).setId(36143), IIf(EContains(ERef(RefId(Id("""labelSet"""))), ERef(RefId(Id("""label""")))), IReturn(EBool(true)).setId(36145), ISeq(List()).setId(36162)).setId(36148), ILet(Id("""__x1__"""), ECopy(ERef(RefId(Id("""labelSet"""))))).setId(36150), IAppend(ERef(RefId(Id("""label"""))), ERef(RefId(Id("""__x1__""")))).setId(36151), ILet(Id("""newLabelSet"""), ERef(RefId(Id("""__x1__""")))).setId(36152), IAccess(Id("""__x2__"""), ERef(RefId(Id("""LabelledItem"""))), EStr("""ContainsDuplicateLabels""")).setId(36154), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(ERef(RefId(Id("""newLabelSet"""))))).setId(36155), IReturn(ERef(RefId(Id("""__x3__""")))).setId(36156))).setId(36170))
  val instToStepMap: Map[Int, Int] = HashMap(36146 -> 1, 36148 -> 2, 36152 -> 3, 36155 -> 4, 36154 -> 4, 36149 -> 2, 36144 -> 0, 36153 -> 3, 36150 -> 3, 36156 -> 4, 36151 -> 3, 36142 -> 0, 36157 -> 4, 36143 -> 0, 36145 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(36144, 36142, 36143), 1 -> HashSet(36146, 36145), 2 -> HashSet(36148, 36149), 3 -> HashSet(36151, 36152, 36153, 36150), 4 -> HashSet(36156, 36155, 36154, 36157))
  /* Beautified form:
  "LabelledStatement0ContainsDuplicateLabels0" (this, LabelIdentifier, LabelledItem, labelSet) => {
    access __x0__ = (LabelIdentifier "StringValue")
    let label = __x0__
    if (contains labelSet label) return true else {}
    let __x1__ = (copy-obj labelSet)
    append label -> __x1__
    let newLabelSet = __x1__
    access __x2__ = (LabelledItem "ContainsDuplicateLabels")
    app __x3__ = (__x2__ newLabelSet)
    return __x3__
  }
  */
}
