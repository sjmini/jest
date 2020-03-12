package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorMethod0HasDirectSuper0 {
  val length: Int = 0
  val func: Func = Func("""GeneratorMethod0HasDirectSuper0""", List(Id("""this"""), Id("""PropertyName"""), Id("""UniqueFormalParameters"""), Id("""GeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""UniqueFormalParameters"""))), EStr("""Contains""")).setId(39992), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(EStr("""SuperCall"""))).setId(39993), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true)), IReturn(EBool(true)).setId(39994), ISeq(List()).setId(40007)).setId(39997), IAccess(Id("""__x2__"""), ERef(RefId(Id("""GeneratorBody"""))), EStr("""Contains""")).setId(39999), IApp(Id("""__x3__"""), ERef(RefId(Id("""__x2__"""))), List(EStr("""SuperCall"""))).setId(40000), IReturn(ERef(RefId(Id("""__x3__""")))).setId(40001))).setId(40012))
  val instToStepMap: Map[Int, Int] = HashMap(39993 -> 1, 39997 -> 1, 39994 -> 0, 39998 -> 1, 39995 -> 0, 39999 -> 2, 39992 -> 1, 40002 -> 2, 40000 -> 2, 40001 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(39994, 39995), 1 -> HashSet(39993, 39997, 39998, 39992), 2 -> HashSet(39999, 40002, 40000, 40001))
  /* Beautified form:
  "GeneratorMethod0HasDirectSuper0" (this, PropertyName, UniqueFormalParameters, GeneratorBody) => {
    access __x0__ = (UniqueFormalParameters "Contains")
    app __x1__ = (__x0__ "SuperCall")
    if (= __x1__ true) return true else {}
    access __x2__ = (GeneratorBody "Contains")
    app __x3__ = (__x2__ "SuperCall")
    return __x3__
  }
  */
}
