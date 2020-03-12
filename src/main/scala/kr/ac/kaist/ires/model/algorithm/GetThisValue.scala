package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GetThisValue {
  val length: Int = 1
  val func: Func = Func("""GetThisValue""", List(Id("""V""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IsSuperReference"""))), List(ERef(RefId(Id("""V"""))))).setId(1037), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""V""")), EStr("""thisValue"""))))).setId(1038), IReturn(ERef(RefId(Id("""__x1__""")))).setId(1039))).setId(1052), ISeq(List()).setId(1053)).setId(1042), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetBase"""))), List(ERef(RefId(Id("""V"""))))).setId(1044), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(1045), IReturn(ERef(RefId(Id("""__x3__""")))).setId(1046))).setId(1058))
  val instToStepMap: Map[Int, Int] = HashMap(1036 -> 0, 1041 -> 3, 1046 -> 5, 1040 -> 3, 1047 -> 5, 1042 -> 4, 1039 -> 3, 1043 -> 4, 1044 -> 5, 1038 -> 3, 1045 -> 5, 1037 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(1036), 3 -> HashSet(1041, 1040, 1039, 1038), 4 -> HashSet(1042, 1043, 1037), 5 -> HashSet(1046, 1047, 1044, 1045))
  /* Beautified form:
  "GetThisValue" (V) => {
    app __x0__ = (IsSuperReference V)
    if (= __x0__ true) {
      app __x1__ = (WrapCompletion V["thisValue"])
      return __x1__
    } else {}
    app __x2__ = (GetBase V)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
