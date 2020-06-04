package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object GLOBALDOTObjectDOTprototypeDOTtoString {
  val length: Int = 0
  val func: Func = Func("""GLOBAL.Object.prototype.toString""", List(Id("""this"""), Id("""argumentsList"""), Id("""NewTarget""")), None, ISeq(List(IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), EUndef), ISeq(List(IApp(Id("""__x0__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""[object Undefined]"""))).setId(65896), IReturn(ERef(RefId(Id("""__x0__""")))).setId(65897))).setId(65898), ISeq(List()).setId(65899)).setId(65900), IIf(EBOp(OEq, ERef(RefId(Id("""this"""))), ENull), ISeq(List(IApp(Id("""__x1__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EStr("""[object Null]"""))).setId(65902), IReturn(ERef(RefId(Id("""__x1__""")))).setId(65903))).setId(65904), ISeq(List()).setId(65899)).setId(65905), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToObject"""))), List(ERef(RefId(Id("""this"""))))).setId(65907), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(65908), IReturn(ERef(RefId(Id("""__x2__""")))).setId(65909)).setId(65910), ISeq(List()).setId(65899)).setId(65911), ILet(Id("""O"""), ERef(RefId(Id("""__x2__""")))).setId(65912), IApp(Id("""__x3__"""), ERef(RefId(Id("""IsArray"""))), List(ERef(RefId(Id("""O"""))))).setId(65914), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(65915), IReturn(ERef(RefId(Id("""__x3__""")))).setId(65916)).setId(65917), ISeq(List()).setId(65899)).setId(65918), ILet(Id("""isArray"""), ERef(RefId(Id("""__x3__""")))).setId(65919), IIf(EBOp(OEq, ERef(RefId(Id("""isArray"""))), EBool(true)), ILet(Id("""builtinTag"""), EStr("""Array""")).setId(65921), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""ParameterMap"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Arguments""")).setId(65923), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""Call"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Function""")).setId(65925), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""ErrorData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Error""")).setId(65927), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""BooleanData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Boolean""")).setId(65929), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""NumberData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Number""")).setId(65931), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""StringData"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""String""")).setId(65933), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""DateValue"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""Date""")).setId(65935), IIf(EUOp(ONot, EBOp(OEq, ERef(RefProp(RefId(Id("""O""")), EStr("""RegExpMatcher"""))), EAbsent)), ILet(Id("""builtinTag"""), EStr("""RegExp""")).setId(65937), ILet(Id("""builtinTag"""), EStr("""Object""")).setId(65939)).setId(65941)).setId(65943)).setId(65945)).setId(65947)).setId(65949)).setId(65951)).setId(65953)).setId(65955)).setId(65957), IApp(Id("""__x4__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""O"""))), ERef(RefId(Id("""SYMBOL_toStringTag"""))))).setId(65959), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(65960), IReturn(ERef(RefId(Id("""__x4__""")))).setId(65961)).setId(65962), ISeq(List()).setId(65899)).setId(65963), ILet(Id("""tag"""), ERef(RefId(Id("""__x4__""")))).setId(65964), IApp(Id("""__x5__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""tag"""))))).setId(65966), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""__x5__"""))), ERef(RefId(Id("""String"""))))), IAssign(RefId(Id("""tag""")), ERef(RefId(Id("""builtinTag""")))).setId(65967), ISeq(List()).setId(65899)).setId(65969), IApp(Id("""__x6__"""), ERef(RefId(Id("""WrapCompletion"""))), List(EBOp(OPlus, EBOp(OPlus, EStr("""[object """), ERef(RefId(Id("""tag""")))), EStr("""]""")))).setId(65971), IReturn(ERef(RefId(Id("""__x6__""")))).setId(65972))).setId(-1))
  /* Beautified form:
  "GLOBAL.Object.prototype.toString" (this, argumentsList, NewTarget) => {
    if (= this undefined) {
      app __x0__ = (WrapCompletion "[object Undefined]")
      return __x0__
    } else {}
    if (= this null) {
      app __x1__ = (WrapCompletion "[object Null]")
      return __x1__
    } else {}
    app __x2__ = (ToObject this)
    if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
    let O = __x2__
    app __x3__ = (IsArray O)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    let isArray = __x3__
    if (= isArray true) let builtinTag = "Array" else if (! (= O["ParameterMap"] absent)) let builtinTag = "Arguments" else if (! (= O["Call"] absent)) let builtinTag = "Function" else if (! (= O["ErrorData"] absent)) let builtinTag = "Error" else if (! (= O["BooleanData"] absent)) let builtinTag = "Boolean" else if (! (= O["NumberData"] absent)) let builtinTag = "Number" else if (! (= O["StringData"] absent)) let builtinTag = "String" else if (! (= O["DateValue"] absent)) let builtinTag = "Date" else if (! (= O["RegExpMatcher"] absent)) let builtinTag = "RegExp" else let builtinTag = "Object"
    app __x4__ = (Get O SYMBOL_toStringTag)
    if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
    let tag = __x4__
    app __x5__ = (Type tag)
    if (! (= __x5__ String)) tag = builtinTag else {}
    app __x6__ = (WrapCompletion (+ (+ "[object " tag) "]"))
    return __x6__
  }
  */
}
