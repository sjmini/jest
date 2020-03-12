package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgGetter {
  val length: Int = 2
  val func: Func = Func("""ArgGetter""", List(Id("""_0"""), Id("""_1"""), Id("""_2"""), Id("""f""")), None, ISeq(List(ILet(Id("""f"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(56360), ILet(Id("""name"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Name""")))).setId(56362), ILet(Id("""env"""), ERef(RefProp(RefId(Id("""f""")), EStr("""Env""")))).setId(56364), IApp(Id("""__x0__"""), ERef(RefProp(RefId(Id("""env""")), EStr("""GetBindingValue"""))), List(ERef(RefId(Id("""env"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(56366), IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x0__"""))))).setId(56367), IReturn(ERef(RefId(Id("""__x1__""")))).setId(56368))).setId(56377))
  val instToStepMap: Map[Int, Int] = HashMap(56364 -> 2, 56369 -> 3, 56363 -> 1, 56366 -> 3, 56367 -> 3, 56361 -> 0, 56360 -> 0, 56365 -> 2, 56368 -> 3, 56362 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(56361, 56360), 1 -> HashSet(56363, 56362), 2 -> HashSet(56365, 56364), 3 -> HashSet(56367, 56369, 56368, 56366))
  /* Beautified form:
  "ArgGetter" (_0, _1, _2, f) => {
    let f = GLOBAL_context["Function"]
    let name = f["Name"]
    let env = f["Env"]
    app __x0__ = (env["GetBindingValue"] env name false)
    app __x1__ = (WrapCompletion __x0__)
    return __x1__
  }
  */
}
