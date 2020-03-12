package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object FunctionEnvironmentRecordDOTGetThisBinding {
  val length: Int = 0
  val func: Func = Func("""FunctionEnvironmentRecord.GetThisBinding""", List(Id("""this""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47946), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus"""))), EStr("""uninitialized""")), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47949), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47950))).setId(47961), ISeq(List()).setId(47962)).setId(47952), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""envRec""")), EStr("""ThisValue"""))))).setId(47954), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47955))).setId(47966))
  val instToStepMap: Map[Int, Int] = HashMap(47949 -> 2, 47955 -> 4, 47948 -> 1, 47952 -> 3, 47956 -> 4, 47951 -> 2, 47947 -> 0, 47954 -> 4, 47950 -> 2, 47946 -> 0, 47953 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47947, 47946), 1 -> HashSet(47948), 2 -> HashSet(47949, 47951, 47950), 3 -> HashSet(47952, 47953), 4 -> HashSet(47955, 47956, 47954))
  /* Beautified form:
  "FunctionEnvironmentRecord.GetThisBinding" (this) => {
    let envRec = this
    if (= envRec["ThisBindingStatus"] "uninitialized") {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["ThisValue"])
    return __x1__
  }
  */
}
