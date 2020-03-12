package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ModuleNamespaceExoticObjectDOTDefineOwnProperty {
  val length: Int = 2
  val func: Func = Func("""ModuleNamespaceExoticObject.DefineOwnProperty""", List(Id("""O"""), Id("""P"""), Id("""Desc""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""P"""))))).setId(57678), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Symbol""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryDefineOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))), ERef(RefId(Id("""Desc"""))))).setId(57679), IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x1__"""))))).setId(57680), IReturn(ERef(RefId(Id("""__x2__""")))).setId(57681))).setId(57733), ISeq(List()).setId(57734)).setId(57684), IApp(Id("""__x3__"""), ERef(RefProp(RefId(Id("""O""")), EStr("""GetOwnProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""P"""))))).setId(57686), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(57687), IReturn(ERef(RefId(Id("""__x3__""")))).setId(57688)).setId(57689), ISeq(List()).setId(57740)).setId(57690), ILet(Id("""current"""), ERef(RefId(Id("""__x3__""")))).setId(57691), IIf(EBOp(OEq, ERef(RefId(Id("""current"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57693), IReturn(ERef(RefId(Id("""__x4__""")))).setId(57694))).setId(57745), ISeq(List()).setId(57746)).setId(57696), IApp(Id("""__x5__"""), ERef(RefId(Id("""IsAccessorDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(57698), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57699), IReturn(ERef(RefId(Id("""__x6__""")))).setId(57700))).setId(57751), ISeq(List()).setId(57752)).setId(57702), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(false)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57704), IReturn(ERef(RefId(Id("""__x7__""")))).setId(57705))).setId(57756), ISeq(List()).setId(57757)).setId(57707), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EBool(false)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57709), IReturn(ERef(RefId(Id("""__x8__""")))).setId(57710))).setId(57761), ISeq(List()).setId(57762)).setId(57712), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(57714), IReturn(ERef(RefId(Id("""__x9__""")))).setId(57715))).setId(57766), ISeq(List()).setId(57767)).setId(57717), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Value"""))))).setId(57719), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(57720), IReturn(ERef(RefId(Id("""__x11__""")))).setId(57721))).setId(57772), ISeq(List()).setId(57773)).setId(57723), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(57725), IReturn(ERef(RefId(Id("""__x12__""")))).setId(57726))).setId(57777))
  val instToStepMap: Map[Int, Int] = HashMap(57697 -> 4, 57716 -> 11, 57692 -> 2, 57723 -> 14, 57704 -> 7, 57710 -> 9, 57707 -> 8, 57702 -> 6, 57685 -> 1, 57719 -> 13, 57708 -> 8, 57691 -> 2, 57712 -> 10, 57695 -> 3, 57680 -> 0, 57698 -> 6, 57724 -> 14, 57701 -> 5, 57713 -> 10, 57720 -> 13, 57696 -> 4, 57709 -> 9, 57684 -> 1, 57705 -> 7, 57727 -> 15, 57714 -> 11, 57682 -> 0, 57717 -> 12, 57706 -> 7, 57678 -> 1, 57693 -> 3, 57722 -> 13, 57700 -> 5, 57726 -> 15, 57703 -> 6, 57686 -> 2, 57681 -> 0, 57694 -> 3, 57690 -> 2, 57679 -> 0, 57715 -> 11, 57718 -> 12, 57721 -> 13, 57711 -> 9, 57725 -> 15, 57699 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(57680, 57682, 57681, 57679), 5 -> HashSet(57701, 57700, 57699), 10 -> HashSet(57712, 57713), 14 -> HashSet(57724, 57723), 1 -> HashSet(57684, 57678, 57685), 6 -> HashSet(57698, 57703, 57702), 9 -> HashSet(57709, 57710, 57711), 13 -> HashSet(57719, 57720, 57722, 57721), 2 -> HashSet(57691, 57692, 57686, 57690), 12 -> HashSet(57717, 57718), 7 -> HashSet(57705, 57704, 57706), 3 -> HashSet(57695, 57693, 57694), 11 -> HashSet(57716, 57714, 57715), 8 -> HashSet(57708, 57707), 4 -> HashSet(57697, 57696), 15 -> HashSet(57727, 57726, 57725))
  /* Beautified form:
  "ModuleNamespaceExoticObject.DefineOwnProperty" (O, P, Desc) => {
    app __x0__ = (Type P)
    if (= __x0__ Symbol) {
      app __x1__ = (OrdinaryDefineOwnProperty O P Desc)
      app __x2__ = (WrapCompletion __x1__)
      return __x2__
    } else {}
    app __x3__ = (O["GetOwnProperty"] O P)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let current = __x3__
    if (= current undefined) {
      app __x4__ = (WrapCompletion false)
      return __x4__
    } else {}
    app __x5__ = (IsAccessorDescriptor Desc)
    if (= __x5__ true) {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    if (= Desc["Writable"] false) {
      app __x7__ = (WrapCompletion false)
      return __x7__
    } else {}
    if (= Desc["Enumerable"] false) {
      app __x8__ = (WrapCompletion false)
      return __x8__
    } else {}
    if (= Desc["Configurable"] true) {
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    if (! (= Desc["Value"] absent)) {
      app __x10__ = (SameValue Desc["Value"] current["Value"])
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (WrapCompletion true)
    return __x12__
  }
  */
}
