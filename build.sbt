import Dependencies.*
import ScalaOptionsUtil.*

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.1"

lazy val root = (project in file("."))
  .settings(
    name := "Fortunate_numbers",
    //libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test,
    libraryDependencies ++= Dependencies.testLibs,
    scalacOptions ++= Seq("-encoding", "UTF-8"),
    mainClass := Some("App.scala")
  )
