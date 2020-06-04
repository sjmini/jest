package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTfrom {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Array.from""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(75009), ILet(Id("""items"""), ERef(RefId(Id("""__x0__""")))).setId(75010), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(75012), ILet(Id("""mapfn"""), ERef(RefId(Id("""__x1__""")))).setId(75013), IApp(Id("""__x2__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(2L))).setId(75015), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x2__""")))).setId(75016), ILet(Id("""C"""), ERef(RefId(Id("""this""")))).setId(75018), IIf(EBOp(OEq, ERef(RefId(Id("""mapfn"""))), EUndef), ILet(Id("""mapping"""), EBool(false)).setId(75020), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""mapfn"""))))).setId(75022), IIf(EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(false)), ISeq(List(IApp(Id("""__x4__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(75023), IReturn(ERef(RefId(Id("""__x4__""")))).setId(75024))).setId(75025), ISeq(List()).setId(75026)).setId(75027), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EINum(2L))), EAbsent)), ILet(Id("""T"""), ERef(RefId(Id("""thisArg""")))).setId(75029), ILet(Id("""T"""), EUndef).setId(75031)).setId(75033), ILet(Id("""mapping"""), EBool(true)).setId(75035))).setId(75037)).setId(75038), IApp(Id("""__x5__"""), ERef(RefId(Id("""GetMethod"""))), List(ERef(RefId(Id("""items"""))), ERef(RefId(Id("""SYMBOL_iterator"""))))).setId(75040), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(75041), IReturn(ERef(RefId(Id("""__x5__""")))).setId(75042)).setId(75043), ISeq(List()).setId(75026)).setId(75044), ILet(Id("""usingIterator"""), ERef(RefId(Id("""__x5__""")))).setId(75045), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""usingIterator"""))), EUndef)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(75047), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))))).setId(75048), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(75049), IReturn(ERef(RefId(Id("""__x7__""")))).setId(75050)).setId(75051), ISeq(List()).setId(75026)).setId(75052), ILet(Id("""A"""), ERef(RefId(Id("""__x7__""")))).setId(75053))).setId(75055), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""ArrayCreate"""))), List(EINum(0L))).setId(75056), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(75057), IReturn(ERef(RefId(Id("""__x8__""")))).setId(75058)).setId(75059), ISeq(List()).setId(75026)).setId(75060), ILet(Id("""A"""), ERef(RefId(Id("""__x8__""")))).setId(75061))).setId(75063)).setId(75064), IApp(Id("""__x9__"""), ERef(RefId(Id("""GetIterator"""))), List(ERef(RefId(Id("""items"""))), ERef(RefId(Id("""CONST_sync"""))), ERef(RefId(Id("""usingIterator"""))))).setId(75066), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(75067), IReturn(ERef(RefId(Id("""__x9__""")))).setId(75068)).setId(75069), ISeq(List()).setId(75026)).setId(75070), ILet(Id("""iteratorRecord"""), ERef(RefId(Id("""__x9__""")))).setId(75071), ILet(Id("""k"""), EINum(0L)).setId(75073), IWhile(EBool(true), ISeq(List(IIf(EUOp(ONot, EBOp(OLt, ERef(RefId(Id("""k"""))), EBOp(OSub, EINum(9007199254740992L), EINum(1L)))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(75075), ILet(Id("""error"""), ERef(RefId(Id("""__x10__""")))).setId(75076), IApp(Id("""__x11__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""error"""))))).setId(75078), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(75079), IReturn(ERef(RefId(Id("""__x11__""")))).setId(75080)).setId(75081), ISeq(List()).setId(75026)).setId(75082), IApp(Id("""__x12__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x11__"""))))).setId(75083), IReturn(ERef(RefId(Id("""__x12__""")))).setId(75084))).setId(75086), ISeq(List()).setId(75026)).setId(75087), IApp(Id("""__x13__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(75089), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(75090), IReturn(ERef(RefId(Id("""__x13__""")))).setId(75091)).setId(75092), ISeq(List()).setId(75026)).setId(75093), ILet(Id("""Pk"""), ERef(RefId(Id("""__x13__""")))).setId(75094), IApp(Id("""__x14__"""), ERef(RefId(Id("""IteratorStep"""))), List(ERef(RefId(Id("""iteratorRecord"""))))).setId(75096), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(75097), IReturn(ERef(RefId(Id("""__x14__""")))).setId(75098)).setId(75099), ISeq(List()).setId(75026)).setId(75100), ILet(Id("""next"""), ERef(RefId(Id("""__x14__""")))).setId(75101), IIf(EBOp(OEq, ERef(RefId(Id("""next"""))), EBool(false)), ISeq(List(IApp(Id("""__x15__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""k"""))), EBool(true))).setId(75103), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(75104), IReturn(ERef(RefId(Id("""__x15__""")))).setId(75105)).setId(75106), ISeq(List()).setId(75026)).setId(75107), IExpr(ERef(RefId(Id("""__x15__""")))).setId(75108), IApp(Id("""__x16__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(75110), IReturn(ERef(RefId(Id("""__x16__""")))).setId(75111))).setId(75113), ISeq(List()).setId(75026)).setId(75114), IApp(Id("""__x17__"""), ERef(RefId(Id("""IteratorValue"""))), List(ERef(RefId(Id("""next"""))))).setId(75116), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))).setId(75117), IReturn(ERef(RefId(Id("""__x17__""")))).setId(75118)).setId(75119), ISeq(List()).setId(75026)).setId(75120), ILet(Id("""nextValue"""), ERef(RefId(Id("""__x17__""")))).setId(75121), IIf(EBOp(OEq, ERef(RefId(Id("""mapping"""))), EBool(true)), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""nextValue"""))), ERef(RefId(Id("""k"""))))))).setId(75123), ILet(Id("""mappedValue"""), ERef(RefId(Id("""__x18__""")))).setId(75124), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""mappedValue"""))))).setId(75126), IIf(ERef(RefId(Id("""__x19__"""))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""mappedValue"""))))).setId(75127), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(75128), IReturn(ERef(RefId(Id("""__x20__""")))).setId(75129)).setId(75130), ISeq(List()).setId(75026)).setId(75131), IApp(Id("""__x21__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x20__"""))))).setId(75132), IReturn(ERef(RefId(Id("""__x21__""")))).setId(75133))).setId(75134), ISeq(List()).setId(75026)).setId(75135))).setId(75137), ILet(Id("""mappedValue"""), ERef(RefId(Id("""nextValue""")))).setId(75138)).setId(75140), IApp(Id("""__x22__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""mappedValue"""))))).setId(75142), ILet(Id("""defineStatus"""), ERef(RefId(Id("""__x22__""")))).setId(75143), IApp(Id("""__x23__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""defineStatus"""))))).setId(75145), IIf(ERef(RefId(Id("""__x23__"""))), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""IteratorClose"""))), List(ERef(RefId(Id("""iteratorRecord"""))), ERef(RefId(Id("""defineStatus"""))))).setId(75146), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x24__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x24__""")), ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Value""")))).setId(75147), IReturn(ERef(RefId(Id("""__x24__""")))).setId(75148)).setId(75149), ISeq(List()).setId(75026)).setId(75150), IApp(Id("""__x25__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x24__"""))))).setId(75151), IReturn(ERef(RefId(Id("""__x25__""")))).setId(75152))).setId(75153), ISeq(List()).setId(75026)).setId(75154), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(75156))).setId(75158)).setId(75159))).setId(75160), ISeq(List()).setId(75026)).setId(75161), IApp(Id("""__x26__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""items"""))))).setId(75163), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))).setId(75164), IReturn(ERef(RefId(Id("""__x26__""")))).setId(75165)).setId(75166), ISeq(List()).setId(75026)).setId(75167), ILet(Id("""arrayLike"""), ERef(RefId(Id("""__x26__""")))).setId(75168), IApp(Id("""__x27__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""arrayLike"""))))).setId(75170), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x27__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))).setId(75171), IReturn(ERef(RefId(Id("""__x27__""")))).setId(75172)).setId(75173), ISeq(List()).setId(75026)).setId(75174), ILet(Id("""len"""), ERef(RefId(Id("""__x27__""")))).setId(75175), IApp(Id("""__x28__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""C"""))))).setId(75177), IIf(EBOp(OEq, ERef(RefId(Id("""__x28__"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""Construct"""))), List(ERef(RefId(Id("""C"""))), EList(List(ERef(RefId(Id("""len"""))))))).setId(75178), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(75179), IReturn(ERef(RefId(Id("""__x29__""")))).setId(75180)).setId(75181), ISeq(List()).setId(75026)).setId(75182), ILet(Id("""A"""), ERef(RefId(Id("""__x29__""")))).setId(75183))).setId(75185), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""ArrayCreate"""))), List(ERef(RefId(Id("""len"""))))).setId(75186), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))).setId(75187), IReturn(ERef(RefId(Id("""__x30__""")))).setId(75188)).setId(75189), ISeq(List()).setId(75026)).setId(75190), ILet(Id("""A"""), ERef(RefId(Id("""__x30__""")))).setId(75191))).setId(75193)).setId(75194), ILet(Id("""k"""), EINum(0L)).setId(75196), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""len""")))), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(75198), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x31__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x31__""")), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Value""")))).setId(75199), IReturn(ERef(RefId(Id("""__x31__""")))).setId(75200)).setId(75201), ISeq(List()).setId(75026)).setId(75202), ILet(Id("""Pk"""), ERef(RefId(Id("""__x31__""")))).setId(75203), IApp(Id("""__x32__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""arrayLike"""))), ERef(RefId(Id("""Pk"""))))).setId(75205), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x32__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x32__""")), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Value""")))).setId(75206), IReturn(ERef(RefId(Id("""__x32__""")))).setId(75207)).setId(75208), ISeq(List()).setId(75026)).setId(75209), ILet(Id("""kValue"""), ERef(RefId(Id("""__x32__""")))).setId(75210), IIf(EBOp(OEq, ERef(RefId(Id("""mapping"""))), EBool(true)), ISeq(List(IApp(Id("""__x33__"""), ERef(RefId(Id("""Call"""))), List(ERef(RefId(Id("""mapfn"""))), ERef(RefId(Id("""T"""))), EList(List(ERef(RefId(Id("""kValue"""))), ERef(RefId(Id("""k"""))))))).setId(75212), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x33__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x33__""")), ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Value""")))).setId(75213), IReturn(ERef(RefId(Id("""__x33__""")))).setId(75214)).setId(75215), ISeq(List()).setId(75026)).setId(75216), ILet(Id("""mappedValue"""), ERef(RefId(Id("""__x33__""")))).setId(75217))).setId(75219), ILet(Id("""mappedValue"""), ERef(RefId(Id("""kValue""")))).setId(75220)).setId(75222), IApp(Id("""__x34__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""Pk"""))), ERef(RefId(Id("""mappedValue"""))))).setId(75224), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))).setId(75225), IReturn(ERef(RefId(Id("""__x34__""")))).setId(75226)).setId(75227), ISeq(List()).setId(75026)).setId(75228), IExpr(ERef(RefId(Id("""__x34__""")))).setId(75229), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(75231))).setId(75233)).setId(75234), IApp(Id("""__x35__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""len"""))), EBool(true))).setId(75236), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x35__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x35__""")), ERef(RefProp(RefId(Id("""__x35__""")), EStr("""Value""")))).setId(75237), IReturn(ERef(RefId(Id("""__x35__""")))).setId(75238)).setId(75239), ISeq(List()).setId(75026)).setId(75240), IExpr(ERef(RefId(Id("""__x35__""")))).setId(75241), IApp(Id("""__x36__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(75243), IReturn(ERef(RefId(Id("""__x36__""")))).setId(75244))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.from" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let items = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let mapfn = __x1__
    app __x2__ = (GetArgument argumentsList 2i)
    let thisArg = __x2__
    let C = this
    if (= mapfn undefined) let mapping = false else {
      app __x3__ = (IsCallable mapfn)
      if (= __x3__ false) {
        app __x4__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x4__
      } else {}
      if (! (= argumentsList[2i] absent)) let T = thisArg else let T = undefined
      let mapping = true
    }
    app __x5__ = (GetMethod items SYMBOL_iterator)
    if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
    let usingIterator = __x5__
    if (! (= usingIterator undefined)) {
      app __x6__ = (IsConstructor C)
      if (= __x6__ true) {
        app __x7__ = (Construct C)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        let A = __x7__
      } else {
        app __x8__ = (ArrayCreate 0i)
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        let A = __x8__
      }
      app __x9__ = (GetIterator items CONST_sync usingIterator)
      if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
      let iteratorRecord = __x9__
      let k = 0i
      while true {
        if (! (< k (- 9007199254740992i 1i))) {
          app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          let error = __x10__
          app __x11__ = (IteratorClose iteratorRecord error)
          if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
          app __x12__ = (WrapCompletion __x11__)
          return __x12__
        } else {}
        app __x13__ = (ToString k)
        if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
        let Pk = __x13__
        app __x14__ = (IteratorStep iteratorRecord)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let next = __x14__
        if (= next false) {
          app __x15__ = (Set A "length" k true)
          if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
          __x15__
          app __x16__ = (WrapCompletion A)
          return __x16__
        } else {}
        app __x17__ = (IteratorValue next)
        if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
        let nextValue = __x17__
        if (= mapping true) {
          app __x18__ = (Call mapfn T (new [nextValue, k]))
          let mappedValue = __x18__
          app __x19__ = (IsAbruptCompletion mappedValue)
          if __x19__ {
            app __x20__ = (IteratorClose iteratorRecord mappedValue)
            if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
            app __x21__ = (WrapCompletion __x20__)
            return __x21__
          } else {}
        } else let mappedValue = nextValue
        app __x22__ = (CreateDataPropertyOrThrow A Pk mappedValue)
        let defineStatus = __x22__
        app __x23__ = (IsAbruptCompletion defineStatus)
        if __x23__ {
          app __x24__ = (IteratorClose iteratorRecord defineStatus)
          if (= (typeof __x24__) "Completion") if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
          app __x25__ = (WrapCompletion __x24__)
          return __x25__
        } else {}
        k = (+ k 1i)
      }
    } else {}
    app __x26__ = (ToObject items)
    if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let arrayLike = __x26__
    app __x27__ = (LengthOfArrayLike arrayLike)
    if (= (typeof __x27__) "Completion") if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
    let len = __x27__
    app __x28__ = (IsConstructor C)
    if (= __x28__ true) {
      app __x29__ = (Construct C (new [len]))
      if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
      let A = __x29__
    } else {
      app __x30__ = (ArrayCreate len)
      if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
      let A = __x30__
    }
    let k = 0i
    while (< k len) {
      app __x31__ = (ToString k)
      if (= (typeof __x31__) "Completion") if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
      let Pk = __x31__
      app __x32__ = (Get arrayLike Pk)
      if (= (typeof __x32__) "Completion") if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
      let kValue = __x32__
      if (= mapping true) {
        app __x33__ = (Call mapfn T (new [kValue, k]))
        if (= (typeof __x33__) "Completion") if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
        let mappedValue = __x33__
      } else let mappedValue = kValue
      app __x34__ = (CreateDataPropertyOrThrow A Pk mappedValue)
      if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
      __x34__
      k = (+ k 1i)
    }
    app __x35__ = (Set A "length" len true)
    if (= (typeof __x35__) "Completion") if (= __x35__["Type"] CONST_normal) __x35__ = __x35__["Value"] else return __x35__ else {}
    __x35__
    app __x36__ = (WrapCompletion A)
    return __x36__
  }
  */
}
