package kr.ac.kaist.ires.model

object MinSampler {
  def TemplateHead(): String = "`${"
  def TemplateMiddle(): String = "}${"
  def StringLiteral(): String = "''"
  def NullLiteral(): String = "null"
  def TemplateTail(): String = "}`"
  def IdentifierName(): String = "x"
  def BooleanLiteral(): String = "true"
  def NoSubstitutionTemplate(): String = "``"
  def NumericLiteral(): String = "0"
  def IdentifierReference(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "x"
    case (false, true) => "x"
    case (false, false) => "x"
    case (true, false) => "x"
  }
  def BindingIdentifier(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "x"
    case (true, false) => "x"
    case (true, true) => "x"
    case (false, false) => "x"
  }
  def LabelIdentifier(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "x"
    case (false, true) => "x"
    case (false, false) => "x"
    case (true, false) => "x"
  }
  def Identifier(): String = () match {
    case () => "x"
  }
  def PrimaryExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "0"
    case (false, true) => "0"
    case (true, true) => "0"
    case (false, false) => "0"
  }
  def CoverParenthesizedExpressionAndArrowParameterList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "( )"
    case (true, false) => "( )"
    case (true, true) => "( )"
    case (false, true) => "( )"
  }
  def ParenthesizedExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "( 0 )"
    case (false, false) => "( 0 )"
    case (true, true) => "( 0 )"
    case (false, true) => "( 0 )"
  }
  def Literal(): String = () match {
    case () => "0"
  }
  def ArrayLiteral(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "[  ]"
    case (true, true) => "[  ]"
    case (true, false) => "[  ]"
    case (false, false) => "[  ]"
  }
  def ElementList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => " 0"
    case (false, true) => " 0"
    case (true, true) => " 0"
    case (false, false) => " 0"
  }
  def Elision(): String = () match {
    case () => ","
  }
  def SpreadElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "... 0"
    case (true, false) => "... 0"
    case (false, false) => "... 0"
    case (true, true) => "... 0"
  }
  def ObjectLiteral(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "{ }"
    case (false, true) => "{ }"
    case (true, false) => "{ }"
    case (false, false) => "{ }"
  }
  def PropertyDefinitionList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "x"
    case (false, true) => "x"
    case (true, true) => "x"
    case (true, false) => "x"
  }
  def PropertyDefinition(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "x"
    case (true, false) => "x"
    case (true, true) => "x"
    case (false, true) => "x"
  }
  def PropertyName(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "0"
    case (false, true) => "0"
    case (false, false) => "0"
    case (true, true) => "0"
  }
  def LiteralPropertyName(): String = () match {
    case () => "0"
  }
  def ComputedPropertyName(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "[ 0 ]"
    case (true, true) => "[ 0 ]"
    case (false, false) => "[ 0 ]"
    case (false, true) => "[ 0 ]"
  }
  def CoverInitializedName(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "x = 0"
    case (true, true) => "x = 0"
    case (false, true) => "x = 0"
    case (false, false) => "x = 0"
  }
  def Initializer(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, true, false) => "= 0"
    case (true, true, false) => "= 0"
    case (false, true, true) => "= 0"
    case (false, false, false) => "= 0"
    case (false, false, true) => "= 0"
    case (true, false, true) => "= 0"
    case (true, true, true) => "= 0"
    case (true, false, false) => "= 0"
  }
  def TemplateLiteral(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): String = (pYield, pAwait, pTagged) match {
    case (false, true, false) => "``"
    case (true, false, true) => "``"
    case (true, false, false) => "``"
    case (false, false, false) => "``"
    case (false, false, true) => "``"
    case (true, true, true) => "``"
    case (false, true, true) => "``"
    case (true, true, false) => "``"
  }
  def SubstitutionTemplate(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): String = (pYield, pAwait, pTagged) match {
    case (true, true, false) => "`${ 0 }`"
    case (false, false, true) => "`${ 0 }`"
    case (true, false, true) => "`${ 0 }`"
    case (false, true, true) => "`${ 0 }`"
    case (false, false, false) => "`${ 0 }`"
    case (true, true, true) => "`${ 0 }`"
    case (true, false, false) => "`${ 0 }`"
    case (false, true, false) => "`${ 0 }`"
  }
  def TemplateSpans(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): String = (pYield, pAwait, pTagged) match {
    case (true, false, false) => "}`"
    case (false, false, false) => "}`"
    case (false, true, false) => "}`"
    case (true, false, true) => "}`"
    case (true, true, false) => "}`"
    case (false, false, true) => "}`"
    case (true, true, true) => "}`"
    case (false, true, true) => "}`"
  }
  def TemplateMiddleList(pYield: Boolean, pAwait: Boolean, pTagged: Boolean): String = (pYield, pAwait, pTagged) match {
    case (false, true, false) => "}${ 0"
    case (false, false, true) => "}${ 0"
    case (true, true, false) => "}${ 0"
    case (false, false, false) => "}${ 0"
    case (true, false, false) => "}${ 0"
    case (true, true, true) => "}${ 0"
    case (false, true, true) => "}${ 0"
    case (true, false, true) => "}${ 0"
  }
  def MemberExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0"
    case (false, false) => "0"
    case (true, false) => "0"
    case (false, true) => "0"
  }
  def SuperProperty(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "super . x"
    case (false, true) => "super . x"
    case (false, false) => "super . x"
    case (true, true) => "super . x"
  }
  def MetaProperty(): String = () match {
    case () => "new . target"
  }
  def NewTarget(): String = () match {
    case () => "new . target"
  }
  def NewExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0"
    case (false, true) => "0"
    case (false, false) => "0"
    case (true, false) => "0"
  }
  def CallExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "0 ( )"
    case (false, true) => "0 ( )"
    case (false, false) => "0 ( )"
    case (true, true) => "0 ( )"
  }
  def CallMemberExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "0 ( )"
    case (true, false) => "0 ( )"
    case (false, false) => "0 ( )"
    case (true, true) => "0 ( )"
  }
  def SuperCall(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "super ( )"
    case (true, true) => "super ( )"
    case (false, false) => "super ( )"
    case (false, true) => "super ( )"
  }
  def Arguments(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "( )"
    case (true, true) => "( )"
    case (true, false) => "( )"
    case (false, true) => "( )"
  }
  def ArgumentList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0"
    case (false, false) => "0"
    case (true, false) => "0"
    case (false, true) => "0"
  }
  def OptionalExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "0 ?. x"
    case (true, false) => "0 ?. x"
    case (false, true) => "0 ?. x"
    case (true, true) => "0 ?. x"
  }
  def OptionalChain(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "?. x"
    case (false, true) => "?. x"
    case (true, true) => "?. x"
    case (true, false) => "?. x"
  }
  def LeftHandSideExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "0"
    case (false, false) => "0"
    case (false, true) => "0"
    case (true, true) => "0"
  }
  def UpdateExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "0"
    case (false, true) => "0"
    case (true, true) => "0"
    case (false, false) => "0"
  }
  def UnaryExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "0"
    case (false, false) => "0"
    case (true, true) => "0"
    case (true, false) => "0"
  }
  def ExponentiationExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "0"
    case (false, true) => "0"
    case (false, false) => "0"
    case (true, true) => "0"
  }
  def MultiplicativeExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0"
    case (false, true) => "0"
    case (false, false) => "0"
    case (true, false) => "0"
  }
  def MultiplicativeOperator(): String = () match {
    case () => "%"
  }
  def AdditiveExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0"
    case (false, false) => "0"
    case (false, true) => "0"
    case (true, false) => "0"
  }
  def ShiftExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "0"
    case (false, true) => "0"
    case (true, false) => "0"
    case (true, true) => "0"
  }
  def RelationalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, false, false) => "0"
    case (false, true, true) => "0"
    case (true, true, true) => "0"
    case (true, true, false) => "0"
    case (false, false, false) => "0"
    case (false, true, false) => "0"
    case (true, false, true) => "0"
    case (false, false, true) => "0"
  }
  def EqualityExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, false, false) => "0"
    case (true, false, true) => "0"
    case (true, true, false) => "0"
    case (false, true, true) => "0"
    case (false, false, true) => "0"
    case (false, true, false) => "0"
    case (true, true, true) => "0"
    case (false, false, false) => "0"
  }
  def BitwiseANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, true, true) => "0"
    case (true, false, false) => "0"
    case (false, false, true) => "0"
    case (true, true, true) => "0"
    case (true, false, true) => "0"
    case (false, true, false) => "0"
    case (false, false, false) => "0"
    case (true, true, false) => "0"
  }
  def BitwiseXORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, false, true) => "0"
    case (true, true, true) => "0"
    case (true, false, false) => "0"
    case (false, false, true) => "0"
    case (false, true, true) => "0"
    case (false, false, false) => "0"
    case (true, true, false) => "0"
    case (false, true, false) => "0"
  }
  def BitwiseORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, true, false) => "0"
    case (false, false, false) => "0"
    case (true, false, false) => "0"
    case (true, true, true) => "0"
    case (false, false, true) => "0"
    case (true, false, true) => "0"
    case (false, true, true) => "0"
    case (true, true, false) => "0"
  }
  def LogicalANDExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, false) => "0"
    case (true, false, false) => "0"
    case (false, true, false) => "0"
    case (false, false, true) => "0"
    case (false, false, false) => "0"
    case (true, false, true) => "0"
    case (true, true, true) => "0"
    case (false, true, true) => "0"
  }
  def LogicalORExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, false) => "0"
    case (false, false, true) => "0"
    case (true, false, false) => "0"
    case (true, true, true) => "0"
    case (false, true, true) => "0"
    case (false, true, false) => "0"
    case (false, false, false) => "0"
    case (true, false, true) => "0"
  }
  def CoalesceExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, true) => "0 ?? 0"
    case (false, false, false) => "0 ?? 0"
    case (false, false, true) => "0 ?? 0"
    case (true, false, true) => "0 ?? 0"
    case (true, false, false) => "0 ?? 0"
    case (true, true, false) => "0 ?? 0"
    case (false, true, false) => "0 ?? 0"
    case (false, true, true) => "0 ?? 0"
  }
  def CoalesceExpressionHead(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, false, false) => "0"
    case (false, false, false) => "0"
    case (true, false, true) => "0"
    case (true, true, false) => "0"
    case (true, true, true) => "0"
    case (false, true, false) => "0"
    case (false, false, true) => "0"
    case (false, true, true) => "0"
  }
  def ShortCircuitExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, false, false) => "0"
    case (true, true, true) => "0"
    case (false, true, false) => "0"
    case (true, true, false) => "0"
    case (true, false, true) => "0"
    case (false, false, false) => "0"
    case (false, true, true) => "0"
    case (false, false, true) => "0"
  }
  def ConditionalExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, true) => "0"
    case (false, false, true) => "0"
    case (false, true, false) => "0"
    case (false, false, false) => "0"
    case (true, true, false) => "0"
    case (true, false, true) => "0"
    case (false, true, true) => "0"
    case (true, false, false) => "0"
  }
  def AssignmentExpression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, false, false) => "0"
    case (false, true, false) => "0"
    case (true, true, false) => "0"
    case (true, true, true) => "0"
    case (true, false, false) => "0"
    case (false, true, true) => "0"
    case (true, false, true) => "0"
    case (false, false, true) => "0"
  }
  def AssignmentOperator(): String = () match {
    case () => "%="
  }
  def AssignmentPattern(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "{ }"
    case (false, false) => "{ }"
    case (false, true) => "{ }"
    case (true, true) => "{ }"
  }
  def ObjectAssignmentPattern(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "{ }"
    case (true, false) => "{ }"
    case (true, true) => "{ }"
    case (false, true) => "{ }"
  }
  def ArrayAssignmentPattern(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "[   ]"
    case (true, true) => "[   ]"
    case (false, false) => "[   ]"
    case (true, false) => "[   ]"
  }
  def AssignmentRestProperty(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "... 0"
    case (true, false) => "... 0"
    case (false, true) => "... 0"
    case (false, false) => "... 0"
  }
  def AssignmentPropertyList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "x "
    case (false, true) => "x "
    case (false, false) => "x "
    case (true, true) => "x "
  }
  def AssignmentElementList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => " 0 "
    case (false, false) => " 0 "
    case (false, true) => " 0 "
    case (true, false) => " 0 "
  }
  def AssignmentElisionElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => " 0 "
    case (true, true) => " 0 "
    case (false, false) => " 0 "
    case (true, false) => " 0 "
  }
  def AssignmentProperty(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "x "
    case (false, true) => "x "
    case (false, false) => "x "
    case (true, true) => "x "
  }
  def AssignmentElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0 "
    case (false, true) => "0 "
    case (true, false) => "0 "
    case (false, false) => "0 "
  }
  def AssignmentRestElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "... 0"
    case (false, false) => "... 0"
    case (true, false) => "... 0"
    case (false, true) => "... 0"
  }
  def DestructuringAssignmentTarget(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "0"
    case (true, false) => "0"
    case (false, false) => "0"
    case (true, true) => "0"
  }
  def Expression(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, true) => "0"
    case (true, true, false) => "0"
    case (false, true, false) => "0"
    case (false, false, false) => "0"
    case (false, false, true) => "0"
    case (false, true, true) => "0"
    case (true, false, true) => "0"
    case (true, false, false) => "0"
  }
  def Statement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, true, false) => ";"
    case (false, false, true) => ";"
    case (true, false, false) => ";"
    case (true, true, true) => ";"
    case (false, true, true) => ";"
    case (true, false, true) => ";"
    case (false, false, false) => ";"
    case (true, true, false) => ";"
  }
  def Declaration(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "let x  ;"
    case (true, true) => "let x  ;"
    case (true, false) => "let x  ;"
    case (false, true) => "let x  ;"
  }
  def HoistableDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): String = (pYield, pAwait, pDefault) match {
    case (false, false, true) => "function (  ) {  }"
    case (false, true, false) => "function x (  ) {  }"
    case (true, true, false) => "function x (  ) {  }"
    case (true, false, false) => "function x (  ) {  }"
    case (false, true, true) => "function (  ) {  }"
    case (false, false, false) => "function x (  ) {  }"
    case (true, false, true) => "function (  ) {  }"
    case (true, true, true) => "function (  ) {  }"
  }
  def BreakableStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, true, false) => "while ( 0 ) ;"
    case (false, false, true) => "while ( 0 ) ;"
    case (false, true, true) => "while ( 0 ) ;"
    case (true, true, true) => "while ( 0 ) ;"
    case (true, false, true) => "while ( 0 ) ;"
    case (false, false, false) => "while ( 0 ) ;"
    case (false, true, false) => "while ( 0 ) ;"
    case (true, false, false) => "while ( 0 ) ;"
  }
  def BlockStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, false, false) => "{  }"
    case (true, true, false) => "{  }"
    case (false, true, true) => "{  }"
    case (true, true, true) => "{  }"
    case (false, false, false) => "{  }"
    case (false, false, true) => "{  }"
    case (true, false, true) => "{  }"
    case (false, true, false) => "{  }"
  }
  def Block(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, false, false) => "{  }"
    case (true, true, true) => "{  }"
    case (false, true, false) => "{  }"
    case (false, false, true) => "{  }"
    case (true, true, false) => "{  }"
    case (true, false, true) => "{  }"
    case (false, true, true) => "{  }"
    case (false, false, false) => "{  }"
  }
  def StatementList(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, false, false) => ";"
    case (true, true, false) => ";"
    case (true, true, true) => ";"
    case (true, false, true) => ";"
    case (false, false, true) => ";"
    case (false, true, true) => ";"
    case (true, false, false) => ";"
    case (false, true, false) => ";"
  }
  def StatementListItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, false, true) => ";"
    case (true, true, false) => ";"
    case (false, true, false) => ";"
    case (false, false, false) => ";"
    case (true, false, false) => ";"
    case (false, false, true) => ";"
    case (false, true, true) => ";"
    case (true, true, true) => ";"
  }
  def LexicalDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, true) => "let x  ;"
    case (false, false, false) => "let x  ;"
    case (true, false, false) => "let x  ;"
    case (true, true, false) => "let x  ;"
    case (false, true, false) => "let x  ;"
    case (false, true, true) => "let x  ;"
    case (false, false, true) => "let x  ;"
    case (true, false, true) => "let x  ;"
  }
  def LetOrConst(): String = () match {
    case () => "let"
  }
  def BindingList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, true, true) => "x "
    case (true, true, false) => "x "
    case (false, false, false) => "x "
    case (true, true, true) => "x "
    case (false, false, true) => "x "
    case (true, false, true) => "x "
    case (false, true, false) => "x "
    case (true, false, false) => "x "
  }
  def LexicalBinding(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, false, true) => "x "
    case (false, true, true) => "x "
    case (true, true, false) => "x "
    case (true, false, true) => "x "
    case (true, false, false) => "x "
    case (false, false, false) => "x "
    case (false, true, false) => "x "
    case (true, true, true) => "x "
  }
  def VariableStatement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "var x  ;"
    case (false, false) => "var x  ;"
    case (false, true) => "var x  ;"
    case (true, true) => "var x  ;"
  }
  def VariableDeclarationList(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, false, false) => "x "
    case (true, false, false) => "x "
    case (true, true, true) => "x "
    case (true, false, true) => "x "
    case (false, false, true) => "x "
    case (true, true, false) => "x "
    case (false, true, true) => "x "
    case (false, true, false) => "x "
  }
  def VariableDeclaration(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, false, false) => "x "
    case (true, false, false) => "x "
    case (true, true, false) => "x "
    case (false, false, true) => "x "
    case (false, true, true) => "x "
    case (true, false, true) => "x "
    case (false, true, false) => "x "
    case (true, true, true) => "x "
  }
  def BindingPattern(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "{ }"
    case (false, true) => "{ }"
    case (true, true) => "{ }"
    case (false, false) => "{ }"
  }
  def ObjectBindingPattern(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "{ }"
    case (true, false) => "{ }"
    case (false, false) => "{ }"
    case (false, true) => "{ }"
  }
  def ArrayBindingPattern(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "[   ]"
    case (true, true) => "[   ]"
    case (false, false) => "[   ]"
    case (false, true) => "[   ]"
  }
  def BindingRestProperty(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "... x"
    case (true, true) => "... x"
    case (false, false) => "... x"
    case (true, false) => "... x"
  }
  def BindingPropertyList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "x "
    case (false, true) => "x "
    case (false, false) => "x "
    case (true, true) => "x "
  }
  def BindingElementList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => " x "
    case (true, true) => " x "
    case (false, true) => " x "
    case (true, false) => " x "
  }
  def BindingElisionElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => " x "
    case (true, true) => " x "
    case (false, false) => " x "
    case (false, true) => " x "
  }
  def BindingProperty(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "x "
    case (false, false) => "x "
    case (true, false) => "x "
    case (true, true) => "x "
  }
  def BindingElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "x "
    case (true, false) => "x "
    case (true, true) => "x "
    case (false, true) => "x "
  }
  def SingleNameBinding(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "x "
    case (false, true) => "x "
    case (false, false) => "x "
    case (true, true) => "x "
  }
  def BindingRestElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "... x"
    case (true, false) => "... x"
    case (false, true) => "... x"
    case (false, false) => "... x"
  }
  def EmptyStatement(): String = () match {
    case () => ";"
  }
  def ExpressionStatement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => " 0 ;"
    case (false, false) => " 0 ;"
    case (true, false) => " 0 ;"
    case (true, true) => " 0 ;"
  }
  def IfStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, false, false) => "if ( 0 ) ; "
    case (false, true, true) => "if ( 0 ) ; "
    case (true, true, false) => "if ( 0 ) ; "
    case (true, false, false) => "if ( 0 ) ; "
    case (true, true, true) => "if ( 0 ) ; "
    case (true, false, true) => "if ( 0 ) ; "
    case (false, false, true) => "if ( 0 ) ; "
    case (false, true, false) => "if ( 0 ) ; "
  }
  def IterationStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, true, false) => "while ( 0 ) ;"
    case (false, false, true) => "while ( 0 ) ;"
    case (false, true, true) => "while ( 0 ) ;"
    case (true, false, false) => "while ( 0 ) ;"
    case (true, true, true) => "while ( 0 ) ;"
    case (true, false, true) => "while ( 0 ) ;"
    case (false, true, false) => "while ( 0 ) ;"
    case (false, false, false) => "while ( 0 ) ;"
  }
  def ForDeclaration(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "let x"
    case (true, true) => "let x"
    case (false, true) => "let x"
    case (false, false) => "let x"
  }
  def ForBinding(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "x"
    case (false, true) => "x"
    case (true, false) => "x"
    case (false, false) => "x"
  }
  def ContinueStatement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "continue ;"
    case (true, false) => "continue ;"
    case (false, true) => "continue ;"
    case (false, false) => "continue ;"
  }
  def BreakStatement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "break ;"
    case (false, false) => "break ;"
    case (true, true) => "break ;"
    case (true, false) => "break ;"
  }
  def ReturnStatement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, false) => "return ;"
    case (true, true) => "return ;"
    case (false, true) => "return ;"
    case (true, false) => "return ;"
  }
  def WithStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, false, true) => "with ( 0 ) ;"
    case (false, true, true) => "with ( 0 ) ;"
    case (true, true, false) => "with ( 0 ) ;"
    case (true, true, true) => "with ( 0 ) ;"
    case (false, false, false) => "with ( 0 ) ;"
    case (true, false, false) => "with ( 0 ) ;"
    case (true, false, true) => "with ( 0 ) ;"
    case (false, true, false) => "with ( 0 ) ;"
  }
  def SwitchStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, false, true) => "switch ( 0 ) {  }"
    case (false, true, false) => "switch ( 0 ) {  }"
    case (false, false, true) => "switch ( 0 ) {  }"
    case (true, false, false) => "switch ( 0 ) {  }"
    case (false, true, true) => "switch ( 0 ) {  }"
    case (false, false, false) => "switch ( 0 ) {  }"
    case (true, true, true) => "switch ( 0 ) {  }"
    case (true, true, false) => "switch ( 0 ) {  }"
  }
  def CaseBlock(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, true, false) => "{  }"
    case (true, true, true) => "{  }"
    case (true, false, true) => "{  }"
    case (false, true, false) => "{  }"
    case (false, false, true) => "{  }"
    case (false, true, true) => "{  }"
    case (true, false, false) => "{  }"
    case (false, false, false) => "{  }"
  }
  def CaseClauses(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, true, true) => "case 0 : "
    case (false, false, false) => "case 0 : "
    case (true, true, true) => "case 0 : "
    case (false, true, false) => "case 0 : "
    case (false, false, true) => "case 0 : "
    case (true, false, true) => "case 0 : "
    case (true, true, false) => "case 0 : "
    case (true, false, false) => "case 0 : "
  }
  def CaseClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, false, true) => "case 0 : "
    case (true, true, true) => "case 0 : "
    case (true, false, true) => "case 0 : "
    case (true, false, false) => "case 0 : "
    case (true, true, false) => "case 0 : "
    case (false, true, true) => "case 0 : "
    case (false, true, false) => "case 0 : "
    case (false, false, false) => "case 0 : "
  }
  def DefaultClause(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, false, true) => "default : "
    case (false, true, true) => "default : "
    case (true, false, false) => "default : "
    case (true, true, false) => "default : "
    case (false, false, true) => "default : "
    case (false, false, false) => "default : "
    case (true, true, true) => "default : "
    case (false, true, false) => "default : "
  }
  def LabelledStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, true, true) => "x : ;"
    case (false, false, true) => "x : ;"
    case (false, true, false) => "x : ;"
    case (false, false, false) => "x : ;"
    case (true, true, false) => "x : ;"
    case (false, true, true) => "x : ;"
    case (true, false, true) => "x : ;"
    case (true, false, false) => "x : ;"
  }
  def LabelledItem(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (true, false, false) => ";"
    case (true, true, false) => ";"
    case (false, false, false) => ";"
    case (true, false, true) => ";"
    case (false, true, false) => ";"
    case (true, true, true) => ";"
    case (false, true, true) => ";"
    case (false, false, true) => ";"
  }
  def ThrowStatement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "throw  0 ;"
    case (true, false) => "throw  0 ;"
    case (false, false) => "throw  0 ;"
    case (true, true) => "throw  0 ;"
  }
  def TryStatement(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, true, false) => "try {  } catch {  }"
    case (true, true, false) => "try {  } catch {  }"
    case (true, true, true) => "try {  } catch {  }"
    case (false, false, true) => "try {  } catch {  }"
    case (false, true, true) => "try {  } catch {  }"
    case (true, false, true) => "try {  } catch {  }"
    case (false, false, false) => "try {  } catch {  }"
    case (true, false, false) => "try {  } catch {  }"
  }
  def Catch(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, true, false) => "catch {  }"
    case (true, true, false) => "catch {  }"
    case (true, false, false) => "catch {  }"
    case (false, true, true) => "catch {  }"
    case (true, false, true) => "catch {  }"
    case (false, false, true) => "catch {  }"
    case (true, true, true) => "catch {  }"
    case (false, false, false) => "catch {  }"
  }
  def Finally(pYield: Boolean, pAwait: Boolean, pReturn: Boolean): String = (pYield, pAwait, pReturn) match {
    case (false, false, true) => "finally {  }"
    case (false, true, true) => "finally {  }"
    case (true, true, false) => "finally {  }"
    case (false, false, false) => "finally {  }"
    case (true, false, false) => "finally {  }"
    case (true, false, true) => "finally {  }"
    case (true, true, true) => "finally {  }"
    case (false, true, false) => "finally {  }"
  }
  def CatchParameter(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "x"
    case (false, true) => "x"
    case (true, false) => "x"
    case (false, false) => "x"
  }
  def DebuggerStatement(): String = () match {
    case () => "debugger ;"
  }
  def FunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): String = (pYield, pAwait, pDefault) match {
    case (true, false, true) => "function (  ) {  }"
    case (false, false, false) => "function x (  ) {  }"
    case (false, false, true) => "function (  ) {  }"
    case (true, true, false) => "function x (  ) {  }"
    case (true, true, true) => "function (  ) {  }"
    case (true, false, false) => "function x (  ) {  }"
    case (false, true, true) => "function (  ) {  }"
    case (false, true, false) => "function x (  ) {  }"
  }
  def FunctionExpression(): String = () match {
    case () => "function  (  ) {  }"
  }
  def UniqueFormalParameters(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => ""
    case (true, false) => ""
    case (true, true) => ""
    case (false, false) => ""
  }
  def FormalParameters(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => ""
    case (false, false) => ""
    case (false, true) => ""
    case (true, false) => ""
  }
  def FormalParameterList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "x "
    case (true, false) => "x "
    case (false, false) => "x "
    case (false, true) => "x "
  }
  def FunctionRestParameter(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "... x"
    case (false, false) => "... x"
    case (true, true) => "... x"
    case (false, true) => "... x"
  }
  def FormalParameter(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "x "
    case (false, false) => "x "
    case (true, true) => "x "
    case (true, false) => "x "
  }
  def FunctionBody(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => ""
    case (false, true) => ""
    case (true, true) => ""
    case (false, false) => ""
  }
  def FunctionStatementList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => ""
    case (true, false) => ""
    case (false, false) => ""
    case (false, true) => ""
  }
  def ArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (false, true, true) => "x  =>  0"
    case (false, true, false) => "x  =>  0"
    case (true, false, true) => "x  =>  0"
    case (true, true, true) => "x  =>  0"
    case (true, false, false) => "x  =>  0"
    case (true, true, false) => "x  =>  0"
    case (false, false, true) => "x  =>  0"
    case (false, false, false) => "x  =>  0"
  }
  def ArrowParameters(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "x"
    case (true, true) => "x"
    case (false, false) => "x"
    case (false, true) => "x"
  }
  def ConciseBody(pIn: Boolean): String = (pIn) match {
    case (false) => " 0"
    case (true) => " 0"
  }
  def ExpressionBody(pIn: Boolean, pAwait: Boolean): String = (pIn, pAwait) match {
    case (false, false) => "0"
    case (true, true) => "0"
    case (true, false) => "0"
    case (false, true) => "0"
  }
  def ArrowFormalParameters(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "(  )"
    case (false, true) => "(  )"
    case (false, false) => "(  )"
    case (true, true) => "(  )"
  }
  def AsyncArrowFunction(pIn: Boolean, pYield: Boolean, pAwait: Boolean): String = (pIn, pYield, pAwait) match {
    case (true, true, false) => "0 ( )  =>  0"
    case (false, true, true) => "0 ( )  =>  0"
    case (false, false, false) => "0 ( )  =>  0"
    case (true, false, false) => "0 ( )  =>  0"
    case (false, true, false) => "0 ( )  =>  0"
    case (true, false, true) => "0 ( )  =>  0"
    case (false, false, true) => "0 ( )  =>  0"
    case (true, true, true) => "0 ( )  =>  0"
  }
  def AsyncConciseBody(pIn: Boolean): String = (pIn) match {
    case (false) => " 0"
    case (true) => " 0"
  }
  def AsyncArrowBindingIdentifier(pYield: Boolean): String = (pYield) match {
    case (false) => "x"
    case (true) => "x"
  }
  def CoverCallExpressionAndAsyncArrowHead(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "0 ( )"
    case (true, false) => "0 ( )"
    case (false, false) => "0 ( )"
    case (true, true) => "0 ( )"
  }
  def AsyncArrowHead(): String = () match {
    case () => "async  (  )"
  }
  def MethodDefinition(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "0 (  ) {  }"
    case (false, false) => "0 (  ) {  }"
    case (false, true) => "0 (  ) {  }"
    case (true, false) => "0 (  ) {  }"
  }
  def PropertySetParameterList(): String = () match {
    case () => "x "
  }
  def GeneratorMethod(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "* 0 (  ) {  }"
    case (true, true) => "* 0 (  ) {  }"
    case (false, false) => "* 0 (  ) {  }"
    case (true, false) => "* 0 (  ) {  }"
  }
  def GeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): String = (pYield, pAwait, pDefault) match {
    case (false, false, true) => "function * (  ) {  }"
    case (false, true, true) => "function * (  ) {  }"
    case (true, false, false) => "function * x (  ) {  }"
    case (true, true, true) => "function * (  ) {  }"
    case (true, false, true) => "function * (  ) {  }"
    case (false, false, false) => "function * x (  ) {  }"
    case (false, true, false) => "function * x (  ) {  }"
    case (true, true, false) => "function * x (  ) {  }"
  }
  def GeneratorExpression(): String = () match {
    case () => "function *  (  ) {  }"
  }
  def GeneratorBody(): String = () match {
    case () => ""
  }
  def YieldExpression(pIn: Boolean, pAwait: Boolean): String = (pIn, pAwait) match {
    case (false, true) => "yield"
    case (true, false) => "yield"
    case (true, true) => "yield"
    case (false, false) => "yield"
  }
  def AsyncGeneratorMethod(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => "async  * 0 (  ) {  }"
    case (false, false) => "async  * 0 (  ) {  }"
    case (true, true) => "async  * 0 (  ) {  }"
    case (false, true) => "async  * 0 (  ) {  }"
  }
  def AsyncGeneratorDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): String = (pYield, pAwait, pDefault) match {
    case (false, true, true) => "async  function * (  ) {  }"
    case (false, false, false) => "async  function * x (  ) {  }"
    case (false, true, false) => "async  function * x (  ) {  }"
    case (true, false, false) => "async  function * x (  ) {  }"
    case (true, true, true) => "async  function * (  ) {  }"
    case (false, false, true) => "async  function * (  ) {  }"
    case (true, false, true) => "async  function * (  ) {  }"
    case (true, true, false) => "async  function * x (  ) {  }"
  }
  def AsyncGeneratorExpression(): String = () match {
    case () => "async  function *  (  ) {  }"
  }
  def AsyncGeneratorBody(): String = () match {
    case () => ""
  }
  def AsyncFunctionDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): String = (pYield, pAwait, pDefault) match {
    case (true, true, true) => "async  function (  ) {  }"
    case (false, true, false) => "async  function x (  ) {  }"
    case (true, false, false) => "async  function x (  ) {  }"
    case (false, false, false) => "async  function x (  ) {  }"
    case (false, true, true) => "async  function (  ) {  }"
    case (true, false, true) => "async  function (  ) {  }"
    case (true, true, false) => "async  function x (  ) {  }"
    case (false, false, true) => "async  function (  ) {  }"
  }
  def AsyncFunctionExpression(): String = () match {
    case () => "async  function (  ) {  }"
  }
  def AsyncMethod(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, true) => "async  0 (  ) {  }"
    case (true, false) => "async  0 (  ) {  }"
    case (false, true) => "async  0 (  ) {  }"
    case (false, false) => "async  0 (  ) {  }"
  }
  def AsyncFunctionBody(): String = () match {
    case () => ""
  }
  def AwaitExpression(pYield: Boolean): String = (pYield) match {
    case (true) => "await 0"
    case (false) => "await 0"
  }
  def ClassDeclaration(pYield: Boolean, pAwait: Boolean, pDefault: Boolean): String = (pYield, pAwait, pDefault) match {
    case (true, true, false) => "class x  {  }"
    case (false, true, true) => "class  {  }"
    case (false, true, false) => "class x  {  }"
    case (true, false, false) => "class x  {  }"
    case (true, true, true) => "class  {  }"
    case (true, false, true) => "class  {  }"
    case (false, false, true) => "class  {  }"
    case (false, false, false) => "class x  {  }"
  }
  def ClassExpression(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "class   {  }"
    case (false, false) => "class   {  }"
    case (true, true) => "class   {  }"
    case (true, false) => "class   {  }"
  }
  def ClassTail(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => " {  }"
    case (false, false) => " {  }"
    case (true, true) => " {  }"
    case (false, true) => " {  }"
  }
  def ClassHeritage(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => "extends 0"
    case (true, false) => "extends 0"
    case (false, false) => "extends 0"
    case (true, true) => "extends 0"
  }
  def ClassBody(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => ";"
    case (false, true) => ";"
    case (true, true) => ";"
    case (false, false) => ";"
  }
  def ClassElementList(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (false, true) => ";"
    case (false, false) => ";"
    case (true, false) => ";"
    case (true, true) => ";"
  }
  def ClassElement(pYield: Boolean, pAwait: Boolean): String = (pYield, pAwait) match {
    case (true, false) => ";"
    case (false, false) => ";"
    case (false, true) => ";"
    case (true, true) => ";"
  }
  def Script(): String = () match {
    case () => ""
  }
  def ScriptBody(): String = () match {
    case () => ";"
  }
  def ExportSpecifier(): String = () match {
    case () => "x"
  }
}
