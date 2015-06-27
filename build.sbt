//import SonatypeKeys._

//sonatypeSettings

// Turn this project into a Scala.js project by importing these settings
enablePlugins(ScalaJSPlugin)

organization := "com.mind_era"

name := "underscore-scala-js"

version := "0.0.10700"

scalaVersion := "2.11.6"

persistLauncher in Compile := true

persistLauncher in Test := false

testFrameworks += new TestFramework("utest.runner.Framework")

jsDependencies += "org.webjars" % "underscorejs" % "1.7.0-1" / "underscore.js"

libraryDependencies += "com.lihaoyi" %%% "utest" % "0.3.1" % "test"

testFrameworks += new TestFramework("utest.runner.Framework")

skip in packageJSDependencies := false

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "UTF-8",
  "-unchecked",
  "-feature",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-language:higherKinds",
  "-language:reflectiveCalls",
  "-Xlint",
//  "-Xfatal-warnings",
  "-Yno-adapted-args",
//  "-Ywarn-dead-code",
  "-Ywarn-numeric-widen",
  "-Ywarn-value-discard",
  "-Xfuture"
)

//publishMavenStyle := true

pomIncludeRepository := { x => false }

//credentials += Credentials(Path.userHome / ".ivy2" / "sonatype.credentials")