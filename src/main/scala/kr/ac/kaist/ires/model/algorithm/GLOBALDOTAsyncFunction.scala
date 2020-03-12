package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTAsyncFunction {
  val length: Int = 5
  val func: Func = Func("""GLOBAL.AsyncFunction""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(ILet(Id("""C"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(93567), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(93569), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateDynamicFunction"""))), List(ERef(RefId(Id("""C"""))), ERef(RefId(Id("""NewTarget"""))), EStr("""async"""), ERef(RefId(Id("""args"""))))).setId(93571), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(93572), IReturn(ERef(RefId(Id("""__x1__""")))).setId(93573))).setId(93581))
  val instToStepMap: Map[Int, Int] = HashMap(93567 -> 0, 93570 -> 1, 93574 -> 2, 93568 -> 0, 93569 -> 1, 93573 -> 2, 93572 -> 2, 93571 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(93567, 93568), 1 -> HashSet(93570, 93569), 2 -> HashSet(93574, 93573, 93572, 93571))
  /* Beautified form:
  "GLOBAL.AsyncFunction" (this, argumentsList, NewTarget) => {
    let C = GLOBAL_context["Function"]
    let args = argumentsList
    app __x0__ = (CreateDynamicFunction C NewTarget "async" args)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
