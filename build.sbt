name := """Registry"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache,
  ws
)

libraryDependencies ++= Seq(
  "org.scaldi" %% "scaldi" % "0.4",
  "org.scaldi" %% "scaldi-play" % "0.4.1"
)
