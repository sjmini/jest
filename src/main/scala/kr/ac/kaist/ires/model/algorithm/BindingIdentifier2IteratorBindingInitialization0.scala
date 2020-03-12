package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier2IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier2IteratorBindingInitialization0""", List(Id("""BindingIdentifier"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(39074), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(39075), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(39077), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39078), ISeq(List()).setId(39121)).setId(39080), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(39082), IReturn(ERef(RefId(Id("""next""")))).setId(39083)).setId(39084), ISeq(List()).setId(39126)).setId(39085), IExpr(ERef(RefId(Id("""next""")))).setId(39086), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39088), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(39090), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(39091), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(39093), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(39094), ISeq(List()).setId(39134)).setId(39096), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(39098), IReturn(ERef(RefId(Id("""v""")))).setId(39099)).setId(39100), ISeq(List()).setId(39139)).setId(39101), IExpr(ERef(RefId(Id("""v""")))).setId(39102))).setId(39142)).setId(39105), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(39107), ISeq(List()).setId(39145)).setId(39109), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")).setId(39111), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(39112), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(39113), IReturn(ERef(RefId(Id("""__x6__""")))).setId(39114))).setId(39151))
  val instToStepMap: Map[Int, Int] = HashMap(39081 -> 3, 39080 -> 3, 39087 -> 4, 39102 -> 11, 39097 -> 11, 39077 -> 3, 39073 -> 0, 39086 -> 4, 39104 -> 11, 39085 -> 4, 39096 -> 11, 39079 -> 2, 39114 -> 14, 39075 -> 1, 39093 -> 11, 39113 -> 14, 39089 -> 5, 39108 -> 12, 39076 -> 1, 39112 -> 14, 39109 -> 13, 39094 -> 9, 39090 -> 11, 39105 -> 11, 39101 -> 11, 39095 -> 9, 39115 -> 14, 39110 -> 13, 39078 -> 2, 39091 -> 11, 39074 -> 1, 39106 -> 11, 39088 -> 5, 39103 -> 11, 39107 -> 12, 39092 -> 11, 39111 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(39073), 5 -> HashSet(39089, 39088), 10 -> HashSet(39093, 39097, 39096), 14 -> HashSet(39113, 39112, 39115, 39114, 39111), 1 -> HashSet(39076, 39074, 39075), 9 -> HashSet(39094, 39095), 13 -> HashSet(39109, 39110), 2 -> HashSet(39078, 39079), 12 -> HashSet(39108, 39107), 3 -> HashSet(39081, 39080, 39077), 11 -> HashSet(39093, 39102, 39097, 39104, 39096, 39103, 39092, 39090, 39105, 39101, 39091, 39106), 8 -> HashSet(39090, 39091, 39092), 4 -> HashSet(39087, 39086, 39085))
  /* Beautified form:
  "BindingIdentifier2IteratorBindingInitialization0" (BindingIdentifier, iteratorRecord, environment) => {
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
