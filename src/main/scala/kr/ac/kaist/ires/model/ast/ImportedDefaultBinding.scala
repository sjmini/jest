package kr.ac.kaist.ires.model

import kr.ac.kaist.ires.{ AST, ASTInfo, Lexical }
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.error.UnexpectedSemantics
import scala.collection.immutable.{ Set => SSet }

trait ImportedDefaultBinding extends AST {
  val kind: String = "ImportedDefaultBinding"
}
case class ImportedDefaultBinding0(x0: ImportedBinding, parserParams: List[Boolean]) extends ImportedDefaultBinding {
  val name: String = "ImportedDefaultBinding0"
  override def toString: String = {
    s"$x0"
  }
  val k: Int = d(x0, 0)
  val fullList: List[(String, Value)] = l("ImportedBinding", x0, Nil).reverse
  val info: ASTInfo = ImportedDefaultBinding0
}
object ImportedDefaultBinding0 extends ASTInfo {
  val maxK: Int = 0
  val semMap: Map[String, Func] = Map()
}