organization := "com.scalablytyped"
name := "zipkin-instrumentation-fetch"
version := "0.11-dt-20181120Z-23a7fc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "base64-js" % "1.2-dt-20180910Z-b671e9",
  "com.scalablytyped" %%% "is-promise" % "2.1-dt-20180910Z-250403",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-0916c6",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "zipkin" % "0.14.3-a52d1d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        