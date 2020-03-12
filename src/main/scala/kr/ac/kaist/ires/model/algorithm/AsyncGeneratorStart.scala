package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncGeneratorStart {
  val length: Int = 2
  val func: Func = Func("""AsyncGeneratorStart""", List(Id("""generator"""), Id("""generatorBody""")), None, ISeq(List(ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(10825), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))).setId(10827), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")).setId(10870), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(10871), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")).setId(10873), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(10874), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(10876), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(10877))).setId(10932), ISeq(List()).setId(10933)).setId(10880), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(10881), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")).setId(10883), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal"""))))), ILet(Id("""resultValue"""), EUndef).setId(10885), ISeq(List(ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(10887), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))))).setId(10889), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(10890), IReturn(ERef(RefId(Id("""__x2__""")))).setId(10891)).setId(10892), ISeq(List()).setId(10943)).setId(10894), IApp(Id("""__x3__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(10895))).setId(10946), ISeq(List()).setId(10947)).setId(10899))).setId(10949)).setId(10902), IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))), EBool(true))).setId(10904), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(10905), IReturn(ERef(RefId(Id("""__x4__""")))).setId(10906)).setId(10907), ISeq(List()).setId(10955)).setId(10909), IApp(Id("""__x5__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x4__"""))))).setId(10910))).setId(10958))).setId(10913), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")), ERef(RefId(Id("""genContext""")))).setId(10914), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedStart""")).setId(10916), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")), EList(List())).setId(10918), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(10920), IReturn(ERef(RefId(Id("""__x6__""")))).setId(10921))).setId(10965))
  val instToStepMap: Map[Int, Int] = HashMap(10917 -> 19, 10854 -> 16, 10833 -> 17, 10826 -> 2, 10848 -> 16, 10857 -> 16, 10868 -> 17, 10849 -> 16, 10845 -> 10, 10916 -> 19, 10844 -> 17, 10832 -> 17, 10869 -> 17, 10827 -> 3, 10859 -> 16, 10913 -> 17, 10918 -> 20, 10922 -> 21, 10831 -> 17, 10855 -> 16, 10858 -> 16, 10843 -> 17, 10830 -> 17, 10914 -> 18, 10919 -> 20, 10834 -> 17, 10866 -> 17, 10862 -> 17, 10840 -> 17, 10842 -> 17, 10921 -> 21, 10847 -> 16, 10825 -> 2, 10824 -> 1, 10867 -> 17, 10920 -> 21, 10856 -> 16, 10835 -> 17, 10915 -> 18, 10861 -> 17, 10846 -> 10, 10860 -> 17, 10841 -> 17, 10828 -> 3, 10853 -> 16)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(10824), 10 -> HashSet(10846, 10845), 20 -> HashSet(10918, 10919), 1 -> HashSet(10824), 6 -> HashSet(10832, 10831, 10830), 21 -> HashSet(10922, 10921, 10920), 9 -> HashSet(10844, 10843), 13 -> HashSet(10848, 10847), 2 -> HashSet(10826, 10825), 17 -> HashSet(10869, 10913, 10833, 10831, 10843, 10830, 10842, 10867, 10835, 10861, 10868, 10844, 10832, 10834, 10866, 10862, 10840, 10860, 10841), 7 -> HashSet(10833, 10834, 10835), 3 -> HashSet(10827, 10828), 18 -> HashSet(10914, 10915), 16 -> HashSet(10859, 10854, 10855, 10858, 10848, 10857, 10847, 10856, 10861, 10860, 10853, 10849), 8 -> HashSet(10840, 10842, 10841), 19 -> HashSet(10917, 10916))
  /* Beautified form:
  "AsyncGeneratorStart" (generator, generatorBody) => {
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
      generator["AsyncGeneratorState"] = "completed"
      if (&& (= (typeof result) "Completion") (= result["Type"] CONST_normal)) let resultValue = undefined else {
        let resultValue = result["Value"]
        if (! (= result["Type"] CONST_return)) {
          app __x2__ = (AsyncGeneratorReject generator resultValue)
          if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
          app __x3__ = (__ret__ __x2__)
        } else {}
      }
      app __x4__ = (AsyncGeneratorResolve generator resultValue true)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (__ret__ __x4__)
    }
    generator["AsyncGeneratorContext"] = genContext
    generator["AsyncGeneratorState"] = "suspendedStart"
    generator["AsyncGeneratorQueue"] = (new [])
    app __x6__ = (WrapCompletion undefined)
    return __x6__
  }
  */
}
