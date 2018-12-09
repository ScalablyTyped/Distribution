organization := "org.scalablytyped"
name := "zipkin-transport-http"
version := "0.11-dt-20181116Z-c4571c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180910Z-9b9acb",
  "org.scalablytyped" %%% "is-promise" % "2.1-dt-20180910Z-0edd47",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "zipkin" % "0.14.3-6af52a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        