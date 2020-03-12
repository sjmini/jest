package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ObjectBindingPattern1BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ObjectBindingPattern1BindingInitialization0""", List(Id("""this"""), Id("""BindingRestProperty"""), Id("""value"""), Id("""environment""")), None, ISeq(List(ILet(Id("""excludedNames"""), EList(List())).setId(28400), IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingRestProperty"""))), EStr("""RestBindingInitialization""")).setId(28402), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))), ERef(RefId(Id("""excludedNames"""))))).setId(28403), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(28404), IReturn(ERef(RefId(Id("""__x2__""")))).setId(28405))).setId(28413))
  val instToStepMap: Map[Int, Int] = HashMap(28404 -> 1, 28401 -> 0, 28400 -> 0, 28402 -> 1, 28405 -> 1, 28406 -> 1, 28403 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28401, 28400), 1 -> HashSet(28404, 28402, 28405, 28406, 28403))
  /* Beautified form:
  "ObjectBindingPattern1BindingInitialization0" (this, BindingRestProperty, value, environment) => {
    let excludedNames = (new [])
    access __x0__ = (BindingRestProperty "RestBindingInitialization")
    app __x1__ = (__x0__ value environment excludedNames)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
