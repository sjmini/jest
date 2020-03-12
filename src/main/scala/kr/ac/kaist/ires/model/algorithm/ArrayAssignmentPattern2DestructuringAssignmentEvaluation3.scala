package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArrayAssignmentPattern2DestructuringAssignmentEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""ArrayAssignmentPattern2DestructuringAssignmentEvaluation3""", List(Id("""this"""), Id("""AssignmentElementList"""), Id("""Elision"""), Id("""AssignmentRestElement"""), Id("""value""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""value"""))))).setId(23965), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(23966), IReturn(ERef(RefId(Id("""__x0__""")))).setId(23967)).setId(23968), ISeq(List()).setId(24036)).setId(23970), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x0__""")))).setId(23971), IAccess(Id("""__x1__"""), ERef(RefId(Id("""AssignmentElementList"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(23973), IApp(Id("""__x2__"""), ERef(RefId(Id("""__x1__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(23974), ILet(Id("""status"""), ERef(RefId(Id("""__x2__""")))).setId(23975), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(23977), IIf(ERef(RefId(Id("""__x3__"""))), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(23978), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(23979), IReturn(ERef(RefId(Id("""__x4__""")))).setId(23980)).setId(23981), ISeq(List()).setId(24047)).setId(23982), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(23983), IReturn(ERef(RefId(Id("""__x5__""")))).setId(23984))).setId(24051), ISeq(List()).setId(24052)).setId(23986), IApp(Id("""__x6__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(23988), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(23989), IReturn(ERef(RefId(Id("""__x7__""")))).setId(23990))).setId(24057), ISeq(List()).setId(24058)).setId(23993), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""Elision"""))), EAbsent)), ISeq(List(IAccess(Id("""__x8__"""), ERef(RefId(Id("""Elision"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(23995), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(23996), IAssign(RefId(Id("""status""")), ERef(RefId(Id("""__x9__""")))).setId(23997), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(23999), IIf(ERef(RefId(Id("""__x10__"""))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(24000), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(24001), IReturn(ERef(RefId(Id("""__x12__""")))).setId(24002))).setId(24067), ISeq(List()).setId(24068)).setId(24005))).setId(24070), ISeq(List()).setId(24071)).setId(24008), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""AssignmentRestElement"""))), EAbsent)), ISeq(List(IAccess(Id("""__x13__"""), ERef(RefId(Id("""AssignmentRestElement"""))), EStr("""IteratorDestructuringAssignmentEvaluation""")).setId(24010), IApp(Id("""__x14__"""), ERef(RefId(Id("""__x13__"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(24011), IAssign(RefId(Id("""status""")), ERef(RefId(Id("""__x14__""")))).setId(24012))).setId(24076), ISeq(List()).setId(24077)).setId(24015), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""status"""))))).setId(24017), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(24018), IReturn(ERef(RefId(Id("""__x15__""")))).setId(24019)).setId(24020), ISeq(List()).setId(24083)).setId(24021), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x15__"""))))).setId(24022), IReturn(ERef(RefId(Id("""__x16__""")))).setId(24023))).setId(24087), ISeq(List()).setId(24088)).setId(24025), IApp(Id("""__x17__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(24027), IApp(Id("""__x18__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x17__"""))))).setId(24028), IReturn(ERef(RefId(Id("""__x18__""")))).setId(24029))).setId(24093))
  val instToStepMap: Map[Int, Int] = HashMap(23974 -> 1, 23985 -> 4, 24003 -> 14, 23998 -> 14, 23965 -> 0, 24016 -> 19, 23984 -> 4, 23969 -> 14, 23996 -> 14, 24015 -> 19, 24028 -> 22, 24005 -> 14, 23992 -> 6, 24024 -> 20, 24009 -> 15, 24013 -> 18, 23988 -> 6, 23977 -> 7, 23973 -> 1, 24000 -> 14, 24001 -> 14, 23983 -> 4, 24021 -> 20, 24006 -> 14, 23995 -> 14, 24027 -> 22, 23970 -> 0, 23989 -> 6, 24012 -> 18, 24017 -> 20, 23999 -> 14, 24002 -> 14, 24022 -> 20, 23986 -> 6, 24026 -> 21, 24011 -> 18, 23990 -> 6, 23971 -> 0, 23975 -> 1, 24030 -> 22, 24025 -> 21, 24010 -> 18, 23972 -> 0, 23991 -> 6, 24023 -> 20, 24008 -> 15, 23982 -> 4, 23993 -> 7, 24014 -> 18, 24029 -> 22, 23987 -> 6, 23978 -> 4, 23994 -> 7, 23976 -> 1, 24007 -> 14, 24004 -> 14, 23997 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(23970, 23971, 23965, 23972), 5 -> HashSet(23986, 23987), 10 -> HashSet(23996, 23995, 23998, 23997), 14 -> HashSet(24003, 23998, 23969, 23996, 24005, 24000, 24001, 24006, 23995, 23999, 24002, 24007, 24004, 23997), 20 -> HashSet(24024, 24021, 24017, 24022, 24023), 1 -> HashSet(23973, 23974, 23975, 23976), 6 -> HashSet(23992, 23988, 23989, 23986, 23990, 23991, 23987), 21 -> HashSet(24026, 24025), 13 -> HashSet(23969), 22 -> HashSet(24028, 24027, 24030, 24029), 7 -> HashSet(23977, 23993, 23994), 18 -> HashSet(24013, 24012, 24011, 24010, 24014), 19 -> HashSet(24015, 24016), 4 -> HashSet(23983, 23985, 23982, 23978, 23984), 15 -> HashSet(24009, 24008))
  /* Beautified form:
  "ArrayAssignmentPattern2DestructuringAssignmentEvaluation3" (this, AssignmentElementList, Elision, AssignmentRestElement, value) => {
    app __x0__ = (GetIterator value)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let iteratorRecord = __x0__
    access __x1__ = (AssignmentElementList "IteratorDestructuringAssignmentEvaluation")
    app __x2__ = (__x1__ iteratorRecord)
    let status = __x2__
    app __x3__ = (IsAbruptCompletion status)
    if __x3__ {
      if (= iteratorRecord["Done"] false) {
        app __x4__ = (IteratorClose iteratorRecord status)
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      } else {}
      app __x6__ = (Completion status)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    } else {}
    if (! (= Elision absent)) {
      access __x8__ = (Elision "IteratorDestructuringAssignmentEvaluation")
      app __x9__ = (__x8__ iteratorRecord)
      status = __x9__
      app __x10__ = (IsAbruptCompletion status)
      if __x10__ {
        app __x11__ = (Completion status)
        app __x12__ = (WrapCompletion __x11__)
        return __x12__
      } else {}
    } else {}
    if (! (= AssignmentRestElement absent)) {
      access __x13__ = (AssignmentRestElement "IteratorDestructuringAssignmentEvaluation")
      app __x14__ = (__x13__ iteratorRecord)
      status = __x14__
    } else {}
    if (= iteratorRecord["Done"] false) {
      app __x15__ = (IteratorClose iteratorRecord status)
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (WrapCompletion __x15__)
      return __x16__
    } else {}
    app __x17__ = (Completion status)
    app __x18__ = (WrapCompletion __x17__)
    return __x18__
  }
  */
}
