package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object TrimString {
  val length: Int = 2
  val func: Func = Func("""TrimString""", List(Id("""string"""), Id("""where""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""string"""))))).setId(74293), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(74294), IReturn(ERef(RefId(Id("""__x0__""")))).setId(74295)).setId(74296), ISeq(List()).setId(74327)).setId(74298), ILet(Id("""str"""), ERef(RefId(Id("""__x0__""")))).setId(74299), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""str"""))))).setId(74301), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(74302), IReturn(ERef(RefId(Id("""__x1__""")))).setId(74303)).setId(74304), ISeq(List()).setId(74334)).setId(74305), ILet(Id("""S"""), ERef(RefId(Id("""__x1__""")))).setId(74306), IIf(EBOp(OEq, ERef(RefId(Id("""where"""))), EStr("""start""")), ILet(Id("""T"""), ENotSupported("""StringOp""")).setId(74308), IIf(EBOp(OEq, ERef(RefId(Id("""where"""))), EStr("""end""")), ILet(Id("""T"""), ENotSupported("""StringOp""")).setId(74310), ILet(Id("""T"""), ENotSupported("""StringOp""")).setId(74312)).setId(74315)).setId(74317), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""T"""))))).setId(74319), IReturn(ERef(RefId(Id("""__x2__""")))).setId(74320))).setId(74344))
  val instToStepMap: Map[Int, Int] = HashMap(74309 -> 2, 74317 -> 7, 74297 -> 7, 74293 -> 0, 74314 -> 7, 74308 -> 2, 74313 -> 7, 74318 -> 7, 74315 -> 7, 74300 -> 0, 74307 -> 1, 74311 -> 3, 74321 -> 8, 74320 -> 8, 74306 -> 1, 74298 -> 0, 74305 -> 1, 74312 -> 7, 74299 -> 0, 74316 -> 7, 74319 -> 8, 74310 -> 3, 74301 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(74298, 74293, 74299, 74300), 1 -> HashSet(74305, 74307, 74301, 74306), 6 -> HashSet(74297), 2 -> HashSet(74309, 74308), 7 -> HashSet(74317, 74297, 74312, 74314, 74313, 74318, 74315, 74316), 3 -> HashSet(74311, 74310), 8 -> HashSet(74321, 74319, 74320))
  /* Beautified form:
  "TrimString" (string, where) => {
    app __x0__ = (RequireObjectCoercible string)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let str = __x0__
    app __x1__ = (ToString str)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let S = __x1__
    if (= where "start") let T = !!! "StringOp" else if (= where "end") let T = !!! "StringOp" else let T = !!! "StringOp"
    app __x2__ = (WrapCompletion T)
    return __x2__
  }
  */
}
