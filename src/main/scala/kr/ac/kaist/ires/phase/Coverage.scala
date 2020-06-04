package kr.ac.kaist.ires.phase

import kr.ac.kaist.ires.IRESConfig
import kr.ac.kaist.ires.ir._
import kr.ac.kaist.ires.util._

// IREval phase
case object Coverage extends PhaseObj[Unit, CoverageConfig, Unit] {
  val name: String = "coverage"
  val help: String = "get coverage"

  def apply(
    unit: Unit,
    iresConfig: IRESConfig,
    config: CoverageConfig
  ): Unit = {
    CoverageCheck.getResult
  }

  def defaultConfig: CoverageConfig = CoverageConfig()
  val options: List[PhaseOption[CoverageConfig]] = List()
}

// IREval phase config
case class CoverageConfig() extends Config
