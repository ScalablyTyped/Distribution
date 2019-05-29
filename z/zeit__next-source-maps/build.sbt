organization := "org.scalablytyped"
name := "zeit__next-source-maps"
version := "0.0-dt-20190321Z-3bd038"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-c668e9",
  "org.scalablytyped" %%% "csstype" % "2.6.4-a0e5c1",
  "org.scalablytyped" %%% "next" % "8.0-dt-20190501Z-8a6263",
  "org.scalablytyped" %%% "next-server" % "8.1-dt-20190501Z-044cfc",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190516Z-df5a93",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-b94c72",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1cea03",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-3caa3d",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4c9904",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-c234c0",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-db399f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190521Z-c79d12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        