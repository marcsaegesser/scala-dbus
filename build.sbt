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

libraryDependencies in ThisBuild ++= Seq(
  "org.scalaz"    %% "scalaz-core"  % "7.2.0-M1"
)

initialCommands in console := """
import scalaz._
import Scalaz._
import dbus._
import DBus._
"""

lazy val demo = project.in(file("."))
