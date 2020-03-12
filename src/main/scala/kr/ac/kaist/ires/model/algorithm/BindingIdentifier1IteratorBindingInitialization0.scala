package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier1IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier1IteratorBindingInitialization0""", List(Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(38960), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(38961), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(38963), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(38964), ISeq(List()).setId(39007)).setId(38966), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(38968), IReturn(ERef(RefId(Id("""next""")))).setId(38969)).setId(38970), ISeq(List()).setId(39012)).setId(38971), IExpr(ERef(RefId(Id("""next""")))).setId(38972), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(38974), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(38976), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(38977), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(38979), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(38980), ISeq(List()).setId(39020)).setId(38982), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(38984), IReturn(ERef(RefId(Id("""v""")))).setId(38985)).setId(38986), ISeq(List()).setId(39025)).setId(38987), IExpr(ERef(RefId(Id("""v""")))).setId(38988))).setId(39028)).setId(38991), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(38993), ISeq(List()).setId(39031)).setId(38995), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")).setId(38997), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(38998), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(38999), IReturn(ERef(RefId(Id("""__x6__""")))).setId(39000))).setId(39037))
  val instToStepMap: Map[Int, Int] = HashMap(38960 -> 1, 38964 -> 2, 38991 -> 11, 38987 -> 11, 38963 -> 3, 39001 -> 14, 38990 -> 11, 38988 -> 11, 38973 -> 4, 38989 -> 11, 38966 -> 3, 38959 -> 0, 38961 -> 1, 38992 -> 11, 38965 -> 2, 38975 -> 5, 38997 -> 14, 38971 -> 4, 38983 -> 11, 38993 -> 12, 38978 -> 11, 38998 -> 14, 38976 -> 11, 38967 -> 3, 38982 -> 11, 38994 -> 12, 38977 -> 11, 38972 -> 4, 38999 -> 14, 38962 -> 1, 38981 -> 9, 38995 -> 13, 38980 -> 9, 39000 -> 14, 38974 -> 5, 38996 -> 13, 38979 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(38959), 5 -> HashSet(38975, 38974), 10 -> HashSet(38983, 38982, 38979), 14 -> HashSet(38997, 38998, 39001, 38999, 39000), 1 -> HashSet(38960, 38962, 38961), 9 -> HashSet(38981, 38980), 13 -> HashSet(38995, 38996), 2 -> HashSet(38964, 38965), 12 -> HashSet(38993, 38994), 3 -> HashSet(38963, 38967, 38966), 11 -> HashSet(38991, 38987, 38976, 38982, 38990, 38977, 38988, 38989, 38979, 38992, 38983, 38978), 8 -> HashSet(38978, 38976, 38977), 4 -> HashSet(38971, 38972, 38973))
  /* Beautified form:
  "BindingIdentifier1IteratorBindingInitialization0" (BindingIdentifier, iteratorRecord, environment) => {
    app __x0__ = (IteratorStep iteratorRecord)
    let next = __x0__
    app __x1__ = (IsAbruptCompletion next)
    if __x1__ iteratorRecord["Done"] = true else {}
    if (= (typeof next) "Completion") if (= next["Type"] CONST_normal) next = next["Value"] else return next else {}
    next
    if (= next false) iteratorRecord["Done"] = true else {
      app __x2__ = (IteratorValue next)
      let v = __x2__
      app __x3__ = (IsAbruptCompletion v)
      if __x3__ iteratorRecord["Done"] = true else {}
      if (= (typeof v) "Completion") if (= v["Type"] CONST_normal) v = v["Value"] else return v else {}
      v
    }
    if (= iteratorRecord["Done"] true) let v = undefined else {}
    access __x4__ = (BindingIdentifier "BindingInitialization")
    app __x5__ = (__x4__ v environment)
    app __x6__ = (WrapCompletion __x5__)
    return __x6__
  }
  */
}
