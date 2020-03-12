package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.ir.Parser._
import scala.collection.immutable.{ Map, HashMap, HashSet }

object ClassTail0ClassDefinitionEvaluation3 {
  val length: Int = 0
  val func: Func = Func("""ClassTail0ClassDefinitionEvaluation3""", List(Id("""this"""), Id("""ClassHeritage"""), Id("""ClassBody"""), Id("""classBinding"""), Id("""className""")), None, ISeq(List(IAccess(Id("""__x0__"""), ERef(RefId(Id("""GLOBAL_context"""))), EStr("""LexicalEnvironment""")).setId(42697), ILet(Id("""lex"""), ERef(RefId(Id("""__x0__""")))).setId(42698), IApp(Id("""__x1__"""), ERef(RefId(Id("""NewDeclarativeEnvironment"""))), List(ERef(RefId(Id("""lex"""))))).setId(42700), ILet(Id("""classScope"""), ERef(RefId(Id("""__x1__""")))).setId(42701), ILet(Id("""classScopeEnvRec"""), ERef(RefProp(RefId(Id("""classScope""")), EStr("""EnvironmentRecord""")))).setId(42703), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""classBinding"""))), EUndef)), ISeq(List(IApp(Id("""__x2__"""), ERef(RefProp(RefId(Id("""classScopeEnvRec""")), EStr("""CreateImmutableBinding"""))), List(ERef(RefId(Id("""classScopeEnvRec"""))), ERef(RefId(Id("""classBinding"""))), EBool(true))).setId(42705), IExpr(ERef(RefId(Id("""__x2__""")))).setId(42706))).setId(42876), ISeq(List()).setId(42877)).setId(42710), IIf(EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent), ISeq(List(ILet(Id("""protoParent"""), ERef(RefId(Id("""INTRINSIC_ObjectPrototype""")))).setId(42712), ILet(Id("""constructorParent"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(42714))).setId(42881), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""classScope""")))).setId(42717), IAccess(Id("""__x3__"""), ERef(RefId(Id("""ClassHeritage"""))), EStr("""Evaluation""")).setId(42720), ILet(Id("""superclassRef"""), ERef(RefId(Id("""__x3__""")))).setId(42721), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lex""")))).setId(42723), IApp(Id("""__x4__"""), ERef(RefId(Id("""GetValue"""))), List(ERef(RefId(Id("""superclassRef"""))))).setId(42725), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x4__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x4__""")), ERef(RefProp(RefId(Id("""__x4__""")), EStr("""Value""")))).setId(42726), IReturn(ERef(RefId(Id("""__x4__""")))).setId(42727)).setId(42728), ISeq(List()).setId(42890)).setId(42729), ILet(Id("""superclass"""), ERef(RefId(Id("""__x4__""")))).setId(42730), IIf(EBOp(OEq, ERef(RefId(Id("""superclass"""))), ENull), ISeq(List(ILet(Id("""protoParent"""), ENull).setId(42732), ILet(Id("""constructorParent"""), ERef(RefId(Id("""INTRINSIC_FunctionPrototype""")))).setId(42734))).setId(42895), ISeq(List(IApp(Id("""__x5__"""), ERef(RefId(Id("""IsConstructor"""))), List(ERef(RefId(Id("""superclass"""))))).setId(42737), IIf(EBOp(OEq, ERef(RefId(Id("""__x5__"""))), EBool(false)), ISeq(List(IApp(Id("""__x6__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(42738), IReturn(ERef(RefId(Id("""__x6__""")))).setId(42739))).setId(42899), ISeq(List(IApp(Id("""__x7__"""), ERef(RefId(Id("""Get"""))), List(ERef(RefId(Id("""superclass"""))), EStr("""prototype"""))).setId(42741), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""__x7__""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""__x7__""")), ERef(RefProp(RefId(Id("""__x7__""")), EStr("""Value""")))).setId(42742), IReturn(ERef(RefId(Id("""__x7__""")))).setId(42743)).setId(42744), ISeq(List()).setId(42904)).setId(42745), ILet(Id("""protoParent"""), ERef(RefId(Id("""__x7__""")))).setId(42746), IApp(Id("""__x8__"""), ERef(RefId(Id("""Type"""))), List(ERef(RefId(Id("""protoParent"""))))).setId(42748), IIf(EUOp(ONot, EBOp(OOr, EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Object""")))), EBOp(OEq, ERef(RefId(Id("""__x8__"""))), ERef(RefId(Id("""Null""")))))), ISeq(List(IApp(Id("""__x9__"""), ERef(RefId(Id("""ThrowCompletion"""))), List(EMap(Ty("""OrdinaryObject"""), List((EStr("""Prototype"""), ERef(RefId(Id("""INTRINSIC_TypeErrorPrototype""")))), (EStr("""ErrorData"""), EUndef), (EStr("""SubMap"""), EMap(Ty("""SubMap"""), List())))))).setId(42749), IReturn(ERef(RefId(Id("""__x9__""")))).setId(42750))).setId(42910), ISeq(List()).setId(42911)).setId(42752), ILet(Id("""constructorParent"""), ERef(RefId(Id("""superclass""")))).setId(42754))).setId(42914)).setId(42757))).setId(42916)).setId(42759))).setId(42918)).setId(42762), IApp(Id("""__x10__"""), ERef(RefId(Id("""ObjectCreate"""))), List(ERef(RefId(Id("""protoParent"""))))).setId(42764), ILet(Id("""proto"""), ERef(RefId(Id("""__x10__""")))).setId(42765), IIf(EBOp(OEq, ERef(RefId(Id("""ClassBody"""))), EAbsent), ILet(Id("""constructor"""), ERef(RefId(Id("""CONST_empty""")))).setId(42767), ISeq(List(IAccess(Id("""__x11__"""), ERef(RefId(Id("""ClassBody"""))), EStr("""ConstructorMethod""")).setId(42769), ILet(Id("""constructor"""), ERef(RefId(Id("""__x11__""")))).setId(42770))).setId(42925)).setId(42772), IIf(EBOp(OEq, ERef(RefId(Id("""constructor"""))), ERef(RefId(Id("""CONST_empty""")))), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent)), IAssign(RefId(Id("""constructor""")), EParseSyntax(EStr("""constructor(...args) { super(...args); }"""), EStr("""MethodDefinition"""), List(EBool(false), EBool(false)))).setId(42774), IAssign(RefId(Id("""constructor""")), EParseSyntax(EStr("""constructor() {}"""), EStr("""MethodDefinition"""), List(EBool(false), EBool(false)))).setId(42777)).setId(42780), ISeq(List()).setId(42930)).setId(42783), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""classScope""")))).setId(42785), IAccess(Id("""__x12__"""), ERef(RefId(Id("""constructor"""))), EStr("""DefineMethod""")).setId(42787), IApp(Id("""__x13__"""), ERef(RefId(Id("""__x12__"""))), List(ERef(RefId(Id("""proto"""))), ERef(RefId(Id("""constructorParent"""))))).setId(42788), ILet(Id("""constructorInfo"""), ERef(RefId(Id("""__x13__""")))).setId(42789), IIf(EBOp(OEq, ETypeOf(ERef(RefId(Id("""constructorInfo""")))), EStr("""Completion""")), IIf(EBOp(OEq, ERef(RefProp(RefId(Id("""constructorInfo""")), EStr("""Type"""))), ERef(RefId(Id("""CONST_normal""")))), IAssign(RefId(Id("""constructorInfo""")), ERef(RefProp(RefId(Id("""constructorInfo""")), EStr("""Value""")))).setId(42791), IReturn(ERef(RefId(Id("""constructorInfo""")))).setId(42792)).setId(42793), ISeq(List()).setId(42939)).setId(42794), IExpr(ERef(RefId(Id("""constructorInfo""")))).setId(42795), ILet(Id("""F"""), ERef(RefProp(RefId(Id("""constructorInfo""")), EStr("""Closure""")))).setId(42797), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""ClassHeritage"""))), EAbsent)), IAssign(RefProp(RefId(Id("""F""")), EStr("""ConstructorKind""")), EStr("""derived""")).setId(42799), ISeq(List()).setId(42944)).setId(42801), IApp(Id("""__x14__"""), ERef(RefId(Id("""MakeConstructor"""))), List(ERef(RefId(Id("""F"""))), EBool(false), ERef(RefId(Id("""proto"""))))).setId(42803), IExpr(ERef(RefId(Id("""__x14__""")))).setId(42804), IApp(Id("""__x15__"""), ERef(RefId(Id("""MakeClassConstructor"""))), List(ERef(RefId(Id("""F"""))))).setId(42806), IExpr(ERef(RefId(Id("""__x15__""")))).setId(42807), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""className"""))), EUndef)), ISeq(List(IApp(Id("""__x16__"""), ERef(RefId(Id("""SetFunctionName"""))), List(ERef(RefId(Id("""F"""))), ERef(RefId(Id("""className"""))))).setId(42809), IExpr(ERef(RefId(Id("""__x16__""")))).setId(42810))).setId(42952), ISeq(List()).setId(42953)).setId(42813), IApp(Id("""__x17__"""), ERef(RefId(Id("""CreateMethodProperty"""))), List(ERef(RefId(Id("""proto"""))), EStr("""constructor"""), ERef(RefId(Id("""F"""))))).setId(42815), IExpr(ERef(RefId(Id("""__x17__""")))).setId(42816), IIf(EBOp(OEq, ERef(RefId(Id("""ClassBody"""))), EAbsent), ILet(Id("""methods"""), EList(List())).setId(42818), ISeq(List(IAccess(Id("""__x18__"""), ERef(RefId(Id("""ClassBody"""))), EStr("""NonConstructorMethodDefinitions""")).setId(42820), ILet(Id("""methods"""), ERef(RefId(Id("""__x18__""")))).setId(42821))).setId(42960)).setId(42823), ILet(Id("""__x19__"""), ERef(RefId(Id("""methods""")))).setId(42849), ILet(Id("""__x20__"""), EINum(0L)).setId(42850), IWhile(EBOp(OLt, ERef(RefId(Id("""__x20__"""))), ERef(RefProp(RefId(Id("""__x19__""")), EStr("""length""")))), ISeq(List(ILet(Id("""m"""), ERef(RefProp(RefId(Id("""__x19__""")), ERef(RefId(Id("""__x20__""")))))).setId(42851), IAccess(Id("""__x21__"""), ERef(RefId(Id("""m"""))), EStr("""IsStatic""")).setId(42825), IIf(EBOp(OEq, ERef(RefId(Id("""__x21__"""))), EBool(false)), ISeq(List(IAccess(Id("""__x22__"""), ERef(RefId(Id("""m"""))), EStr("""PropertyDefinitionEvaluation""")).setId(42826), IApp(Id("""__x23__"""), ERef(RefId(Id("""__x22__"""))), List(ERef(RefId(Id("""proto"""))), EBool(false))).setId(42827), ILet(Id("""status"""), ERef(RefId(Id("""__x23__""")))).setId(42828))).setId(42969), ISeq(List(IAccess(Id("""__x24__"""), ERef(RefId(Id("""m"""))), EStr("""PropertyDefinitionEvaluation""")).setId(42831), IApp(Id("""__x25__"""), ERef(RefId(Id("""__x24__"""))), List(ERef(RefId(Id("""F"""))), EBool(false))).setId(42832), ILet(Id("""status"""), ERef(RefId(Id("""__x25__""")))).setId(42833))).setId(42973)).setId(42836), IApp(Id("""__x26__"""), ERef(RefId(Id("""IsAbruptCompletion"""))), List(ERef(RefId(Id("""status"""))))).setId(42838), IIf(ERef(RefId(Id("""__x26__"""))), ISeq(List(IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lex""")))).setId(42839), IApp(Id("""__x27__"""), ERef(RefId(Id("""Completion"""))), List(ERef(RefId(Id("""status"""))))).setId(42841), IApp(Id("""__x28__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""__x27__"""))))).setId(42842), IReturn(ERef(RefId(Id("""__x28__""")))).setId(42843))).setId(42980), ISeq(List()).setId(42981)).setId(42846), IAssign(RefId(Id("""__x20__""")), EBOp(OPlus, ERef(RefId(Id("""__x20__"""))), EINum(1L))).setId(42852))).setId(42984)).setId(42854), IAssign(RefProp(RefId(Id("""GLOBAL_context""")), EStr("""LexicalEnvironment""")), ERef(RefId(Id("""lex""")))).setId(42857), IIf(EUOp(ONot, EBOp(OEq, ERef(RefId(Id("""classBinding"""))), EUndef)), ISeq(List(IApp(Id("""__x29__"""), ERef(RefProp(RefId(Id("""classScopeEnvRec""")), EStr("""InitializeBinding"""))), List(ERef(RefId(Id("""classScopeEnvRec"""))), ERef(RefId(Id("""classBinding"""))), ERef(RefId(Id("""F"""))))).setId(42859), IExpr(ERef(RefId(Id("""__x29__""")))).setId(42860))).setId(42989), ISeq(List()).setId(42990)).setId(42863), IApp(Id("""__x30__"""), ERef(RefId(Id("""WrapCompletion"""))), List(ERef(RefId(Id("""F"""))))).setId(42865), IReturn(ERef(RefId(Id("""__x30__""")))).setId(42866))).setId(42994))
  val instToStepMap: Map[Int, Int] = HashMap(42735 -> 20, 42828 -> 59, 42758 -> 27, 42781 -> 38, 42813 -> 51, 42856 -> 66, 42800 -> 44, 42731 -> 27, 42772 -> 30, 42832 -> 62, 42804 -> 46, 42863 -> 71, 42752 -> 27, 42777 -> 38, 42768 -> 29, 42737 -> 27, 42809 -> 50, 42822 -> 54, 42720 -> 27, 42836 -> 66, 42866 -> 72, 42837 -> 66, 42776 -> 35, 42759 -> 27, 42699 -> 0, 42808 -> 47, 42748 -> 27, 42859 -> 70, 42716 -> 10, 42818 -> 53, 42769 -> 30, 42711 -> 6, 42848 -> 66, 42764 -> 28, 42855 -> 66, 42801 -> 45, 42833 -> 62, 42703 -> 2, 42786 -> 40, 42754 -> 27, 42796 -> 42, 42844 -> 66, 42860 -> 70, 42784 -> 39, 42767 -> 29, 42816 -> 52, 42730 -> 27, 42740 -> 21, 42823 -> 54, 42751 -> 25, 42795 -> 42, 42840 -> 66, 42865 -> 72, 42756 -> 27, 42708 -> 5, 42763 -> 27, 42734 -> 20, 42827 -> 59, 42747 -> 27, 42850 -> 66, 42799 -> 44, 42715 -> 10, 42788 -> 41, 42705 -> 5, 42722 -> 27, 42854 -> 66, 42773 -> 30, 42831 -> 62, 42805 -> 46, 42787 -> 41, 42841 -> 66, 42834 -> 62, 42702 -> 1, 42839 -> 66, 42780 -> 38, 42755 -> 27, 42864 -> 71, 42770 -> 30, 42802 -> 45, 42824 -> 54, 42812 -> 50, 42760 -> 27, 42698 -> 0, 42819 -> 53, 42712 -> 10, 42845 -> 66, 42811 -> 50, 42714 -> 10, 42798 -> 43, 42846 -> 66, 42794 -> 42, 42746 -> 27, 42724 -> 27, 42849 -> 66, 42779 -> 38, 42733 -> 20, 42826 -> 59, 42815 -> 52, 42718 -> 27, 42762 -> 27, 42706 -> 5, 42750 -> 25, 42783 -> 39, 42766 -> 28, 42821 -> 54, 42789 -> 41, 42738 -> 21, 42741 -> 27, 42820 -> 54, 42838 -> 66, 42803 -> 46, 42701 -> 1, 42806 -> 47, 42857 -> 67, 42723 -> 27, 42771 -> 30, 42842 -> 66, 42830 -> 59, 42697 -> 0, 42861 -> 70, 42757 -> 27, 42835 -> 62, 42729 -> 27, 42749 -> 25, 42797 -> 43, 42761 -> 27, 42867 -> 72, 42713 -> 10, 42707 -> 5, 42778 -> 38, 42862 -> 70, 42814 -> 51, 42825 -> 66, 42700 -> 1, 42847 -> 66, 42717 -> 27, 42721 -> 27, 42774 -> 35, 42765 -> 28, 42810 -> 50, 42736 -> 20, 42704 -> 2, 42843 -> 66, 42790 -> 41, 42753 -> 27, 42725 -> 27, 42732 -> 20, 42807 -> 47, 42785 -> 40, 42745 -> 27, 42739 -> 21, 42710 -> 6, 42817 -> 52, 42829 -> 59, 42775 -> 35, 42858 -> 67, 42782 -> 38)
  val stepToInstsMap: Map[Int, HashSet[Int]] = HashMap(0 -> HashSet(42699, 42698, 42697), 5 -> HashSet(42708, 42705, 42706, 42707), 10 -> HashSet(42716, 42715, 42712, 42714, 42713), 1 -> HashSet(42702, 42701, 42700), 6 -> HashSet(42711, 42710), 65 -> HashSet(42840, 42839), 2 -> HashSet(42703, 42704), 45 -> HashSet(42801, 42802), 39 -> HashSet(42784, 42783), 66 -> HashSet(42856, 42848, 42855, 42844, 42840, 42850, 42854, 42841, 42839, 42845, 42846, 42849, 42838, 42842, 42825, 42847, 42843, 42837, 42836), 35 -> HashSet(42776, 42774, 42775), 42 -> HashSet(42796, 42795, 42794), 24 -> HashSet(42747, 42746, 42741, 42745), 25 -> HashSet(42751, 42750, 42749), 52 -> HashSet(42816, 42815, 42817), 14 -> HashSet(42720, 42722, 42721), 20 -> HashSet(42735, 42734, 42733, 42736, 42732), 46 -> HashSet(42804, 42805, 42803), 29 -> HashSet(42768, 42767), 70 -> HashSet(42859, 42860, 42861, 42862), 21 -> HashSet(42740, 42738, 42739), 28 -> HashSet(42764, 42766, 42765), 38 -> HashSet(42781, 42777, 42780, 42779, 42778, 42782), 9 -> HashSet(42712, 42713), 53 -> HashSet(42818, 42819), 13 -> HashSet(42718, 42717), 41 -> HashSet(42788, 42787, 42789, 42790), 44 -> HashSet(42800, 42799), 59 -> HashSet(42828, 42827, 42826, 42830, 42829), 27 -> HashSet(42758, 42754, 42730, 42747, 42722, 42755, 42760, 42741, 42723, 42761, 42717, 42721, 42745, 42731, 42752, 42737, 42720, 42759, 42748, 42763, 42756, 42746, 42724, 42718, 42762, 42757, 42729, 42753, 42725), 71 -> HashSet(42863, 42864), 54 -> HashSet(42822, 42823, 42824, 42821, 42820), 50 -> HashSet(42809, 42812, 42811, 42810), 67 -> HashSet(42857, 42858), 16 -> HashSet(42731, 42730, 42729, 42725), 72 -> HashSet(42866, 42865, 42867), 43 -> HashSet(42798, 42797), 40 -> HashSet(42786, 42785), 26 -> HashSet(42752, 42748, 42753), 30 -> HashSet(42772, 42769, 42773, 42770, 42771), 51 -> HashSet(42813, 42814), 19 -> HashSet(42733, 42732), 47 -> HashSet(42808, 42806, 42807), 15 -> HashSet(42724, 42723), 62 -> HashSet(42832, 42833, 42831, 42834, 42835, 42825, 42837, 42836))
  /* Beautified form:
  "ClassTail0ClassDefinitionEvaluation3" (this, ClassHeritage, ClassBody, classBinding, className) => {
    access __x0__ = (GLOBAL_context "LexicalEnvironment")
    let lex = __x0__
    app __x1__ = (NewDeclarativeEnvironment lex)
    let classScope = __x1__
    let classScopeEnvRec = classScope["EnvironmentRecord"]
    if (! (= classBinding undefined)) {
      app __x2__ = (classScopeEnvRec["CreateImmutableBinding"] classScopeEnvRec classBinding true)
      __x2__
    } else {}
    if (= ClassHeritage absent) {
      let protoParent = INTRINSIC_ObjectPrototype
      let constructorParent = INTRINSIC_FunctionPrototype
    } else {
      GLOBAL_context["LexicalEnvironment"] = classScope
      access __x3__ = (ClassHeritage "Evaluation")
      let superclassRef = __x3__
      GLOBAL_context["LexicalEnvironment"] = lex
      app __x4__ = (GetValue superclassRef)
      if (= (typeof __x4__) "Completion") if (= __x4__["Type"] CONST_normal) __x4__ = __x4__["Value"] else return __x4__ else {}
      let superclass = __x4__
      if (= superclass null) {
        let protoParent = null
        let constructorParent = INTRINSIC_FunctionPrototype
      } else {
        app __x5__ = (IsConstructor superclass)
        if (= __x5__ false) {
          app __x6__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
          return __x6__
        } else {
          app __x7__ = (Get superclass "prototype")
          if (= (typeof __x7__) "Completion") if (= __x7__["Type"] CONST_normal) __x7__ = __x7__["Value"] else return __x7__ else {}
          let protoParent = __x7__
          app __x8__ = (Type protoParent)
          if (! (|| (= __x8__ Object) (= __x8__ Null))) {
            app __x9__ = (ThrowCompletion (new OrdinaryObject("Prototype" -> INTRINSIC_TypeErrorPrototype, "ErrorData" -> undefined, "SubMap" -> (new SubMap()))))
            return __x9__
          } else {}
          let constructorParent = superclass
        }
      }
    }
    app __x10__ = (ObjectCreate protoParent)
    let proto = __x10__
    if (= ClassBody absent) let constructor = CONST_empty else {
      access __x11__ = (ClassBody "ConstructorMethod")
      let constructor = __x11__
    }
    if (= constructor CONST_empty) if (! (= ClassHeritage absent)) constructor = (parse-syntax "constructor(...args) { super(...args); }" "MethodDefinition" false false) else constructor = (parse-syntax "constructor() {}" "MethodDefinition" false false) else {}
    GLOBAL_context["LexicalEnvironment"] = classScope
    access __x12__ = (constructor "DefineMethod")
    app __x13__ = (__x12__ proto constructorParent)
    let constructorInfo = __x13__
    if (= (typeof constructorInfo) "Completion") if (= constructorInfo["Type"] CONST_normal) constructorInfo = constructorInfo["Value"] else return constructorInfo else {}
    constructorInfo
    let F = constructorInfo["Closure"]
    if (! (= ClassHeritage absent)) F["ConstructorKind"] = "derived" else {}
    app __x14__ = (MakeConstructor F false proto)
    __x14__
    app __x15__ = (MakeClassConstructor F)
    __x15__
    if (! (= className undefined)) {
      app __x16__ = (SetFunctionName F className)
      __x16__
    } else {}
    app __x17__ = (CreateMethodProperty proto "constructor" F)
    __x17__
    if (= ClassBody absent) let methods = (new []) else {
      access __x18__ = (ClassBody "NonConstructorMethodDefinitions")
      let methods = __x18__
    }
    let __x19__ = methods
    let __x20__ = 0i
    while (< __x20__ __x19__["length"]) {
      let m = __x19__[__x20__]
      access __x21__ = (m "IsStatic")
      if (= __x21__ false) {
        access __x22__ = (m "PropertyDefinitionEvaluation")
        app __x23__ = (__x22__ proto false)
        let status = __x23__
      } else {
        access __x24__ = (m "PropertyDefinitionEvaluation")
        app __x25__ = (__x24__ F false)
        let status = __x25__
      }
      app __x26__ = (IsAbruptCompletion status)
      if __x26__ {
        GLOBAL_context["LexicalEnvironment"] = lex
        app __x27__ = (Completion status)
        app __x28__ = (WrapCompletion __x27__)
        return __x28__
      } else {}
      __x20__ = (+ __x20__ 1i)
    }
    GLOBAL_context["LexicalEnvironment"] = lex
    if (! (= classBinding undefined)) {
      app __x29__ = (classScopeEnvRec["InitializeBinding"] classScopeEnvRec classBinding F)
      __x29__
    } else {}
    app __x30__ = (WrapCompletion F)
    return __x30__
  }
  */
}
