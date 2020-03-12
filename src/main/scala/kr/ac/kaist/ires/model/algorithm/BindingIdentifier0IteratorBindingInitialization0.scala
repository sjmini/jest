package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object BindingIdentifier0IteratorBindingInitialization0 {
  val length: Int = 0
  val func: Func = Func("""BindingIdentifier0IteratorBindingInitialization0""", List(Id("""BindingIdentifier"""), Id("""_"""), Id("""iteratorRecord"""), Id("""environment""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(38846), ILet(Id("""next"""), ERef(RefId(Id("""__x0__""")))).setId(38847), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""next"""))))).setId(38849), IIf(ERef(RefId(Id("""__x1__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(38850), ISeq(List()).setId(38893)).setId(38852), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""next""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""next""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""next""")), ERef(RefProp(RefId(Id("""next""")), EStr("""Value""")))).setId(38854), IReturn(ERef(RefId(Id("""next""")))).setId(38855)).setId(38856), ISeq(List()).setId(38898)).setId(38857), IExpr(ERef(RefId(Id("""next""")))).setId(38858), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(38860), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(38862), ILet(Id("""v"""), ERef(RefId(Id("""__x2__""")))).setId(38863), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""v"""))))).setId(38865), IIf(ERef(RefId(Id("""__x3__"""))), IAssign(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done""")), EBool(true)).setId(38866), ISeq(List()).setId(38906)).setId(38868), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""v""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""v""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""v""")), ERef(RefProp(RefId(Id("""v""")), EStr("""Value""")))).setId(38870), IReturn(ERef(RefId(Id("""v""")))).setId(38871)).setId(38872), ISeq(List()).setId(38911)).setId(38873), IExpr(ERef(RefId(Id("""v""")))).setId(38874))).setId(38914)).setId(38877), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""iteratorRecord""")), EStr("""Done"""))), EBool(true)), ILet(Id("""v"""), EUndef).setId(38879), ISeq(List()).setId(38917)).setId(38881), IAccess(Id("""__x4__"""), ERef(RefId(Id("""BindingIdentifier"""))), EStr("""BindingInitialization""")).setId(38883), IApp(Id("""__x5__"""), ERef(RefId(Id("""__x4__"""))), List(ERef(RefId(Id("""v"""))), ERef(RefId(Id("""environment"""))))).setId(38884), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(38885), IReturn(ERef(RefId(Id("""__x6__""")))).setId(38886))).setId(38923))
  val instToStepMap: Map[Int, Int] = HashMap(38880 -> 12, 38876 -> 11, 38859 -> 4, 38886 -> 14, 38877 -> 11, 38862 -> 11, 38882 -> 13, 38849 -> 3, 38874 -> 11, 38878 -> 11, 38866 -> 9, 38864 -> 11, 38860 -> 5, 38858 -> 4, 38887 -> 14, 38851 -> 2, 38848 -> 1, 38883 -> 14, 38861 -> 5, 38868 -> 11, 38869 -> 11, 38850 -> 2, 38873 -> 11, 38845 -> 0, 38867 -> 9, 38846 -> 1, 38881 -> 13, 38857 -> 4, 38853 -> 3, 38863 -> 11, 38852 -> 3, 38875 -> 11, 38879 -> 12, 38847 -> 1, 38865 -> 11, 38885 -> 14, 38884 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(38845), 5 -> HashSet(38861, 38860), 10 -> HashSet(38865, 38868, 38869), 14 -> HashSet(38887, 38883, 38886, 38885, 38884), 1 -> HashSet(38848, 38846, 38847), 9 -> HashSet(38867, 38866), 13 -> HashSet(38882, 38881), 2 -> HashSet(38851, 38850), 12 -> HashSet(38880, 38879), 3 -> HashSet(38849, 38853, 38852), 11 -> HashSet(38876, 38873, 38877, 38862, 38874, 38878, 38863, 38875, 38864, 38865, 38868, 38869), 8 -> HashSet(38862, 38863, 38864), 4 -> HashSet(38859, 38857, 38858))
  /* Beautified form:
  "BindingIdentifier0IteratorBindingInitialization0" (BindingIdentifier, _, iteratorRecord, environment) => {
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
