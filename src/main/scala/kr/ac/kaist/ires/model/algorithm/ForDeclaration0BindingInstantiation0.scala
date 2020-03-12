package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ForDeclaration0BindingInstantiation0 {
  val length: Int = 0
  val func: Func = Func("""ForDeclaration0BindingInstantiation0""", List(Id("""this"""), Id("""LetOrConst"""), Id("""ForBinding"""), Id("""environment""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""environment""")), EStr("""EnvironmentRecord""")))).setId(32563), IAccess(Id("""__x0__"""), ERef(RefId(Id("""ForBinding"""))), EStr("""BoundNames""")).setId(32566), ILet(Id("""__x1__"""), ERef(RefId(Id("""__x0__""")))).setId(32587), ILet(Id("""__x2__"""), EINum(0L)).setId(32588), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""name"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(32589), IAccess(Id("""__x3__"""), ERef(RefId(Id("""LetOrConst"""))), EStr("""IsConstantDeclaration""")).setId(32567), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(true))).setId(32568), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(32569), IReturn(ERef(RefId(Id("""__x4__""")))).setId(32570)).setId(32571), ISeq(List()).setId(32606)).setId(32572), IExpr(ERef(RefId(Id("""__x4__""")))).setId(32573))).setId(32609), ISeq(List(IApp(Id("""__x5__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""name"""))), EBool(false))).setId(32576), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(32577), IReturn(ERef(RefId(Id("""__x5__""")))).setId(32578)).setId(32579), ISeq(List()).setId(32614)).setId(32580), IExpr(ERef(RefId(Id("""__x5__""")))).setId(32581))).setId(32617)).setId(32584), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(32590))).setId(32620)).setId(32592))).setId(32622))
  val instToStepMap: Map[Int, Int] = HashMap(32565 -> 1, 32568 -> 6, 32587 -> 9, 32572 -> 6, 32583 -> 9, 32593 -> 9, 32580 -> 9, 32564 -> 0, 32586 -> 9, 32567 -> 9, 32585 -> 9, 32573 -> 6, 32588 -> 9, 32574 -> 6, 32592 -> 9, 32575 -> 6, 32582 -> 9, 32594 -> 9, 32584 -> 9, 32563 -> 0, 32581 -> 9, 32576 -> 9, 32566 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(32564, 32563), 1 -> HashSet(32565), 6 -> HashSet(32575, 32568, 32572, 32573, 32574), 9 -> HashSet(32582, 32587, 32583, 32593, 32580, 32586, 32567, 32581, 32585, 32588, 32592, 32594, 32584, 32576, 32566))
  /* Beautified form:
  "ForDeclaration0BindingInstantiation0" (this, LetOrConst, ForBinding, environment) => {
    let envRec = environment["EnvironmentRecord"]
    access __x0__ = (ForBinding "BoundNames")
    let __x1__ = __x0__
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let name = __x1__[__x2__]
      access __x3__ = (LetOrConst "IsConstantDeclaration")
      if (= __x3__ true) {
        app __x4__ = (envRec["CreateImmutableBinding"] envRec name true)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      } else {
        app __x5__ = (envRec["CreateMutableBinding"] envRec name false)
        if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
        __x5__
      }
      __x2__ = (+ __x2__ 1i)
    }
  }
  */
}
