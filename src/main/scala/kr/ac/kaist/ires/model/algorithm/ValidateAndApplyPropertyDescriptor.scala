package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ValidateAndApplyPropertyDescriptor {
  val length: Int = 5
  val func: Func = Func("""ValidateAndApplyPropertyDescriptor""", List(Id("""O"""), Id("""P"""), Id("""extensible"""), Id("""Desc"""), Id("""current""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""current"""))), EUndef), ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""extensible"""))), EBool(false)), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49614), IReturn(ERef(RefId(Id("""__x0__""")))).setId(49615))).setId(49822), ISeq(List()).setId(49823)).setId(49617), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(49619), ILet(Id("""__x2__"""), EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(true))).setId(49625), IIf(ERef(RefId(Id("""__x2__"""))), ISeq(List()).setId(49827), ISeq(List(IApp(Id("""__x3__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(49620), IAssign(RefId(Id("""__x2__""")), EBOp(OEq, ERef(RefId(Id("""__x3__"""))), EBool(true))).setId(49623))).setId(49830)).setId(49626), IIf(ERef(RefId(Id("""__x2__"""))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(IAssign(RefId(Id("""dp""")), EMap(Ty("""DataProperty"""), List())).setId(49627), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Value""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))).setId(49628), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Value""")), EUndef).setId(49629)).setId(49630), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Writable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")))).setId(49631), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Writable""")), EBool(false)).setId(49632)).setId(49633), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))).setId(49634), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), EBool(false)).setId(49635)).setId(49636), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")))).setId(49637), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), EBool(false)).setId(49638)).setId(49639), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""dp""")))).setId(49640))).setId(49846), ISeq(List()).setId(49847)).setId(49642), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(IAssign(RefId(Id("""dp""")), EMap(Ty("""AccessorProperty"""), List())).setId(49645), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Get""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get""")))).setId(49646), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Get""")), EUndef).setId(49647)).setId(49648), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Set""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set""")))).setId(49649), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Set""")), EUndef).setId(49650)).setId(49651), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))).setId(49652), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Enumerable""")), EBool(false)).setId(49653)).setId(49654), IIf(EUOp(ONot, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable""")))).setId(49655), IAssign(RefProp(RefId(Id("""dp""")), EStr("""Configurable""")), EBool(false)).setId(49656)).setId(49657), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""dp""")))).setId(49658))).setId(49863), ISeq(List()).setId(49864)).setId(49660)).setId(49663), IApp(Id("""__x4__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49665), IReturn(ERef(RefId(Id("""__x4__""")))).setId(49666))).setId(49869), ISeq(List()).setId(49870)).setId(49669), IIf(EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set""")))), EBOp(OAnd, EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable""")))), EBOp(OEq, EAbsent, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))))))))), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49671), IReturn(ERef(RefId(Id("""__x5__""")))).setId(49672))).setId(49874), ISeq(List()).setId(49875)).setId(49674), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Configurable"""))), EBool(true)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49676), IReturn(ERef(RefId(Id("""__x6__""")))).setId(49677))).setId(49879), ISeq(List()).setId(49880)).setId(49679), ILet(Id("""__x7__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), EAbsent))).setId(49690), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x8__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Enumerable"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Enumerable"""))))).setId(49681), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(49682), IReturn(ERef(RefId(Id("""__x8__""")))).setId(49683)).setId(49684), ISeq(List()).setId(49887)).setId(49685), IAssign(RefId(Id("""__x7__""")), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), EBool(false))).setId(49688))).setId(49890), ISeq(List()).setId(49891)).setId(49691), IIf(ERef(RefId(Id("""__x7__"""))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49692), IReturn(ERef(RefId(Id("""__x9__""")))).setId(49693))).setId(49895), ISeq(List()).setId(49896)).setId(49695))).setId(49898), ISeq(List()).setId(49899)).setId(49698), IApp(Id("""__x10__"""), ERef(RefId(Id("""IsGenericDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(49700), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(49701), IReturn(ERef(RefId(Id("""__x10__""")))).setId(49702)).setId(49703), ISeq(List()).setId(49905)).setId(49704), IIf(EBOp(OEq, ERef(RefId(Id("""__x10__"""))), EBool(true)), ISeq(List()).setId(49907), ISeq(List(IApp(Id("""__x11__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))).setId(49706), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x11__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x11__""")), ERef(RefProp(RefId(Id("""__x11__""")), EStr("""Value""")))).setId(49707), IReturn(ERef(RefId(Id("""__x11__""")))).setId(49708)).setId(49709), ISeq(List()).setId(49912)).setId(49710), IApp(Id("""__x12__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(49711), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x12__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x12__""")), ERef(RefProp(RefId(Id("""__x12__""")), EStr("""Value""")))).setId(49712), IReturn(ERef(RefId(Id("""__x12__""")))).setId(49713)).setId(49714), ISeq(List()).setId(49918)).setId(49715), IApp(Id("""__x13__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""__x12__"""))))).setId(49716), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x13__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x13__""")), ERef(RefProp(RefId(Id("""__x13__""")), EStr("""Value""")))).setId(49717), IReturn(ERef(RefId(Id("""__x13__""")))).setId(49718)).setId(49719), ISeq(List()).setId(49924)).setId(49720), IIf(EBOp(OEq, ERef(RefId(Id("""__x13__"""))), EBool(false)), ISeq(List(IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(IApp(Id("""__x14__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49721), IReturn(ERef(RefId(Id("""__x14__""")))).setId(49722))).setId(49928), ISeq(List()).setId(49929)).setId(49724), IApp(Id("""__x15__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))).setId(49726), IIf(EBOp(OEq, ERef(RefId(Id("""__x15__"""))), EBool(true)), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x16__"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))).setId(49727), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), EMap(Ty("""AccessorProperty"""), List((EStr("""Get"""), EUndef), (EStr("""Set"""), EUndef), (EStr("""Enumerable"""), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Enumerable""")))), (EStr("""Configurable"""), ERef(RefProp(RefId(Id("""__x16__""")), EStr("""Configurable"""))))))).setId(49728))).setId(49934), ISeq(List()).setId(49935)).setId(49730), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x17__"""), ERef(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))))).setId(49733), IAssign(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), EMap(Ty("""DataProperty"""), List((EStr("""Value"""), EUndef), (EStr("""Writable"""), EBool(false)), (EStr("""Enumerable"""), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Enumerable""")))), (EStr("""Configurable"""), ERef(RefProp(RefId(Id("""__x17__""")), EStr("""Configurable"""))))))).setId(49734))).setId(49939), ISeq(List()).setId(49940)).setId(49736)).setId(49739))).setId(49943), ISeq(List(IApp(Id("""__x18__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""current"""))))).setId(49742), IApp(Id("""__x19__"""), ERef(RefId(Id("""IsDataDescriptor"""))), List(ERef(RefId(Id("""Desc"""))))).setId(49743), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefId(Id("""__x18__"""))), EBool(true)), EBOp(OEq, ERef(RefId(Id("""__x19__"""))), EBool(true))), IIf(EBOp(OAnd, EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Writable"""))), EBool(false))), ISeq(List(IIf(EBOp(OAnd, EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EAbsent)), EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Writable"""))), EBool(true))), ISeq(List(IApp(Id("""__x20__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49744), IReturn(ERef(RefId(Id("""__x20__""")))).setId(49745))).setId(49948), ISeq(List()).setId(49949)).setId(49747), ILet(Id("""__x21__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), EAbsent))).setId(49754), IIf(ERef(RefId(Id("""__x21__"""))), ISeq(List(IApp(Id("""__x22__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Value"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Value"""))))).setId(49749), IAssign(RefId(Id("""__x21__""")), EBOp(OEq, ERef(RefId(Id("""__x22__"""))), EBool(false))).setId(49752))).setId(49954), ISeq(List()).setId(49955)).setId(49755), IIf(ERef(RefId(Id("""__x21__"""))), ISeq(List(IApp(Id("""__x23__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49756), IReturn(ERef(RefId(Id("""__x23__""")))).setId(49757))).setId(49959), ISeq(List()).setId(49960)).setId(49759), IApp(Id("""__x24__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49761), IReturn(ERef(RefId(Id("""__x24__""")))).setId(49762))).setId(49964), ISeq(List()).setId(49965)).setId(49765), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""current""")), EStr("""Configurable"""))), EBool(false)), ISeq(List(ILet(Id("""__x25__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), EAbsent))).setId(49773), IIf(ERef(RefId(Id("""__x25__"""))), ISeq(List(IApp(Id("""__x26__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Set"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Set"""))))).setId(49768), IAssign(RefId(Id("""__x25__""")), EBOp(OEq, ERef(RefId(Id("""__x26__"""))), EBool(false))).setId(49771))).setId(49970), ISeq(List()).setId(49971)).setId(49774), IIf(ERef(RefId(Id("""__x25__"""))), ISeq(List(IApp(Id("""__x27__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49775), IReturn(ERef(RefId(Id("""__x27__""")))).setId(49776))).setId(49975), ISeq(List()).setId(49976)).setId(49778), ILet(Id("""__x28__"""), EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), EAbsent))).setId(49785), IIf(ERef(RefId(Id("""__x28__"""))), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""SameValue"""))), List(ERef(RefProp(RefId(Id("""Desc""")), EStr("""Get"""))), ERef(RefProp(RefId(Id("""current""")), EStr("""Get"""))))).setId(49780), IAssign(RefId(Id("""__x28__""")), EBOp(OEq, ERef(RefId(Id("""__x29__"""))), EBool(false))).setId(49783))).setId(49981), ISeq(List()).setId(49982)).setId(49786), IIf(ERef(RefId(Id("""__x28__"""))), ISeq(List(IApp(Id("""__x30__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(false))).setId(49787), IReturn(ERef(RefId(Id("""__x30__""")))).setId(49788))).setId(49986), ISeq(List()).setId(49987)).setId(49790), IApp(Id("""__x31__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49792), IReturn(ERef(RefId(Id("""__x31__""")))).setId(49793))).setId(49991), ISeq(List()).setId(49992)).setId(49796)).setId(49799))).setId(49995)).setId(49801))).setId(49997)).setId(49803), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""O"""))), EUndef)), ISeq(List(ILet(Id("""__x32__"""), EKeys(ERef(RefId(Id("""Desc"""))))).setId(49806), ILet(Id("""__x33__"""), EINum(0L)).setId(49807), IWhile(EBOp(OLt, ERef(RefId(Id("""__x33__"""))), ERef(RefProp(RefId(Id("""__x32__""")), EStr("""length""")))), ISeq(List(ILet(Id("""__x34__"""), ERef(RefProp(RefId(Id("""__x32__""")), ERef(RefId(Id("""__x33__""")))))).setId(49808), IAssign(RefProp(RefProp(RefProp(RefId(Id("""O""")), EStr("""SubMap""")), ERef(RefId(Id("""P""")))), ERef(RefId(Id("""__x34__""")))), ERef(RefProp(RefId(Id("""Desc""")), ERef(RefId(Id("""__x34__""")))))).setId(49805), IAssign(RefId(Id("""__x33__""")), EBOp(OPlus, ERef(RefId(Id("""__x33__"""))), EINum(1L))).setId(49809))).setId(50004)).setId(49811))).setId(50006), ISeq(List()).setId(50007)).setId(49814), IApp(Id("""__x35__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBool(true))).setId(49816), IReturn(ERef(RefId(Id("""__x35__""")))).setId(49817))).setId(50011))
  val instToStepMap: Map[Int, Int] = HashMap(49767 -> 44, 49799 -> 54, 49694 -> 21, 49705 -> 25, 49673 -> 15, 49816 -> 59, 49737 -> 35, 49651 -> 12, 49668 -> 13, 49664 -> 13, 49677 -> 19, 49700 -> 54, 49796 -> 54, 49758 -> 42, 49777 -> 50, 49733 -> 35, 49764 -> 44, 49726 -> 35, 49660 -> 12, 49791 -> 54, 49813 -> 57, 49802 -> 54, 49704 -> 54, 49754 -> 44, 49722 -> 28, 49615 -> 3, 49643 -> 8, 49806 -> 57, 49690 -> 21, 49736 -> 35, 49787 -> 52, 49774 -> 54, 49619 -> 13, 49672 -> 15, 49741 -> 35, 49740 -> 35, 49721 -> 28, 49766 -> 44, 49613 -> 54, 49746 -> 40, 49815 -> 58, 49763 -> 44, 49744 -> 40, 49798 -> 54, 49693 -> 21, 49812 -> 57, 49663 -> 13, 49793 -> 54, 49795 -> 54, 49680 -> 21, 49627 -> 8, 49807 -> 57, 49775 -> 50, 49747 -> 44, 49659 -> 12, 49792 -> 54, 49676 -> 19, 49725 -> 35, 49803 -> 54, 49614 -> 3, 49669 -> 14, 49762 -> 44, 49645 -> 12, 49639 -> 8, 49642 -> 8, 49788 -> 52, 49757 -> 42, 49756 -> 42, 49728 -> 32, 49636 -> 8, 49743 -> 54, 49626 -> 13, 49794 -> 54, 49789 -> 52, 49662 -> 12, 49801 -> 54, 49711 -> 54, 49730 -> 32, 49698 -> 22, 49814 -> 58, 49760 -> 44, 49779 -> 54, 49666 -> 13, 49679 -> 21, 49811 -> 57, 49715 -> 54, 49696 -> 21, 49761 -> 44, 49776 -> 50, 49729 -> 32, 49748 -> 44, 49670 -> 14, 49675 -> 16, 49692 -> 21, 49716 -> 54, 49665 -> 13, 49630 -> 8, 49739 -> 35, 49640 -> 8, 49724 -> 35, 49817 -> 59, 49617 -> 13, 49778 -> 54, 49641 -> 8, 49785 -> 54, 49804 -> 54, 49697 -> 21, 49734 -> 35, 49658 -> 12, 49661 -> 12, 49678 -> 19, 49759 -> 44, 49667 -> 13, 49727 -> 32, 49800 -> 54, 49773 -> 54, 49633 -> 8, 49648 -> 12, 49786 -> 54, 49625 -> 13, 49731 -> 32, 49742 -> 54, 49695 -> 21, 49699 -> 22, 49710 -> 54, 49732 -> 32, 49745 -> 40, 49818 -> 59, 49618 -> 13, 49644 -> 8, 49735 -> 35, 49720 -> 54, 49797 -> 54, 49790 -> 54, 49765 -> 44, 49616 -> 3, 49691 -> 21, 49706 -> 54, 49738 -> 35, 49654 -> 12, 49657 -> 12, 49674 -> 16, 49755 -> 44, 49671 -> 15, 49723 -> 28)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(49613), 5 -> HashSet(49613), 53 -> HashSet(49791, 49785, 49786, 49790), 32 -> HashSet(49728, 49730, 49729, 49727, 49731, 49732), 40 -> HashSet(49746, 49744, 49745), 4 -> HashSet(49617, 49618), 42 -> HashSet(49758, 49757, 49756), 25 -> HashSet(49705, 49613), 52 -> HashSet(49787, 49788, 49789), 14 -> HashSet(49669, 49670), 20 -> HashSet(49680, 49679), 57 -> HashSet(49813, 49806, 49812, 49807, 49811), 29 -> HashSet(49725, 49724), 28 -> HashSet(49722, 49721, 49723), 21 -> HashSet(49694, 49690, 49693, 49680, 49692, 49697, 49695, 49691, 49679, 49696), 13 -> HashSet(49668, 49664, 49619, 49613, 49663, 49626, 49666, 49665, 49617, 49667, 49625, 49618), 41 -> HashSet(49747, 49748), 22 -> HashSet(49698, 49699), 44 -> HashSet(49767, 49764, 49754, 49766, 49763, 49747, 49762, 49760, 49759, 49765, 49755, 49761, 49748), 59 -> HashSet(49816, 49817, 49818), 12 -> HashSet(49651, 49664, 49660, 49619, 49613, 49663, 49659, 49645, 49626, 49662, 49658, 49661, 49654, 49657, 49648, 49625), 54 -> HashSet(49799, 49700, 49796, 49774, 49613, 49798, 49792, 49803, 49779, 49715, 49716, 49778, 49786, 49706, 49791, 49802, 49704, 49793, 49795, 49794, 49743, 49801, 49711, 49785, 49804, 49800, 49773, 49742, 49710, 49720, 49797, 49790), 3 -> HashSet(49615, 49614, 49616), 35 -> HashSet(49737, 49736, 49741, 49740, 49725, 49734, 49735, 49738, 49733, 49726, 49739, 49724), 50 -> HashSet(49777, 49775, 49776), 16 -> HashSet(49675, 49674), 11 -> HashSet(49613), 43 -> HashSet(49754, 49760, 49759, 49755), 8 -> HashSet(49643, 49627, 49636, 49633, 49644, 49639, 49642, 49630, 49640, 49641), 58 -> HashSet(49815, 49814), 51 -> HashSet(49774, 49779, 49778, 49773), 19 -> HashSet(49677, 49676, 49678), 47 -> HashSet(49613), 15 -> HashSet(49673, 49672, 49671))
  /* Beautified form:
  "ValidateAndApplyPropertyDescriptor" (O, P, extensible, Desc, current) => {
    if (= current undefined) {
      if (= extensible false) {
        app __x0__ = (WrapCompletion false)
        return __x0__
      } else {}
      app __x1__ = (IsGenericDescriptor Desc)
      let __x2__ = (= __x1__ true)
      if __x2__ {} else {
        app __x3__ = (IsDataDescriptor Desc)
        __x2__ = (= __x3__ true)
      }
      if __x2__ if (! (= O undefined)) {
        dp = (new DataProperty())
        if (! (= absent Desc["Value"])) dp["Value"] = Desc["Value"] else dp["Value"] = undefined
        if (! (= absent Desc["Writable"])) dp["Writable"] = Desc["Writable"] else dp["Writable"] = false
        if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
        if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
        O["SubMap"][P] = dp
      } else {} else if (! (= O undefined)) {
        dp = (new AccessorProperty())
        if (! (= absent Desc["Get"])) dp["Get"] = Desc["Get"] else dp["Get"] = undefined
        if (! (= absent Desc["Set"])) dp["Set"] = Desc["Set"] else dp["Set"] = undefined
        if (! (= absent Desc["Enumerable"])) dp["Enumerable"] = Desc["Enumerable"] else dp["Enumerable"] = false
        if (! (= absent Desc["Configurable"])) dp["Configurable"] = Desc["Configurable"] else dp["Configurable"] = false
        O["SubMap"][P] = dp
      } else {}
      app __x4__ = (WrapCompletion true)
      return __x4__
    } else {}
    if (&& (= absent Desc["Value"]) (&& (= absent Desc["Writable"]) (&& (= absent Desc["Get"]) (&& (= absent Desc["Set"]) (&& (= absent Desc["Enumerable"]) (= absent Desc["Configurable"])))))) {
      app __x5__ = (WrapCompletion true)
      return __x5__
    } else {}
    if (= current["Configurable"] false) {
      if (= Desc["Configurable"] true) {
        app __x6__ = (WrapCompletion false)
        return __x6__
      } else {}
      let __x7__ = (! (= Desc["Enumerable"] absent))
      if __x7__ {
        app __x8__ = (SameValue Desc["Enumerable"] current["Enumerable"])
        if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
        __x7__ = (= __x8__ false)
      } else {}
      if __x7__ {
        app __x9__ = (WrapCompletion false)
        return __x9__
      } else {}
    } else {}
    app __x10__ = (IsGenericDescriptor Desc)
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    if (= __x10__ true) {} else {
      app __x11__ = (IsDataDescriptor current)
      if (= (typeof __x11__) "Completion") if (= __x11__["Type"] CONST_normal) __x11__ = __x11__["Value"] else return __x11__ else {}
      app __x12__ = (IsDataDescriptor Desc)
      if (= (typeof __x12__) "Completion") if (= __x12__["Type"] CONST_normal) __x12__ = __x12__["Value"] else return __x12__ else {}
      app __x13__ = (SameValue __x11__ __x12__)
      if (= (typeof __x13__) "Completion") if (= __x13__["Type"] CONST_normal) __x13__ = __x13__["Value"] else return __x13__ else {}
      if (= __x13__ false) {
        if (= current["Configurable"] false) {
          app __x14__ = (WrapCompletion false)
          return __x14__
        } else {}
        app __x15__ = (IsDataDescriptor current)
        if (= __x15__ true) if (! (= O undefined)) {
          let __x16__ = O["SubMap"][P]
          O["SubMap"][P] = (new AccessorProperty("Get" -> undefined, "Set" -> undefined, "Enumerable" -> __x16__["Enumerable"], "Configurable" -> __x16__["Configurable"]))
        } else {} else if (! (= O undefined)) {
          let __x17__ = O["SubMap"][P]
          O["SubMap"][P] = (new DataProperty("Value" -> undefined, "Writable" -> false, "Enumerable" -> __x17__["Enumerable"], "Configurable" -> __x17__["Configurable"]))
        } else {}
      } else {
        app __x18__ = (IsDataDescriptor current)
        app __x19__ = (IsDataDescriptor Desc)
        if (&& (= __x18__ true) (= __x19__ true)) if (&& (= current["Configurable"] false) (= current["Writable"] false)) {
          if (&& (! (= Desc["Writable"] absent)) (= Desc["Writable"] true)) {
            app __x20__ = (WrapCompletion false)
            return __x20__
          } else {}
          let __x21__ = (! (= Desc["Value"] absent))
          if __x21__ {
            app __x22__ = (SameValue Desc["Value"] current["Value"])
            __x21__ = (= __x22__ false)
          } else {}
          if __x21__ {
            app __x23__ = (WrapCompletion false)
            return __x23__
          } else {}
          app __x24__ = (WrapCompletion true)
          return __x24__
        } else {} else if (= current["Configurable"] false) {
          let __x25__ = (! (= Desc["Set"] absent))
          if __x25__ {
            app __x26__ = (SameValue Desc["Set"] current["Set"])
            __x25__ = (= __x26__ false)
          } else {}
          if __x25__ {
            app __x27__ = (WrapCompletion false)
            return __x27__
          } else {}
          let __x28__ = (! (= Desc["Get"] absent))
          if __x28__ {
            app __x29__ = (SameValue Desc["Get"] current["Get"])
            __x28__ = (= __x29__ false)
          } else {}
          if __x28__ {
            app __x30__ = (WrapCompletion false)
            return __x30__
          } else {}
          app __x31__ = (WrapCompletion true)
          return __x31__
        } else {}
      }
    }
    if (! (= O undefined)) {
      let __x32__ = (map-keys Desc)
      let __x33__ = 0i
      while (< __x33__ __x32__["length"]) {
        let __x34__ = __x32__[__x33__]
        O["SubMap"][P][__x34__] = Desc[__x34__]
        __x33__ = (+ __x33__ 1i)
      }
    } else {}
    app __x35__ = (WrapCompletion true)
    return __x35__
  }
  */
}
