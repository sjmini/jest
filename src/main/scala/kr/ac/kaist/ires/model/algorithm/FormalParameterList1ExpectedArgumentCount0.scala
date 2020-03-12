package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FormalParameterList1ExpectedArgumentCount0 {
  val length: Int = 0
  val func: Func = Func("""FormalParameterList1ExpectedArgumentCount0""", List(Id("""this"""), Id("""FormalParameterList"""), Id("""FormalParameter""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""ExpectedArgumentCount""")).setId(37887), ILet(Id("""count"""), ERef(RefId(Id("""__x0__""")))).setId(37888), IAccess(Id("""__x1__"""), ERef(RefId(Id("""FormalParameterList"""))), EStr("""HasInitializer""")).setId(37890), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))).setId(37897), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List()).setId(37910), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""FormalParameter"""))), EStr("""HasInitializer""")).setId(37891), IAssign(RefId(Id("""__x2__""")), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true))).setId(37894))).setId(37913)).setId(37898), IIf(ERef(RefId(Id("""__x2__"""))), IReturn(ERef(RefId(Id("""count""")))).setId(37899), ISeq(List()).setId(37916)).setId(37901), IReturn(EBOp(OPlus, ERef(RefId(Id("""count"""))), EINum(1L))).setId(37903))).setId(37919))
  val instToStepMap: Map[Int, Int] = HashMap(37902 -> 2, 37903 -> 3, 37887 -> 0, 37899 -> 1, 37897 -> 2, 37904 -> 3, 37888 -> 0, 37900 -> 1, 37898 -> 2, 37889 -> 0, 37901 -> 2, 37890 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(37887, 37888, 37889), 1 -> HashSet(37899, 37900), 2 -> HashSet(37902, 37897, 37898, 37901, 37890), 3 -> HashSet(37903, 37904))
  /* Beautified form:
  "FormalParameterList1ExpectedArgumentCount0" (this, FormalParameterList, FormalParameter) => {
    access __x0__ = (FormalParameterList "ExpectedArgumentCount")
    let count = __x0__
    access __x1__ = (FormalParameterList "HasInitializer")
    let __x2__ = (= __x1__ true)
    if __x2__ {} else {
      access __x3__ = (FormalParameter "HasInitializer")
      __x2__ = (= __x3__ true)
    }
    if __x2__ return count else {}
    return (+ count 1i)
  }
  */
}
