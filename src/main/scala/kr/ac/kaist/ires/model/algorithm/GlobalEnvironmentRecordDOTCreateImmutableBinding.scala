package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTCreateImmutableBinding {
  val length: Int = 2
  val func: Func = Func("""GlobalEnvironmentRecord.CreateImmutableBinding""", List(Id("""this"""), Id("""N"""), Id("""S""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48125), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48127), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48129), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(48130), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48131))).setId(48146), ISeq(List()).setId(48147)).setId(48134), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""S"""))))).setId(48136), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(48137), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48138))).setId(48152))
  val instToStepMap: Map[Int, Int] = HashMap(48135 -> 3, 48131 -> 2, 48138 -> 4, 48126 -> 0, 48130 -> 2, 48134 -> 3, 48127 -> 1, 48139 -> 4, 48125 -> 0, 48129 -> 3, 48128 -> 1, 48136 -> 4, 48132 -> 2, 48137 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48126, 48125), 1 -> HashSet(48127, 48128), 2 -> HashSet(48131, 48130, 48132), 3 -> HashSet(48135, 48134, 48129), 4 -> HashSet(48138, 48139, 48136, 48137))
  /* Beautified form:
  "GlobalEnvironmentRecord.CreateImmutableBinding" (this, N, S) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (DclRec["CreateImmutableBinding"] DclRec N S)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
