package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingElisionElement0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingElisionElement0IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingElement"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElement"""))), EStr("""IteratorBindingInitialization""")).setId(29016), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(29017), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(29018), IReturn(ERef(RefId(Id("""__x2__""")))).setId(29019))).setId(29026))
  val instToStepMap: Map[Int, Int] = HashMap(29019 -> 0, 29016 -> 0, 29018 -> 0, 29017 -> 0, 29020 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(29019, 29016, 29018, 29017, 29020))
  /* Beautified form:
  "BindingElisionElement0IteratorBindingInitialization0" (this, BindingElement, iteratorRecord, environment) => {
    access __x0__ = (BindingElement "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
