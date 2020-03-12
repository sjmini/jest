package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionEnvironmentRecordDOTBindThisValue {
  val length: Int = 1
  val func: Func = Func("""FunctionEnvironmentRecord.BindThisValue""", List(Id("""this"""), Id("""V""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47834), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""initialized""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47837), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47838))).setId(47853), ISeq(List()).setId(47854)).setId(47840), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisValue""")), ERef(RefId(Id("""V""")))).setId(47842), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""initialized""")).setId(47844), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""V"""))))).setId(47846), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47847))).setId(47860))
  val instToStepMap: Map[Int, Int] = HashMap(47838 -> 2, 47836 -> 1, 47843 -> 4, 47848 -> 6, 47845 -> 5, 47839 -> 2, 47837 -> 2, 47842 -> 4, 47847 -> 6, 47835 -> 0, 47844 -> 5, 47841 -> 3, 47840 -> 3, 47834 -> 0, 47846 -> 6)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47835, 47834), 5 -> HashSet(47844, 47845), 1 -> HashSet(47836), 6 -> HashSet(47848, 47846, 47847), 2 -> HashSet(47838, 47839, 47837), 3 -> HashSet(47841, 47840), 4 -> HashSet(47843, 47842))
  /* Beautified form:
  "FunctionEnvironmentRecord.BindThisValue" (this, V) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "initialized") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    envRec["ThisValue"] = V
    envRec["ThisBindingStatus"] = "initialized"
    app __x1__ = (WrapCompletion V)
    return __x1__
  }
  */
}
