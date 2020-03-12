package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object MakeArgGetter {
  val length: Int = 2
  val func: Func = Func("""MakeArgGetter""", List(Id("""name"""), Id("""env""")), None, ISeq(List(ILet(Id("""steps"""), ERef(RefId(Id("""ArgGetter""")))).setId(56316), IApp(Id("""__x0__"""), ERef(RefId(Id("""CreateBuiltinFunction"""))), List(ERef(RefId(Id("""steps"""))), EList(List(EStr("""Name"""), EStr("""Env"""))))).setId(56318), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(56319), IReturn(ERef(RefId(Id("""__x0__""")))).setId(56320)).setId(56321), ISeq(List()).setId(56339)).setId(56323), ILet(Id("""getter"""), ERef(RefId(Id("""__x0__""")))).setId(56324), IAssign(RefProp(RefId(Id("""getter""")), EStr("""Name""")), ERef(RefId(Id("""name""")))).setId(56326), IAssign(RefProp(RefId(Id("""getter""")), EStr("""Env""")), ERef(RefId(Id("""env""")))).setId(56328), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""getter"""))))).setId(56330), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56331))).setId(56346))
  val instToStepMap: Map[Int, Int] = HashMap(56325 -> 1, 56329 -> 3, 56328 -> 3, 56317 -> 0, 56326 -> 2, 56316 -> 0, 56332 -> 4, 56331 -> 4, 56323 -> 1, 56330 -> 4, 56318 -> 1, 56324 -> 1, 56327 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56317, 56316), 1 -> HashSet(56325, 56323, 56318, 56324), 2 -> HashSet(56326, 56327), 3 -> HashSet(56329, 56328), 4 -> HashSet(56332, 56331, 56330))
  /* Beautified form:
  "MakeArgGetter" (name, env) => {
    let steps = ArgGetter
    app __x0__ = (CreateBuiltinFunction steps (new ["Name", "Env"]))
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let getter = __x0__
    getter["Name"] = name
    getter["Env"] = env
    app __x1__ = (WrapCompletion getter)
    return __x1__
  }
  */
}
