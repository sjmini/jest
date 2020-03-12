package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForDeclaration0BindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0BindingInitialization0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding"""), Id("""value"""), Id("""environment""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BindingInitialization""")).setId(32547), IApp(Id("""__x1__"""), ERef(RefId(Id("""__x0__"""))), List(ERef(RefId(Id("""value"""))), ERef(RefId(Id("""environment"""))))).setId(32548), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(32549), IReturn(ERef(RefId(Id("""__x2__""")))).setId(32550))).setId(32557))
  val instToStepMap: Map[Int, Int] = HashMap(32548 -> 0, 32551 -> 0, 32550 -> 0, 32547 -> 0, 32549 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32548, 32551, 32550, 32547, 32549))
  /* Beautified form:
  "ForDeclaration0BindingInitialization0" (this, LetOrConst, ForBinding, value, environment) => {
    access __x0__ = (ForBinding "BindingInitialization")
    app __x1__ = (__x0__ value environment)
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
