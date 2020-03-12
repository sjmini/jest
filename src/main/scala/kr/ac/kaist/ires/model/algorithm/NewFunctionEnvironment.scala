package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object NewFunctionEnvironment {
  val length: Int = 2
  val func: Func = Func("""NewFunctionEnvironment""", List(Id("""F"""), Id("""newTarget""")), None, ISeq(List(ILet(Id("""env"""), EMap(Ty("""LexicalEnvironment"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8009), ILet(Id("""envRec"""), EMap(Ty("""FunctionEnvironmentRecord"""), List((EStr("""SubMap"""), EMap(Ty("""SubMap"""), List()))))).setId(8011), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""FunctionObject""")), ERef(RefId(Id("""F""")))).setId(8013), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""F""")), EStr("""ThisMode"""))), ERef(RefId(Id("""CONST_lexical""")))), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""lexical""")).setId(8015), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""ThisBindingStatus""")), EStr("""uninitialized""")).setId(8017)).setId(8019), ILet(Id("""home"""), ERef(RefProp(RefId(Id("""F""")), EStr("""HomeObject""")))).setId(8021), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""HomeObject""")), ERef(RefId(Id("""home""")))).setId(8023), IAssign(RefProp(RefId(Id("""envRec""")), EStr("""NewTarget""")), ERef(RefId(Id("""newTarget""")))).setId(8025), IAssign(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")), ERef(RefId(Id("""envRec""")))).setId(8027), IAssign(RefProp(RefId(Id("""env""")), EStr("""Outer""")), ERef(RefProp(RefId(Id("""F""")), EStr("""Environment""")))).setId(8029), IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""env"""))))).setId(8031), IReturn(ERef(RefId(Id("""__x0__""")))).setId(8032))).setId(8048))
  val instToStepMap: Map[Int, Int] = HashMap(8030 -> 11, 8012 -> 3, 8025 -> 9, 8022 -> 7, 8033 -> 12, 8013 -> 4, 8010 -> 2, 8032 -> 12, 8020 -> 6, 8024 -> 8, 8028 -> 10, 8011 -> 3, 8019 -> 6, 8023 -> 8, 8029 -> 11, 8018 -> 6, 8026 -> 9, 8021 -> 7, 8031 -> 12, 8009 -> 2, 8016 -> 5, 8014 -> 4, 8017 -> 6, 8008 -> 1, 8015 -> 5, 8027 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(8008), 5 -> HashSet(8016, 8015), 10 -> HashSet(8027, 8028), 1 -> HashSet(8008), 6 -> HashSet(8018, 8017, 8020, 8019), 9 -> HashSet(8025, 8026), 2 -> HashSet(8009, 8010), 12 -> HashSet(8033, 8031, 8032), 7 -> HashSet(8022, 8021), 3 -> HashSet(8012, 8011), 11 -> HashSet(8030, 8029), 8 -> HashSet(8024, 8023), 4 -> HashSet(8014, 8013))
  /* Beautified form:
  "NewFunctionEnvironment" (F, newTarget) => {
    let env = (new LexicalEnvironment("SubMap" -> (new SubMap())))
    let envRec = (new FunctionEnvironmentRecord("SubMap" -> (new SubMap())))
    envRec["FunctionObject"] = F
    if (= F["ThisMode"] CONST_lexical) envRec["ThisBindingStatus"] = "lexical" else envRec["ThisBindingStatus"] = "uninitialized"
    let home = F["HomeObject"]
    envRec["HomeObject"] = home
    envRec["NewTarget"] = newTarget
    env["EnvironmentRecord"] = envRec
    env["Outer"] = F["Environment"]
    app __x0__ = (WrapCompletion env)
    return __x0__
  }
  */
}
