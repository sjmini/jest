package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object SameValueNonNumber {
  val length: Int = 2
  val func: Func = Func("""SameValueNonNumber""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3988), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""Undefined""")))), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3989), IReturn(ERef(RefId(Id("""__x1__""")))).setId(3990))).setId(4048), ISeq(List()).setId(4049)).setId(3992), IApp(Id("""__x2__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(3994), IIf(EBOp(OEq, ERef(RefId(Id("""__x2__"""))), ERef(RefId(Id("""Null""")))), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(3995), IReturn(ERef(RefId(Id("""__x3__""")))).setId(3996))).setId(4054), ISeq(List()).setId(4055)).setId(3998), IApp(Id("""__x4__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4000), IIf(EBOp(OEq, ERef(RefId(Id("""__x4__"""))), ERef(RefId(Id("""String""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4001), IReturn(ERef(RefId(Id("""__x5__""")))).setId(4002))).setId(4060), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4004), IReturn(ERef(RefId(Id("""__x6__""")))).setId(4005))).setId(4063)).setId(4007), ISeq(List()).setId(4065)).setId(4010), IApp(Id("""__x7__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4012), IIf(EBOp(OEq, ERef(RefId(Id("""__x7__"""))), ERef(RefId(Id("""Boolean""")))), IIf(EBOp(OOr, EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""y"""))), EBool(true))), EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EBool(false)), EBOp(OEq, ERef(RefId(Id("""y"""))), EBool(false)))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4013), IReturn(ERef(RefId(Id("""__x8__""")))).setId(4014))).setId(4070), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4016), IReturn(ERef(RefId(Id("""__x9__""")))).setId(4017))).setId(4073)).setId(4019), ISeq(List()).setId(4075)).setId(4022), IApp(Id("""__x10__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4024), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), ERef(RefId(Id("""Symbol""")))), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4025), IReturn(ERef(RefId(Id("""__x11__""")))).setId(4026))).setId(4080), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4028), IReturn(ERef(RefId(Id("""__x12__""")))).setId(4029))).setId(4083)).setId(4031), ISeq(List()).setId(4085)).setId(4034), IIf(EBOp(OEq, ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y""")))), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4036), IReturn(ERef(RefId(Id("""__x13__""")))).setId(4037))).setId(4089), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4039), IReturn(ERef(RefId(Id("""__x14__""")))).setId(4040))).setId(4092)).setId(4042))).setId(4094))
  val instToStepMap: Map[Int, Int] = HashMap(4023 -> 13, 4027 -> 16, 4012 -> 13, 4017 -> 12, 3996 -> 4, 4013 -> 12, 4006 -> 8, 4019 -> 12, 4002 -> 8, 4005 -> 8, 4022 -> 13, 4015 -> 12, 4043 -> 18, 3990 -> 2, 4037 -> 18, 4011 -> 9, 4026 -> 16, 3994 -> 5, 4030 -> 16, 3998 -> 5, 4008 -> 8, 4018 -> 12, 4001 -> 8, 4033 -> 16, 4040 -> 18, 4038 -> 18, 3995 -> 4, 4031 -> 16, 4016 -> 12, 3989 -> 2, 4021 -> 12, 3999 -> 5, 4036 -> 18, 4004 -> 8, 4041 -> 18, 4000 -> 9, 4032 -> 16, 4009 -> 8, 4028 -> 16, 3988 -> 3, 4035 -> 17, 4020 -> 12, 4003 -> 8, 4042 -> 18, 3991 -> 2, 4010 -> 9, 3993 -> 3, 4025 -> 16, 3992 -> 3, 4039 -> 18, 4014 -> 12, 3997 -> 4, 3987 -> 1, 4029 -> 16, 4007 -> 8, 4024 -> 17, 4034 -> 17)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(3987), 5 -> HashSet(3994, 3998, 3999), 1 -> HashSet(3987), 9 -> HashSet(4011, 4000, 4010), 13 -> HashSet(4022, 4023, 4012), 2 -> HashSet(3990, 3989, 3991), 17 -> HashSet(4035, 4024, 4034), 12 -> HashSet(4015, 4018, 4017, 4013, 4020, 4014, 4019, 4016, 4021), 3 -> HashSet(3988, 3993, 3992), 18 -> HashSet(4036, 4041, 4042, 4039, 4043, 4037, 4040, 4038), 16 -> HashSet(4026, 4030, 4033, 4031, 4027, 4032, 4028, 4025, 4029), 8 -> HashSet(4005, 4008, 4001, 4004, 4009, 4003, 4006, 4007, 4002), 4 -> HashSet(3995, 3996, 3997))
  /* Beautified form:
  "SameValueNonNumber" (x, y) => {
    app __x0__ = (Type x)
    if (= __x0__ Undefined) {
      app __x1__ = (WrapCompletion true)
      return __x1__
    } else {}
    app __x2__ = (Type x)
    if (= __x2__ Null) {
      app __x3__ = (WrapCompletion true)
      return __x3__
    } else {}
    app __x4__ = (Type x)
    if (= __x4__ String) if (= x y) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {
      app __x6__ = (WrapCompletion false)
      return __x6__
    } else {}
    app __x7__ = (Type x)
    if (= __x7__ Boolean) if (|| (&& (= x true) (= y true)) (&& (= x false) (= y false))) {
      app __x8__ = (WrapCompletion true)
      return __x8__
    } else {
      app __x9__ = (WrapCompletion false)
      return __x9__
    } else {}
    app __x10__ = (Type x)
    if (= __x10__ Symbol) if (= x y) {
      app __x11__ = (WrapCompletion true)
      return __x11__
    } else {
      app __x12__ = (WrapCompletion false)
      return __x12__
    } else {}
    if (= x y) {
      app __x13__ = (WrapCompletion true)
      return __x13__
    } else {
      app __x14__ = (WrapCompletion false)
      return __x14__
    }
  }
  */
}
