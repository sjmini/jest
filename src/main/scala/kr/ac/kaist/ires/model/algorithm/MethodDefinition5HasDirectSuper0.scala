package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MethodDefinition5HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""MethodDefinition5HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""PropertySetParameterList"""), Id("""FunctionBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""PropertySetParameterList"""))), EStr("""Contains""")).setId(39531), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(39532), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(39533), ISeq(List()).setId(39546)).setId(39536), IAccess(Id("""__x2__"""), ERef(RefId(Id("""FunctionBody"""))), EStr("""Contains""")).setId(39538), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))).setId(39539), IReturn(ERef(RefId(Id("""__x3__""")))).setId(39540))).setId(39551))
  val instToStepMap: Map[Int, Int] = HashMap(39537 -> 1, 39536 -> 1, 39538 -> 2, 39533 -> 0, 39539 -> 2, 39534 -> 0, 39532 -> 1, 39531 -> 1, 39540 -> 2, 39541 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39533, 39534), 1 -> HashSet(39537, 39536, 39532, 39531), 2 -> HashSet(39538, 39539, 39540, 39541))
  /* Beautified form:
  "MethodDefinition5HasDirectSuper0" (this, PropertyName, PropertySetParameterList, FunctionBody) => {
    access __x0__ = (PropertySetParameterList "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (FunctionBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
