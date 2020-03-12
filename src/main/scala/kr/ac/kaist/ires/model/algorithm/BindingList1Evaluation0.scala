package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingList1Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""BindingList1Evaluation0""", List(Id("""this"""), Id("""BindingList"""), Id("""LexicalBinding""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingList"""))), EStr("""Evaluation""")).setId(27238), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(27239), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(27241), IReturn(ERef(RefId(Id("""next""")))).setId(27242)).setId(27243), ISeq(List()).setId(27259)).setId(27245), IExpr(ERef(RefId(Id("""next""")))).setId(27246), IAccess(Id("""__x1__"""), ERef(RefId(Id("""LexicalBinding"""))), EStr("""Evaluation""")).setId(27249), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(27250), IReturn(ERef(RefId(Id("""__x2__""")))).setId(27251))).setId(27265))
  val instToStepMap: Map[Int, Int] = HashMap(27250 -> 2, 27245 -> 1, 27240 -> 0, 27249 -> 2, 27239 -> 0, 27246 -> 1, 27252 -> 2, 27238 -> 0, 27251 -> 2, 27247 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(27240, 27239, 27238), 1 -> HashSet(27245, 27246, 27247), 2 -> HashSet(27250, 27249, 27252, 27251))
  /* Beautified form:
  "BindingList1Evaluation0" (this, BindingList, LexicalBinding) => {
    access __x0__ = (BindingList "Evaluation")
    let next = __x0__
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    access __x1__ = (LexicalBinding "Evaluation")
    app __x2__ = (WrapCompletion __x1__)
    return __x2__
  }
  */
}
