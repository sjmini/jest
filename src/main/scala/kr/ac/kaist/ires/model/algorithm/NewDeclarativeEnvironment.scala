package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewDeclarativeEnvironment {
  val length: Int = 1
  val func: Func = Func("""NewDeclarativeEnvironment""", List(Id("""E""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(7956), ILet(Id("""envRec"""), EMap(Ty("""DeclarativeEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(7958), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))).setId(7960), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefId(Id("""E""")))).setId(7962), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))).setId(7964), IReturn(ERef(RefId(Id("""__x0__""")))).setId(7965))).setId(7974))
  val instToStepMap: Map[Int, Int] = HashMap(7958 -> 1, 7961 -> 2, 7965 -> 4, 7957 -> 0, 7962 -> 3, 7966 -> 4, 7963 -> 3, 7960 -> 2, 7956 -> 0, 7964 -> 4, 7959 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(7957, 7956), 1 -> HashSet(7958, 7959), 2 -> HashSet(7961, 7960), 3 -> HashSet(7962, 7963), 4 -> HashSet(7965, 7966, 7964))
  /* Beautified form:
  "NewDeclarativeEnvironment" (E) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new DeclarativeEnvironmentRecord("SubMap" -> (new SubMap())))
    env["EnvironmentRecord"] = envRec
    env["Outer"] = E
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
