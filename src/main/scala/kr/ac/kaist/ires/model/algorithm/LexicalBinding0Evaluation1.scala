package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object LexicalBinding0Evaluation1 {
  val length: Int = 0
  val func: Func = Func("""LexicalBinding0Evaluation1""", List(Id("""this"""), Id("""BindingIdentifier"""), Id("""Initializer""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""StringValue""")).setId(27301), ILet(Id("""bindingId"""), ERef(RefId(Id("""__x0__""")))).setId(27302), IApp(Id("""__x1__"""), ERef(RefId(Id("""ResolveBinding"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(27304), ILet(Id("""lhs"""), ERef(RefId(Id("""__x1__""")))).setId(27305), IApp(Id("""__x2__"""), ERef(RefId(Id("""IsAnonymousFunctionDefinition"""))), List(ERef(RefId(Id("""Initializer"""))))).setId(27307), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), EBool(true)), ISeq(List(IAccess(Id("""__x3__"""), ERef(RefId(Id("""Initializer"""))), EStr("""NamedEvaluation""")).setId(27308), IApp(Id("""__x4__"""), ERef(RefId(Id("""__x3__"""))), List(ERef(RefId(Id("""bindingId"""))))).setId(27309), ILet(Id("""value"""), ERef(RefId(Id("""__x4__""")))).setId(27310))).setId(27341), ISeq(List(IAccess(Id("""__x5__"""), ERef(RefId(Id("""Initializer"""))), EStr("""Evaluation""")).setId(27314), ILet(Id("""rhs"""), ERef(RefId(Id("""__x5__""")))).setId(27315), IApp(Id("""__x6__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rhs"""))))).setId(27317), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(27318), IReturn(ERef(RefId(Id("""__x6__""")))).setId(27319)).setId(27320), ISeq(List()).setId(27348)).setId(27322), ILet(Id("""value"""), ERef(RefId(Id("""__x6__""")))).setId(27323))).setId(27351)).setId(27326), IApp(Id("""__x7__"""), ERef(RefId(Id("""InitializeReferencedBinding"""))), List(ERef(RefId(Id("""lhs"""))), ERef(RefId(Id("""value"""))))).setId(27328), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x7__"""))))).setId(27329), IReturn(ERef(RefId(Id("""__x8__""")))).setId(27330))).setId(27356))
  val instToStepMap: Map[Int, Int] = HashMap(27315 -> 8, 27327 -> 8, 27323 -> 8, 27308 -> 4, 27312 -> 4, 27328 -> 9, 27304 -> 1, 27301 -> 0, 27303 -> 0, 27325 -> 8, 27310 -> 4, 27322 -> 8, 27302 -> 0, 27307 -> 8, 27324 -> 8, 27314 -> 8, 27309 -> 4, 27329 -> 9, 27305 -> 1, 27316 -> 8, 27317 -> 8, 27306 -> 1, 27326 -> 8, 27330 -> 9, 27331 -> 9, 27311 -> 4)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(27301, 27303, 27302), 1 -> HashSet(27304, 27305, 27306), 9 -> HashSet(27328, 27329, 27330, 27331), 7 -> HashSet(27315, 27314, 27316), 8 -> HashSet(27315, 27327, 27323, 27325, 27322, 27326, 27307, 27324, 27314, 27316, 27317), 4 -> HashSet(27308, 27312, 27309, 27310, 27311))
  /* Beautified form:
  "LexicalBinding0Evaluation1" (this, BindingIdentifier, Initializer) => {
    access __x0__ = (BindingIdentifier "StringValue")
    let bindingId = __x0__
    app __x1__ = (ResolveBinding bindingId)
    let lhs = __x1__
    app __x2__ = (IsAnonymousFunctionDefinition Initializer)
    if (= __x2__ true) {
      access __x3__ = (Initializer "NamedEvaluation")
      app __x4__ = (__x3__ bindingId)
      let value = __x4__
    } else {
      access __x5__ = (Initializer "Evaluation")
      let rhs = __x5__
      app __x6__ = (GetValue rhs)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      let value = __x6__
    }
    app __x7__ = (InitializeReferencedBinding lhs value)
    app __x8__ = (WrapCompletion __x7__)
    return __x8__
  }
  */
}
