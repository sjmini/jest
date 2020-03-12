package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MakeArgSetter {
  val length: Int = 2
  val func: Func = Func("""MakeArgSetter""", List(Id("""name"""), Id("""env""")), None, ISeq(List(ILet(Id("""steps"""), ERef(RefId(Id("""ArgSetter""")))).setId(56385), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Name"""), EStr("""Env"""))))).setId(56387), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(56388), IReturn(ERef(RefId(Id("""__x0__""")))).setId(56389)).setId(56390), ISeq(List()).setId(56408)).setId(56392), ILet(Id("""setter"""), ERef(RefId(Id("""__x0__""")))).setId(56393), IAssign(RefProp(RefId(Id("""setter""")), EStr("""Name""")), ERef(RefId(Id("""name""")))).setId(56395), IAssign(RefProp(RefId(Id("""setter""")), EStr("""Env""")), ERef(RefId(Id("""env""")))).setId(56397), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""setter"""))))).setId(56399), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56400))).setId(56415))
  val instToStepMap: Map[Int, Int] = HashMap(56393 -> 1, 56392 -> 1, 56385 -> 0, 56386 -> 0, 56401 -> 4, 56396 -> 2, 56395 -> 2, 56394 -> 1, 56387 -> 1, 56399 -> 4, 56397 -> 3, 56398 -> 3, 56400 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56385, 56386), 1 -> HashSet(56393, 56392, 56394, 56387), 2 -> HashSet(56396, 56395), 3 -> HashSet(56397, 56398), 4 -> HashSet(56399, 56401, 56400))
  /* Beautified form:
  "MakeArgSetter" (name, env) => {
    let steps = ArgSetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let setter = __x0__
    setter["Name"] = name
    setter["Env"] = env
    app __x1__ = (WrapCompletion setter)
    return __x1__
  }
  */
}
