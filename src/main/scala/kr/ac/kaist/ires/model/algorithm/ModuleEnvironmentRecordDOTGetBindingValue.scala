package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleEnvironmentRecordDOTGetBindingValue {
  val length: Int = 2
  val func: Func = Func("""ModuleEnvironmentRecord.GetBindingValue""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(IExpr(ENotSupported("""Etc""")).setId(49098), IExpr(ENotSupported("""Etc""")).setId(49098), IIf(EBOp(OEq, ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""initialized"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_ReferenceErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(49099), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49100))).setId(49112), ISeq(List()).setId(49113)).setId(49102), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefProp(RefProp(RefId(Id("""envRec""")), EStr("""SubMap""")), ERef(RefId(Id("""N""")))), EStr("""BoundValue"""))))).setId(49104), IReturn(ERef(RefId(Id("""__x1__""")))).setId(49105))).setId(49117))
  val instToStepMap: Map[Int, Int] = HashMap(49102 -> 10, 49098 -> 8, 49099 -> 9, 49104 -> 11, 49103 -> 10, 49105 -> 11, 49100 -> 9, 49097 -> 2, 49106 -> 11, 49101 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(49097), 10 -> HashSet(49102, 49103), 1 -> HashSet(49098), 9 -> HashSet(49099, 49100, 49101), 2 -> HashSet(49097), 11 -> HashSet(49104, 49105, 49106), 8 -> HashSet(49098))
  /* Beautified form:
  "ModuleEnvironmentRecord.GetBindingValue" (this, N, S) => {
    !!! "Etc"
    !!! "Etc"
    if (= envRec["SubMap"][N]["initialized"] false) {
      app __x0__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_ReferenceErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x0__
    } else {}
    app __x1__ = (WrapCompletion envRec["SubMap"][N]["BoundValue"])
    return __x1__
  }
  */
}
