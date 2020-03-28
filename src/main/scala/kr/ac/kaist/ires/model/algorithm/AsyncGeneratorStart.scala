package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object AsyncGeneratorStart {
  val length: Int = 2
  val func: Func = Func("""AsyncGeneratorStart""", List(Id("""generator"""), Id("""generatorBody""")), None, ISeq(List(IAssert(EBOp(OEq, ERef(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState"""))), EUndef)), ILet(Id("""genContext"""), ERef(RefId(Id("""GLOBAL_context""")))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""Generator""")), ERef(RefId(Id("""generator""")))), IAssign(RefProp(RefId(Id("""genContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""generatorBody"""))), EStr("""Evaluation""")), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))), IAccess(Id("""__ret__"""), ERef(RefId(Id("""genContext"""))), EStr("""ReturnCont""")), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""genContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))))), ISeq(List())), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""completed""")), IIf(EBOp(OAnd, EIsCompletion(ERef(RefId(Id("""result""")))), EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal"""))))), ILet(Id("""resultValue"""), EUndef), ISeq(List(ILet(Id("""resultValue"""), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return"""))))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""AsyncGeneratorReject"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))))), IIf(EIsCompletion(ERef(RefId(Id("""__x2__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x2__"""))))), ISeq(List())), IApp(Id("""__x3__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x2__"""))))))), ISeq(List()))))), IApp(Id("""__x4__"""), ERef(RefId(Id("""AsyncGeneratorResolve"""))), List(ERef(RefId(Id("""generator"""))), ERef(RefId(Id("""resultValue"""))), EBool(true))), IIf(EIsCompletion(ERef(RefId(Id("""__x4__""")))), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))), IReturn(ERef(RefId(Id("""__x4__"""))))), ISeq(List())), IApp(Id("""__x5__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x4__"""))))))))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorContext""")), ERef(RefId(Id("""genContext""")))), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorState""")), EStr("""suspendedStart""")), IAssign(RefProp(RefId(Id("""generator""")), EStr("""AsyncGeneratorQueue""")), EList(List())), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)), IReturn(ERef(RefId(Id("""__x6__""")))))))
  /* Beautified form:
  "AsyncGeneratorStart" (generator, generatorBody) => {
    assert (= generator["AsyncGeneratorState"] undefined)
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
      if (&& (is-completion result) (= result["Type"] CONST_normal)) let resultValue = undefined else {
        let resultValue = result["Value"]
        if (! (= result["Type"] CONST_return)) {
          app __x2__ = (AsyncGeneratorReject generator resultValue)
          if (is-completion __x2__) if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
          app __x3__ = (__ret__ __x2__)
        } else {}
      }
      app __x4__ = (AsyncGeneratorResolve generator resultValue true)
      if (is-completion __x4__) if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
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