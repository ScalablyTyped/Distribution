organization := "org.scalablytyped"
name := "zipkin-instrumentation-express"
version := "0.11-dt-20181116Z-0aa1a0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180910Z-168609",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-d7d4ef",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-448588",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-5ea9ff",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-b93914",
  "org.scalablytyped" %%% "is-promise" % "2.1-dt-20180910Z-30ea30",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-399889",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-e9c641",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-de6390",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "zipkin" % "0.14.3-8dc339")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        