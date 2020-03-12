package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTcodePointAt {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.String.prototype.codePointAt""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(70922), ILet(Id("""pos"""), ERef(RefId(Id("""__x0__""")))).setId(70923), IApp(Id("""__x1__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(70925), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(70926), IReturn(ERef(RefId(Id("""__x1__""")))).setId(70927)).setId(70928), ISeq(List()).setId(70971)).setId(70930), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(70931), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(70933), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(70934), IReturn(ERef(RefId(Id("""__x2__""")))).setId(70935)).setId(70936), ISeq(List()).setId(70978)).setId(70937), ILet(Id("""S"""), ERef(RefId(Id("""__x2__""")))).setId(70938), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""pos"""))))).setId(70940), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(70941), IReturn(ERef(RefId(Id("""__x3__""")))).setId(70942)).setId(70943), ISeq(List()).setId(70985)).setId(70944), ILet(Id("""position"""), ERef(RefId(Id("""__x3__""")))).setId(70945), ILet(Id("""size"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(70947), IIf(EBOp(OOr, EBOp(OLt, ERef(RefId(Id("""position"""))), EINum(0L)), EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""position"""))), ERef(RefId(Id("""size""")))))), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(70949), IReturn(ERef(RefId(Id("""__x4__""")))).setId(70950))).setId(70991), ISeq(List()).setId(70992)).setId(70952), IApp(Id("""__x5__"""), ERef(RefId(Id("""CodePointAt"""))), List(ERef(RefId(Id("""S"""))), ERef(RefId(Id("""position"""))))).setId(70954), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(70955), IReturn(ERef(RefId(Id("""__x5__""")))).setId(70956)).setId(70957), ISeq(List()).setId(70998)).setId(70958), ILet(Id("""cp"""), ERef(RefId(Id("""__x5__""")))).setId(70959), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""cp""")), EStr("""CodePoint"""))))).setId(70961), IReturn(ERef(RefId(Id("""__x6__""")))).setId(70962))).setId(71003))
  val instToStepMap: Map[Int, Int] = HashMap(70948 -> 4, 70923 -> 0, 70951 -> 5, 70961 -> 8, 70949 -> 5, 70950 -> 5, 70939 -> 2, 70924 -> 0, 70938 -> 2, 70953 -> 6, 70931 -> 1, 70959 -> 7, 70937 -> 2, 70933 -> 2, 70932 -> 1, 70952 -> 6, 70958 -> 7, 70945 -> 3, 70962 -> 8, 70930 -> 1, 70925 -> 1, 70922 -> 0, 70940 -> 3, 70944 -> 3, 70954 -> 7, 70947 -> 4, 70946 -> 3, 70963 -> 8, 70960 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(70923, 70922, 70924), 5 -> HashSet(70951, 70949, 70950), 1 -> HashSet(70932, 70930, 70925, 70931), 6 -> HashSet(70952, 70953), 2 -> HashSet(70937, 70933, 70939, 70938), 7 -> HashSet(70959, 70958, 70954, 70960), 3 -> HashSet(70945, 70940, 70944, 70946), 8 -> HashSet(70961, 70962, 70963), 4 -> HashSet(70948, 70947))
  /* Beautified form:
  "GLOBAL.String.prototype.codePointAt" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let pos = __x0__
    app __x1__ = (RequireObjectCoercible this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (ToString O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let S = __x2__
    app __x3__ = (ToInteger pos)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let position = __x3__
    let size = S["length"]
    if (|| (< position 0i) (! (< position size))) {
      app __x4__ = (WrapCompletion undefined)
      return __x4__
    } else {}
    app __x5__ = (CodePointAt S position)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let cp = __x5__
    app __x6__ = (WrapCompletion cp["CodePoint"])
    return __x6__
  }
  */
}
