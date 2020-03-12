package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTObjectDOTkeys {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Object.keys""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(65179), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(65180), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""O"""))))).setId(65182), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(65183), IReturn(ERef(RefId(Id("""__x1__""")))).setId(65184)).setId(65185), ISeq(List()).setId(65208)).setId(65187), ILet(Id("""obj"""), ERef(RefId(Id("""__x1__""")))).setId(65188), IApp(Id("""__x2__"""), ERef(RefId(Id("""EnumerableOwnPropertyNames"""))), List(ERef(RefId(Id("""obj"""))), EStr("""key"""))).setId(65190), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65191), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65192)).setId(65193), ISeq(List()).setId(65215)).setId(65194), ILet(Id("""nameList"""), ERef(RefId(Id("""__x2__""")))).setId(65195), IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateArrayFromList"""))), List(ERef(RefId(Id("""nameList"""))))).setId(65197), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(65198), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65199))).setId(65221))
  val instToStepMap: Map[Int, Int] = HashMap(65181 -> 0, 65200 -> 3, 65190 -> 2, 65196 -> 2, 65194 -> 2, 65182 -> 1, 65189 -> 1, 65188 -> 1, 65199 -> 3, 65180 -> 0, 65187 -> 1, 65179 -> 0, 65197 -> 3, 65198 -> 3, 65195 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(65181, 65179, 65180), 1 -> HashSet(65182, 65189, 65188, 65187), 2 -> HashSet(65190, 65196, 65194, 65195), 3 -> HashSet(65200, 65197, 65198, 65199))
  /* Beautified form:
  "GLOBAL.Object.keys" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let O = __x0__
    app __x1__ = (ToObject O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let obj = __x1__
    app __x2__ = (EnumerableOwnPropertyNames obj "key")
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let nameList = __x2__
    app __x3__ = (CreateArrayFromList nameList)
    app __x4__ = (WrapCompletion __x3__)
    return __x4__
  }
  */
}
