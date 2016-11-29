lazy val commonSettings = Seq(
  organization := "com.michaelpollmeier",
  scalaVersion := "2.11.8",
  libraryDependencies ++= Seq(
    "org.scalameta" %% "scalameta" % "1.3.0",
    "org.scalatest" %% "scalatest" % "3.0.1" % "test"
  ),
  addCompilerPlugin("org.scalameta" % "paradise" % "3.0.0-M5" cross CrossVersion.full),
  licenses +=("Apache-2.0", url("https://www.apache.org/licenses/LICENSE-2.0.html")),
  homepage := Some(url("https://github.com/mpollmeier/scalameta-tutorial"))
)

lazy val scalameta_code = project.in(file("."))
  .settings(commonSettings: _*)

lazy val examples = project.in(file("examples"))
  .settings(commonSettings: _*)
  .dependsOn(scalameta_code)
