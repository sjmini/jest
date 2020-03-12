package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SetFunctionName {
  val length: Int = 2
  val func: Func = Func("""SetFunctionName""", List(Id("""F"""), Id("""name"""), Id("""prefix""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""name"""))))).setId(52460), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(ILet(Id("""description"""), ERef(RefProp(RefId(Id("""name""")), EStr("""Description""")))).setId(52461), IIf(EBOp(OEq, ERef(RefId(Id("""description"""))), EUndef), IAssign(RefId(Id("""name""")), EStr("""""")).setId(52463), IAssign(RefId(Id("""name""")), EBOp(OPlus, EBOp(OPlus, EStr("""["""), ERef(RefId(Id("""description""")))), EStr("""]"""))).setId(52465)).setId(52467))).setId(52491), ISeq(List()).setId(52492)).setId(52470), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""prefix"""))), EAbsent)), IAssign(RefId(Id("""name""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""prefix"""))), EStr(""" """)), ERef(RefId(Id("""name"""))))).setId(52472), ISeq(List()).setId(52495)).setId(52475), IApp(Id("""__x1__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""name"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""name""")))), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true)))))).setId(52477), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(52478), IReturn(ERef(RefId(Id("""__x1__""")))).setId(52479)).setId(52480), ISeq(List()).setId(52501)).setId(52481), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(52482), IReturn(ERef(RefId(Id("""__x2__""")))).setId(52483))).setId(52505))
  val instToStepMap: Map[Int, Int] = HashMap(52470 -> 8, 52483 -> 13, 52473 -> 11, 52463 -> 6, 52469 -> 7, 52472 -> 11, 52461 -> 7, 52475 -> 12, 52484 -> 13, 52471 -> 8, 52462 -> 7, 52476 -> 12, 52466 -> 7, 52459 -> 2, 52460 -> 8, 52465 -> 7, 52477 -> 13, 52464 -> 6, 52474 -> 11, 52482 -> 13, 52468 -> 7, 52467 -> 7, 52481 -> 13)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(52459), 5 -> HashSet(52461, 52462), 1 -> HashSet(52459), 6 -> HashSet(52463, 52464), 13 -> HashSet(52483, 52477, 52482, 52484, 52481), 2 -> HashSet(52459), 12 -> HashSet(52476, 52475), 7 -> HashSet(52466, 52465, 52469, 52468, 52461, 52467, 52462), 11 -> HashSet(52473, 52474, 52472), 8 -> HashSet(52470, 52460, 52471))
  /* Beautified form:
  "SetFunctionName" (F, name, prefix) => {
    app __x0__ = (Type name)
    if (= __x0__ Symbol) {
      let description = name["Description"]
      if (= description undefined) name = "" else name = (+ (+ "[" description) "]")
    } else {}
    if (! (= prefix absent)) name = (+ (+ prefix " ") name) else {}
    app __x1__ = (DefinePropertyOrThrow F "name" (new PropertyDescriptor("Value" -> name, "Writable" -> false, "Enumerable" -> false, "Configurable" -> true)))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
