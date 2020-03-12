package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateArrayIterator {
  val length: Int = 2
  val func: Func = Func("""CreateArrayIterator""", List(Id("""array"""), Id("""kind""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_ArrayIteratorPrototype"""))), EList(List(EStr("""IteratedObject"""), EStr("""ArrayIteratorNextIndex"""), EStr("""ArrayIterationKind"""))))).setId(83738), ILet(Id("""iterator"""), ERef(RefId(Id("""__x0__""")))).setId(83739), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""IteratedObject""")), ERef(RefId(Id("""array""")))).setId(83741), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""ArrayIteratorNextIndex""")), EINum(0L)).setId(83743), IAssign(RefProp(RefId(Id("""iterator""")), EStr("""ArrayIterationKind""")), ERef(RefId(Id("""kind""")))).setId(83745), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""iterator"""))))).setId(83747), IReturn(ERef(RefId(Id("""__x1__""")))).setId(83748))).setId(83758))
  val instToStepMap: Map[Int, Int] = HashMap(83743 -> 3, 83746 -> 4, 83748 -> 5, 83744 -> 3, 83740 -> 1, 83737 -> 0, 83738 -> 1, 83741 -> 2, 83745 -> 4, 83742 -> 2, 83747 -> 5, 83739 -> 1, 83749 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(83737), 5 -> HashSet(83748, 83749, 83747), 1 -> HashSet(83740, 83738, 83739), 2 -> HashSet(83741, 83742), 3 -> HashSet(83743, 83744), 4 -> HashSet(83746, 83745))
  /* Beautified form:
  "CreateArrayIterator" (array, kind) => {
    app __x0__ = (ObjectCreate INTRINSIC_ArrayIteratorPrototype (new ["IteratedObject", "ArrayIteratorNextIndex", "ArrayIterationKind"]))
    let iterator = __x0__
    iterator["IteratedObject"] = array
    iterator["ArrayIteratorNextIndex"] = 0i
    iterator["ArrayIterationKind"] = kind
    app __x1__ = (WrapCompletion iterator)
    return __x1__
  }
  */
}
