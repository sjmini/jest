package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTArrayDOTprototypeDOTsplice {
  val length: Int = 2
  val func: Func = Func("""GLOBAL.Array.prototype.splice""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(82207), ILet(Id("""start"""), ERef(RefId(Id("""__x0__""")))).setId(82208), IApp(Id("""__x1__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(1L))).setId(82210), ILet(Id("""deleteCount"""), ERef(RefId(Id("""__x1__""")))).setId(82211), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(82213), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(82214), IReturn(ERef(RefId(Id("""__x2__""")))).setId(82215)).setId(82216), ISeq(List()).setId(82217)).setId(82218), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(82219), IApp(Id("""__x3__"""), ERef(RefId(Id("""LengthOfArrayLike"""))), List(ERef(RefId(Id("""O"""))))).setId(82221), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(82222), IReturn(ERef(RefId(Id("""__x3__""")))).setId(82223)).setId(82224), ISeq(List()).setId(82217)).setId(82225), ILet(Id("""len"""), ERef(RefId(Id("""__x3__""")))).setId(82226), IApp(Id("""__x4__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""start"""))))).setId(82228), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(82229), IReturn(ERef(RefId(Id("""__x4__""")))).setId(82230)).setId(82231), ISeq(List()).setId(82217)).setId(82232), ILet(Id("""relativeStart"""), ERef(RefId(Id("""__x4__""")))).setId(82233), IIf(EBOp(OLt, ERef(RefId(Id("""relativeStart"""))), EINum(0L)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""max"""))), List(EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""relativeStart""")))), EINum(0L))).setId(82235), ILet(Id("""actualStart"""), ERef(RefId(Id("""__x5__""")))).setId(82236))).setId(82237), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""relativeStart"""))), ERef(RefId(Id("""len"""))))).setId(82238), ILet(Id("""actualStart"""), ERef(RefId(Id("""__x6__""")))).setId(82239))).setId(82240)).setId(82241), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(0L)), ISeq(List(ILet(Id("""insertCount"""), EINum(0L)).setId(82243), ILet(Id("""actualDeleteCount"""), EINum(0L)).setId(82245))).setId(82247), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(1L)), ISeq(List(ILet(Id("""insertCount"""), EINum(0L)).setId(82248), ILet(Id("""actualDeleteCount"""), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualStart"""))))).setId(82250))).setId(82252), ISeq(List(ILet(Id("""insertCount"""), EBOp(OSub, ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length"""))), EINum(2L))).setId(82253), IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""deleteCount"""))))).setId(82255), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(82256), IReturn(ERef(RefId(Id("""__x7__""")))).setId(82257)).setId(82258), ISeq(List()).setId(82217)).setId(82259), ILet(Id("""dc"""), ERef(RefId(Id("""__x7__""")))).setId(82260), IApp(Id("""__x8__"""), ERef(RefId(Id("""max"""))), List(ERef(RefId(Id("""dc"""))), EINum(0L))).setId(82262), IApp(Id("""__x9__"""), ERef(RefId(Id("""min"""))), List(ERef(RefId(Id("""__x8__"""))), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualStart""")))))).setId(82263), ILet(Id("""actualDeleteCount"""), ERef(RefId(Id("""__x9__""")))).setId(82264))).setId(82266)).setId(82267)).setId(82269), IIf(EBOp(OLt, EBOp(OSub, EINum(9007199254740992L), EINum(1L)), EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""insertCount""")))), ERef(RefId(Id("""actualDeleteCount"""))))), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(82271), IReturn(ERef(RefId(Id("""__x10__""")))).setId(82272))).setId(82273), ISeq(List()).setId(82217)).setId(82274), IApp(Id("""__x11__"""), ERef(RefId(Id("""ArraySpeciesCreate"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""actualDeleteCount"""))))).setId(82276), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(82277), IReturn(ERef(RefId(Id("""__x11__""")))).setId(82278)).setId(82279), ISeq(List()).setId(82217)).setId(82280), ILet(Id("""A"""), ERef(RefId(Id("""__x11__""")))).setId(82281), ILet(Id("""k"""), EINum(0L)).setId(82283), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""actualDeleteCount""")))), ISeq(List(IApp(Id("""__x12__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OPlus, ERef(RefId(Id("""actualStart"""))), ERef(RefId(Id("""k""")))))).setId(82285), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(82286), IReturn(ERef(RefId(Id("""__x12__""")))).setId(82287)).setId(82288), ISeq(List()).setId(82217)).setId(82289), ILet(Id("""from"""), ERef(RefId(Id("""__x12__""")))).setId(82290), IApp(Id("""__x13__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(82292), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(82293), IReturn(ERef(RefId(Id("""__x13__""")))).setId(82294)).setId(82295), ISeq(List()).setId(82217)).setId(82296), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x13__""")))).setId(82297), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(82299), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x14__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x14__""")), ERef(RefProp(RefId(Id("""__x14__""")), EStr("""Value""")))).setId(82300), IReturn(ERef(RefId(Id("""__x14__""")))).setId(82301)).setId(82302), ISeq(List()).setId(82217)).setId(82303), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x14__""")))).setId(82304), IApp(Id("""__x15__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(82306), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x15__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x15__""")), ERef(RefProp(RefId(Id("""__x15__""")), EStr("""Value""")))).setId(82307), IReturn(ERef(RefId(Id("""__x15__""")))).setId(82308)).setId(82309), ISeq(List()).setId(82217)).setId(82310), IApp(Id("""__x16__"""), ERef(RefId(Id("""CreateDataPropertyOrThrow"""))), List(ERef(RefId(Id("""A"""))), ERef(RefId(Id("""__x15__"""))), ERef(RefId(Id("""fromValue"""))))).setId(82311), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x16__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x16__""")), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Value""")))).setId(82312), IReturn(ERef(RefId(Id("""__x16__""")))).setId(82313)).setId(82314), ISeq(List()).setId(82217)).setId(82315), IExpr(ERef(RefId(Id("""__x16__""")))).setId(82316))).setId(82318), ISeq(List()).setId(82217)).setId(82319), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(82321))).setId(82323)).setId(82324), IApp(Id("""__x17__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""A"""))), EStr("""length"""), ERef(RefId(Id("""actualDeleteCount"""))), EBool(true))).setId(82326), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x17__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x17__""")), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Value""")))).setId(82327), IReturn(ERef(RefId(Id("""__x17__""")))).setId(82328)).setId(82329), ISeq(List()).setId(82217)).setId(82330), IExpr(ERef(RefId(Id("""__x17__""")))).setId(82331), IIf(EBOp(OLt, EINum(2L), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), ISeq(List(IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(82333), IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(82334))).setId(82335), IAssign(RefId(Id("""argumentsList""")), EList(List())).setId(82336)).setId(82338), ILet(Id("""items"""), ERef(RefId(Id("""argumentsList""")))).setId(82339), ILet(Id("""itemCount"""), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))).setId(82341), IIf(EBOp(OLt, ERef(RefId(Id("""itemCount"""))), ERef(RefId(Id("""actualDeleteCount""")))), ISeq(List(IAssign(RefId(Id("""k""")), ERef(RefId(Id("""actualStart""")))).setId(82343), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount"""))))), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""actualDeleteCount""")))))).setId(82345), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x18__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x18__""")), ERef(RefProp(RefId(Id("""__x18__""")), EStr("""Value""")))).setId(82346), IReturn(ERef(RefId(Id("""__x18__""")))).setId(82347)).setId(82348), ISeq(List()).setId(82217)).setId(82349), ILet(Id("""from"""), ERef(RefId(Id("""__x18__""")))).setId(82350), IApp(Id("""__x19__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""itemCount""")))))).setId(82352), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x19__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x19__""")), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""Value""")))).setId(82353), IReturn(ERef(RefId(Id("""__x19__""")))).setId(82354)).setId(82355), ISeq(List()).setId(82217)).setId(82356), ILet(Id("""to"""), ERef(RefId(Id("""__x19__""")))).setId(82357), IApp(Id("""__x20__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(82359), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x20__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x20__""")), ERef(RefProp(RefId(Id("""__x20__""")), EStr("""Value""")))).setId(82360), IReturn(ERef(RefId(Id("""__x20__""")))).setId(82361)).setId(82362), ISeq(List()).setId(82217)).setId(82363), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x20__""")))).setId(82364), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x21__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(82366), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x21__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x21__""")), ERef(RefProp(RefId(Id("""__x21__""")), EStr("""Value""")))).setId(82367), IReturn(ERef(RefId(Id("""__x21__""")))).setId(82368)).setId(82369), ISeq(List()).setId(82217)).setId(82370), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x21__""")))).setId(82371), IApp(Id("""__x22__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))), ERef(RefId(Id("""fromValue"""))), EBool(true))).setId(82373), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x22__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x22__""")), ERef(RefProp(RefId(Id("""__x22__""")), EStr("""Value""")))).setId(82374), IReturn(ERef(RefId(Id("""__x22__""")))).setId(82375)).setId(82376), ISeq(List()).setId(82217)).setId(82377), IExpr(ERef(RefId(Id("""__x22__""")))).setId(82378))).setId(82380), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))))).setId(82381), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x23__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x23__""")), ERef(RefProp(RefId(Id("""__x23__""")), EStr("""Value""")))).setId(82382), IReturn(ERef(RefId(Id("""__x23__""")))).setId(82383)).setId(82384), ISeq(List()).setId(82217)).setId(82385), IExpr(ERef(RefId(Id("""__x23__""")))).setId(82386))).setId(82388)).setId(82389), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(82391))).setId(82393)).setId(82394), IAssign(RefId(Id("""k""")), ERef(RefId(Id("""len""")))).setId(82396), IWhile(EBOp(OLt, EBOp(OPlus, EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount""")))), ERef(RefId(Id("""itemCount""")))), ERef(RefId(Id("""k""")))), ISeq(List(IApp(Id("""__x24__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L)))).setId(82398), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x24__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x24__""")), ERef(RefProp(RefId(Id("""__x24__""")), EStr("""Value""")))).setId(82399), IReturn(ERef(RefId(Id("""__x24__""")))).setId(82400)).setId(82401), ISeq(List()).setId(82217)).setId(82402), IApp(Id("""__x25__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x24__"""))))).setId(82403), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x25__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x25__""")), ERef(RefProp(RefId(Id("""__x25__""")), EStr("""Value""")))).setId(82404), IReturn(ERef(RefId(Id("""__x25__""")))).setId(82405)).setId(82406), ISeq(List()).setId(82217)).setId(82407), IExpr(ERef(RefId(Id("""__x25__""")))).setId(82408), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L))).setId(82410))).setId(82412)).setId(82413))).setId(82415), IIf(EBOp(OLt, ERef(RefId(Id("""actualDeleteCount"""))), ERef(RefId(Id("""itemCount""")))), ISeq(List(IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount"""))))).setId(82416), IWhile(EBOp(OLt, ERef(RefId(Id("""actualStart"""))), ERef(RefId(Id("""k""")))), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""actualDeleteCount""")))), EINum(1L)))).setId(82418), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))).setId(82419), IReturn(ERef(RefId(Id("""__x26__""")))).setId(82420)).setId(82421), ISeq(List()).setId(82217)).setId(82422), ILet(Id("""from"""), ERef(RefId(Id("""__x26__""")))).setId(82423), IApp(Id("""__x27__"""), ERef(RefId(Id("""ToString"""))), List(EBOp(OSub, EBOp(OPlus, ERef(RefId(Id("""k"""))), ERef(RefId(Id("""itemCount""")))), EINum(1L)))).setId(82425), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x27__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x27__""")), ERef(RefProp(RefId(Id("""__x27__""")), EStr("""Value""")))).setId(82426), IReturn(ERef(RefId(Id("""__x27__""")))).setId(82427)).setId(82428), ISeq(List()).setId(82217)).setId(82429), ILet(Id("""to"""), ERef(RefId(Id("""__x27__""")))).setId(82430), IApp(Id("""__x28__"""), ERef(RefId(Id("""HasProperty"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(82432), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x28__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x28__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x28__""")), ERef(RefProp(RefId(Id("""__x28__""")), EStr("""Value""")))).setId(82433), IReturn(ERef(RefId(Id("""__x28__""")))).setId(82434)).setId(82435), ISeq(List()).setId(82217)).setId(82436), ILet(Id("""fromPresent"""), ERef(RefId(Id("""__x28__""")))).setId(82437), IIf(EBOp(OEq, ERef(RefId(Id("""fromPresent"""))), EBool(true)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""from"""))))).setId(82439), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x29__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x29__""")), ERef(RefProp(RefId(Id("""__x29__""")), EStr("""Value""")))).setId(82440), IReturn(ERef(RefId(Id("""__x29__""")))).setId(82441)).setId(82442), ISeq(List()).setId(82217)).setId(82443), ILet(Id("""fromValue"""), ERef(RefId(Id("""__x29__""")))).setId(82444), IApp(Id("""__x30__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))), ERef(RefId(Id("""fromValue"""))), EBool(true))).setId(82446), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x30__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x30__""")), ERef(RefProp(RefId(Id("""__x30__""")), EStr("""Value""")))).setId(82447), IReturn(ERef(RefId(Id("""__x30__""")))).setId(82448)).setId(82449), ISeq(List()).setId(82217)).setId(82450), IExpr(ERef(RefId(Id("""__x30__""")))).setId(82451))).setId(82453), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""DeletePropertyOrThrow"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""to"""))))).setId(82454), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x31__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x31__""")), ERef(RefProp(RefId(Id("""__x31__""")), EStr("""Value""")))).setId(82455), IReturn(ERef(RefId(Id("""__x31__""")))).setId(82456)).setId(82457), ISeq(List()).setId(82217)).setId(82458), IExpr(ERef(RefId(Id("""__x31__""")))).setId(82459))).setId(82461)).setId(82462), IAssign(RefId(Id("""k""")), EBOp(OSub, ERef(RefId(Id("""k"""))), EINum(1L))).setId(82464))).setId(82466)).setId(82467))).setId(82469), ISeq(List()).setId(82217)).setId(82470)).setId(82472), IAssign(RefId(Id("""k""")), ERef(RefId(Id("""actualStart""")))).setId(82474), IWhile(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""items""")), EStr("""length""")))), ISeq(List(ILet(Id("""E"""), EPop(ERef(RefId(Id("""items"""))), EINum(0L))).setId(82476), IApp(Id("""__x32__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""k"""))))).setId(82477), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x32__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x32__""")), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""Value""")))).setId(82478), IReturn(ERef(RefId(Id("""__x32__""")))).setId(82479)).setId(82480), ISeq(List()).setId(82217)).setId(82481), IApp(Id("""__x33__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""__x32__"""))), ERef(RefId(Id("""E"""))), EBool(true))).setId(82482), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x33__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x33__""")), ERef(RefProp(RefId(Id("""__x33__""")), EStr("""Value""")))).setId(82483), IReturn(ERef(RefId(Id("""__x33__""")))).setId(82484)).setId(82485), ISeq(List()).setId(82217)).setId(82486), IExpr(ERef(RefId(Id("""__x33__""")))).setId(82487), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(82489))).setId(82491)).setId(82492), IApp(Id("""__x34__"""), ERef(RefId(Id("""Set"""))), List(ERef(RefId(Id("""O"""))), EStr("""length"""), EBOp(OPlus, EBOp(OSub, ERef(RefId(Id("""len"""))), ERef(RefId(Id("""actualDeleteCount""")))), ERef(RefId(Id("""itemCount""")))), EBool(true))).setId(82494), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x34__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x34__""")), ERef(RefProp(RefId(Id("""__x34__""")), EStr("""Value""")))).setId(82495), IReturn(ERef(RefId(Id("""__x34__""")))).setId(82496)).setId(82497), ISeq(List()).setId(82217)).setId(82498), IExpr(ERef(RefId(Id("""__x34__""")))).setId(82499), IApp(Id("""__x35__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""A"""))))).setId(82501), IReturn(ERef(RefId(Id("""__x35__""")))).setId(82502))).setId(-1))
  /* Beautified form:
  "GLOBAL.Array.prototype.splice" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let start = __x0__
    app __x1__ = (GetArgument argumentsList 1i)
    let deleteCount = __x1__
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (LengthOfArrayLike O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let len = __x3__
    app __x4__ = (ToInteger start)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let relativeStart = __x4__
    if (< relativeStart 0i) {
      app __x5__ = (max (+ len relativeStart) 0i)
      let actualStart = __x5__
    } else {
      app __x6__ = (min relativeStart len)
      let actualStart = __x6__
    }
    if (= argumentsList["length"] 0i) {
      let insertCount = 0i
      let actualDeleteCount = 0i
    } else if (= argumentsList["length"] 1i) {
      let insertCount = 0i
      let actualDeleteCount = (- len actualStart)
    } else {
      let insertCount = (- argumentsList["length"] 2i)
      app __x7__ = (ToInteger deleteCount)
      if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
      let dc = __x7__
      app __x8__ = (max dc 0i)
      app __x9__ = (min __x8__ (- len actualStart))
      let actualDeleteCount = __x9__
    }
    if (< (- 9007199254740992i 1i) (- (+ len insertCount) actualDeleteCount)) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    app __x11__ = (ArraySpeciesCreate O actualDeleteCount)
    if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
    let A = __x11__
    let k = 0i
    while (< k actualDeleteCount) {
      app __x12__ = (ToString (+ actualStart k))
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      let from = __x12__
      app __x13__ = (HasProperty O from)
      if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      let fromPresent = __x13__
      if (= fromPresent true) {
        app __x14__ = (Get O from)
        if (= (typeof __x14__) "Completion") if (= __x14__["Type"] CONST_normal) __x14__ = __x14__["Value"] else return __x14__ else {}
        let fromValue = __x14__
        app __x15__ = (ToString k)
        if (= (typeof __x15__) "Completion") if (= __x15__["Type"] CONST_normal) __x15__ = __x15__["Value"] else return __x15__ else {}
        app __x16__ = (CreateDataPropertyOrThrow A __x15__ fromValue)
        if (= (typeof __x16__) "Completion") if (= __x16__["Type"] CONST_normal) __x16__ = __x16__["Value"] else return __x16__ else {}
        __x16__
      } else {}
      k = (+ k 1i)
    }
    app __x17__ = (Set A "length" actualDeleteCount true)
    if (= (typeof __x17__) "Completion") if (= __x17__["Type"] CONST_normal) __x17__ = __x17__["Value"] else return __x17__ else {}
    __x17__
    if (< 2i argumentsList["length"]) {
      (pop argumentsList 0i)
      (pop argumentsList 0i)
    } else argumentsList = (new [])
    let items = argumentsList
    let itemCount = items["length"]
    if (< itemCount actualDeleteCount) {
      k = actualStart
      while (< k (- len actualDeleteCount)) {
        app __x18__ = (ToString (+ k actualDeleteCount))
        if (= (typeof __x18__) "Completion") if (= __x18__["Type"] CONST_normal) __x18__ = __x18__["Value"] else return __x18__ else {}
        let from = __x18__
        app __x19__ = (ToString (+ k itemCount))
        if (= (typeof __x19__) "Completion") if (= __x19__["Type"] CONST_normal) __x19__ = __x19__["Value"] else return __x19__ else {}
        let to = __x19__
        app __x20__ = (HasProperty O from)
        if (= (typeof __x20__) "Completion") if (= __x20__["Type"] CONST_normal) __x20__ = __x20__["Value"] else return __x20__ else {}
        let fromPresent = __x20__
        if (= fromPresent true) {
          app __x21__ = (Get O from)
          if (= (typeof __x21__) "Completion") if (= __x21__["Type"] CONST_normal) __x21__ = __x21__["Value"] else return __x21__ else {}
          let fromValue = __x21__
          app __x22__ = (Set O to fromValue true)
          if (= (typeof __x22__) "Completion") if (= __x22__["Type"] CONST_normal) __x22__ = __x22__["Value"] else return __x22__ else {}
          __x22__
        } else {
          app __x23__ = (DeletePropertyOrThrow O to)
          if (= (typeof __x23__) "Completion") if (= __x23__["Type"] CONST_normal) __x23__ = __x23__["Value"] else return __x23__ else {}
          __x23__
        }
        k = (+ k 1i)
      }
      k = len
      while (< (+ (- len actualDeleteCount) itemCount) k) {
        app __x24__ = (ToString (- k 1i))
        if (= (typeof __x24__) "Completion") if (= __x24__["Type"] CONST_normal) __x24__ = __x24__["Value"] else return __x24__ else {}
        app __x25__ = (DeletePropertyOrThrow O __x24__)
        if (= (typeof __x25__) "Completion") if (= __x25__["Type"] CONST_normal) __x25__ = __x25__["Value"] else return __x25__ else {}
        __x25__
        k = (- k 1i)
      }
    } else if (< actualDeleteCount itemCount) {
      k = (- len actualDeleteCount)
      while (< actualStart k) {
        app __x26__ = (ToString (- (+ k actualDeleteCount) 1i))
        if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
        let from = __x26__
        app __x27__ = (ToString (- (+ k itemCount) 1i))
        if (= (typeof __x27__) "Completion") if (= __x27__["Type"] CONST_normal) __x27__ = __x27__["Value"] else return __x27__ else {}
        let to = __x27__
        app __x28__ = (HasProperty O from)
        if (= (typeof __x28__) "Completion") if (= __x28__["Type"] CONST_normal) __x28__ = __x28__["Value"] else return __x28__ else {}
        let fromPresent = __x28__
        if (= fromPresent true) {
          app __x29__ = (Get O from)
          if (= (typeof __x29__) "Completion") if (= __x29__["Type"] CONST_normal) __x29__ = __x29__["Value"] else return __x29__ else {}
          let fromValue = __x29__
          app __x30__ = (Set O to fromValue true)
          if (= (typeof __x30__) "Completion") if (= __x30__["Type"] CONST_normal) __x30__ = __x30__["Value"] else return __x30__ else {}
          __x30__
        } else {
          app __x31__ = (DeletePropertyOrThrow O to)
          if (= (typeof __x31__) "Completion") if (= __x31__["Type"] CONST_normal) __x31__ = __x31__["Value"] else return __x31__ else {}
          __x31__
        }
        k = (- k 1i)
      }
    } else {}
    k = actualStart
    while (< 0i items["length"]) {
      let E = (pop items 0i)
      app __x32__ = (ToString k)
      if (= (typeof __x32__) "Completion") if (= __x32__["Type"] CONST_normal) __x32__ = __x32__["Value"] else return __x32__ else {}
      app __x33__ = (Set O __x32__ E true)
      if (= (typeof __x33__) "Completion") if (= __x33__["Type"] CONST_normal) __x33__ = __x33__["Value"] else return __x33__ else {}
      __x33__
      k = (+ k 1i)
    }
    app __x34__ = (Set O "length" (+ (- len actualDeleteCount) itemCount) true)
    if (= (typeof __x34__) "Completion") if (= __x34__["Type"] CONST_normal) __x34__ = __x34__["Value"] else return __x34__ else {}
    __x34__
    app __x35__ = (WrapCompletion A)
    return __x35__
  }
  */
}
