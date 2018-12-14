organization := "org.scalablytyped"
name := "zipkin-instrumentation-express"
version := "0.11-dt-20181116Z-1abecf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180910Z-1c4644",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "is-promise" % "2.1-dt-20180910Z-f26f07",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "zipkin" % "0.15.0-c47cc0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        