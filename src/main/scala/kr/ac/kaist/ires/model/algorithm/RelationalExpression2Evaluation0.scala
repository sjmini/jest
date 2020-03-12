package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object RelationalExpression2Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""RelationalExpression2Evaluation0""", List(Id("""this"""), Id("""RelationalExpression"""), Id("""ShiftExpression""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""RelationalExpression"""))), EStr("""Evaluation""")).setId(20864), ILet(Id("""lref"""), ERef(RefId(Id("""__x0__""")))).setId(20865), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""lref"""))))).setId(20867), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(20868), IReturn(ERef(RefId(Id("""__x1__""")))).setId(20869)).setId(20870), ISeq(List()).setId(20911)).setId(20872), ILet(Id("""lval"""), ERef(RefId(Id("""__x1__""")))).setId(20873), IAccess(Id("""__x2__"""), ERef(RefId(Id("""ShiftExpression"""))), EStr("""Evaluation""")).setId(20876), ILet(Id("""rref"""), ERef(RefId(Id("""__x2__""")))).setId(20877), IApp(Id("""__x3__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""rref"""))))).setId(20879), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(20880), IReturn(ERef(RefId(Id("""__x3__""")))).setId(20881)).setId(20882), ISeq(List()).setId(20920)).setId(20883), ILet(Id("""rval"""), ERef(RefId(Id("""__x3__""")))).setId(20884), IApp(Id("""__x4__"""), ERef(RefId(Id("""AbstractRelationalComparison"""))), List(ERef(RefId(Id("""rval"""))), ERef(RefId(Id("""lval"""))), EBool(false))).setId(20887), ILet(Id("""r"""), ERef(RefId(Id("""__x4__""")))).setId(20888), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""r""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""r""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""r""")), ERef(RefProp(RefId(Id("""r""")), EStr("""Value""")))).setId(20890), IReturn(ERef(RefId(Id("""r""")))).setId(20891)).setId(20892), ISeq(List()).setId(20928)).setId(20893), IExpr(ERef(RefId(Id("""r""")))).setId(20894), IIf(EBOp(OEq, ERef(RefId(Id("""r"""))), EUndef), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(20896), IReturn(ERef(RefId(Id("""__x5__""")))).setId(20897))).setId(20933), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""r"""))))).setId(20899), IReturn(ERef(RefId(Id("""__x6__""")))).setId(20900))).setId(20936)).setId(20902))).setId(20938))
  val instToStepMap: Map[Int, Int] = HashMap(20885 -> 3, 20877 -> 2, 20876 -> 2, 20899 -> 6, 20898 -> 6, 20897 -> 6, 20873 -> 1, 20902 -> 6, 20894 -> 5, 20866 -> 0, 20903 -> 6, 20889 -> 4, 20867 -> 1, 20893 -> 5, 20887 -> 4, 20872 -> 1, 20864 -> 0, 20879 -> 3, 20896 -> 6, 20900 -> 6, 20883 -> 3, 20888 -> 4, 20901 -> 6, 20874 -> 1, 20865 -> 0, 20895 -> 5, 20884 -> 3, 20878 -> 2)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(20866, 20864, 20865), 5 -> HashSet(20894, 20893, 20895), 1 -> HashSet(20873, 20867, 20872, 20874), 6 -> HashSet(20902, 20903, 20899, 20896, 20900, 20901, 20898, 20897), 2 -> HashSet(20877, 20876, 20878), 3 -> HashSet(20885, 20879, 20883, 20884), 4 -> HashSet(20889, 20887, 20888))
  /* Beautified form:
  "RelationalExpression2Evaluation0" (this, RelationalExpression, ShiftExpression) => {
    access __x0__ = (RelationalExpression "Evaluation")
    let lref = __x0__
    app __x1__ = (GetValue lref)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let lval = __x1__
    access __x2__ = (ShiftExpression "Evaluation")
    let rref = __x2__
    app __x3__ = (GetValue rref)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let rval = __x3__
    app __x4__ = (AbstractRelationalComparison rval lval false)
    let r = __x4__
    if (= (typeof r) "Completion") if (= r["Type"] CONST_normal) r = r["Value"] else return r else {}
    r
    if (= r undefined) {
      app __x5__ = (WrapCompletion false)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion r)
      return __x6__
    }
  }
  */
}
