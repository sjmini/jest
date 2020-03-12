package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ArgumentList1ArgumentListEvaluation0 {
  val length: Int = 0
  val func: Func = Func("""ArgumentList1ArgumentListEvaluation0""", List(Id("""this"""), Id("""AssignmentExpression""")), None, ISeq(List(ILet(Id("""list"""), EList(List())).setId(18036), IAccess(Id("""__x0__"""), ERef(RefId(Id("""AssignmentExpression"""))), EStr("""Evaluation""")).setId(18039), ILet(Id("""spreadRef"""), ERef(RefId(Id("""__x0__""")))).setId(18040), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""spreadRef"""))))).setId(18042), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(18043), IReturn(ERef(RefId(Id("""__x1__""")))).setId(18044)).setId(18045), ISeq(List()).setId(18088)).setId(18047), ILet(Id("""spreadObj"""), ERef(RefId(Id("""__x1__""")))).setId(18048), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""spreadObj"""))))).setId(18050), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(18051), IReturn(ERef(RefId(Id("""__x2__""")))).setId(18052)).setId(18053), ISeq(List()).setId(18095)).setId(18054), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x2__""")))).setId(18055), IWhile(EBool(true), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(18057), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(18058), IReturn(ERef(RefId(Id("""__x3__""")))).setId(18059)).setId(18060), ISeq(List()).setId(18102)).setId(18061), ILet(Id("""next"""), ERef(RefId(Id("""__x3__""")))).setId(18062), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""list"""))))).setId(18064), IReturn(ERef(RefId(Id("""__x4__""")))).setId(18065))).setId(18107), ISeq(List()).setId(18108)).setId(18067), IApp(Id("""__x5__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(18069), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(18070), IReturn(ERef(RefId(Id("""__x5__""")))).setId(18071)).setId(18072), ISeq(List()).setId(18114)).setId(18073), ILet(Id("""nextArg"""), ERef(RefId(Id("""__x5__""")))).setId(18074), IAppend(ERef(RefId(Id("""nextArg"""))), ERef(RefId(Id("""list""")))).setId(18076))).setId(18118)).setId(18079))).setId(18120))
  val instToStepMap: Map[Int, Int] = HashMap(18079 -> 10, 18050 -> 3, 18056 -> 3, 18069 -> 10, 18063 -> 10, 18055 -> 3, 18076 -> 10, 18049 -> 2, 18048 -> 2, 18064 -> 7, 18077 -> 10, 18067 -> 10, 18057 -> 10, 18041 -> 1, 18054 -> 3, 18066 -> 7, 18061 -> 10, 18078 -> 10, 18074 -> 10, 18042 -> 2, 18062 -> 10, 18040 -> 1, 18075 -> 10, 18037 -> 0, 18065 -> 7, 18047 -> 2, 18036 -> 0, 18068 -> 10, 18073 -> 10, 18039 -> 1)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(18037, 18036), 10 -> HashSet(18079, 18062, 18069, 18075, 18063, 18068, 18073, 18076, 18077, 18067, 18057, 18061, 18078, 18074), 1 -> HashSet(18040, 18039, 18041), 6 -> HashSet(18062, 18063, 18057, 18061), 9 -> HashSet(18069, 18075, 18073, 18074), 2 -> HashSet(18047, 18049, 18048, 18042), 7 -> HashSet(18065, 18064, 18066), 3 -> HashSet(18050, 18056, 18055, 18054), 8 -> HashSet(18068, 18067))
  /* Beautified form:
  "ArgumentList1ArgumentListEvaluation0" (this, AssignmentExpression) => {
    let list = (new [])
    access __x0__ = (AssignmentExpression "Evaluation")
    let spreadRef = __x0__
    app __x1__ = (GetValue spreadRef)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let spreadObj = __x1__
    app __x2__ = (GetIterator spreadObj)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let iteratorRecord = __x2__
    while true {
      app __x3__ = (IteratorStep iteratorRecord)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let next = __x3__
      if (= next false) {
        app __x4__ = (WrapCompletion list)
        return __x4__
      } else {}
      app __x5__ = (IteratorValue next)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let nextArg = __x5__
      append nextArg -> list
    }
  }
  */
}
