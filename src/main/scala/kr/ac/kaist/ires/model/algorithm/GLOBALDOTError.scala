package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTError {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Error""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(67932), ILet(Id("""message"""), ERef(RefId(Id("""__x0__""")))).setId(67933), IIf(EBOp(OEq, ERef(RefId(Id("""NewTarget"""))), EUndef), ILet(Id("""newTarget"""), ERef(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""Function""")))).setId(67935), ILet(Id("""newTarget"""), ERef(RefId(Id("""NewTarget""")))).setId(67937)).setId(67939), IApp(Id("""__x1__"""), ERef(RefId(Id("""OrdinaryCreateFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), EStr("""%ErrorPrototype%"""), EList(List(EStr("""ErrorData"""))))).setId(67941), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(67942), IReturn(ERef(RefId(Id("""__x1__""")))).setId(67943)).setId(67944), ISeq(List()).setId(67981)).setId(67946), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(67947), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""message"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""message"""))))).setId(67949), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(67950), IReturn(ERef(RefId(Id("""__x2__""")))).setId(67951)).setId(67952), ISeq(List()).setId(67988)).setId(67953), ILet(Id("""msg"""), ERef(RefId(Id("""__x2__""")))).setId(67954), ILet(Id("""msgDesc"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""msg""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(true))))).setId(67956), IApp(Id("""__x3__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), EStr("""message"""), ERef(RefId(Id("""msgDesc"""))))).setId(67958), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(67959), IReturn(ERef(RefId(Id("""__x3__""")))).setId(67960)).setId(67961), ISeq(List()).setId(67996)).setId(67962), IExpr(ERef(RefId(Id("""__x3__""")))).setId(67963))).setId(67999), ISeq(List()).setId(68000)).setId(67966), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""O"""))))).setId(67968), IReturn(ERef(RefId(Id("""__x4__""")))).setId(67969))).setId(68004))
  val instToStepMap: Map[Int, Int] = HashMap(67938 -> 1, 67955 -> 7, 67965 -> 7, 67941 -> 2, 67970 -> 9, 67957 -> 7, 67962 -> 7, 67940 -> 1, 67967 -> 8, 67935 -> 1, 67947 -> 2, 67958 -> 7, 67946 -> 2, 67966 -> 8, 67934 -> 0, 67953 -> 7, 67969 -> 9, 67933 -> 0, 67937 -> 1, 67954 -> 7, 67964 -> 7, 67932 -> 0, 67939 -> 1, 67956 -> 7, 67968 -> 9, 67949 -> 7, 67936 -> 1, 67948 -> 2, 67963 -> 7)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(67933, 67932, 67934), 5 -> HashSet(67955, 67954, 67949, 67953), 1 -> HashSet(67938, 67937, 67939, 67936, 67940, 67935), 6 -> HashSet(67956, 67957), 9 -> HashSet(67969, 67970, 67968), 2 -> HashSet(67941, 67948, 67947, 67946), 7 -> HashSet(67955, 67965, 67954, 67964, 67956, 67949, 67963, 67957, 67962, 67958, 67953), 8 -> HashSet(67967, 67966))
  /* Beautified form:
  "GLOBAL.Error" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let message = __x0__
    if (= NewTarget undefined) let newTarget = GLOBAL_context["Function"] else let newTarget = NewTarget
    app __x1__ = (OrdinaryCreateFromConstructor newTarget "%ErrorPrototype%" (new ["ErrorData"]))
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    if (! (= message undefined)) {
      app __x2__ = (ToString message)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let msg = __x2__
      let msgDesc = (new PropertyDescriptor("Value" -> msg, "Writable" -> true, "Enumerable" -> false, "Configurable" -> true))
      app __x3__ = (DefinePropertyOrThrow O "message" msgDesc)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      __x3__
    } else {}
    app __x4__ = (WrapCompletion O)
    return __x4__
  }
  */
}
