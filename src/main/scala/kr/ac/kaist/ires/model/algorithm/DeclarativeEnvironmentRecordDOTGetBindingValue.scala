package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object DeclarativeEnvironmentRecordDOTGetBindingValue {
  val length: Int = 2
  val func: Func = Func("""DeclarativeEnvironmentRecord.GetBindingValue""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(47314), IIf(EBOp(OEq, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(47317), IReturn(ERef(RefId(Id("""__x0__""")))).setId(47318))).setId(47329), ISeq(List()).setId(47330)).setId(47320), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""BoundValue"""))))).setId(47322), IReturn(ERef(RefId(Id("""__x1__""")))).setId(47323))).setId(47334))
  val instToStepMap: Map[Int, Int] = HashMap(47318 -> 2, 47323 -> 4, 47314 -> 0, 47322 -> 4, 47319 -> 2, 47321 -> 3, 47317 -> 2, 47316 -> 1, 47324 -> 4, 47315 -> 0, 47320 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(47314, 47315), 1 -> HashSet(47316), 2 -> HashSet(47318, 47319, 47317), 3 -> HashSet(47320, 47321), 4 -> HashSet(47323, 47322, 47324))
  /* Beautified form:
  "DeclarativeEnvironmentRecord.GetBindingValue" (this, N, S) => {
    let envRec = this
    if (= envRec["SubMap"][N]["initialized"] false) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["SubMap"][N]["BoundValue"])
    return __x1__
  }
  */
}
