package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTINTRINSIC_AsyncFromSyncIteratorPrototypeDOTreturn {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(87946), ILet(Id("""value"""), ERef(RefId(Id("""__x0__""")))).setId(87947), ILet(Id("""O"""), ERef(RefId(Id("""this""")))).setId(87949), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewPromiseCapability"""))), List(ERef(RefId(Id("""INTRINSIC_Promise"""))))).setId(87952), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(87953), IReturn(ERef(RefId(Id("""__x1__""")))).setId(87954)).setId(87955), ISeq(List()).setId(88037)).setId(87956), ILet(Id("""promiseCapability"""), ERef(RefId(Id("""__x1__""")))).setId(87957), ILet(Id("""syncIterator"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SyncIteratorRecord""")), EStr("""Iterator""")))).setId(87959), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""syncIterator"""))), EStr("""return"""))).setId(87961), ILet(Id("""return"""), ERef(RefId(Id("""__x2__""")))).setId(87962), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""return""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""return""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""return""")), ERef(RefProp(RefId(Id("""return""")), EStr("""Value""")))).setId(87964), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""return""")), EStr("""Value"""))))))).setId(87965), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x3__""")))).setId(87966), ISeq(List()).setId(88046)).setId(87967), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(87968))).setId(88049)).setId(87970), ISeq(List()).setId(88051)).setId(87971), IExpr(ERef(RefId(Id("""return""")))).setId(87972), IIf(EBOp(OEq, ERef(RefId(Id("""return"""))), EUndef), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""CreateIterResultObject"""))), List(ERef(RefId(Id("""value"""))), EBool(true))).setId(87974), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(87975), IReturn(ERef(RefId(Id("""__x4__""")))).setId(87976)).setId(87977), ISeq(List()).setId(88058)).setId(87978), ILet(Id("""iterResult"""), ERef(RefId(Id("""__x4__""")))).setId(87979), IApp(Id("""__x5__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Resolve"""))), EUndef, EList(List(ERef(RefId(Id("""iterResult"""))))))).setId(87981), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(87982), IReturn(ERef(RefId(Id("""__x5__""")))).setId(87983)).setId(87984), ISeq(List()).setId(88065)).setId(87985), IExpr(ERef(RefId(Id("""__x5__""")))).setId(87986), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(87988), IReturn(ERef(RefId(Id("""__x6__""")))).setId(87989))).setId(88070), ISeq(List()).setId(88071)).setId(87992), IApp(Id("""__x7__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""return"""))), ERef(RefId(Id("""syncIterator"""))), EList(List(ERef(RefId(Id("""value"""))))))).setId(87994), ILet(Id("""result"""), ERef(RefId(Id("""__x7__""")))).setId(87995), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""result""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""result""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""result""")), ERef(RefProp(RefId(Id("""result""")), EStr("""Value""")))).setId(87997), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(ERef(RefProp(RefId(Id("""result""")), EStr("""Value"""))))))).setId(87998), IIf(EBOp(OAnd, EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))))), IReturn(ERef(RefId(Id("""__x8__""")))).setId(87999), ISeq(List()).setId(88078)).setId(88000), IReturn(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise""")))).setId(88001))).setId(88081)).setId(88003), ISeq(List()).setId(88083)).setId(88004), IExpr(ERef(RefId(Id("""result""")))).setId(88005), IApp(Id("""__x9__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""result"""))))).setId(88007), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x9__"""))), ERef(RefId(Id("""Object"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Reject"""))), EUndef, EList(List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))))).setId(88008), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(88009), IReturn(ERef(RefId(Id("""__x10__""")))).setId(88010)).setId(88011), ISeq(List()).setId(88091)).setId(88012), IExpr(ERef(RefId(Id("""__x10__""")))).setId(88013), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefProp(RefId(Id("""promiseCapability""")), EStr("""Promise"""))))).setId(88015), IReturn(ERef(RefId(Id("""__x11__""")))).setId(88016))).setId(88096), ISeq(List()).setId(88097)).setId(88019), IApp(Id("""__x12__"""), ERef(RefId(Id("""AsyncFromSyncIteratorContinuation"""))), List(ERef(RefId(Id("""result"""))), ERef(RefId(Id("""promiseCapability"""))))).setId(88021), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(88022), IReturn(ERef(RefId(Id("""__x12__""")))).setId(88023)).setId(88024), ISeq(List()).setId(88103)).setId(88025), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x12__"""))))).setId(88026), IReturn(ERef(RefId(Id("""__x13__""")))).setId(88027))).setId(88107))
  val instToStepMap: Map[Int, Int] = HashMap(88012 -> 18, 87980 -> 11, 88017 -> 18, 87952 -> 3, 87948 -> 0, 87960 -> 4, 87979 -> 11, 87947 -> 0, 88019 -> 19, 88004 -> 14, 87992 -> 12, 87951 -> 2, 87985 -> 11, 88005 -> 14, 88016 -> 18, 87957 -> 3, 88020 -> 19, 87974 -> 11, 87988 -> 11, 87971 -> 6, 87993 -> 12, 87961 -> 5, 87978 -> 11, 87946 -> 0, 88028 -> 20, 88025 -> 20, 87989 -> 11, 87956 -> 3, 88021 -> 20, 87996 -> 13, 88018 -> 18, 87986 -> 11, 88006 -> 14, 88015 -> 18, 87973 -> 6, 87987 -> 11, 88007 -> 19, 87962 -> 5, 87972 -> 6, 87949 -> 1, 87990 -> 11, 87995 -> 13, 87959 -> 4, 88014 -> 18, 88008 -> 18, 87991 -> 11, 87963 -> 5, 87950 -> 1, 88027 -> 20, 88013 -> 18, 87981 -> 11, 87958 -> 3, 88026 -> 20, 87994 -> 13)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(87946, 87948, 87947), 5 -> HashSet(87961, 87962, 87963), 10 -> HashSet(87985, 87986, 87987, 87981), 14 -> HashSet(88005, 88006, 88004), 20 -> HashSet(88021, 88027, 88026, 88028, 88025), 1 -> HashSet(87949, 87950), 6 -> HashSet(87971, 87973, 87972), 9 -> HashSet(87980, 87974, 87978, 87979), 13 -> HashSet(87996, 87995, 87994), 2 -> HashSet(87951), 17 -> HashSet(88012, 88013, 88014, 88008), 12 -> HashSet(87992, 87993), 3 -> HashSet(87957, 87956, 87952, 87958), 18 -> HashSet(88012, 88016, 88017, 88018, 88015, 88013, 88014, 88008), 11 -> HashSet(87980, 87985, 87978, 87989, 87986, 87987, 87990, 87979, 87991, 87981, 87974, 87988), 19 -> HashSet(88020, 88007, 88019), 4 -> HashSet(87960, 87959))
  /* Beautified form:
  "GLOBAL.INTRINSIC_AsyncFromSyncIteratorPrototype.return" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let value = __x0__
    let O = this
    app __x1__ = (NewPromiseCapability INTRINSIC_Promise)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let promiseCapability = __x1__
    let syncIterator = O["SyncIteratorRecord"]["Iterator"]
    app __x2__ = (GetMethod syncIterator "return")
    let return = __x2__
    if (= (typeof return) "Completion") if (= return["Type"] CONST_normal) return = return["Value"] else {
      app __x3__ = (Call promiseCapability["Reject"] undefined (new [return["Value"]]))
      if (&& (= (typeof __x3__) "Completion") (! (= __x3__["Type"] CONST_normal))) return __x3__ else {}
      return promiseCapability["Promise"]
    } else {}
    return
    if (= return undefined) {
      app __x4__ = (CreateIterResultObject value true)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let iterResult = __x4__
      app __x5__ = (Call promiseCapability["Resolve"] undefined (new [iterResult]))
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      __x5__
      app __x6__ = (WrapCompletion promiseCapability["Promise"])
      return __x6__
    } else {}
    app __x7__ = (Call return syncIterator (new [value]))
    let result = __x7__
    if (= (typeof result) "Completion") if (= result["Type"] CONST_normal) result = result["Value"] else {
      app __x8__ = (Call promiseCapability["Reject"] undefined (new [result["Value"]]))
      if (&& (= (typeof __x8__) "Completion") (! (= __x8__["Type"] CONST_normal))) return __x8__ else {}
      return promiseCapability["Promise"]
    } else {}
    result
    app __x9__ = (Type result)
    if (! (= __x9__ Object)) {
      app __x10__ = (Call promiseCapability["Reject"] undefined (new [(new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap())))]))
      if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
      __x10__
      app __x11__ = (WrapCompletion promiseCapability["Promise"])
      return __x11__
    } else {}
    app __x12__ = (AsyncFromSyncIteratorContinuation result promiseCapability)
    if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
    app __x13__ = (WrapCompletion __x12__)
    return __x13__
  }
  */
}
