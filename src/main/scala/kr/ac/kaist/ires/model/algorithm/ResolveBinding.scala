package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ResolveBinding {
  val length: Int = 1
  val func: Func = Func("""ResolveBinding""", List(Id("""name"""), Id("""env""")), None, ISeq(List(IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""env"""))), EAbsent), EBOp(OEq, ERef(RefId(Id("""env"""))), EUndef)), IAssign(RefId(Id("""env""")), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")))).setId(8438), ISeq(List()).setId(8460)).setId(8442), IIf(EBool(true), ILet(Id("""strict"""), EBool(true)).setId(8444), ILet(Id("""strict"""), EBool(false)).setId(8446)).setId(8448), IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIdentifierReference"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""strict"""))))).setId(8450), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(8451), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8452)).setId(8453), ISeq(List()).setId(8469)).setId(8454), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(8455), IReturn(ERef(RefId(Id("""__x1__""")))).setId(8456))).setId(8473))
  val instToStepMap: Map[Int, Int] = HashMap(8446 -> 5, 8445 -> 5, 8444 -> 5, 8450 -> 6, 8447 -> 5, 8438 -> 2, 8454 -> 6, 8443 -> 3, 8442 -> 3, 8439 -> 2, 8455 -> 6, 8440 -> 2, 8456 -> 6, 8441 -> 4, 8457 -> 6, 8448 -> 5, 8449 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(8447, 8446, 8445, 8444, 8448, 8449), 6 -> HashSet(8450, 8454, 8455, 8456, 8457), 2 -> HashSet(8438, 8439, 8440), 3 -> HashSet(8443, 8442), 4 -> HashSet(8441))
  /* Beautified form:
  "ResolveBinding" (name, env) => {
    if (|| (= env absent) (= env undefined)) env = GLOBAL_context["LexicalEnvironment"] else {}
    if true let strict = true else let strict = false
    app __x0__ = (GetIdentifierReference env name strict)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
