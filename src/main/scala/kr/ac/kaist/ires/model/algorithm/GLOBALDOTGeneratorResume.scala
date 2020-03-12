package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTGeneratorResume {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GeneratorResume""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(89056), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(89057), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(89059), ILet(Id("""value"""), ERef(RefId(Id("""__x1__""")))).setId(89060), IApp(Id("""__x2__"""), ERef(RefId(Id("""GeneratorValidate"""))), List(ERef(RefId(Id("""generator"""))))).setId(89062), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(89063), IReturn(ERef(RefId(Id("""__x2__""")))).setId(89064)).setId(89065), ISeq(List()).setId(89111)).setId(89067), ILet(Id("""state"""), ERef(RefId(Id("""__x2__""")))).setId(89068), IIf(EBOp(OEq, ERef(RefId(Id("""state"""))), EStr("""completed""")), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(EUndef, EBool(true))).setId(89070), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x3__"""))))).setId(89071), IReturn(ERef(RefId(Id("""__x4__""")))).setId(89072))).setId(89117), ISeq(List()).setId(89118)).setId(89074), ILet(Id("""genContext"""), ERef(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")))).setId(89076), ILet(Id("""methodContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(89078), IAssign(RefId(Id("""GLOBAL_context""")), ENull).setId(89080), IAssign(RefId(Id("""methodContext""")), ENull).setId(89081), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""executing""")).setId(89083), IAppend(ERef(RefId(Id("""genContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(89085), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(89086), IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(ERef(RefId(Id("""value"""))))).setId(89088), IWithCont(Id("""__x6__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")), EList(List())).setId(89089), ISeq(List()).setId(89129)).setId(89092), IAppend(ERef(RefId(Id("""__x6__"""))), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ReturnCont""")))).setId(89093), IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(89094))).setId(89133)).setId(89096), IApp(Id("""__x8__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(89098), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(89099), IReturn(ERef(RefId(Id("""__x9__""")))).setId(89100))).setId(89138))
  val instToStepMap: Map[Int, Int] = HashMap(89075 -> 4, 89076 -> 6, 89082 -> 8, 89098 -> 13, 89077 -> 6, 89078 -> 7, 89060 -> 1, 89070 -> 3, 89068 -> 2, 89099 -> 13, 89087 -> 10, 89095 -> 11, 89057 -> 0, 89083 -> 9, 89092 -> 11, 89079 -> 7, 89061 -> 1, 89086 -> 10, 89096 -> 11, 89080 -> 8, 89097 -> 11, 89085 -> 10, 89101 -> 13, 89067 -> 2, 89073 -> 3, 89058 -> 0, 89072 -> 3, 89093 -> 11, 89081 -> 8, 89074 -> 4, 89066 -> 12, 89069 -> 2, 89062 -> 2, 89088 -> 11, 89094 -> 11, 89071 -> 3, 89056 -> 0, 89059 -> 1, 89100 -> 13, 89084 -> 9)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(89057, 89058, 89056), 5 -> HashSet(89066), 10 -> HashSet(89087, 89086, 89085), 1 -> HashSet(89060, 89061, 89059), 6 -> HashSet(89076, 89077), 9 -> HashSet(89083, 89084), 13 -> HashSet(89099, 89098, 89101, 89100), 2 -> HashSet(89068, 89067, 89069, 89062), 12 -> HashSet(89066), 7 -> HashSet(89078, 89079), 3 -> HashSet(89070, 89073, 89072, 89071), 11 -> HashSet(89095, 89092, 89096, 89097, 89093, 89088, 89094), 8 -> HashSet(89082, 89080, 89081), 4 -> HashSet(89075, 89074))
  /* Beautified form:
  "GLOBAL.GeneratorResume" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let value = __x1__
    app __x2__ = (GeneratorValidate generator)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let state = __x2__
    if (= state "completed") {
      app __x3__ = (CreateIterResultObject undefined true)
      app __x4__ = (WrapCompletion __x3__)
      return __x4__
    } else {}
    let genContext = generator["GeneratorContext"]
    let methodContext = GLOBAL_context
    GLOBAL_context = null
    methodContext = null
    generator["GeneratorState"] = "executing"
    append genContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    app __x5__ = (NormalCompletion value)
    withcont __x6__ (result) ={
      if (= genContext["ReturnCont"] absent) genContext["ReturnCont"] = (new []) else {}
      append __x6__ -> genContext["ReturnCont"]
      app __x7__ = (genContext["ResumeCont"] __x5__)
    }
    app __x8__ = (Completion result)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
