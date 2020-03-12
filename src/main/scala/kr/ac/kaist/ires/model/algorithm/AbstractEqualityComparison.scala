package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object AbstractEqualityComparison {
  val length: Int = 0
  val func: Func = Func("""AbstractEqualityComparison""", List(Id("""x"""), Id("""y""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4465), IApp(Id("""__x1__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4466), IIf(EBOp(OEq, ERef(RefId(Id("""__x0__"""))), ERef(RefId(Id("""__x1__""")))), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""StrictEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""y"""))))).setId(4468), IApp(Id("""__x3__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x2__"""))))).setId(4469), IReturn(ERef(RefId(Id("""__x3__""")))).setId(4470))).setId(4595), ISeq(List()).setId(4596)).setId(4474), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), ENull), EBOp(OEq, ERef(RefId(Id("""y"""))), EUndef)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4476), IReturn(ERef(RefId(Id("""__x4__""")))).setId(4477))).setId(4600), ISeq(List()).setId(4601)).setId(4479), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""x"""))), EUndef), EBOp(OEq, ERef(RefId(Id("""y"""))), ENull)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(4481), IReturn(ERef(RefId(Id("""__x5__""")))).setId(4482))).setId(4605), ISeq(List()).setId(4606)).setId(4484), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4486), ILet(Id("""__x7__"""), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Number"""))))).setId(4492), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4487), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""String"""))))).setId(4490))).setId(4612), ISeq(List()).setId(4613)).setId(4493), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""y"""))))).setId(4494), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(4495), IReturn(ERef(RefId(Id("""__x9__""")))).setId(4496)).setId(4497), ISeq(List()).setId(4619)).setId(4498), IApp(Id("""__x10__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""__x9__"""))))).setId(4499), IApp(Id("""__x11__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x10__"""))))).setId(4500), IReturn(ERef(RefId(Id("""__x11__""")))).setId(4501))).setId(4624), ISeq(List()).setId(4625)).setId(4503), IApp(Id("""__x12__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4505), ILet(Id("""__x13__"""), EBOp(OEq, ERef(RefId(Id("""__x12__"""))), ERef(RefId(Id("""String"""))))).setId(4511), IIf(ERef(RefId(Id("""__x13__"""))), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4506), IAssign(RefId(Id("""__x13__""")), EBOp(OEq, ERef(RefId(Id("""__x14__"""))), ERef(RefId(Id("""Number"""))))).setId(4509))).setId(4631), ISeq(List()).setId(4632)).setId(4512), IIf(ERef(RefId(Id("""__x13__"""))), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""x"""))))).setId(4513), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(4514), IReturn(ERef(RefId(Id("""__x15__""")))).setId(4515)).setId(4516), ISeq(List()).setId(4638)).setId(4517), IApp(Id("""__x16__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""y"""))))).setId(4518), IApp(Id("""__x17__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x16__"""))))).setId(4519), IReturn(ERef(RefId(Id("""__x17__""")))).setId(4520))).setId(4643), ISeq(List()).setId(4644)).setId(4522), IApp(Id("""__x18__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4524), IIf(EBOp(OEq, ERef(RefId(Id("""__x18__"""))), ERef(RefId(Id("""Boolean""")))), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""x"""))))).setId(4525), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))).setId(4526), IReturn(ERef(RefId(Id("""__x19__""")))).setId(4527)).setId(4528), ISeq(List()).setId(4651)).setId(4529), IApp(Id("""__x20__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""__x19__"""))), ERef(RefId(Id("""y"""))))).setId(4530), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x20__"""))))).setId(4531), IReturn(ERef(RefId(Id("""__x21__""")))).setId(4532))).setId(4656), ISeq(List()).setId(4657)).setId(4534), IApp(Id("""__x22__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4536), IIf(EBOp(OEq, ERef(RefId(Id("""__x22__"""))), ERef(RefId(Id("""Boolean""")))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""ToNumber"""))), List(ERef(RefId(Id("""y"""))))).setId(4537), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x23__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))).setId(4538), IReturn(ERef(RefId(Id("""__x23__""")))).setId(4539)).setId(4540), ISeq(List()).setId(4664)).setId(4541), IApp(Id("""__x24__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""__x23__"""))))).setId(4542), IApp(Id("""__x25__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x24__"""))))).setId(4543), IReturn(ERef(RefId(Id("""__x25__""")))).setId(4544))).setId(4669), ISeq(List()).setId(4670)).setId(4546), IApp(Id("""__x26__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4548), ILet(Id("""__x27__"""), EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x26__"""))), ERef(RefId(Id("""String""")))), EBOp(OEq, ERef(RefId(Id("""__x26__"""))), ERef(RefId(Id("""Number"""))))), EBOp(OEq, ERef(RefId(Id("""__x26__"""))), ERef(RefId(Id("""Symbol""")))))).setId(4554), IIf(ERef(RefId(Id("""__x27__"""))), ISeq(List(IApp(Id("""__x28__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4549), IAssign(RefId(Id("""__x27__""")), EBOp(OEq, ERef(RefId(Id("""__x28__"""))), ERef(RefId(Id("""Object"""))))).setId(4552))).setId(4676), ISeq(List()).setId(4677)).setId(4555), IIf(ERef(RefId(Id("""__x27__"""))), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""y"""))))).setId(4556), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(4557), IReturn(ERef(RefId(Id("""__x29__""")))).setId(4558)).setId(4559), ISeq(List()).setId(4683)).setId(4560), IApp(Id("""__x30__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""x"""))), ERef(RefId(Id("""__x29__"""))))).setId(4561), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x30__"""))))).setId(4562), IReturn(ERef(RefId(Id("""__x31__""")))).setId(4563))).setId(4688), ISeq(List()).setId(4689)).setId(4565), IApp(Id("""__x32__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""x"""))))).setId(4567), ILet(Id("""__x33__"""), EBOp(OEq, ERef(RefId(Id("""__x32__"""))), ERef(RefId(Id("""Object"""))))).setId(4573), IIf(ERef(RefId(Id("""__x33__"""))), ISeq(List(IApp(Id("""__x34__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""y"""))))).setId(4568), IAssign(RefId(Id("""__x33__""")), EBOp(OOr, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x34__"""))), ERef(RefId(Id("""String""")))), EBOp(OEq, ERef(RefId(Id("""__x34__"""))), ERef(RefId(Id("""Number"""))))), EBOp(OEq, ERef(RefId(Id("""__x34__"""))), ERef(RefId(Id("""Symbol""")))))).setId(4571))).setId(4695), ISeq(List()).setId(4696)).setId(4574), IIf(ERef(RefId(Id("""__x33__"""))), ISeq(List(IApp(Id("""__x35__"""), ERef(RefId(Id("""ToPrimitive"""))), List(ERef(RefId(Id("""x"""))))).setId(4575), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x35__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))).setId(4576), IReturn(ERef(RefId(Id("""__x35__""")))).setId(4577)).setId(4578), ISeq(List()).setId(4702)).setId(4579), IApp(Id("""__x36__"""), ERef(RefId(Id("""AbstractEqualityComparison"""))), List(ERef(RefId(Id("""__x35__"""))), ERef(RefId(Id("""y"""))))).setId(4580), IApp(Id("""__x37__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x36__"""))))).setId(4581), IReturn(ERef(RefId(Id("""__x37__""")))).setId(4582))).setId(4707), ISeq(List()).setId(4708)).setId(4584), IApp(Id("""__x38__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(4586), IReturn(ERef(RefId(Id("""__x38__""")))).setId(4587))).setId(4712))
  val instToStepMap: Map[Int, Int] = HashMap(4560 -> 16, 4511 -> 11, 4585 -> 19, 4482 -> 6, 4478 -> 4, 4500 -> 8, 4479 -> 5, 4532 -> 12, 4543 -> 14, 4575 -> 18, 4564 -> 16, 4546 -> 15, 4524 -> 13, 4563 -> 16, 4492 -> 9, 4471 -> 2, 4583 -> 18, 4556 -> 16, 4504 -> 9, 4536 -> 15, 4519 -> 10, 4588 -> 20, 4475 -> 3, 4483 -> 6, 4480 -> 5, 4531 -> 12, 4466 -> 3, 4521 -> 10, 4499 -> 8, 4493 -> 9, 4512 -> 11, 4486 -> 9, 4544 -> 14, 4525 -> 12, 4518 -> 10, 4582 -> 18, 4545 -> 14, 4513 -> 10, 4530 -> 12, 4535 -> 13, 4567 -> 19, 4476 -> 4, 4470 -> 2, 4562 -> 16, 4503 -> 9, 4494 -> 8, 4465 -> 3, 4505 -> 11, 4537 -> 14, 4485 -> 7, 4573 -> 19, 4498 -> 8, 4586 -> 20, 4477 -> 4, 4541 -> 14, 4554 -> 17, 4502 -> 8, 4481 -> 6, 4580 -> 18, 4529 -> 12, 4566 -> 17, 4581 -> 18, 4534 -> 13, 4517 -> 10, 4469 -> 2, 4522 -> 11, 4561 -> 16, 4548 -> 17, 4587 -> 20, 4574 -> 19, 4468 -> 2, 4542 -> 14, 4472 -> 2, 4523 -> 11, 4579 -> 18, 4565 -> 17, 4474 -> 3, 4484 -> 7, 4501 -> 8, 4533 -> 12, 4520 -> 10, 4584 -> 19, 4555 -> 17, 4547 -> 15)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(4479, 4480), 10 -> HashSet(4519, 4521, 4517, 4520, 4518, 4513), 14 -> HashSet(4543, 4544, 4545, 4537, 4541, 4542), 20 -> HashSet(4588, 4586, 4587), 6 -> HashSet(4483, 4482, 4481), 9 -> HashSet(4492, 4504, 4493, 4486, 4503), 13 -> HashSet(4524, 4535, 4534), 2 -> HashSet(4471, 4470, 4469, 4468, 4472), 17 -> HashSet(4554, 4566, 4548, 4565, 4555), 12 -> HashSet(4532, 4531, 4525, 4530, 4529, 4533), 7 -> HashSet(4485, 4484), 3 -> HashSet(4475, 4466, 4465, 4474), 18 -> HashSet(4575, 4583, 4582, 4579, 4580, 4581), 16 -> HashSet(4560, 4564, 4563, 4556, 4562, 4561), 11 -> HashSet(4511, 4512, 4505, 4522, 4523), 8 -> HashSet(4500, 4499, 4494, 4498, 4502, 4501), 19 -> HashSet(4585, 4567, 4573, 4574, 4584), 4 -> HashSet(4476, 4477, 4478), 15 -> HashSet(4546, 4536, 4547))
  /* Beautified form:
  "AbstractEqualityComparison" (x, y) => {
    app __x0__ = (Type x)
    app __x1__ = (Type y)
    if (= __x0__ __x1__) {
      app __x2__ = (StrictEqualityComparison x y)
      app __x3__ = (WrapCompletion __x2__)
      return __x3__
    } else {}
    if (&& (= x null) (= y undefined)) {
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= x undefined) (= y null)) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    app __x6__ = (Type x)
    let __x7__ = (= __x6__ Number)
    if __x7__ {
      app __x8__ = (Type y)
      __x7__ = (= __x8__ String)
    } else {}
    if __x7__ {
      app __x9__ = (ToNumber y)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      app __x10__ = (AbstractEqualityComparison x __x9__)
      app __x11__ = (WrapCompletion __x10__)
      return __x11__
    } else {}
    app __x12__ = (Type x)
    let __x13__ = (= __x12__ String)
    if __x13__ {
      app __x14__ = (Type y)
      __x13__ = (= __x14__ Number)
    } else {}
    if __x13__ {
      app __x15__ = (ToNumber x)
      if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
      app __x16__ = (AbstractEqualityComparison __x15__ y)
      app __x17__ = (WrapCompletion __x16__)
      return __x17__
    } else {}
    app __x18__ = (Type x)
    if (= __x18__ Boolean) {
      app __x19__ = (ToNumber x)
      if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
      app __x20__ = (AbstractEqualityComparison __x19__ y)
      app __x21__ = (WrapCompletion __x20__)
      return __x21__
    } else {}
    app __x22__ = (Type y)
    if (= __x22__ Boolean) {
      app __x23__ = (ToNumber y)
      if (= (typeof __x23__) "Completion") if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
      app __x24__ = (AbstractEqualityComparison x __x23__)
      app __x25__ = (WrapCompletion __x24__)
      return __x25__
    } else {}
    app __x26__ = (Type x)
    let __x27__ = (|| (|| (= __x26__ String) (= __x26__ Number)) (= __x26__ Symbol))
    if __x27__ {
      app __x28__ = (Type y)
      __x27__ = (= __x28__ Object)
    } else {}
    if __x27__ {
      app __x29__ = (ToPrimitive y)
      if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      app __x30__ = (AbstractEqualityComparison x __x29__)
      app __x31__ = (WrapCompletion __x30__)
      return __x31__
    } else {}
    app __x32__ = (Type x)
    let __x33__ = (= __x32__ Object)
    if __x33__ {
      app __x34__ = (Type y)
      __x33__ = (|| (|| (= __x34__ String) (= __x34__ Number)) (= __x34__ Symbol))
    } else {}
    if __x33__ {
      app __x35__ = (ToPrimitive x)
      if (= (typeof __x35__) "Completion") if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
      app __x36__ = (AbstractEqualityComparison __x35__ y)
      app __x37__ = (WrapCompletion __x36__)
      return __x37__
    } else {}
    app __x38__ = (WrapCompletion false)
    return __x38__
  }
  */
}
