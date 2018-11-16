organization := "com.scalablytyped"
name := "zipkin-context-cls"
version := "0.11-dt-20181116Z-276ec7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "base64-js" % "1.2-dt-20181102Z-f61a73",
  "com.scalablytyped" %%% "is-promise" % "2.1-dt-20181102Z-f019af",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "zipkin" % "0.14.3-ea208f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        