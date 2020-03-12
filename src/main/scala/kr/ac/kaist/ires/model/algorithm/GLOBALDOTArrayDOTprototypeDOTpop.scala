package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTpop {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Array.prototype.pop""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(79954), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(79955), IReturn(ERef(RefId(Id("""__x0__""")))).setId(79956)).setId(79957), ISeq(List()).setId(80021)).setId(79959), ILet(Id("""O"""), ERef(RefId(Id("""__x0__""")))).setId(79960), IApp(Id("""__x1__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(79962), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(79963), IReturn(ERef(RefId(Id("""__x1__""")))).setId(79964)).setId(79965), ISeq(List()).setId(80028)).setId(79966), ILet(Id("""len"""), ERef(RefId(Id("""__x1__""")))).setId(79967), IIf(EBOp(OEq, ERef(RefId(Id("""len"""))), EINum(0L)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EINum(0L), EBool(true))).setId(79969), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(79970), IReturn(ERef(RefId(Id("""__x2__""")))).setId(79971)).setId(79972), ISeq(List()).setId(80035)).setId(79973), IExpr(ERef(RefId(Id("""__x2__""")))).setId(79974), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(79976), IReturn(ERef(RefId(Id("""__x3__""")))).setId(79977))).setId(80040), ISeq(List(ILet(Id("""newLen"""), EBOp(OSub, ERef(RefId(Id("""len"""))), EINum(1L))).setId(79980), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""newLen"""))))).setId(79982), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(79983), IReturn(ERef(RefId(Id("""__x4__""")))).setId(79984)).setId(79985), ISeq(List()).setId(80046)).setId(79986), ILet(Id("""index"""), ERef(RefId(Id("""__x4__""")))).setId(79987), IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""index"""))))).setId(79989), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(79990), IReturn(ERef(RefId(Id("""__x5__""")))).setId(79991)).setId(79992), ISeq(List()).setId(80053)).setId(79993), ILet(Id("""element"""), ERef(RefId(Id("""__x5__""")))).setId(79994), IApp(Id("""__x6__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""index"""))))).setId(79996), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(79997), IReturn(ERef(RefId(Id("""__x6__""")))).setId(79998)).setId(79999), ISeq(List()).setId(80060)).setId(80000), IExpr(ERef(RefId(Id("""__x6__""")))).setId(80001), IApp(Id("""__x7__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), ERef(RefId(Id("""newLen"""))), EBool(true))).setId(80003), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(80004), IReturn(ERef(RefId(Id("""__x7__""")))).setId(80005)).setId(80006), ISeq(List()).setId(80067)).setId(80007), IExpr(ERef(RefId(Id("""__x7__""")))).setId(80008), IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""element"""))))).setId(80010), IReturn(ERef(RefId(Id("""__x8__""")))).setId(80011))).setId(80072)).setId(80014))).setId(80074))
  val instToStepMap: Map[Int, Int] = HashMap(80011 -> 14, 80002 -> 14, 80007 -> 14, 79994 -> 14, 79979 -> 5, 79962 -> 1, 79988 -> 14, 79960 -> 0, 79980 -> 14, 79981 -> 14, 80014 -> 14, 79987 -> 14, 79959 -> 0, 79977 -> 5, 80015 -> 14, 79975 -> 5, 79958 -> 14, 79986 -> 14, 79954 -> 0, 80000 -> 14, 79993 -> 14, 79968 -> 1, 80008 -> 14, 79978 -> 5, 80003 -> 14, 79961 -> 0, 80010 -> 14, 79976 -> 5, 79989 -> 14, 79974 -> 5, 80012 -> 14, 79969 -> 5, 80013 -> 14, 79973 -> 5, 80001 -> 14, 79995 -> 14, 79966 -> 1, 79967 -> 1, 79996 -> 14, 80009 -> 14, 79982 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(79954, 79961, 79960, 79959), 5 -> HashSet(79975, 79978, 79976, 79974, 79979, 79969, 79973, 79977), 10 -> HashSet(79986, 79988, 79987, 79982), 14 -> HashSet(80015, 80011, 80000, 80002, 80007, 79994, 79988, 80013, 80001, 79980, 79995, 79981, 80014, 79987, 79996, 79958, 79986, 79993, 80008, 80003, 80010, 79989, 80012, 80009, 79982), 1 -> HashSet(79968, 79962, 79966, 79967), 9 -> HashSet(79980, 79981), 13 -> HashSet(80008, 80003, 80007, 80009), 12 -> HashSet(80000, 80002, 80001, 79996), 11 -> HashSet(79993, 79989, 79994, 79995), 8 -> HashSet(79958), 4 -> HashSet(79975, 79974, 79969, 79973))
  /* Beautified form:
  "GLOBAL.Array.prototype.pop" (this, argumentsList, NewTarget) => {
    app __x0__ = (ToObject this)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    let O = __x0__
    app __x1__ = (LengthOfArrayLike O)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let len = __x1__
    if (= len 0i) {
      app __x2__ = (Set O "length" 0i true)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      __x2__
      app __x3__ = (WrapCompletion undefined)
      return __x3__
    } else {
      let newLen = (- len 1i)
      app __x4__ = (ToString newLen)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let index = __x4__
      app __x5__ = (Get O index)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let element = __x5__
      app __x6__ = (DeletePropertyOrThrow O index)
      if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
      __x6__
      app __x7__ = (Set O "length" newLen true)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      __x7__
      app __x8__ = (WrapCompletion element)
      return __x8__
    }
  }
  */
}
