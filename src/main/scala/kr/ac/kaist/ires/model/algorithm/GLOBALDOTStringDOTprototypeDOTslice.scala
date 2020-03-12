package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTStringDOTprototypeDOTslice {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.String.prototype.slice""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(73155), ILet(Id("""start"""), ERef(RefId(Id("""__x0__""")))).setId(73156), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(73158), ILet(Id("""end"""), ERef(RefId(Id("""__x1__""")))).setId(73159), IApp(Id("""__x2__"""), ERef(RefId(Id("""RequireObjectCoercible"""))), List(ERef(RefId(Id("""this"""))))).setId(73161), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(73162), IReturn(ERef(RefId(Id("""__x2__""")))).setId(73163)).setId(73164), ISeq(List()).setId(73227)).setId(73166), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(73167), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""O"""))))).setId(73169), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(73170), IReturn(ERef(RefId(Id("""__x3__""")))).setId(73171)).setId(73172), ISeq(List()).setId(73234)).setId(73173), ILet(Id("""S"""), ERef(RefId(Id("""__x3__""")))).setId(73174), ILet(Id("""len"""), ERef(RefProp(RefId(Id("""S""")), EStr("""length""")))).setId(73176), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(73178), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(73179), IReturn(ERef(RefId(Id("""__x4__""")))).setId(73180)).setId(73181), ISeq(List()).setId(73242)).setId(73182), ILet(Id("""intStart"""), ERef(RefId(Id("""__x4__""")))).setId(73183), IIf(EBOp(OEq, ERef(RefId(Id("""end"""))), EUndef), ILet(Id("""intEnd"""), ERef(RefId(Id("""len""")))).setId(73185), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""end"""))))).setId(73187), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(73188), IReturn(ERef(RefId(Id("""__x5__""")))).setId(73189)).setId(73190), ISeq(List()).setId(73250)).setId(73191), ILet(Id("""intEnd"""), ERef(RefId(Id("""__x5__""")))).setId(73192))).setId(73253)).setId(73194), IIf(EBOp(OLt, ERef(RefId(Id("""intStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""intStart""")))), EINum(0L))).setId(73196), ILet(Id("""from"""), ERef(RefId(Id("""__x6__""")))).setId(73197))).setId(73257), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""intStart"""))), ERef(RefId(Id("""len"""))))).setId(73199), ILet(Id("""from"""), ERef(RefId(Id("""__x7__""")))).setId(73200))).setId(73260)).setId(73202), IIf(EBOp(OLt, ERef(RefId(Id("""intEnd"""))), EINum(0L)), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""intEnd""")))), EINum(0L))).setId(73204), ILet(Id("""to"""), ERef(RefId(Id("""__x8__""")))).setId(73205))).setId(73264), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""intEnd"""))), ERef(RefId(Id("""len"""))))).setId(73207), ILet(Id("""to"""), ERef(RefId(Id("""__x9__""")))).setId(73208))).setId(73267)).setId(73210), IApp(Id("""__x10__"""), ERef(RefId(Id("""max"""))), List(EBOp(OSub, ERef(RefId(Id("""to"""))), ERef(RefId(Id("""from""")))), EINum(0L))).setId(73212), ILet(Id("""span"""), ERef(RefId(Id("""__x10__""")))).setId(73213), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ENotSupported("""StringOp"""))).setId(73215), IReturn(ERef(RefId(Id("""__x11__""")))).setId(73216))).setId(73273))
  val instToStepMap: Map[Int, Int] = HashMap(73213 -> 9, 73156 -> 0, 73201 -> 7, 73169 -> 3, 73205 -> 8, 73173 -> 3, 73177 -> 4, 73155 -> 0, 73166 -> 2, 73168 -> 2, 73211 -> 8, 73207 -> 8, 73216 -> 10, 73157 -> 0, 73209 -> 8, 73196 -> 7, 73197 -> 7, 73192 -> 6, 73182 -> 5, 73160 -> 1, 73214 -> 9, 73187 -> 6, 73204 -> 8, 73199 -> 7, 73161 -> 2, 73193 -> 6, 73210 -> 8, 73167 -> 2, 73178 -> 5, 73208 -> 8, 73191 -> 6, 73159 -> 1, 73198 -> 7, 73217 -> 10, 73186 -> 6, 73176 -> 4, 73200 -> 7, 73203 -> 7, 73183 -> 5, 73158 -> 1, 73194 -> 6, 73215 -> 10, 73185 -> 6, 73175 -> 3, 73202 -> 7, 73206 -> 8, 73174 -> 3, 73195 -> 6, 73212 -> 9, 73184 -> 5)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(73156, 73155, 73157), 5 -> HashSet(73182, 73178, 73183, 73184), 10 -> HashSet(73217, 73215, 73216), 1 -> HashSet(73160, 73159, 73158), 6 -> HashSet(73192, 73187, 73193, 73191, 73186, 73194, 73185, 73195), 9 -> HashSet(73213, 73214, 73212), 2 -> HashSet(73161, 73167, 73166, 73168), 7 -> HashSet(73201, 73196, 73197, 73199, 73198, 73202, 73200, 73203), 3 -> HashSet(73169, 73173, 73175, 73174), 8 -> HashSet(73205, 73209, 73204, 73210, 73208, 73211, 73207, 73206), 4 -> HashSet(73177, 73176))
  /* Beautified form:
  "GLOBAL.String.prototype.slice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let end = __x1__
    app __x2__ = (RequireObjectCoercible this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (ToString O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let S = __x3__
    let len = S["length"]
    app __x4__ = (ToInteger start)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let intStart = __x4__
    if (= end undefined) let intEnd = len else {
      app __x5__ = (ToInteger end)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let intEnd = __x5__
    }
    if (< intStart 0i) {
      app __x6__ = (max (+ len intStart) 0i)
      let from = __x6__
    } else {
      app __x7__ = (min intStart len)
      let from = __x7__
    }
    if (< intEnd 0i) {
      app __x8__ = (max (+ len intEnd) 0i)
      let to = __x8__
    } else {
      app __x9__ = (min intEnd len)
      let to = __x9__
    }
    app __x10__ = (max (- to from) 0i)
    let span = __x10__
    app __x11__ = (WrapCompletion !!! "StringOp")
    return __x11__
  }
  */
}
