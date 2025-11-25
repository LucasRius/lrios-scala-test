ThisBuild / scalaVersion := "2.13.12" // Ou "3.3.1" se preferir Scala 3

lazy val root = (project in file("."))
  .settings(
    name := "scala-lint-exemplo",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies += "org.scala-lang" % "scala-library" % scalaVersion.value
  )

ThisBuild / semanticdbEnabled := true
ThisBuild / semanticdbVersion := scalafixSemanticdb.revision