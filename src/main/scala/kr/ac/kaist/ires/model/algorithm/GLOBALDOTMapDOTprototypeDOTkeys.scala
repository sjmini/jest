package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTMapDOTprototypeDOTkeys {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Map.prototype.keys""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""M"""), ERef(RefId(Id("""this""")))).setId(84940), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateMapIterator"""))), List(ERef(RefId(Id("""M"""))), EStr("""key"""))).setId(84942), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(84943), IReturn(ERef(RefId(Id("""__x0__""")))).setId(84944)).setId(84945), ISeq(List()).setId(84957)).setId(84947), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(84948), IReturn(ERef(RefId(Id("""__x1__""")))).setId(84949))).setId(84961))
  val instToStepMap: Map[Int, Int] = HashMap(84947 -> 1, 84950 -> 1, 84941 -> 0, 84948 -> 1, 84949 -> 1, 84940 -> 0, 84942 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(84941, 84940), 1 -> HashSet(84947, 84950, 84948, 84949, 84942))
  /* Beautified form:
  "GLOBAL.Map.prototype.keys" (this, argumentsList, NewTarget) => {
    let M = this
    app __x0__ = (CreateMapIterator M "key")
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
