package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._

object BlockDeclarationInstantiation {
  val length: Int = 2
  val func: Func = Func("""BlockDeclarationInstantiation""", List(Id("""code"""), Id("""env""")), None, ISeq(List(ILet(Id("""envRec"""), ERef(RefProp(RefId(Id("""env""")), EStr("""EnvironmentRecord""")))).setId(26959), IAccess(Id("""__x0__"""), ERef(RefId(Id("""code"""))), EStr("""LexicallyScopedDeclarations""")).setId(26962), ILet(Id("""declarations"""), ERef(RefId(Id("""__x0__""")))).setId(26963), ILet(Id("""__x1__"""), ERef(RefId(Id("""declarations""")))).setId(27008), ILet(Id("""__x2__"""), EINum(0L)).setId(27009), IWhile(EBOp(OLt, ERef(RefId(Id("""__x2__"""))), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""length""")))), ISeq(List(ILet(Id("""d"""), ERef(RefProp(RefId(Id("""__x1__""")), ERef(RefId(Id("""__x2__""")))))).setId(27010), IAccess(Id("""__x3__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(26965), ILet(Id("""__x4__"""), ERef(RefId(Id("""__x3__""")))).setId(26986), ILet(Id("""__x5__"""), EINum(0L)).setId(26987), IWhile(EBOp(OLt, ERef(RefId(Id("""__x5__"""))), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""length""")))), ISeq(List(ILet(Id("""dn"""), ERef(RefProp(RefId(Id("""__x4__""")), ERef(RefId(Id("""__x5__""")))))).setId(26988), IAccess(Id("""__x6__"""), ERef(RefId(Id("""d"""))), EStr("""IsConstantDeclaration""")).setId(26966), IIf(EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(true)), ISeq(List(IApp(Id("""__x7__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""dn"""))), EBool(true))).setId(26967), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(26968), IReturn(ERef(RefId(Id("""__x7__""")))).setId(26969)).setId(26970), ISeq(List()).setId(26961)).setId(26971), IExpr(ERef(RefId(Id("""__x7__""")))).setId(26972))).setId(26974), ISeq(List(IApp(Id("""__x8__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""CreateMutableBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""dn"""))), EBool(false))).setId(26975), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x8__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x8__""")), ERef(RefProp(RefId(Id("""__x8__""")), EStr("""Value""")))).setId(26976), IReturn(ERef(RefId(Id("""__x8__""")))).setId(26977)).setId(26978), ISeq(List()).setId(26961)).setId(26979), IExpr(ERef(RefId(Id("""__x8__""")))).setId(26980))).setId(26982)).setId(26983), IAssign(RefId(Id("""__x5__""")), EBOp(OPlus, ERef(RefId(Id("""__x5__"""))), EINum(1L))).setId(26989))).setId(26990)).setId(26991), IIf(EBOp(OOr, EBOp(OOr, EBOp(OOr, EIsInstanceOf(ERef(RefId(Id("""d"""))), """FunctionDeclaration"""), EIsInstanceOf(ERef(RefId(Id("""d"""))), """GeneratorDeclaration""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """AsyncFunctionDeclaration""")), EIsInstanceOf(ERef(RefId(Id("""d"""))), """AsyncGeneratorDeclaration""")), ISeq(List(IAccess(Id("""__x9__"""), ERef(RefId(Id("""d"""))), EStr("""BoundNames""")).setId(26994), ILet(Id("""fn"""), ERef(RefProp(RefId(Id("""__x9__""")), EINum(0L)))).setId(26995), IAccess(Id("""__x10__"""), ERef(RefId(Id("""d"""))), EStr("""InstantiateFunctionObject""")).setId(26997), IApp(Id("""__x11__"""), ERef(RefId(Id("""__x10__"""))), List(ERef(RefId(Id("""env"""))))).setId(26998), ILet(Id("""fo"""), ERef(RefId(Id("""__x11__""")))).setId(26999), IApp(Id("""__x12__"""), ERef(RefProp(RefId(Id("""envRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""envRec"""))), ERef(RefId(Id("""fn"""))), ERef(RefId(Id("""fo"""))))).setId(27001), IExpr(ERef(RefId(Id("""__x12__""")))).setId(27002))).setId(27004), ISeq(List()).setId(26961)).setId(27005), IAssign(RefId(Id("""__x2__""")), EBOp(OPlus, ERef(RefId(Id("""__x2__"""))), EINum(1L))).setId(27011))).setId(27012)).setId(27013))).setId(-1))
  /* Beautified form:
  "BlockDeclarationInstantiation" (code, env) => {
    let envRec = env["EnvironmentRecord"]
    access __x0__ = (code "LexicallyScopedDeclarations")
    let declarations = __x0__
    let __x1__ = declarations
    let __x2__ = 0i
    while (< __x2__ __x1__["length"]) {
      let d = __x1__[__x2__]
      access __x3__ = (d "BoundNames")
      let __x4__ = __x3__
      let __x5__ = 0i
      while (< __x5__ __x4__["length"]) {
        let dn = __x4__[__x5__]
        access __x6__ = (d "IsConstantDeclaration")
        if (= __x6__ true) {
          app __x7__ = (envRec["CreateImmutableBinding"] envRec dn true)
          if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          __x7__
        } else {
          app __x8__ = (envRec["CreateMutableBinding"] envRec dn false)
          if (= (typeof __x8__) "Completion") if (= __x8__["Type"] CONST_normal) __x8__ = __x8__["Value"] else return __x8__ else {}
          __x8__
        }
        __x5__ = (+ __x5__ 1i)
      }
      if (|| (|| (|| (is-instance-of d FunctionDeclaration) (is-instance-of d GeneratorDeclaration)) (is-instance-of d AsyncFunctionDeclaration)) (is-instance-of d AsyncGeneratorDeclaration)) {
        access __x9__ = (d "BoundNames")
        let fn = __x9__[0i]
        access __x10__ = (d "InstantiateFunctionObject")
        app __x11__ = (__x10__ env)
        let fo = __x11__
        app __x12__ = (envRec["InitializeBinding"] envRec fn fo)
        __x12__
      } else {}
      __x2__ = (+ __x2__ 1i)
    }
  }
  */
}
