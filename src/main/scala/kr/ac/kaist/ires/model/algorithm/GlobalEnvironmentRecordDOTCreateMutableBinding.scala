package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GlobalEnvironmentRecordDOTCreateMutableBinding {
  val length: Int = 2
  val func: Func = Func("""GlobalEnvironmentRecord.CreateMutableBinding""", List(Id("""this"""), Id("""N"""), Id("""D""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefId(Id("""this""")))).setId(48085), ILet(Id("""DclRec"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""DeclarativeRecord""")))).setId(48087), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""HasBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))))).setId(48089), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), EBool(true)), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(48090), IReturn(ERef(RefId(Id("""__x1__""")))).setId(48091))).setId(48106), ISeq(List()).setId(48107)).setId(48094), IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""DclRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""DclRec"""))), ERef(RefId(Id("""N"""))), ERef(RefId(Id("""D"""))))).setId(48096), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(48097), IReturn(ERef(RefId(Id("""__x3__""")))).setId(48098))).setId(48112))
  val instToStepMap: Map[Int, Int] = HashMap(48091 -> 2, 48092 -> 2, 48095 -> 3, 48087 -> 1, 48089 -> 3, 48099 -> 4, 48098 -> 4, 48097 -> 4, 48094 -> 3, 48088 -> 1, 48096 -> 4, 48086 -> 0, 48085 -> 0, 48090 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(48086, 48085), 1 -> HashSet(48088, 48087), 2 -> HashSet(48091, 48092, 48090), 3 -> HashSet(48094, 48095, 48089), 4 -> HashSet(48099, 48096, 48098, 48097))
  /* Beautified form:
  "GlobalEnvironmentRecord.CreateMutableBinding" (this, N, D) => {
    let envRec = this
    let DclRec = envRec["DeclarativeRecord"]
    app __x0__ = (DclRec["HasBinding"] DclRec N)
    if (= __x0__ true) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    app __x2__ = (DclRec["CreateMutableBinding"] DclRec N D)
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
