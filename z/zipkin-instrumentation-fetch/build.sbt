organization := "org.scalablytyped"
name := "zipkin-instrumentation-fetch"
version := "0.11-dt-20181119Z-922f16"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "is-promise" % "2.1-dt-20180214Z-a7d185",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-ae8c41",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "zipkin" % "0.16.1-07df59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        