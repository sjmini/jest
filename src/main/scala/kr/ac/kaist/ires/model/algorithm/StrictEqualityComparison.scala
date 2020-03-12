package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object StrictEqualityComparison {
  val length: Int = 0
  val func: Func = Func("""StrictEqualityComparison""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4836), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4837), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4838), IReturn(ERef(RefId(Id("""__x2__""")))).setId(4839))).setId(4885), ISeq(List()).setId(4886)).setId(4842), IApp(Id("""__x3__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4844), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), ERef(RefId(Id("""Number""")))), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4845), IReturn(ERef(RefId(Id("""__x4__""")))).setId(4846))).setId(4891), ISeq(List()).setId(4892)).setId(4848), IIf(EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4850), IReturn(ERef(RefId(Id("""__x5__""")))).setId(4851))).setId(4896), ISeq(List()).setId(4897)).setId(4853), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4855), IReturn(ERef(RefId(Id("""__x6__""")))).setId(4856))).setId(4901), ISeq(List()).setId(4902)).setId(4858), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""y"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4860), IReturn(ERef(RefId(Id("""__x7__""")))).setId(4861))).setId(4906), ISeq(List()).setId(4907)).setId(4863), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""y"""))), EINum(0L))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4865), IReturn(ERef(RefId(Id("""__x8__""")))).setId(4866))).setId(4911), ISeq(List()).setId(4912)).setId(4868), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4870), IReturn(ERef(RefId(Id("""__x9__""")))).setId(4871))).setId(4916), ISeq(List()).setId(4917)).setId(4874), IApp(Id("""__x10__"""), ERef(RefId(Id("""SameValueNonNumber"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(4876), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(4877), IReturn(ERef(RefId(Id("""__x11__""")))).setId(4878))).setId(4922))
  val instToStepMap: Map[Int, Int] = HashMap(4866 -> 12, 4862 -> 10, 4842 -> 1, 4853 -> 14, 4849 -> 14, 4846 -> 4, 4850 -> 6, 4844 -> 15, 4864 -> 14, 4875 -> 15, 4838 -> 0, 4843 -> 1, 4865 -> 12, 4852 -> 6, 4877 -> 16, 4839 -> 0, 4870 -> 14, 4856 -> 8, 4857 -> 8, 4847 -> 4, 4871 -> 14, 4878 -> 16, 4836 -> 1, 4845 -> 4, 4840 -> 0, 4860 -> 10, 4861 -> 10, 4867 -> 12, 4872 -> 14, 4874 -> 15, 4837 -> 1, 4854 -> 14, 4868 -> 14, 4879 -> 16, 4859 -> 14, 4851 -> 6, 4873 -> 14, 4855 -> 8, 4869 -> 14, 4848 -> 14, 4876 -> 16, 4863 -> 14, 4858 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(4839, 4840, 4838), 5 -> HashSet(4849, 4848), 10 -> HashSet(4862, 4860, 4861), 14 -> HashSet(4870, 4871, 4853, 4849, 4872, 4854, 4864, 4873, 4869, 4848, 4868, 4859, 4863, 4858), 1 -> HashSet(4842, 4836, 4837, 4843), 6 -> HashSet(4852, 4850, 4851), 9 -> HashSet(4859, 4858), 13 -> HashSet(4868, 4869), 12 -> HashSet(4866, 4867, 4865), 7 -> HashSet(4853, 4854), 16 -> HashSet(4877, 4878, 4879, 4876), 11 -> HashSet(4864, 4863), 8 -> HashSet(4856, 4857, 4855), 4 -> HashSet(4847, 4845, 4846), 15 -> HashSet(4874, 4844, 4875))
  /* Beautified form:
  "StrictEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (! (= __x0__ __x1__)) {
      app __x2__ = (WrapCompletion false)
      return __x2__
    } else {}
    app __x3__ = (Type x)
    if (= __x3__ Number) {
      if (= x NaN) {
        app __x4__ = (WrapCompletion false)
        return __x4__
      } else {}
      if (= y NaN) {
        app __x5__ = (WrapCompletion false)
        return __x5__
      } else {}
      if (= x y) {
        app __x6__ = (WrapCompletion true)
        return __x6__
      } else {}
      if (&& (= x 0i) (= y -0.0)) {
        app __x7__ = (WrapCompletion true)
        return __x7__
      } else {}
      if (&& (= x -0.0) (= y 0i)) {
        app __x8__ = (WrapCompletion true)
        return __x8__
      } else {}
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (SameValueNonNumber x y)
    app __x11__ = (WrapCompletion __x10__)
    return __x11__
  }
  */
}
