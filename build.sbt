name := "Scala-DBus"

scalaVersion in ThisBuild := "2.11.6"

scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-deprecation",
  "-Yno-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-numeric-widen",
  "-Ywarn-dead-code",
  "-Xlint",
  "-Xfatal-warnings",
  "-unchecked",
  "-language:implicitConversions"
)

resolvers += "tpolecat"  at "http://dl.bintray.com/tpolecat/maven"

libraryDependencies in ThisBuild ++= Seq(
  "org.scalaz"     %% "scalaz-core"    % "7.1.2",
  "org.tpolecat"   %% "atto-core"      % "0.4.1",
  "org.scalatest"  %  "scalatest_2.11" % "2.2.4" % "test",
  "org.scalacheck" %% "scalacheck"     % "1.12.3" % "test"
)

initialCommands in console := """
import scalaz._
import Scalaz._
import dbus._
import DBus._
"""

lazy val demo = project.in(file("."))
