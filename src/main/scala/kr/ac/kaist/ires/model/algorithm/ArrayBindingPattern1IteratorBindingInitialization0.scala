package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayBindingPattern1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ArrayBindingPattern1IteratorBindingInitialization0""", List(Id("""this"""), Id("""BindingElementList"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingElementList"""))), EStr("""IteratorBindingInitialization""")).setId(28812), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""environment"""))))).setId(28813), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(28814), IReturn(ERef(RefId(Id("""__x2__""")))).setId(28815))).setId(28822))
  val instToStepMap: Map[Int, Int] = HashMap(28815 -> 0, 28812 -> 0, 28816 -> 0, 28813 -> 0, 28814 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(28815, 28812, 28816, 28813, 28814))
  /* Beautified form:
  "ArrayBindingPattern1IteratorBindingInitialization0" (this, BindingElementList, iteratorRecord, environment) => {
    access __x0__ = (BindingElementList "IteratorBindingInitialization")
    app __x1__ = (__x0__ iteratorRecord environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
