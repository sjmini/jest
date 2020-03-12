package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgSetter {
  val length: Int = 2
  val func: Func = Func("""ArgSetter""", List(Id("""_0"""), Id("""argumentsList"""), Id("""_1"""), Id("""f""")), None, ISeq(List(ILet(Id("""value"""), ERef(RefProp(RefId(Id("""argumentsList""")), EINum(0L)))).setId(56429), ILet(Id("""f"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(56431), ILet(Id("""name"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Name""")))).setId(56433), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Env""")))).setId(56435), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""SetMutableBinding"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), ERef(RefId(Id("""value"""))), EBool(false))).setId(56437), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(56438), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56439))).setId(56449))
  val instToStepMap: Map[Int, Int] = HashMap(56429 -> 0, 56438 -> 4, 56432 -> 1, 56434 -> 2, 56437 -> 4, 56433 -> 2, 56440 -> 4, 56436 -> 3, 56439 -> 4, 56435 -> 3, 56430 -> 0, 56431 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(56429, 56430), 1 -> HashSet(56432, 56431), 2 -> HashSet(56434, 56433), 3 -> HashSet(56436, 56435), 4 -> HashSet(56438, 56437, 56440, 56439))
  /* Beautified form:
  "ArgSetter" (_0, argumentsList, _1, f) => {
    let value = argumentsList[0i]
    let f = GLOBAL_context["Function"]
    let name = f["Name"]
    let env = f["Env"]
    app __x0__ = (env["SetMutableBinding"] env name value false)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
