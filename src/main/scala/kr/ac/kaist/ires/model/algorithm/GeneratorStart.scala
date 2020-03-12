package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GeneratorStart {
  val length: Int = 2
  val func: Func = Func("""GeneratorStart""", List(Id("""generator"""), Id("""generatorBody""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10280), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(10282), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")).setId(10316), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(10317), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")).setId(10319), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(10320), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(10322), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(10323))).setId(10367), ISeq(List()).setId(10368)).setId(10326), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(10327), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")).setId(10329), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ILet(Id("""resultValue"""), EUndef).setId(10332), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(10334), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(10337), IApp(Id("""__x3__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(10338))).setId(10376)).setId(10341)).setId(10343), IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""resultValue"""))), EBool(true))).setId(10345), IApp(Id("""__x5__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(10346))).setId(10381))).setId(10349), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")), ERef(RefId(Id("""genContext""")))).setId(10350), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedStart""")).setId(10352), IApp(Id("""__x6__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(10354), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(10355), IReturn(ERef(RefId(Id("""__x7__""")))).setId(10356))).setId(10388))
  val instToStepMap: Map[Int, Int] = HashMap(10282 -> 2, 10351 -> 17, 10309 -> 15, 10313 -> 16, 10353 -> 18, 10349 -> 16, 10301 -> 10, 10290 -> 16, 10352 -> 18, 10355 -> 19, 10299 -> 16, 10314 -> 16, 10286 -> 16, 10305 -> 15, 10356 -> 19, 10303 -> 11, 10350 -> 17, 10295 -> 16, 10281 -> 1, 10298 -> 16, 10285 -> 16, 10306 -> 15, 10302 -> 11, 10310 -> 16, 10289 -> 16, 10297 -> 16, 10279 -> 16, 10296 -> 16, 10311 -> 16, 10354 -> 19, 10307 -> 15, 10288 -> 16, 10283 -> 2, 10300 -> 10, 10315 -> 16, 10357 -> 19, 10312 -> 16, 10280 -> 1, 10308 -> 15, 10287 -> 16, 10304 -> 15)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10279), 5 -> HashSet(10286, 10285, 10287), 10 -> HashSet(10301, 10300), 14 -> HashSet(10279), 1 -> HashSet(10281, 10280), 6 -> HashSet(10289, 10290, 10288), 9 -> HashSet(10279), 2 -> HashSet(10282, 10283), 17 -> HashSet(10351, 10350), 7 -> HashSet(10295, 10297, 10296), 18 -> HashSet(10353, 10352), 16 -> HashSet(10286, 10313, 10285, 10349, 10311, 10290, 10288, 10315, 10312, 10287, 10299, 10314, 10295, 10298, 10310, 10289, 10297, 10279, 10296), 11 -> HashSet(10303, 10302), 8 -> HashSet(10299, 10298), 19 -> HashSet(10356, 10354, 10357, 10355), 15 -> HashSet(10305, 10309, 10306, 10310, 10279, 10311, 10307, 10308, 10304))
  /* Beautified form:
  "GeneratorStart" (generator, generatorBody) => {
    let genContext = GLOBAL_context
    genContext["Generator"] = generator
    genContext["ResumeCont"] = () [=>] {
      access __x0__ = (generatorBody "Evaluation")
      let result = __x0__
      access __ret__ = (genContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
        __x1__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x1__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      generator["GeneratorState"] = "completed"
      if (= result["Type"] CONST_normal) let resultValue = undefined else if (= result["Type"] CONST_return) let resultValue = result["Value"] else {
        app __x2__ = (Completion result)
        app __x3__ = (__ret__ __x2__)
      }
      app __x4__ = (CreateIterResultObject resultValue true)
      app __x5__ = (__ret__ __x4__)
    }
    generator["GeneratorContext"] = genContext
    generator["GeneratorState"] = "suspendedStart"
    app __x6__ = (NormalCompletion undefined)
    app __x7__ = (WrapCompletion __x6__)
    return __x7__
  }
  */
}
