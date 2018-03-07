name := """TomMurphyDev"""
organization := "com.tommurphydev"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.12.4"
fork := true // required for "sbt run" to pick up javaOptions

javaOptions += "-Dplay.editor=http://localhost:63342/api/file/?file=%s&line=%s"
libraryDependencies += guice
