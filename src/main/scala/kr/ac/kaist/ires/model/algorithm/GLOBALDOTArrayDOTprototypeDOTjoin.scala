package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTArrayDOTprototypeDOTjoin {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.prototype.join""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(79220), ILet(Id("""separator"""), ERef(RefId(Id("""__x0__""")))).setId(79221), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(79223), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(79224), IReturn(ERef(RefId(Id("""__x1__""")))).setId(79225)).setId(79226), ISeq(List()).setId(79297)).setId(79228), ILet(Id("""O"""), ERef(RefId(Id("""__x1__""")))).setId(79229), IApp(Id("""__x2__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(79231), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(79232), IReturn(ERef(RefId(Id("""__x2__""")))).setId(79233)).setId(79234), ISeq(List()).setId(79304)).setId(79235), ILet(Id("""len"""), ERef(RefId(Id("""__x2__""")))).setId(79236), IIf(EBOp(OEq, ERef(RefId(Id("""separator"""))), EUndef), ILet(Id("""sep"""), EStr(""",""")).setId(79238), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""separator"""))))).setId(79240), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(79241), IReturn(ERef(RefId(Id("""__x3__""")))).setId(79242)).setId(79243), ISeq(List()).setId(79312)).setId(79244), ILet(Id("""sep"""), ERef(RefId(Id("""__x3__""")))).setId(79245))).setId(79315)).setId(79247), ILet(Id("""R"""), EStr("""""")).setId(79249), ILet(Id("""k"""), EINum(0L)).setId(79251), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IIf(EBOp(OLt, EINum(0L), ERef(RefId(Id("""k""")))), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""sep"""))))).setId(79253), ISeq(List()).setId(79320)).setId(79255), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(79257), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(79258), IReturn(ERef(RefId(Id("""__x4__""")))).setId(79259)).setId(79260), ISeq(List()).setId(79326)).setId(79261), IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x4__"""))))).setId(79262), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(79263), IReturn(ERef(RefId(Id("""__x5__""")))).setId(79264)).setId(79265), ISeq(List()).setId(79332)).setId(79266), ILet(Id("""element"""), ERef(RefId(Id("""__x5__""")))).setId(79267), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""element"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""element"""))), ENull)), ILet(Id("""next"""), EStr("""""")).setId(79269), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""element"""))))).setId(79271), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x6__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x6__""")), ERef(RefProp(RefId(Id("""__x6__""")), EStr("""Value""")))).setId(79272), IReturn(ERef(RefId(Id("""__x6__""")))).setId(79273)).setId(79274), ISeq(List()).setId(79340)).setId(79275), ILet(Id("""next"""), ERef(RefId(Id("""__x6__""")))).setId(79276))).setId(79343)).setId(79278), IAssign(RefId(Id("""R""")), EBOp(OPlus, ERef(RefId(Id("""R"""))), ERef(RefId(Id("""next"""))))).setId(79280), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(79282))).setId(79347)).setId(79285), IApp(Id("""__x7__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""R"""))))).setId(79287), IReturn(ERef(RefId(Id("""__x7__""")))).setId(79288))).setId(79351))
  val instToStepMap: Map[Int, Int] = HashMap(79261 -> 15, 79235 -> 2, 79277 -> 13, 79228 -> 1, 79223 -> 1, 79256 -> 15, 79281 -> 15, 79266 -> 15, 79249 -> 5, 79279 -> 15, 79275 -> 13, 79250 -> 5, 79280 -> 15, 79222 -> 0, 79287 -> 16, 79254 -> 10, 79268 -> 15, 79283 -> 15, 79229 -> 1, 79230 -> 1, 79239 -> 3, 79276 -> 13, 79245 -> 4, 79244 -> 4, 79262 -> 15, 79247 -> 4, 79267 -> 15, 79240 -> 4, 79286 -> 15, 79271 -> 13, 79236 -> 2, 79255 -> 15, 79248 -> 4, 79282 -> 15, 79251 -> 6, 79220 -> 0, 79278 -> 15, 79237 -> 2, 79231 -> 2, 79257 -> 15, 79285 -> 15, 79252 -> 6, 79270 -> 13, 79284 -> 15, 79238 -> 3, 79289 -> 16, 79253 -> 10, 79269 -> 13, 79288 -> 16, 79246 -> 4, 79221 -> 0)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(79222, 79220, 79221), 5 -> HashSet(79250, 79249), 10 -> HashSet(79254, 79253), 14 -> HashSet(79280, 79281), 1 -> HashSet(79229, 79230, 79228, 79223), 6 -> HashSet(79251, 79252), 13 -> HashSet(79276, 79277, 79271, 79278, 79270, 79279, 79269, 79275), 2 -> HashSet(79235, 79236, 79237, 79231), 12 -> HashSet(79261, 79268, 79262, 79267, 79257, 79266), 3 -> HashSet(79239, 79238), 16 -> HashSet(79287, 79289, 79288), 11 -> HashSet(79255, 79256), 4 -> HashSet(79245, 79240, 79248, 79246, 79244, 79247), 15 -> HashSet(79280, 79261, 79268, 79283, 79262, 79267, 79282, 79278, 79256, 79281, 79266, 79279, 79284, 79286, 79255, 79257, 79285))
  /* Beautified form:
  "GLOBAL.Array.prototype.join" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let separator = __x0__
    app __x1__ = (ToObject this)
    if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
    let O = __x1__
    app __x2__ = (LengthOfArrayLike O)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let len = __x2__
    if (= separator undefined) let sep = "," else {
      app __x3__ = (ToString separator)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let sep = __x3__
    }
    let R = ""
    let k = 0i
    while (< k len) {
      if (< 0i k) R = (+ R sep) else {}
      app __x4__ = (ToString k)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      app __x5__ = (Get O __x4__)
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let element = __x5__
      if (|| (= element undefined) (= element null)) let next = "" else {
        app __x6__ = (ToString element)
        if (= (typeof __x6__) "Completion") if (= __x6__["Type"] CONST_normal) __x6__ = __x6__["Value"] else return __x6__ else {}
        let next = __x6__
      }
      R = (+ R next)
      k = (+ k 1i)
    }
    app __x7__ = (WrapCompletion R)
    return __x7__
  }
  */
}
