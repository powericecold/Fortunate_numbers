import sbt.*
object Dependencies {

  private val scalaTestVersion = "3.2.15"

  lazy val testLibs: List[ModuleID] = List(
    "org.scalatest" %% "scalatest" % scalaTestVersion
  ).map(_ % Test)

}