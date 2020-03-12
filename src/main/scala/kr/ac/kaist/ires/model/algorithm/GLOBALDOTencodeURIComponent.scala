package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTencodeURIComponent {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.encodeURIComponent""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(63577), ILet(Id("""uriComponent"""), ERef(RefId(Id("""__x0__""")))).setId(63578), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""uriComponent"""))))).setId(63580), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(63581), IReturn(ERef(RefId(Id("""__x1__""")))).setId(63582)).setId(63583), ISeq(List()).setId(63604)).setId(63585), ILet(Id("""componentString"""), ERef(RefId(Id("""__x1__""")))).setId(63586), IExpr(ENotSupported("""Etc""")).setId(63588), IApp(Id("""__x2__"""), ERef(RefId(Id("""Encode"""))), List(ERef(RefId(Id("""componentString"""))), ERef(RefId(Id("""unescapedURIComponentSet"""))))).setId(63589), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(63590), IReturn(ERef(RefId(Id("""__x2__""")))).setId(63591)).setId(63592), ISeq(List()).setId(63612)).setId(63593), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(63594), IReturn(ERef(RefId(Id("""__x3__""")))).setId(63595))).setId(63616))
  val instToStepMap: Map[Int, Int] = HashMap(63588 -> 2, 63578 -> 0, 63589 -> 3, 63585 -> 1, 63596 -> 3, 63577 -> 0, 63586 -> 1, 63580 -> 1, 63595 -> 3, 63593 -> 3, 63587 -> 1, 63579 -> 0, 63594 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = Map(0 -> HashSet(63578, 63577, 63579), 1 -> HashSet(63585, 63586, 63580, 63587), 2 -> HashSet(63588), 3 -> HashSet(63589, 63596, 63595, 63593, 63594))
  /* Beautified form:
  "GLOBAL.encodeURIComponent" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let uriComponent = __x0__
    app __x1__ = (ToString uriComponent)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let componentString = __x1__
    !!! "Etc"
    app __x2__ = (Encode componentString unescapedURIComponentSet)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    app __x3__ = (WrapCompletion __x2__)
    return __x3__
  }
  */
}
