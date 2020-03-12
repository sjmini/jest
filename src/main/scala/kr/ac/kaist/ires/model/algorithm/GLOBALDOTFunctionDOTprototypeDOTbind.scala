package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object GLOBALDOTFunctionDOTprototypeDOTbind {
  val length: Int = 1
  val func: Func = Func("""GLOBAL.Function.prototype.bind""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""GetArgument"""))), List(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(66853), ILet(Id("""thisArg"""), ERef(RefId(Id("""__x0__""")))).setId(66854), ILet(Id("""Target"""), ERef(RefId(Id("""this""")))).setId(66856), IApp(Id("""__x1__"""), ERef(RefId(Id("""IsCallable"""))), List(ERef(RefId(Id("""Target"""))))).setId(66858), IIf(EBOp(OEq, ERef(RefId(Id("""__x1__"""))), EBool(false)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66859), IReturn(ERef(RefId(Id("""__x2__""")))).setId(66860))).setId(66947), ISeq(List()).setId(66948)).setId(66863), IIf(EBOp(OLt, EINum(0L), ERef(RefProp(RefId(Id("""argumentsList""")), EStr("""length""")))), IExpr(EPop(ERef(RefId(Id("""argumentsList"""))), EINum(0L))).setId(66865), ISeq(List()).setId(66951)).setId(66867), ILet(Id("""args"""), ERef(RefId(Id("""argumentsList""")))).setId(66868), IApp(Id("""__x3__"""), ERef(RefId(Id("""BoundFunctionCreate"""))), List(ERef(RefId(Id("""Target"""))), ERef(RefId(Id("""thisArg"""))), ERef(RefId(Id("""args"""))))).setId(66870), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(66871), IReturn(ERef(RefId(Id("""__x3__""")))).setId(66872)).setId(66873), ISeq(List()).setId(66958)).setId(66874), ILet(Id("""F"""), ERef(RefId(Id("""__x3__""")))).setId(66875), IApp(Id("""__x4__"""), ERef(RefId(Id("""HasOwnProperty"""))), List(ERef(RefId(Id("""Target"""))), EStr("""length"""))).setId(66877), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(66878), IReturn(ERef(RefId(Id("""__x4__""")))).setId(66879)).setId(66880), ISeq(List()).setId(66965)).setId(66881), ILet(Id("""targetHasLength"""), ERef(RefId(Id("""__x4__""")))).setId(66882), IIf(EBOp(OEq, ERef(RefId(Id("""targetHasLength"""))), EBool(true)), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Target"""))), EStr("""length"""))).setId(66884), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x5__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x5__""")), ERef(RefProp(RefId(Id("""__x5__""")), EStr("""Value""")))).setId(66885), IReturn(ERef(RefId(Id("""__x5__""")))).setId(66886)).setId(66887), ISeq(List()).setId(66972)).setId(66888), ILet(Id("""targetLen"""), ERef(RefId(Id("""__x5__""")))).setId(66889), IApp(Id("""__x6__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""targetLen"""))))).setId(66891), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x6__"""))), ERef(RefId(Id("""Number"""))))), ILet(Id("""L"""), EINum(0L)).setId(66892), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ToInteger"""))), List(ERef(RefId(Id("""targetLen"""))))).setId(66894), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(66895), IReturn(ERef(RefId(Id("""__x7__""")))).setId(66896)).setId(66897), ISeq(List()).setId(66981)).setId(66898), IAssign(RefId(Id("""targetLen""")), ERef(RefId(Id("""__x7__""")))).setId(66899), IIf(EBOp(OLt, EINum(0L), EBOp(OSub, ERef(RefId(Id("""targetLen"""))), ERef(RefProp(RefId(Id("""args""")), EStr("""length"""))))), ILet(Id("""__x8__"""), EBOp(OSub, ERef(RefId(Id("""targetLen"""))), ERef(RefProp(RefId(Id("""args""")), EStr("""length"""))))).setId(66901), ILet(Id("""__x8__"""), EINum(0L)).setId(66902)).setId(66903), ILet(Id("""L"""), ERef(RefId(Id("""__x8__""")))).setId(66905))).setId(66988)).setId(66908))).setId(66990), ILet(Id("""L"""), EINum(0L)).setId(66911)).setId(66913), IApp(Id("""__x9__"""), ERef(RefId(Id("""SetFunctionLength"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""L"""))))).setId(66915), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x9__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x9__""")), ERef(RefProp(RefId(Id("""__x9__""")), EStr("""Value""")))).setId(66916), IReturn(ERef(RefId(Id("""__x9__""")))).setId(66917)).setId(66918), ISeq(List()).setId(66997)).setId(66919), IExpr(ERef(RefId(Id("""__x9__""")))).setId(66920), IApp(Id("""__x10__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""Target"""))), EStr("""name"""))).setId(66922), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x10__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x10__""")), ERef(RefProp(RefId(Id("""__x10__""")), EStr("""Value""")))).setId(66923), IReturn(ERef(RefId(Id("""__x10__""")))).setId(66924)).setId(66925), ISeq(List()).setId(67004)).setId(66926), ILet(Id("""targetName"""), ERef(RefId(Id("""__x10__""")))).setId(66927), IApp(Id("""__x11__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""targetName"""))))).setId(66929), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x11__"""))), ERef(RefId(Id("""String"""))))), IAssign(RefId(Id("""targetName""")), EStr("""""")).setId(66930), ISeq(List()).setId(67009)).setId(66932), IApp(Id("""__x12__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""targetName"""))), EStr("""bound"""))).setId(66934), IExpr(ERef(RefId(Id("""__x12__""")))).setId(66935), IApp(Id("""__x13__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(66937), IReturn(ERef(RefId(Id("""__x13__""")))).setId(66938))).setId(67015))
  val instToStepMap: Map[Int, Int] = HashMap(66874 -> 5, 66905 -> 14, 66863 -> 3, 66858 -> 3, 66856 -> 1, 66889 -> 14, 66931 -> 18, 66928 -> 17, 66908 -> 14, 66876 -> 5, 66861 -> 2, 66868 -> 4, 66854 -> 0, 66869 -> 4, 66927 -> 17, 66875 -> 5, 66933 -> 19, 66892 -> 10, 66939 -> 21, 66860 -> 2, 66907 -> 14, 66906 -> 14, 66864 -> 3, 66938 -> 21, 66870 -> 5, 66855 -> 0, 66913 -> 15, 66859 -> 2, 66930 -> 18, 66934 -> 20, 66890 -> 14, 66891 -> 14, 66937 -> 21, 66919 -> 16, 66922 -> 17, 66910 -> 14, 66915 -> 16, 66883 -> 6, 66929 -> 19, 66914 -> 15, 66912 -> 15, 66921 -> 16, 66882 -> 6, 66877 -> 6, 66909 -> 14, 66920 -> 16, 66935 -> 20, 66894 -> 14, 66881 -> 6, 66867 -> 4, 66903 -> 14, 66888 -> 14, 66898 -> 14, 66899 -> 14, 66857 -> 1, 66926 -> 17, 66884 -> 14, 66911 -> 15, 66853 -> 0, 66893 -> 10, 66904 -> 14, 66936 -> 20, 66932 -> 19, 66900 -> 14)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(66854, 66855, 66853), 5 -> HashSet(66875, 66874, 66870, 66876), 10 -> HashSet(66892, 66893), 14 -> HashSet(66905, 66910, 66889, 66909, 66908, 66904, 66900, 66907, 66906, 66890, 66891, 66894, 66903, 66888, 66898, 66899, 66884), 20 -> HashSet(66934, 66935, 66936), 1 -> HashSet(66856, 66857), 6 -> HashSet(66883, 66882, 66877, 66881), 21 -> HashSet(66939, 66938, 66937), 9 -> HashSet(66890, 66889, 66888, 66884), 13 -> HashSet(66894, 66900, 66898, 66899), 2 -> HashSet(66860, 66859, 66861), 17 -> HashSet(66927, 66922, 66926, 66928), 3 -> HashSet(66864, 66863, 66858), 18 -> HashSet(66930, 66931), 16 -> HashSet(66919, 66915, 66921, 66920), 19 -> HashSet(66933, 66929, 66932), 4 -> HashSet(66869, 66867, 66868), 15 -> HashSet(66913, 66911, 66914, 66912))
  /* Beautified form:
  "GLOBAL.Function.prototype.bind" (this, argumentsList, NewTarget) => {
    app __x0__ = (GetArgument argumentsList 0i)
    let thisArg = __x0__
    let Target = this
    app __x1__ = (IsCallable Target)
    if (= __x1__ false) {
      app __x2__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x2__
    } else {}
    if (< 0i argumentsList["length"]) (pop argumentsList 0i) else {}
    let args = argumentsList
    app __x3__ = (BoundFunctionCreate Target thisArg args)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let F = __x3__
    app __x4__ = (HasOwnProperty Target "length")
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let targetHasLength = __x4__
    if (= targetHasLength true) {
      app __x5__ = (Get Target "length")
      if (= (typeof __x5__) "Completion") if (= __x5__["Type"] CONST_normal) __x5__ = __x5__["Value"] else return __x5__ else {}
      let targetLen = __x5__
      app __x6__ = (Type targetLen)
      if (! (= __x6__ Number)) let L = 0i else {
        app __x7__ = (ToInteger targetLen)
        if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
        targetLen = __x7__
        if (< 0i (- targetLen args["length"])) let __x8__ = (- targetLen args["length"]) else let __x8__ = 0i
        let L = __x8__
      }
    } else let L = 0i
    app __x9__ = (SetFunctionLength F L)
    if (= (typeof __x9__) "Completion") if (= __x9__["Type"] CONST_normal) __x9__ = __x9__["Value"] else return __x9__ else {}
    __x9__
    app __x10__ = (Get Target "name")
    if (= (typeof __x10__) "Completion") if (= __x10__["Type"] CONST_normal) __x10__ = __x10__["Value"] else return __x10__ else {}
    let targetName = __x10__
    app __x11__ = (Type targetName)
    if (! (= __x11__ String)) targetName = "" else {}
    app __x12__ = (SetFunctionName F targetName "bound")
    __x12__
    app __x13__ = (WrapCompletion F)
    return __x13__
  }
  */
}
