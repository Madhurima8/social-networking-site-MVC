ThisBuild / version := "0.0.1"
ThisBuild / scalaVersion := "3.3.1"


lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    name := "Assignment2"
  )

libraryDependencies ++= Seq(
  guice,
)
