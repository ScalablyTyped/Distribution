organization := "com.scalablytyped"
name := "zipkin-context-cls"
version := "0.11-dt-20181116Z-a4431e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "base64-js" % "1.2-dt-20180910Z-2f3741",
  "com.scalablytyped" %%% "is-promise" % "2.1-dt-20180910Z-1bc383",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "zipkin" % "0.14.2-963734",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        