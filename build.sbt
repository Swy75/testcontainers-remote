name := "testcontainers-remote"

version := "0.1"

scalaVersion := "2.13.6"


libraryDependencies ++= Seq(
  "com.dimafeng" %% "testcontainers-scala-scalatest" % "0.39.5" % "test",
  "com.dimafeng" %% "testcontainers-scala-elasticsearch" % "0.39.5" % "test",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.9" % "test",
  "org.scalatest" %% "scalatest-flatspec" % "3.2.9" % "test",
  "ch.qos.logback" % "logback-classic" % "1.2.1"
)