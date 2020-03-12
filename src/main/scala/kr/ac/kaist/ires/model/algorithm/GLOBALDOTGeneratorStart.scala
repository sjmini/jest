package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTGeneratorStart {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.GeneratorStart""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(88836), ILet(Id("""generator"""), ERef(RefId(Id("""__x0__""")))).setId(88837), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(88839), ILet(Id("""generatorBody"""), ERef(RefId(Id("""__x1__""")))).setId(88840), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(88843), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(88845), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x2__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")).setId(88881), ILet(Id("""result"""), ERef(RefId(Id("""__x2__""")))).setId(88882), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")).setId(88884), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(88885), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x3__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(88887), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x3__"""))))).setId(88888))).setId(88938), ISeq(List()).setId(88939)).setId(88891), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(88892), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""completed""")).setId(88894), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ILet(Id("""resultValue"""), EUndef).setId(88897), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(88899), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""result"""))))).setId(88902), IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(88903), IReturn(ERef(RefId(Id("""__x5__""")))).setId(88904))).setId(88948)).setId(88907)).setId(88909), IApp(Id("""__x6__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""resultValue"""))), EBool(true))).setId(88911), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x6__"""))))).setId(88912), IReturn(ERef(RefId(Id("""__x7__""")))).setId(88913))).setId(88954))).setId(88916), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorContext""")), ERef(RefId(Id("""genContext""")))).setId(88917), IAssign(RefProp(RefId(Id("""generator""")), EStr("""GeneratorState""")), EStr("""suspendedStart""")).setId(88919), IApp(Id("""__x8__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(88921), IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x8__"""))))).setId(88922), IReturn(ERef(RefId(Id("""__x9__""")))).setId(88923))).setId(88961))
  val instToStepMap: Map[Int, Int] = HashMap(88869 -> 17, 88919 -> 20, 88865 -> 13, 88863 -> 12, 88860 -> 18, 88873 -> 17, 88877 -> 18, 88867 -> 17, 88858 -> 18, 88853 -> 18, 88843 -> 3, 88920 -> 20, 88844 -> 3, 88837 -> 0, 88876 -> 18, 88862 -> 18, 88916 -> 18, 88840 -> 1, 88859 -> 18, 88923 -> 21, 88852 -> 18, 88846 -> 4, 88841 -> 1, 88878 -> 18, 88872 -> 17, 88836 -> 0, 88845 -> 4, 88924 -> 21, 88868 -> 17, 88851 -> 18, 88918 -> 19, 88874 -> 18, 88842 -> 18, 88871 -> 17, 88850 -> 18, 88861 -> 18, 88839 -> 1, 88864 -> 12, 88879 -> 18, 88921 -> 21, 88875 -> 18, 88922 -> 21, 88866 -> 13, 88917 -> 19, 88880 -> 18, 88870 -> 17, 88848 -> 18, 88838 -> 0, 88849 -> 18)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(88837, 88836, 88838), 10 -> HashSet(88862, 88861), 20 -> HashSet(88919, 88920), 1 -> HashSet(88840, 88841, 88839), 21 -> HashSet(88923, 88924, 88921, 88922), 9 -> HashSet(88859, 88860, 88858), 13 -> HashSet(88865, 88866), 2 -> HashSet(88842), 17 -> HashSet(88869, 88873, 88872, 88868, 88871, 88867, 88875, 88870, 88874, 88842), 12 -> HashSet(88863, 88864), 7 -> HashSet(88850, 88848, 88849), 3 -> HashSet(88844, 88843), 18 -> HashSet(88852, 88860, 88878, 88877, 88851, 88850, 88861, 88879, 88858, 88853, 88875, 88876, 88862, 88916, 88859, 88874, 88842, 88880, 88848, 88849), 16 -> HashSet(88842), 11 -> HashSet(88842), 8 -> HashSet(88852, 88851, 88853), 19 -> HashSet(88918, 88917), 4 -> HashSet(88846, 88845))
  /* Beautified form:
  "GLOBAL.GeneratorStart" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let generator = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let generatorBody = __x1__
    let genContext = GLOBAL_context
    genContext["Generator"] = generator
    genContext["ResumeCont"] = () [=>] {
      access __x2__ = (generatorBody "Evaluation")
      let result = __x2__
      access __ret__ = (genContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] genContext) {
        __x3__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x3__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      generator["GeneratorState"] = "completed"
      if (= result["Type"] CONST_normal) let resultValue = undefined else if (= result["Type"] CONST_return) let resultValue = result["Value"] else {
        app __x4__ = (Completion result)
        app __x5__ = (WrapCompletion __x4__)
        return __x5__
      }
      app __x6__ = (CreateIterResultObject resultValue true)
      app __x7__ = (WrapCompletion __x6__)
      return __x7__
    }
    generator["GeneratorContext"] = genContext
    generator["GeneratorState"] = "suspendedStart"
    app __x8__ = (NormalCompletion undefined)
    app __x9__ = (WrapCompletion __x8__)
    return __x9__
  }
  */
}
