package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object CreateDynamicFunction {
  val length: Int = 4
  val func: Func = Func("""CreateDynamicFunction""", List(Id("""constructor"""), Id("""newTarget"""), Id("""kind"""), Id("""args""")), None, ISeq(List(ILet(Id("""callerContext"""), ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EBOp(OSub, ERef(RefProp(RefId(Id("""GLOBAL_executionStack""")), EStr("""length"""))), EINum(2L))))).setId(66154), ILet(Id("""callerRealm"""), ERef(RefProp(RefId(Id("""callerContext""")), EStr("""Realm""")))).setId(66156), ILet(Id("""calleeRealm"""), ERef(RefId(Id("""REALM""")))).setId(66158), IApp(Id("""__x0__"""), ERef(RefId(Id("""HostEnsureCanCompileStrings"""))), List(ERef(RefId(Id("""callerRealm"""))), ERef(RefId(Id("""calleeRealm"""))))).setId(66160), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x0__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x0__""")), ERef(RefProp(RefId(Id("""__x0__""")), EStr("""Value""")))).setId(66161), IReturn(ERef(RefId(Id("""__x0__""")))).setId(66162)).setId(66163), ISeq(List()).setId(66380)).setId(66164), IExpr(ERef(RefId(Id("""__x0__""")))).setId(66165), IIf(EBOp(OEq, ERef(RefId(Id("""newTarget"""))), EUndef), IAssign(RefId(Id("""newTarget""")), ERef(RefId(Id("""constructor""")))).setId(66167), ISeq(List()).setId(66384)).setId(66169), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""normal""")), ISeq(List(ILet(Id("""goal"""), EStr("""FunctionBody""")).setId(66171), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")).setId(66173), ILet(Id("""fallbackProto"""), EStr("""%FunctionPrototype%""")).setId(66175))).setId(66389), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""generator""")), ISeq(List(ILet(Id("""goal"""), EStr("""GeneratorBody""")).setId(66178), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")).setId(66180), ILet(Id("""fallbackProto"""), EStr("""%Generator%""")).setId(66182))).setId(66393), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async""")), ISeq(List(ILet(Id("""goal"""), EStr("""AsyncFunctionBody""")).setId(66185), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")).setId(66187), ILet(Id("""fallbackProto"""), EStr("""%AsyncFunctionPrototype%""")).setId(66189))).setId(66397), ISeq(List(ILet(Id("""goal"""), EStr("""AsyncGeneratorBody""")).setId(66192), ILet(Id("""parameterGoal"""), EStr("""FormalParameters""")).setId(66194), ILet(Id("""fallbackProto"""), EStr("""%AsyncGenerator%""")).setId(66196))).setId(66401)).setId(66199)).setId(66201)).setId(66203), ILet(Id("""argCount"""), ERef(RefProp(RefId(Id("""args""")), EStr("""length""")))).setId(66205), ILet(Id("""P"""), EStr("""""")).setId(66207), IIf(EBOp(OEq, ERef(RefId(Id("""argCount"""))), EINum(0L)), ILet(Id("""bodyText"""), EStr("""""")).setId(66209), IIf(EBOp(OEq, ERef(RefId(Id("""argCount"""))), EINum(1L)), ILet(Id("""bodyText"""), ERef(RefProp(RefId(Id("""args""")), EINum(0L)))).setId(66211), ISeq(List(ILet(Id("""firstArg"""), ERef(RefProp(RefId(Id("""args""")), EINum(0L)))).setId(66213), IApp(Id("""__x1__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""firstArg"""))))).setId(66215), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x1__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x1__""")), ERef(RefProp(RefId(Id("""__x1__""")), EStr("""Value""")))).setId(66216), IReturn(ERef(RefId(Id("""__x1__""")))).setId(66217)).setId(66218), ISeq(List()).setId(66414)).setId(66219), IAssign(RefId(Id("""P""")), ERef(RefId(Id("""__x1__""")))).setId(66220), ILet(Id("""k"""), EINum(1L)).setId(66222), IWhile(EBOp(OLt, ERef(RefId(Id("""k"""))), EBOp(OSub, ERef(RefId(Id("""argCount"""))), EINum(1L))), ISeq(List(ILet(Id("""nextArg"""), ERef(RefProp(RefId(Id("""args""")), ERef(RefId(Id("""k""")))))).setId(66224), IApp(Id("""__x2__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""nextArg"""))))).setId(66226), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x2__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x2__""")), ERef(RefProp(RefId(Id("""__x2__""")), EStr("""Value""")))).setId(66227), IReturn(ERef(RefId(Id("""__x2__""")))).setId(66228)).setId(66229), ISeq(List()).setId(66423)).setId(66230), ILet(Id("""nextArgString"""), ERef(RefId(Id("""__x2__""")))).setId(66231), IAssign(RefId(Id("""P""")), EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""P"""))), EStr(""",""")), ERef(RefId(Id("""nextArgString"""))))).setId(66233), IAssign(RefId(Id("""k""")), EBOp(OPlus, ERef(RefId(Id("""k"""))), EINum(1L))).setId(66235))).setId(66428)).setId(66238), ILet(Id("""bodyText"""), ERef(RefProp(RefId(Id("""args""")), ERef(RefId(Id("""k""")))))).setId(66240))).setId(66431)).setId(66243)).setId(66245), IApp(Id("""__x3__"""), ERef(RefId(Id("""ToString"""))), List(ERef(RefId(Id("""bodyText"""))))).setId(66247), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x3__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x3__""")), ERef(RefProp(RefId(Id("""__x3__""")), EStr("""Value""")))).setId(66248), IReturn(ERef(RefId(Id("""__x3__""")))).setId(66249)).setId(66250), ISeq(List()).setId(66438)).setId(66251), IAssign(RefId(Id("""bodyText""")), ERef(RefId(Id("""__x3__""")))).setId(66252), IExpr(ENotSupported("""Etc""")).setId(66254), IExpr(ENotSupported("""Etc""")).setId(66254), IAccess(Id("""__x4__"""), ERef(RefId(Id("""body"""))), EStr("""ContainsUseStrict""")).setId(66255), ILet(Id("""strict"""), ERef(RefId(Id("""__x4__""")))).setId(66256), IExpr(ENotSupported("""Etc""")).setId(66254), ILet(Id("""__x5__"""), EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true))).setId(66263), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IAccess(Id("""__x6__"""), ERef(RefId(Id("""parameters"""))), EStr("""IsSimpleParameterList""")).setId(66258), IAssign(RefId(Id("""__x5__""")), EBOp(OEq, ERef(RefId(Id("""__x6__"""))), EBool(false))).setId(66261))).setId(66449), ISeq(List()).setId(66450)).setId(66264), IIf(ERef(RefId(Id("""__x5__"""))), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66265), IReturn(ERef(RefId(Id("""__x7__""")))).setId(66266))).setId(66454), ISeq(List()).setId(66455)).setId(66268), IExpr(ENotSupported("""Etc""")).setId(66254), IAccess(Id("""__x8__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")).setId(66270), IApp(Id("""__x9__"""), ERef(RefId(Id("""__x8__"""))), List(EStr("""SuperCall"""))).setId(66271), IIf(EBOp(OEq, ERef(RefId(Id("""__x9__"""))), EBool(true)), ISeq(List(IApp(Id("""__x10__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66272), IReturn(ERef(RefId(Id("""__x10__""")))).setId(66273))).setId(66462), ISeq(List()).setId(66463)).setId(66275), IAccess(Id("""__x11__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")).setId(66277), IApp(Id("""__x12__"""), ERef(RefId(Id("""__x11__"""))), List(EStr("""SuperCall"""))).setId(66278), IIf(EBOp(OEq, ERef(RefId(Id("""__x12__"""))), EBool(true)), ISeq(List(IApp(Id("""__x13__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66279), IReturn(ERef(RefId(Id("""__x13__""")))).setId(66280))).setId(66469), ISeq(List()).setId(66470)).setId(66282), IAccess(Id("""__x14__"""), ERef(RefId(Id("""body"""))), EStr("""Contains""")).setId(66284), IApp(Id("""__x15__"""), ERef(RefId(Id("""__x14__"""))), List(EStr("""SuperProperty"""))).setId(66285), IIf(EBOp(OEq, ERef(RefId(Id("""__x15__"""))), EBool(true)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66286), IReturn(ERef(RefId(Id("""__x16__""")))).setId(66287))).setId(66476), ISeq(List()).setId(66477)).setId(66289), IAccess(Id("""__x17__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")).setId(66291), IApp(Id("""__x18__"""), ERef(RefId(Id("""__x17__"""))), List(EStr("""SuperProperty"""))).setId(66292), IIf(EBOp(OEq, ERef(RefId(Id("""__x18__"""))), EBool(true)), ISeq(List(IApp(Id("""__x19__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66293), IReturn(ERef(RefId(Id("""__x19__""")))).setId(66294))).setId(66483), ISeq(List()).setId(66484)).setId(66296), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""generator""")), EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator"""))), ISeq(List(IAccess(Id("""__x20__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")).setId(66298), IApp(Id("""__x21__"""), ERef(RefId(Id("""__x20__"""))), List(EStr("""YieldExpression"""))).setId(66299), IIf(EBOp(OEq, ERef(RefId(Id("""__x21__"""))), EBool(true)), ISeq(List(IApp(Id("""__x22__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66300), IReturn(ERef(RefId(Id("""__x22__""")))).setId(66301))).setId(66490), ISeq(List()).setId(66491)).setId(66303))).setId(66493), ISeq(List()).setId(66494)).setId(66306), IIf(EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async""")), EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator"""))), ISeq(List(IAccess(Id("""__x23__"""), ERef(RefId(Id("""parameters"""))), EStr("""Contains""")).setId(66308), IApp(Id("""__x24__"""), ERef(RefId(Id("""__x23__"""))), List(EStr("""AwaitExpression"""))).setId(66309), IIf(EBOp(OEq, ERef(RefId(Id("""__x24__"""))), EBool(true)), ISeq(List(IApp(Id("""__x25__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_SyntaxErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(66310), IReturn(ERef(RefId(Id("""__x25__""")))).setId(66311))).setId(66500), ISeq(List()).setId(66501)).setId(66313))).setId(66503), ISeq(List()).setId(66504)).setId(66316), IIf(EBOp(OEq, ERef(RefId(Id("""strict"""))), EBool(true)), IExpr(ENotSupported("""Etc""")).setId(66254), ISeq(List()).setId(66507)).setId(66319), IApp(Id("""__x26__"""), ERef(RefId(Id("""GetPrototypeFromConstructor"""))), List(ERef(RefId(Id("""newTarget"""))), ERef(RefId(Id("""fallbackProto"""))))).setId(66322), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x26__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x26__""")), ERef(RefProp(RefId(Id("""__x26__""")), EStr("""Value""")))).setId(66323), IReturn(ERef(RefId(Id("""__x26__""")))).setId(66324)).setId(66325), ISeq(List()).setId(66513)).setId(66326), ILet(Id("""proto"""), ERef(RefId(Id("""__x26__""")))).setId(66327), IApp(Id("""__x27__"""), ERef(RefId(Id("""FunctionAllocate"""))), List(ERef(RefId(Id("""proto"""))), ERef(RefId(Id("""kind"""))))).setId(66329), ILet(Id("""F"""), ERef(RefId(Id("""__x27__""")))).setId(66330), ILet(Id("""realmF"""), ERef(RefProp(RefId(Id("""F""")), EStr("""Realm""")))).setId(66332), ILet(Id("""scope"""), ERef(RefProp(RefId(Id("""realmF""")), EStr("""GlobalEnv""")))).setId(66334), IApp(Id("""__x28__"""), ERef(RefId(Id("""FunctionInitialize"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""CONST_Normal"""))), ERef(RefId(Id("""parameters"""))), ERef(RefId(Id("""body"""))), ERef(RefId(Id("""scope"""))))).setId(66336), IExpr(ERef(RefId(Id("""__x28__""")))).setId(66337), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""generator""")), ISeq(List(IApp(Id("""__x29__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_GeneratorPrototype"""))))).setId(66339), ILet(Id("""prototype"""), ERef(RefId(Id("""__x29__""")))).setId(66340), IApp(Id("""__x30__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(66342), IExpr(ERef(RefId(Id("""__x30__""")))).setId(66343))).setId(66526), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""async generator""")), ISeq(List(IApp(Id("""__x31__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""INTRINSIC_AsyncGeneratorPrototype"""))))).setId(66346), ILet(Id("""prototype"""), ERef(RefId(Id("""__x31__""")))).setId(66347), IApp(Id("""__x32__"""), ERef(RefId(Id("""DefinePropertyOrThrow"""))), List(ERef(RefId(Id("""F"""))), EStr("""prototype"""), EMap(Ty("""PropertyDescriptor"""), List((EStr("""Value"""), ERef(RefId(Id("""prototype""")))), (EStr("""Writable"""), EBool(true)), (EStr("""Enumerable"""), EBool(false)), (EStr("""Configurable"""), EBool(false)))))).setId(66349), IExpr(ERef(RefId(Id("""__x32__""")))).setId(66350))).setId(66531), IIf(EBOp(OEq, ERef(RefId(Id("""kind"""))), EStr("""normal""")), ISeq(List(IApp(Id("""__x33__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))))).setId(66353), IExpr(ERef(RefId(Id("""__x33__""")))).setId(66354))).setId(66534), ISeq(List()).setId(66535)).setId(66356)).setId(66358)).setId(66360), IApp(Id("""__x34__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), EStr("""anonymous"""))).setId(66362), IExpr(ERef(RefId(Id("""__x34__""")))).setId(66363), IExpr(ENotSupported("""Etc""")).setId(66254), ILet(Id("""sourceText"""), EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, EBOp(OPlus, ERef(RefId(Id("""prefix"""))), EStr(""" anonymous(""")), ERef(RefId(Id("""P""")))), EStr("""
""")), EStr(""") {""")), EStr("""
""")), ERef(RefId(Id("""bodyText""")))), EStr("""
""")), EStr("""}"""))).setId(66365), IAssign(RefProp(RefId(Id("""F""")), EStr("""SourceText""")), ERef(RefId(Id("""sourceText""")))).setId(66367), IApp(Id("""__x35__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(66369), IReturn(ERef(RefId(Id("""__x35__""")))).setId(66370))).setId(66546))
  val instToStepMap: Map[Int, Int] = HashMap(66341 -> 83, 66201 -> 27, 66167 -> 5, 66293 -> 62, 66206 -> 28, 66350 -> 87, 66292 -> 74, 66330 -> 76, 66309 -> 70, 66270 -> 74, 66347 -> 87, 66360 -> 89, 66318 -> 74, 66328 -> 75, 66233 -> 44, 66187 -> 21, 66223 -> 45, 66302 -> 66, 66255 -> 74, 66238 -> 45, 66297 -> 74, 66197 -> 27, 66164 -> 4, 66202 -> 27, 66362 -> 91, 66287 -> 60, 66191 -> 21, 66315 -> 70, 66265 -> 53, 66264 -> 74, 66160 -> 4, 66251 -> 46, 66283 -> 74, 66234 -> 44, 66319 -> 74, 66175 -> 11, 66361 -> 89, 66156 -> 2, 66329 -> 76, 66178 -> 16, 66296 -> 74, 66334 -> 78, 66219 -> 45, 66298 -> 66, 66232 -> 44, 66266 -> 53, 66277 -> 74, 66171 -> 11, 66200 -> 27, 66356 -> 89, 66210 -> 30, 66153 -> 90, 66254 -> 92, 66185 -> 21, 66286 -> 60, 66357 -> 89, 66281 -> 58, 66321 -> 74, 66346 -> 87, 66242 -> 45, 66157 -> 2, 66222 -> 45, 66274 -> 56, 66190 -> 21, 66166 -> 4, 66353 -> 88, 66177 -> 11, 66314 -> 70, 66193 -> 27, 66333 -> 77, 66176 -> 11, 66182 -> 16, 66301 -> 66, 66342 -> 83, 66211 -> 31, 66246 -> 45, 66370 -> 95, 66179 -> 16, 66365 -> 93, 66278 -> 74, 66310 -> 70, 66186 -> 21, 66225 -> 44, 66269 -> 74, 66289 -> 74, 66345 -> 83, 66205 -> 28, 66172 -> 11, 66338 -> 79, 66214 -> 45, 66313 -> 70, 66194 -> 27, 66237 -> 44, 66282 -> 74, 66306 -> 74, 66257 -> 74, 66226 -> 44, 66272 -> 56, 66243 -> 45, 66275 -> 74, 66169 -> 6, 66236 -> 44, 66204 -> 27, 66311 -> 70, 66304 -> 66, 66332 -> 77, 66369 -> 95, 66268 -> 74, 66326 -> 75, 66173 -> 11, 66337 -> 79, 66240 -> 45, 66364 -> 91, 66208 -> 29, 66285 -> 74, 66290 -> 74, 66300 -> 66, 66349 -> 87, 66358 -> 89, 66241 -> 45, 66322 -> 75, 66273 -> 56, 66209 -> 30, 66198 -> 27, 66317 -> 74, 66339 -> 83, 66154 -> 1, 66215 -> 45, 66212 -> 31, 66253 -> 46, 66195 -> 27, 66305 -> 66, 66368 -> 94, 66180 -> 16, 66294 -> 62, 66336 -> 79, 66244 -> 45, 66230 -> 44, 66221 -> 45, 66354 -> 88, 66371 -> 95, 66247 -> 46, 66279 -> 58, 66189 -> 21, 66158 -> 3, 66343 -> 83, 66307 -> 74, 66183 -> 16, 66188 -> 21, 66312 -> 70, 66366 -> 93, 66168 -> 5, 66359 -> 89, 66235 -> 44, 66276 -> 74, 66327 -> 75, 66203 -> 27, 66291 -> 74, 66245 -> 45, 66220 -> 45, 66344 -> 83, 66363 -> 91, 66192 -> 27, 66271 -> 74, 66239 -> 45, 66316 -> 74, 66181 -> 16, 66213 -> 45, 66288 -> 60, 66207 -> 29, 66351 -> 87, 66331 -> 76, 66348 -> 87, 66256 -> 74, 66303 -> 66, 66224 -> 44, 66367 -> 94, 66284 -> 74, 66320 -> 74, 66267 -> 53, 66165 -> 4, 66335 -> 78, 66170 -> 6, 66159 -> 3, 66299 -> 66, 66352 -> 87, 66252 -> 46, 66196 -> 27, 66355 -> 88, 66280 -> 58, 66308 -> 70, 66184 -> 16, 66263 -> 74, 66231 -> 44, 66295 -> 62, 66155 -> 1, 66340 -> 83, 66199 -> 27, 66174 -> 11)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(5 -> HashSet(66167, 66168), 92 -> HashSet(66254), 77 -> HashSet(66333, 66332), 41 -> HashSet(66225, 66224), 2 -> HashSet(66156, 66157), 76 -> HashSet(66330, 66329, 66331), 87 -> HashSet(66350, 66347, 66346, 66349, 66352, 66351, 66348), 0 -> HashSet(66153), 88 -> HashSet(66353, 66354, 66355), 10 -> HashSet(66173, 66174), 56 -> HashSet(66274, 66272, 66273), 42 -> HashSet(66232, 66226, 66230, 66231), 24 -> HashSet(66153), 37 -> HashSet(66223, 66222), 25 -> HashSet(66193, 66192), 52 -> HashSet(66254), 14 -> HashSet(66178, 66179), 20 -> HashSet(66187, 66188), 46 -> HashSet(66251, 66253, 66247, 66252), 93 -> HashSet(66365, 66366), 57 -> HashSet(66270, 66275, 66276, 66271), 78 -> HashSet(66334, 66335), 29 -> HashSet(66208, 66207), 61 -> HashSet(66289, 66284, 66285, 66290), 89 -> HashSet(66360, 66361, 66356, 66357, 66358, 66359), 1 -> HashSet(66154, 66155), 74 -> HashSet(66292, 66319, 66296, 66277, 66254, 66321, 66289, 66275, 66268, 66317, 66307, 66276, 66291, 66256, 66263, 66270, 66318, 66255, 66297, 66264, 66283, 66278, 66269, 66282, 66306, 66257, 66285, 66290, 66316, 66271, 66284, 66320), 6 -> HashSet(66169, 66170), 60 -> HashSet(66287, 66286, 66288), 28 -> HashSet(66206, 66205), 70 -> HashSet(66309, 66315, 66314, 66310, 66313, 66311, 66312, 66308), 21 -> HashSet(66187, 66191, 66185, 66190, 66186, 66189, 66188), 9 -> HashSet(66171, 66172), 53 -> HashSet(66265, 66266, 66267), 34 -> HashSet(66153), 45 -> HashSet(66223, 66238, 66219, 66153, 66246, 66214, 66243, 66240, 66241, 66215, 66222, 66242, 66244, 66221, 66245, 66220, 66213, 66239), 44 -> HashSet(66233, 66238, 66234, 66232, 66225, 66237, 66226, 66236, 66230, 66235, 66239, 66224, 66231), 59 -> HashSet(66283, 66277, 66278, 66282), 27 -> HashSet(66201, 66200, 66153, 66193, 66194, 66204, 66198, 66195, 66203, 66192, 66196, 66199, 66197, 66202), 71 -> HashSet(66317, 66316), 54 -> HashSet(66264, 66269, 66268, 66263), 49 -> HashSet(66254), 86 -> HashSet(66347, 66346, 66348), 91 -> HashSet(66362, 66364, 66363), 66 -> HashSet(66302, 66298, 66301, 66304, 66300, 66305, 66303, 66299), 3 -> HashSet(66158, 66159), 35 -> HashSet(66214, 66213), 63 -> HashSet(66292, 66297, 66296, 66291), 95 -> HashSet(66370, 66369, 66371), 50 -> HashSet(66254), 67 -> HashSet(66306, 66307), 16 -> HashSet(66178, 66182, 66179, 66180, 66183, 66181, 66184), 31 -> HashSet(66211, 66212), 11 -> HashSet(66175, 66171, 66177, 66176, 66172, 66173, 66174), 43 -> HashSet(66233, 66234), 26 -> HashSet(66194, 66195), 55 -> HashSet(66254), 75 -> HashSet(66328, 66326, 66322, 66327), 58 -> HashSet(66281, 66279, 66280), 82 -> HashSet(66341, 66339, 66340), 36 -> HashSet(66219, 66215, 66221, 66220), 30 -> HashSet(66210, 66209), 51 -> HashSet(66255, 66257, 66256), 19 -> HashSet(66185, 66186), 4 -> HashSet(66164, 66160, 66166, 66165), 79 -> HashSet(66338, 66337, 66336), 94 -> HashSet(66368, 66367), 15 -> HashSet(66180, 66181), 62 -> HashSet(66293, 66294, 66295), 90 -> HashSet(66153), 83 -> HashSet(66341, 66342, 66345, 66339, 66343, 66344, 66340))
  /* Beautified form:
  "CreateDynamicFunction" (constructor, newTarget, kind, args) => {
    let callerContext = GLOBAL_executionStack[(- GLOBAL_executionStack["length"] 2i)]
    let callerRealm = callerContext["Realm"]
    let calleeRealm = REALM
    app __x0__ = (HostEnsureCanCompileStrings callerRealm calleeRealm)
    if (= (typeof __x0__) "Completion") if (= __x0__["Type"] CONST_normal) __x0__ = __x0__["Value"] else return __x0__ else {}
    __x0__
    if (= newTarget undefined) newTarget = constructor else {}
    if (= kind "normal") {
      let goal = "FunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%FunctionPrototype%"
    } else if (= kind "generator") {
      let goal = "GeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%Generator%"
    } else if (= kind "async") {
      let goal = "AsyncFunctionBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncFunctionPrototype%"
    } else {
      let goal = "AsyncGeneratorBody"
      let parameterGoal = "FormalParameters"
      let fallbackProto = "%AsyncGenerator%"
    }
    let argCount = args["length"]
    let P = ""
    if (= argCount 0i) let bodyText = "" else if (= argCount 1i) let bodyText = args[0i] else {
      let firstArg = args[0i]
      app __x1__ = (ToString firstArg)
      if (= (typeof __x1__) "Completion") if (= __x1__["Type"] CONST_normal) __x1__ = __x1__["Value"] else return __x1__ else {}
      P = __x1__
      let k = 1i
      while (< k (- argCount 1i)) {
        let nextArg = args[k]
        app __x2__ = (ToString nextArg)
        if (= (typeof __x2__) "Completion") if (= __x2__["Type"] CONST_normal) __x2__ = __x2__["Value"] else return __x2__ else {}
        let nextArgString = __x2__
        P = (+ (+ P ",") nextArgString)
        k = (+ k 1i)
      }
      let bodyText = args[k]
    }
    app __x3__ = (ToString bodyText)
    if (= (typeof __x3__) "Completion") if (= __x3__["Type"] CONST_normal) __x3__ = __x3__["Value"] else return __x3__ else {}
    bodyText = __x3__
    !!! "Etc"
    !!! "Etc"
    access __x4__ = (body "ContainsUseStrict")
    let strict = __x4__
    !!! "Etc"
    let __x5__ = (= strict true)
    if __x5__ {
      access __x6__ = (parameters "IsSimpleParameterList")
      __x5__ = (= __x6__ false)
    } else {}
    if __x5__ {
      app __x7__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x7__
    } else {}
    !!! "Etc"
    access __x8__ = (body "Contains")
    app __x9__ = (__x8__ "SuperCall")
    if (= __x9__ true) {
      app __x10__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x10__
    } else {}
    access __x11__ = (parameters "Contains")
    app __x12__ = (__x11__ "SuperCall")
    if (= __x12__ true) {
      app __x13__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x13__
    } else {}
    access __x14__ = (body "Contains")
    app __x15__ = (__x14__ "SuperProperty")
    if (= __x15__ true) {
      app __x16__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x16__
    } else {}
    access __x17__ = (parameters "Contains")
    app __x18__ = (__x17__ "SuperProperty")
    if (= __x18__ true) {
      app __x19__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
      return __x19__
    } else {}
    if (|| (= kind "generator") (= kind "async generator")) {
      access __x20__ = (parameters "Contains")
      app __x21__ = (__x20__ "YieldExpression")
      if (= __x21__ true) {
        app __x22__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x22__
      } else {}
    } else {}
    if (|| (= kind "async") (= kind "async generator")) {
      access __x23__ = (parameters "Contains")
      app __x24__ = (__x23__ "AwaitExpression")
      if (= __x24__ true) {
        app __x25__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_SyntaxErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
        return __x25__
      } else {}
    } else {}
    if (= strict true) !!! "Etc" else {}
    app __x26__ = (GetPrototypeFromConstructor newTarget fallbackProto)
    if (= (typeof __x26__) "Completion") if (= __x26__["Type"] CONST_normal) __x26__ = __x26__["Value"] else return __x26__ else {}
    let proto = __x26__
    app __x27__ = (FunctionAllocate proto kind)
    let F = __x27__
    let realmF = F["Realm"]
    let scope = realmF["GlobalEnv"]
    app __x28__ = (FunctionInitialize F CONST_Normal parameters body scope)
    __x28__
    if (= kind "generator") {
      app __x29__ = (ObjectCreate INTRINSIC_GeneratorPrototype)
      let prototype = __x29__
      app __x30__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x30__
    } else if (= kind "async generator") {
      app __x31__ = (ObjectCreate INTRINSIC_AsyncGeneratorPrototype)
      let prototype = __x31__
      app __x32__ = (DefinePropertyOrThrow F "prototype" (new PropertyDescriptor("Value" -> prototype, "Writable" -> true, "Enumerable" -> false, "Configurable" -> false)))
      __x32__
    } else if (= kind "normal") {
      app __x33__ = (MakeConstructor F)
      __x33__
    } else {}
    app __x34__ = (SetFunctionName F "anonymous")
    __x34__
    !!! "Etc"
    let sourceText = (+ (+ (+ (+ (+ (+ (+ (+ prefix " anonymous(") P) "\n") ") {") "\n") bodyText) "\n") "}")
    F["SourceText"] = sourceText
    app __x35__ = (WrapCompletion F)
    return __x35__
  }
  */
}
