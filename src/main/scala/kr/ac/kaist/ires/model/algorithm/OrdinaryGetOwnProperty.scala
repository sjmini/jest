package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object OrdinaryGetOwnProperty {
  val length: Int = 2
  val func: Func = Func("""OrdinaryGetOwnProperty""", List(Id("""O"""), Id("""P""")), None, ISeq(List(IIf(EUOp(ONot, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P"""))))), EAbsent))), IReturn(EUndef).setId(49454), ISeq(List()).setId(49483)).setId(49456), ILet(Id("""D"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(49458), ILet(Id("""X"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))).setId(49460), IApp(Id("""__x0__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""X"""))))).setId(49462), IIf(ERef(RefId(Id("""__x0__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""D""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Value""")))).setId(49463), IAssign(RefProp(RefId(Id("""D""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Writable""")))).setId(49465))).setId(49490), ISeq(List(IAssign(RefProp(RefId(Id("""D""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Get""")))).setId(49468), IAssign(RefProp(RefId(Id("""D""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Set""")))).setId(49470))).setId(49493)).setId(49473), IAssign(RefProp(RefId(Id("""D""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Enumerable""")))).setId(49475), IAssign(RefProp(RefId(Id("""D""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""X""")), EStr("""Configurable""")))).setId(49477), IReturn(ERef(RefId(Id("""D""")))).setId(49479))).setId(49498))
  val instToStepMap: Map[Int, Int] = HashMap(49466 -> 8, 49467 -> 8, 49459 -> 3, 49463 -> 8, 49478 -> 15, 49455 -> 1, 49472 -> 13, 49476 -> 14, 49465 -> 8, 49480 -> 16, 49461 -> 4, 49457 -> 2, 49475 -> 14, 49460 -> 4, 49479 -> 16, 49464 -> 8, 49453 -> 13, 49470 -> 13, 49474 -> 13, 49468 -> 13, 49471 -> 13, 49454 -> 1, 49477 -> 15, 49462 -> 13, 49473 -> 13, 49458 -> 3, 49469 -> 13, 49456 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(49453), 14 -> HashSet(49475, 49476), 1 -> HashSet(49454, 49455), 13 -> HashSet(49471, 49462, 49473, 49472, 49469, 49453, 49470, 49474, 49468), 2 -> HashSet(49457, 49456), 12 -> HashSet(49468, 49469), 7 -> HashSet(49464, 49463), 3 -> HashSet(49459, 49458), 16 -> HashSet(49479, 49480), 11 -> HashSet(49453), 8 -> HashSet(49466, 49464, 49467, 49463, 49465), 4 -> HashSet(49460, 49461), 15 -> HashSet(49478, 49477))
  /* Beautified form:
  "OrdinaryGetOwnProperty" (O, P) => {
    if (! (! (= O["SubMap"][P] absent))) return undefined else {}
    let D = (new PropertyDescriptor("SubMap" -> (new SubMap())))
    let X = O["SubMap"][P]
    app __x0__ = (IsDataDescriptor X)
    if __x0__ {
      D["Value"] = X["Value"]
      D["Writable"] = X["Writable"]
    } else {
      D["Get"] = X["Get"]
      D["Set"] = X["Set"]
    }
    D["Enumerable"] = X["Enumerable"]
    D["Configurable"] = X["Configurable"]
    return D
  }
  */
}
