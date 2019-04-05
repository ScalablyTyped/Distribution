organization := "org.scalablytyped"
name := "zipkin-context-cls"
version := "0.11-dt-20190225Z-51b809"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-a816e1",
  "org.scalablytyped" %%% "is-promise" % "2.1-dt-20180214Z-2d9d07",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "zipkin" % "0.17.1-daa3ba")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        