package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTreplace {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.replace""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(72674), ILet(Id("""searchValue"""), ERef(RefId(Id("""__x0__""")))).setId(72675), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(72677), ILet(Id("""replaceValue"""), ERef(RefId(Id("""__x1__""")))).setId(72678), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(72680), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(72681), IReturn(ERef(RefId(Id("""__x2__""")))).setId(72682)).setId(72683), ISeq(List()).setId(72774)).setId(72685), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(72686), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""searchValue"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""searchValue"""))), ENull))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""searchValue"""))), ERef(RefId(Id("""SYMBOL_replace"""))))).setId(72688), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(72689), IReturn(ERef(RefId(Id("""__x3__""")))).setId(72690)).setId(72691), ISeq(List()).setId(72781)).setId(72692), ILet(Id("""replacer"""), ERef(RefId(Id("""__x3__""")))).setId(72693), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""replacer"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""replacer"""))), ERef(RefId(Id("""searchValue"""))), EList(List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""replaceValue"""))))))).setId(72695), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(72696), IReturn(ERef(RefId(Id("""__x4__""")))).setId(72697)).setId(72698), ISeq(List()).setId(72788)).setId(72699), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(72700), IReturn(ERef(RefId(Id("""__x5__""")))).setId(72701))).setId(72792), ISeq(List()).setId(72793)).setId(72704))).setId(72795), ISeq(List()).setId(72796)).setId(72707), IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(72709), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(72710), IReturn(ERef(RefId(Id("""__x6__""")))).setId(72711)).setId(72712), ISeq(List()).setId(72802)).setId(72713), ILet(Id("""string"""), ERef(RefId(Id("""__x6__""")))).setId(72714), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""searchValue"""))))).setId(72716), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(72717), IReturn(ERef(RefId(Id("""__x7__""")))).setId(72718)).setId(72719), ISeq(List()).setId(72809)).setId(72720), ILet(Id("""searchString"""), ERef(RefId(Id("""__x7__""")))).setId(72721), IApp(Id("""__x8__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""replaceValue"""))))).setId(72723), ILet(Id("""functionalReplace"""), ERef(RefId(Id("""__x8__""")))).setId(72724), IIf(EBOp(OEq, ERef(RefId(Id("""functionalReplace"""))), EBool(false)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""replaceValue"""))))).setId(72726), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(72727), IReturn(ERef(RefId(Id("""__x9__""")))).setId(72728)).setId(72729), ISeq(List()).setId(72818)).setId(72730), IAssign(RefId(Id("""replaceValue""")), ERef(RefId(Id("""__x9__""")))).setId(72731))).setId(72821), ISeq(List()).setId(72822)).setId(72734), IExpr(ENotSupported("""Etc""")).setId(72736), IIf(EBOp(OEq, ERef(RefId(Id("""functionalReplace"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""replaceValue"""))), EUndef, EList(List(ERef(RefId(Id("""matched"""))), ERef(RefId(Id("""pos"""))), ERef(RefId(Id("""string"""))))))).setId(72737), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(72738), IReturn(ERef(RefId(Id("""__x10__""")))).setId(72739)).setId(72740), ISeq(List()).setId(72829)).setId(72741), ILet(Id("""replValue"""), ERef(RefId(Id("""__x10__""")))).setId(72742), IApp(Id("""__x11__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""replValue"""))))).setId(72744), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(72745), IReturn(ERef(RefId(Id("""__x11__""")))).setId(72746)).setId(72747), ISeq(List()).setId(72836)).setId(72748), ILet(Id("""replStr"""), ERef(RefId(Id("""__x11__""")))).setId(72749))).setId(72839), ISeq(List(ILet(Id("""captures"""), EList(List())).setId(72752), IApp(Id("""__x12__"""), ERef(RefId(Id("""GetSubstitution"""))), List(ERef(RefId(Id("""matched"""))), ERef(RefId(Id("""string"""))), ERef(RefId(Id("""pos"""))), ERef(RefId(Id("""captures"""))), EUndef, ERef(RefId(Id("""replaceValue"""))))).setId(72754), ILet(Id("""replStr"""), ERef(RefId(Id("""__x12__""")))).setId(72755))).setId(72843)).setId(72758), ILet(Id("""tailPos"""), EBOp(OPlus, ERef(RefId(Id("""pos"""))), ERef(RefProp(RefId(Id("""matched""")), EStr("""length"""))))).setId(72760), IExpr(ENotSupported("""Etc""")).setId(72736), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""newString"""))))).setId(72762), IReturn(ERef(RefId(Id("""__x13__""")))).setId(72763))).setId(72849))
  val instToStepMap: Map[Int, Int] = HashMap(72714 -> 10, 72735 -> 16, 72704 -> 8, 72760 -> 26, 72759 -> 25, 72748 -> 21, 72702 -> 8, 72716 -> 11, 72687 -> 2, 72694 -> 8, 72721 -> 11, 72680 -> 2, 72763 -> 28, 72731 -> 15, 72742 -> 21, 72752 -> 25, 72720 -> 11, 72692 -> 8, 72755 -> 25, 72675 -> 0, 72723 -> 12, 72750 -> 21, 72700 -> 8, 72743 -> 21, 72726 -> 15, 72764 -> 28, 72732 -> 15, 72701 -> 8, 72758 -> 25, 72741 -> 21, 72679 -> 1, 72705 -> 8, 72736 -> 27, 72686 -> 2, 72737 -> 21, 72709 -> 10, 72706 -> 8, 72674 -> 0, 72715 -> 10, 72678 -> 1, 72725 -> 12, 72685 -> 2, 72761 -> 26, 72722 -> 11, 72708 -> 9, 72754 -> 25, 72757 -> 25, 72695 -> 8, 72677 -> 1, 72753 -> 25, 72733 -> 15, 72676 -> 0, 72707 -> 9, 72751 -> 21, 72734 -> 16, 72756 -> 25, 72703 -> 8, 72693 -> 8, 72688 -> 8, 72724 -> 12, 72744 -> 21, 72730 -> 15, 72749 -> 21, 72699 -> 8, 72762 -> 28, 72713 -> 10)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(72675, 72674, 72676), 5 -> HashSet(72692, 72694, 72693, 72688), 10 -> HashSet(72714, 72709, 72715, 72713), 20 -> HashSet(72742, 72743, 72741, 72737), 1 -> HashSet(72679, 72678, 72677), 9 -> HashSet(72708, 72707), 2 -> HashSet(72680, 72686, 72685, 72687), 17 -> HashSet(72736), 27 -> HashSet(72736), 12 -> HashSet(72723, 72725, 72724), 16 -> HashSet(72735, 72734), 11 -> HashSet(72720, 72722, 72716, 72721), 26 -> HashSet(72760, 72761), 8 -> HashSet(72692, 72704, 72700, 72701, 72705, 72706, 72695, 72702, 72694, 72688, 72699, 72703, 72693), 15 -> HashSet(72731, 72726, 72732, 72733, 72730), 24 -> HashSet(72752, 72753), 25 -> HashSet(72752, 72755, 72758, 72759, 72753, 72756, 72754, 72757), 28 -> HashSet(72763, 72764, 72762), 21 -> HashSet(72742, 72741, 72737, 72748, 72751, 72750, 72743, 72744, 72749))
  /* Beautified form:
  "GLOBAL.String.prototype.replace" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let searchValue = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let replaceValue = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    if (! (|| (= searchValue undefined) (= searchValue null))) {
      app __x3__ = (GetMethod searchValue SYMBOL_replace)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let replacer = __x3__
      if (! (= replacer undefined)) {
        app __x4__ = (Call replacer searchValue (new [O, replaceValue]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
    } else {}
    app __x6__ = (ToString O)
    if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
    let string = __x6__
    app __x7__ = (ToString searchValue)
    if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
    let searchString = __x7__
    app __x8__ = (IsCallable replaceValue)
    let functionalReplace = __x8__
    if (= functionalReplace false) {
      app __x9__ = (ToString replaceValue)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      replaceValue = __x9__
    } else {}
    !!! "Etc"
    if (= functionalReplace true) {
      app __x10__ = (Call replaceValue undefined (new [matched, pos, string]))
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      let replValue = __x10__
      app __x11__ = (ToString replValue)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      let replStr = __x11__
    } else {
      let captures = (new [])
      app __x12__ = (GetSubstitution matched string pos captures undefined replaceValue)
      let replStr = __x12__
    }
    let tailPos = (+ pos matched["length"])
    !!! "Etc"
    app __x13__ = (WrapCompletion newString)
    return __x13__
  }
  */
}
