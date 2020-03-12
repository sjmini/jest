package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AbstractRelationalComparison {
  val length: Int = 0
  val func: Func = Func("""AbstractRelationalComparison""", List(Id("""x"""), Id("""y"""), Id("""LeftFirst""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""LeftFirst"""))), EAbsent), ILet(Id("""LeftFirst"""), EBool(true)).setId(4145), ISeq(List()).setId(4256)).setId(4148), IIf(EBOp(OEq, ERef(RefId(Id("""LeftFirst"""))), EBool(true)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""Number"""))))).setId(4150), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(4151), IReturn(ERef(RefId(Id("""__x0__""")))).setId(4152)).setId(4153), ISeq(List()).setId(4262)).setId(4154), ILet(Id("""px"""), ERef(RefId(Id("""__x0__""")))).setId(4155), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""y"""))), ERef(RefId(Id("""Number"""))))).setId(4157), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(4158), IReturn(ERef(RefId(Id("""__x1__""")))).setId(4159)).setId(4160), ISeq(List()).setId(4269)).setId(4161), ILet(Id("""py"""), ERef(RefId(Id("""__x1__""")))).setId(4162))).setId(4272), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""y"""))), ERef(RefId(Id("""Number"""))))).setId(4165), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(4166), IReturn(ERef(RefId(Id("""__x2__""")))).setId(4167)).setId(4168), ISeq(List()).setId(4277)).setId(4169), ILet(Id("""py"""), ERef(RefId(Id("""__x2__""")))).setId(4170), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""Number"""))))).setId(4172), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(4173), IReturn(ERef(RefId(Id("""__x3__""")))).setId(4174)).setId(4175), ISeq(List()).setId(4284)).setId(4176), ILet(Id("""px"""), ERef(RefId(Id("""__x3__""")))).setId(4177))).setId(4287)).setId(4180), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""px"""))))).setId(4182), ILet(Id("""__x5__"""), EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""String"""))))).setId(4188), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""py"""))))).setId(4183), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""String"""))))).setId(4186))).setId(4293), ISeq(List()).setId(4294)).setId(4189), IIf(ERef(RefId(Id("""__x5__"""))), IReturn(EBOp(OLt, ERef(RefId(Id("""px"""))), ERef(RefId(Id("""py"""))))).setId(4190), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""px"""))))).setId(4191), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(4192), IReturn(ERef(RefId(Id("""__x7__""")))).setId(4193)).setId(4194), ISeq(List()).setId(4301)).setId(4195), ILet(Id("""nx"""), ERef(RefId(Id("""__x7__""")))).setId(4196), IApp(Id("""__x8__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""py"""))))).setId(4198), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(4199), IReturn(ERef(RefId(Id("""__x8__""")))).setId(4200)).setId(4201), ISeq(List()).setId(4308)).setId(4202), ILet(Id("""ny"""), ERef(RefId(Id("""__x8__""")))).setId(4203), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(4205), IReturn(ERef(RefId(Id("""__x9__""")))).setId(4206))).setId(4313), ISeq(List()).setId(4314)).setId(4208), IIf(EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(Double.NaN)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EUndef)).setId(4210), IReturn(ERef(RefId(Id("""__x10__""")))).setId(4211))).setId(4318), ISeq(List()).setId(4319)).setId(4213), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ERef(RefId(Id("""ny""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4215), IReturn(ERef(RefId(Id("""__x11__""")))).setId(4216))).setId(4323), ISeq(List()).setId(4324)).setId(4218), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""nx"""))), EINum(0L)), EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(-0.0))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4220), IReturn(ERef(RefId(Id("""__x12__""")))).setId(4221))).setId(4328), ISeq(List()).setId(4329)).setId(4223), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(-0.0)), EBOp(OEq, ERef(RefId(Id("""ny"""))), EINum(0L))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4225), IReturn(ERef(RefId(Id("""__x13__""")))).setId(4226))).setId(4333), ISeq(List()).setId(4334)).setId(4228), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4230), IReturn(ERef(RefId(Id("""__x14__""")))).setId(4231))).setId(4338), ISeq(List()).setId(4339)).setId(4233), IIf(EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(Double.PositiveInfinity)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4235), IReturn(ERef(RefId(Id("""__x15__""")))).setId(4236))).setId(4343), ISeq(List()).setId(4344)).setId(4238), IIf(EBOp(OEq, ERef(RefId(Id("""ny"""))), ENum(Double.NegativeInfinity)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4240), IReturn(ERef(RefId(Id("""__x16__""")))).setId(4241))).setId(4348), ISeq(List()).setId(4349)).setId(4243), IIf(EBOp(OEq, ERef(RefId(Id("""nx"""))), ENum(Double.NegativeInfinity)), ISeq(List(IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4245), IReturn(ERef(RefId(Id("""__x17__""")))).setId(4246))).setId(4353), ISeq(List()).setId(4354)).setId(4248), IReturn(EBOp(OLt, ERef(RefId(Id("""nx"""))), ERef(RefId(Id("""ny"""))))).setId(4250))).setId(4357)).setId(4252))).setId(4359))
  val instToStepMap: Map[Int, Int] = HashMap(4155 -> 5, 4250 -> 41, 4188 -> 41, 4169 -> 10, 4226 -> 31, 4215 -> 27, 4234 -> 41, 4220 -> 29, 4247 -> 39, 4198 -> 41, 4156 -> 5, 4249 -> 41, 4238 -> 41, 4224 -> 41, 4243 -> 41, 4179 -> 10, 4253 -> 41, 4205 -> 23, 4147 -> 41, 4162 -> 5, 4230 -> 33, 4211 -> 25, 4216 -> 27, 4172 -> 10, 4252 -> 41, 4204 -> 41, 4248 -> 41, 4233 -> 41, 4227 -> 31, 4219 -> 41, 4191 -> 41, 4180 -> 10, 4244 -> 41, 4237 -> 35, 4231 -> 33, 4223 -> 41, 4163 -> 5, 4148 -> 1, 4195 -> 41, 4212 -> 25, 4251 -> 41, 4245 -> 39, 4149 -> 1, 4171 -> 10, 4236 -> 35, 4218 -> 41, 4228 -> 41, 4176 -> 10, 4213 -> 41, 4154 -> 5, 4203 -> 41, 4208 -> 41, 4181 -> 10, 4232 -> 33, 4196 -> 41, 4209 -> 41, 4207 -> 23, 4177 -> 10, 4240 -> 37, 4190 -> 17, 4222 -> 29, 4145 -> 0, 4241 -> 37, 4164 -> 5, 4246 -> 39, 4225 -> 31, 4150 -> 5, 4217 -> 27, 4235 -> 35, 4202 -> 41, 4165 -> 10, 4170 -> 10, 4182 -> 41, 4197 -> 41, 4214 -> 41, 4146 -> 0, 4178 -> 10, 4210 -> 25, 4157 -> 5, 4242 -> 37, 4239 -> 41, 4229 -> 41, 4206 -> 23, 4221 -> 29, 4161 -> 5, 4189 -> 41)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(4145, 4146), 5 -> HashSet(4156, 4162, 4155, 4163, 4154, 4164, 4150, 4157, 4161), 10 -> HashSet(4169, 4179, 4147, 4172, 4180, 4171, 4176, 4181, 4177, 4178, 4165, 4170), 1 -> HashSet(4148, 4149), 9 -> HashSet(4169, 4171, 4165, 4170), 41 -> HashSet(4188, 4234, 4253, 4147, 4191, 4195, 4202, 4250, 4189, 4198, 4249, 4238, 4224, 4243, 4252, 4204, 4248, 4233, 4219, 4244, 4223, 4251, 4218, 4228, 4213, 4203, 4208, 4196, 4209, 4182, 4197, 4214, 4239, 4229), 39 -> HashSet(4247, 4245, 4246), 35 -> HashSet(4237, 4236, 4235), 31 -> HashSet(4226, 4227, 4225), 8 -> HashSet(4147), 4 -> HashSet(4156, 4155, 4154, 4150), 24 -> HashSet(4208, 4209), 37 -> HashSet(4242, 4240, 4241), 25 -> HashSet(4211, 4212, 4210), 20 -> HashSet(4147), 29 -> HashSet(4220, 4222, 4221), 21 -> HashSet(4191, 4195, 4196, 4197), 33 -> HashSet(4230, 4231, 4232), 28 -> HashSet(4219, 4218), 38 -> HashSet(4243, 4244), 17 -> HashSet(4190), 32 -> HashSet(4228, 4229), 34 -> HashSet(4234, 4233), 22 -> HashSet(4198, 4204, 4203, 4202), 27 -> HashSet(4215, 4216, 4217), 40 -> HashSet(4249, 4248), 26 -> HashSet(4213, 4214), 23 -> HashSet(4205, 4207, 4206), 36 -> HashSet(4238, 4239), 30 -> HashSet(4224, 4223))
  /* Beautified form:
  "AbstractRelationalComparison" (x, y, LeftFirst) => {
    if (= LeftFirst absent) let LeftFirst = true else {}
    if (= LeftFirst true) {
      app __x0__ = (ToPrimitive x Number)
      if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
      let px = __x0__
      app __x1__ = (ToPrimitive y Number)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      let py = __x1__
    } else {
      app __x2__ = (ToPrimitive y Number)
      if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
      let py = __x2__
      app __x3__ = (ToPrimitive x Number)
      if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
      let px = __x3__
    }
    app __x4__ = (Type px)
    let __x5__ = (= __x4__ String)
    if __x5__ {
      app __x6__ = (Type py)
      __x5__ = (= __x6__ String)
    } else {}
    if __x5__ return (< px py) else {
      app __x7__ = (ToNumber px)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let nx = __x7__
      app __x8__ = (ToNumber py)
      if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
      let ny = __x8__
      if (= nx NaN) {
        app __x9__ = (WrapCompletion undefined)
        return __x9__
      } else {}
      if (= ny NaN) {
        app __x10__ = (WrapCompletion undefined)
        return __x10__
      } else {}
      if (= nx ny) {
        app __x11__ = (WrapCompletion false)
        return __x11__
      } else {}
      if (&& (= nx 0i) (= ny -0.0)) {
        app __x12__ = (WrapCompletion false)
        return __x12__
      } else {}
      if (&& (= nx -0.0) (= ny 0i)) {
        app __x13__ = (WrapCompletion false)
        return __x13__
      } else {}
      if (= nx Infinity) {
        app __x14__ = (WrapCompletion false)
        return __x14__
      } else {}
      if (= ny Infinity) {
        app __x15__ = (WrapCompletion true)
        return __x15__
      } else {}
      if (= ny -Infinity) {
        app __x16__ = (WrapCompletion false)
        return __x16__
      } else {}
      if (= nx -Infinity) {
        app __x17__ = (WrapCompletion true)
        return __x17__
      } else {}
      return (< nx ny)
    }
  }
  */
}
