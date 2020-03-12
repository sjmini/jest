package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionEnvironmentRecordDOTHasSuperBinding {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.HasSuperBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47901), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""lexical""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47903), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47904))).setId(47921), ISeq(List()).setId(47922)).setId(47907), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject"""))), EUndef), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(47909), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47910))).setId(47926), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(47912), IReturn(ERef(RefId(Id("""__x2__""")))).setId(47913))).setId(47929)).setId(47915))).setId(47931))
  val instToStepMap: Map[Int, Int] = HashMap(47913 -> 3, 47902 -> 0, 47907 -> 2, 47912 -> 3, 47916 -> 3, 47908 -> 2, 47915 -> 3, 47903 -> 1, 47914 -> 3, 47901 -> 0, 47911 -> 3, 47904 -> 1, 47909 -> 3, 47910 -> 3, 47905 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(47902, 47901), 1 -> HashSet(47904, 47905, 47903), 2 -> HashSet(47907, 47908), 3 -> HashSet(47913, 47912, 47916, 47915, 47909, 47910, 47914, 47911))
  /* Beautified form:
  "FunctionEnvironmentRecord.HasSuperBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "lexical") {
      app __x0__ = (WrapCompletion false)
      return __x0__
    } else {}
    if (= envRec["HomeObject"] undefined) {
      app __x1__ = (WrapCompletion false)
      return __x1__
    } else {
      app __x2__ = (WrapCompletion true)
      return __x2__
    }
  }
  */
}
