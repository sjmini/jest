package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern2IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern2IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingElementList"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""IteratorBindingInitialization""")).setId(28828), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28829), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(28830), IReturn(ERef(RefId(Id("""__x2__""")))).setId(28831))).setId(28838))
  val instToStepMap: Map[Int, Int] = HashMap(28830 -> 0, 28831 -> 0, 28828 -> 0, 28832 -> 0, 28829 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28830, 28831, 28828, 28832, 28829))
  /* Beautified form:
  "ArrayBindingPattern2IteratorBindingInitialization0" (this, BindingElementList, iteratorRecord, environment) => {
    access __x0__ = (BindingElementList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
