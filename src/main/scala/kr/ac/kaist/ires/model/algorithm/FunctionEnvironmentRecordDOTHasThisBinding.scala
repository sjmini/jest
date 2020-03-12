package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionEnvironmentRecordDOTHasThisBinding {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.HasThisBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47872), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""lexical""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47874), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47875))).setId(47886), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47877), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47878))).setId(47889)).setId(47880))).setId(47891))
  val instToStepMap: Map[Int, Int] = HashMap(47881 -> 1, 47880 -> 1, 47876 -> 1, 47877 -> 1, 47878 -> 1, 47872 -> 0, 47873 -> 0, 47875 -> 1, 47874 -> 1, 47879 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47872, 47873), 1 -> HashSet(47881, 47880, 47876, 47877, 47878, 47875, 47874, 47879))
  /* Beautified form:
  "FunctionEnvironmentRecord.HasThisBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "lexical") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {
      app __x1__ = (WrapCompletion true)
      return __x1__
    }
  }
  */
}
