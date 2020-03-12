package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AsyncFunctionStart {
  val length: Int = 2
  val func: Func = Func("""AsyncFunctionStart""", List(Id("""promiseCapability"""), Id("""asyncFunctionBody""")), None, ISeq(List(ILet(Id("""runningContext"""), ERef(RefId(Id("""GLOBAL_context""")))).setId(12900), ILet(Id("""asyncContext"""), ECopy(ERef(RefId(Id("""runningContext"""))))).setId(12902), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont""")), ECont(List(), ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""asyncFunctionBody"""))), EStr("""Evaluation""")).setId(12951), ILet(Id("""result"""), ERef(RefId(Id("""__x0__""")))).setId(12952), IAccess(Id("""__ret__"""), ERef(RefId(Id("""asyncContext"""))), EStr("""ReturnCont""")).setId(12954), IAssign(RefId(Id("""__ret__""")), EPop(ERef(RefId(Id("""__ret__"""))), EINum(0L))).setId(12955), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L)))), ERef(RefId(Id("""asyncContext""")))), ISeq(List(IAssign(RefId(Id("""__x1__""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))).setId(12957), IExpr(EPop(ERef(RefId(Id("""GLOBAL_executionStack"""))), ERef(RefId(Id("""__x1__"""))))).setId(12958))).setId(13024), ISeq(List()).setId(13025)).setId(12961), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(12962), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(EUndef)))).setId(12964), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(12965), IReturn(ERef(RefId(Id("""__x2__""")))).setId(12966)).setId(12967), ISeq(List()).setId(13032)).setId(12969), IExpr(ERef(RefId(Id("""__x2__""")))).setId(12970))).setId(13035), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_return""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(12973), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(12974), IReturn(ERef(RefId(Id("""__x3__""")))).setId(12975)).setId(12976), ISeq(List()).setId(13040)).setId(12978), IExpr(ERef(RefId(Id("""__x3__""")))).setId(12979))).setId(13043), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(12983), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(12984), IReturn(ERef(RefId(Id("""__x4__""")))).setId(12985)).setId(12986), ISeq(List()).setId(13048)).setId(12988), IExpr(ERef(RefId(Id("""__x4__""")))).setId(12989))).setId(13051)).setId(12992)).setId(12994), IApp(Id("""__x5__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(12996), IApp(Id("""__x6__"""), ERef(RefId(Id("""__ret__"""))), List(ERef(RefId(Id("""__x5__"""))))).setId(12997))).setId(13056))).setId(13000), IAppend(ERef(RefId(Id("""asyncContext"""))), ERef(RefId(Id("""GLOBAL_executionStack""")))).setId(13001), IAssign(RefId(Id("""GLOBAL_context""")), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(1L))))).setId(13002), IWithCont(Id("""__x7__"""), List(Id("""result""")), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont"""))), EAbsent), IAssign(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")), EList(List())).setId(13004), ISeq(List()).setId(13061)).setId(13007), IAppend(ERef(RefId(Id("""__x7__"""))), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ReturnCont""")))).setId(13008), IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""asyncContext""")), EStr("""ResumeCont"""))), List()).setId(13009))).setId(13065)).setId(13011), IApp(Id("""__x9__"""), ERef(RefId(Id("""NormalCompletion"""))), List(EUndef)).setId(13012), IReturn(ERef(RefId(Id("""__x9__""")))).setId(13013))).setId(13069))
  val instToStepMap: Map[Int, Int] = HashMap(12934 -> 12, 12939 -> 16, 12907 -> 17, 13002 -> 18, 12946 -> 17, 12926 -> 9, 12932 -> 12, 13008 -> 19, 12915 -> 17, 12944 -> 16, 12948 -> 17, 12949 -> 17, 13007 -> 19, 12916 -> 17, 13003 -> 18, 12943 -> 16, 12901 -> 0, 12924 -> 9, 13013 -> 22, 12935 -> 16, 12927 -> 12, 12910 -> 17, 12905 -> 17, 12950 -> 17, 12945 -> 17, 12906 -> 17, 13009 -> 19, 12917 -> 17, 12942 -> 16, 12902 -> 1, 12931 -> 12, 13014 -> 22, 12923 -> 9, 12909 -> 17, 13001 -> 18, 13010 -> 19, 13000 -> 17, 12922 -> 21, 12941 -> 16, 12903 -> 1, 12918 -> 9, 12947 -> 17, 13012 -> 22, 12933 -> 12, 12925 -> 9, 12900 -> 0, 12940 -> 16, 12908 -> 17, 13011 -> 19)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(12901, 12900), 5 -> HashSet(12910, 12909, 12908), 20 -> HashSet(12922), 1 -> HashSet(12902, 12903), 6 -> HashSet(12916, 12917, 12915), 21 -> HashSet(12922), 9 -> HashSet(12924, 12923, 12926, 12918, 12925), 17 -> HashSet(12949, 12916, 12907, 12946, 12909, 13000, 12947, 12915, 12948, 12908, 12910, 12905, 12950, 12945, 12906, 12917), 22 -> HashSet(13013, 13014, 13012), 12 -> HashSet(12934, 12927, 12931, 12932, 12933), 18 -> HashSet(13003, 13002, 13001), 16 -> HashSet(12939, 12943, 12935, 12945, 12942, 12946, 12940, 12944, 12922, 12941), 19 -> HashSet(13007, 13009, 13010, 13008, 13011), 4 -> HashSet(12907, 12905, 12906), 15 -> HashSet(12922))
  /* Beautified form:
  "AsyncFunctionStart" (promiseCapability, asyncFunctionBody) => {
    let runningContext = GLOBAL_context
    let asyncContext = (copy-obj runningContext)
    asyncContext["ResumeCont"] = () [=>] {
      access __x0__ = (asyncFunctionBody "Evaluation")
      let result = __x0__
      access __ret__ = (asyncContext "ReturnCont")
      __ret__ = (pop __ret__ 0i)
      if (= GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)] asyncContext) {
        __x1__ = (- GLOBAL_executionStack["length"] 1i)
        (pop GLOBAL_executionStack __x1__)
      } else {}
      GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
      if (= result["Type"] CONST_normal) {
        app __x2__ = (Call promiseCapability["Resolve"] undefined (new [undefined]))
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        __x2__
      } else if (= result["Type"] CONST_return) {
        app __x3__ = (Call promiseCapability["Resolve"] undefined (new [result["Value"]]))
        if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
        __x3__
      } else {
        app __x4__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
        if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
        __x4__
      }
      app __x5__ = (NormalCompletion undefined)
      app __x6__ = (__ret__ __x5__)
    }
    append asyncContext -> GLOBAL_executionStack
    GLOBAL_context = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 1i)]
    withcont __x7__ (result) ={
      if (= asyncContext["ReturnCont"] absent) asyncContext["ReturnCont"] = (new []) else {}
      append __x7__ -> asyncContext["ReturnCont"]
      app __x8__ = (asyncContext["ResumeCont"] )
    }
    app __x9__ = (NormalCompletion undefined)
    return __x9__
  }
  */
}
