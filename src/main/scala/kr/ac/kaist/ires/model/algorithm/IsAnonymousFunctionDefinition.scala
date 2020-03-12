package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object IsAnonymousFunctionDefinition {
  val length: Int = 1
  val func: Func = Func("""IsAnonymousFunctionDefinition""", List(Id("""expr""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""expr"""))), EStr("""IsFunctionDefinition""")).setId(37968), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(false)), IReturn(EBool(false)).setId(37969), ISeq(List()).setId(37986)).setId(37972), IAccess(Id("""__x1__"""), ERef(RefId(Id("""expr"""))), EStr("""HasName""")).setId(37974), ILet(Id("""hasName"""), ERef(RefId(Id("""__x1__""")))).setId(37975), IIf(EBOp(OEq, ERef(RefId(Id("""hasName"""))), EBool(true)), IReturn(EBool(false)).setId(37977), ISeq(List()).setId(37991)).setId(37979), IReturn(EBool(true)).setId(37981))).setId(37994))
  val instToStepMap: Map[Int, Int] = HashMap(37970 -> 0, 37980 -> 4, 37975 -> 2, 37979 -> 4, 37976 -> 2, 37972 -> 1, 37968 -> 1, 37973 -> 1, 37978 -> 3, 37982 -> 5, 37969 -> 0, 37974 -> 2, 37977 -> 3, 37981 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(37970, 37969), 5 -> HashSet(37982, 37981), 1 -> HashSet(37972, 37968, 37973), 2 -> HashSet(37975, 37976, 37974), 3 -> HashSet(37978, 37977), 4 -> HashSet(37980, 37979))
  /* Beautified form:
  "IsAnonymousFunctionDefinition" (expr) => {
    access __x0__ = (expr "IsFunctionDefinition")
    if (= __x0__ false) return false else {}
    access __x1__ = (expr "HasName")
    let hasName = __x1__
    if (= hasName true) return false else {}
    return true
  }
  */
}
