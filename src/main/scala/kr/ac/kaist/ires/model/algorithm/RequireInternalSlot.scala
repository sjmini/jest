package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RequireInternalSlot {
  val length: Int = 2
  val func: Func = Func("""RequireInternalSlot""", List(Id("""O"""), Id("""internalSlot""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""O"""))))).setId(51285), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(51286), IReturn(ERef(RefId(Id("""__x1__""")))).setId(51287))).setId(51301), ISeq(List()).setId(51302)).setId(51290), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), ERef(RefId(Id("""internalSlot"""))))), EAbsent), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(51292), IReturn(ERef(RefId(Id("""__x2__""")))).setId(51293))).setId(51306), ISeq(List()).setId(51307)).setId(51295))).setId(51309))
  val instToStepMap: Map[Int, Int] = HashMap(51293 -> 2, 51286 -> 0, 51292 -> 2, 51285 -> 1, 51296 -> 3, 51287 -> 0, 51291 -> 1, 51295 -> 3, 51290 -> 1, 51288 -> 0, 51294 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(51286, 51287, 51288), 1 -> HashSet(51285, 51291, 51290), 2 -> HashSet(51293, 51292, 51294), 3 -> HashSet(51296, 51295))
  /* Beautified form:
  "RequireInternalSlot" (O, internalSlot) => {
    app __x0__ = (Type O)
    if (! (= __x0__ Object)) {
      app __x1__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x1__
    } else {}
    if (= O[internalSlot] absent) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
  }
  */
}
