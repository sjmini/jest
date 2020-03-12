package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorExpression0Evaluation0 {
  val length: Int = 0
  val func: Func = Func("""AsyncGeneratorExpression0Evaluation0""", List(Id("""this"""), Id("""FormalParameters"""), Id("""AsyncGeneratorBody""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(41934), ILet(Id("""scope"""), ERef(RefId(Id("""__x0__""")))).setId(41935), IApp(Id("""__x1__"""), ERef(RefId(Id("""AsyncGeneratorFunctionCreate"""))), List(ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""FormalParameters"""))), ERef(RefId(Id("""AsyncGeneratorBody"""))), ERef(RefId(Id("""scope"""))))).setId(41937), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(41938), IReturn(ERef(RefId(Id("""__x1__""")))).setId(41939)).setId(41940), ISeq(List()).setId(41971)).setId(41942), ILet(Id("""closure"""), ERef(RefId(Id("""__x1__""")))).setId(41943), IApp(Id("""__x2__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncGeneratorPrototype"""))))).setId(41945), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(41946), IReturn(ERef(RefId(Id("""__x2__""")))).setId(41947)).setId(41948), ISeq(List()).setId(41978)).setId(41949), ILet(Id("""prototype"""), ERef(RefId(Id("""__x2__""")))).setId(41950), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""closure"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(41952), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(41953), IReturn(ERef(RefId(Id("""__x3__""")))).setId(41954)).setId(41955), ISeq(List()).setId(41985)).setId(41956), IExpr(ERef(RefId(Id("""__x3__""")))).setId(41957), IAssign(RefProp(RefId(Id("""closure""")), EStr("""SourceText""")), EGetSyntax(ERef(RefId(Id("""this"""))))).setId(41959), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""closure"""))))).setId(41961), IReturn(ERef(RefId(Id("""__x4__""")))).setId(41962))).setId(41991))
  val instToStepMap: Map[Int, Int] = HashMap(41950 -> 2, 41957 -> 3, 41945 -> 2, 41943 -> 1, 41951 -> 2, 41962 -> 5, 41956 -> 3, 41961 -> 5, 41942 -> 1, 41963 -> 5, 41959 -> 4, 41944 -> 1, 41935 -> 0, 41952 -> 3, 41949 -> 2, 41937 -> 1, 41934 -> 0, 41960 -> 4, 41936 -> 0, 41958 -> 3)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(41934, 41935, 41936), 5 -> HashSet(41962, 41961, 41963), 1 -> HashSet(41943, 41942, 41944, 41937), 2 -> HashSet(41950, 41945, 41951, 41949), 3 -> HashSet(41957, 41956, 41952, 41958), 4 -> HashSet(41960, 41959))
  /* Beautified form:
  "AsyncGeneratorExpression0Evaluation0" (this, FormalParameters, AsyncGeneratorBody) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let scope = __x0__
    app __x1__ = (AsyncGeneratorFunctionCreate CONST_Normal FormalParameters AsyncGeneratorBody scope)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let closure = __x1__
    app __x2__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let prototype = __x2__
    app __x3__ = (DefinePropertyOrThrow closure "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    __x3__
    closure["SourceText"] = (get-syntax this)
    app __x4__ = (WrapCompletion closure)
    return __x4__
  }
  */
}
