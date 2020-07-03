package kr.ac.kaist

import java.io.File

package object ires {
  // Line seperator
  val LINE_SEP = System.getProperty("line.separator")

  // Base project directory root
  val BASE_DIR = System.getenv("IRES_HOME")

  // Tests directory root
  val TEST_DIR = s"${BASE_DIR}/tests"

  // Source directory root
  val SRC_DIR = s"${BASE_DIR}/src/main"

  // Source directory root
  val RESOURCE_DIR = s"${SRC_DIR}/resources"

  // Scala source directory root
  val SCALA_DIR = s"${SRC_DIR}/scala/kr/ac/kaist/ires"

  // Model directory root
  val MODEL_DIR = s"${SCALA_DIR}/model"

  // Differential testing directories
  val DIFF_TEST_DIR = s"${BASE_DIR}/diff-test"
  val GENERATED_DIR = s"${DIFF_TEST_DIR}/generated"
  val MODIFIED_DIR = s"${DIFF_TEST_DIR}/modified"

  // Current directory root
  val CUR_DIR = System.getProperty("user.dir")

  // Debugging mode
  val DEBUG_SEMI_INSERT: Boolean = false
  val DEBUG_PARSER: Boolean = false
  val DEBUG_INTERP: Boolean = false
  val DEBUG_FILTER: Boolean = false

  // Coverage check mode
  val COVERAGE_MODE: Boolean = true
  val COVERAGE_DIR = s"$BASE_DIR/coverage"
}
