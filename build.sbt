name := "Scala-DBus"

scalaVersion in ThisBuild := "2.11.7"

scalacOptions in ThisBuild ++= Seq(
  "-feature",
  "-deprecation",
  "-Yno-adapted-args",
  "-Ywarn-value-discard",
  "-Ywarn-numeric-widen",
  "-Ywarn-dead-code",
  // "-Ymacro-debug-lite",
  "-Xlint",
  // "-Xfatal-warnings",
  "-unchecked",
  "-language:implicitConversions",
  "-language:experimental.macros")

// testOptions in Test += Tests.Setup(classLoader =>
//   classLoader
//     .loadClass("org.slf4j.LoggerFactory")
//     .getMethod("getLogger", classLoader.loadClass("java.lang.String"))
//     .invoke(null, "ROOT")
// )

resolvers += "tpolecat"  at "http://dl.bintray.com/tpolecat/maven"
resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/"
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies in ThisBuild ++= Seq(
  "org.scalaz"                 %% "scalaz-core"   % "7.1.2",
  "org.tpolecat"               %% "atto-core"     % "0.4.1",
  "org.scodec"                 %% "scodec-bits"   % "1.0.9",
  "org.scodec"                 %% "scodec-core"   % "1.8.0",
  "org.scalaz.stream"          %% "scalaz-stream" % "0.7a",
  "org.scala-stm"              %% "scala-stm"     % "0.7",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "org.slf4j"                  %  "slf4j-api"     % "1.7.7",
  "ch.qos.logback"             %  "logback-classic" % "1.1.3",
  "org.scalatest"              %% "scalatest"     % "2.2.4"  % "test",
  "org.scalacheck"             %% "scalacheck"    % "1.12.3" % "test"
)
libraryDependencies ++= {
  if (scalaBinaryVersion.value startsWith "2.10")
    Seq(compilerPlugin("org.scalamacros" % "paradise" % "2.0.1" cross CrossVersion.full))
  else Nil
}

libraryDependencies := {
  CrossVersion.partialVersion(scalaVersion.value) match {
    // if scala 2.11+ is used, add dependency on scala-xml module
    case Some((2, scalaMajor)) if scalaMajor >= 11 =>
      libraryDependencies.value ++ Seq(
        "org.scala-lang.modules" %% "scala-xml" % "1.0.5",
        "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"
      )
    case _ =>
      // or just libraryDependencies.value if you don't depend on scala-swing
      libraryDependencies.value
  }
}

addCompilerPlugin("org.spire-math" % "kind-projector" % "0.6.3" cross CrossVersion.binary)

unmanagedJars in Compile <++= baseDirectory map { base =>
  (base ** "*.jar").classpath
}

initialCommands in console := """
import scalaz._
import Scalaz._
import dbus._
import DBus._
import scodec.bits._
"""

// fork in Test := true

parallelExecution in Test := false

lazy val dbus = project.in(file("."))
