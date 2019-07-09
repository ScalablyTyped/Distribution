organization := "org.scalablytyped"
name := "zeit__next-typescript"
version := "0.1-dt-20190213Z-06fefc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-630d1b",
  "org.scalablytyped" %%% "csstype" % "2.6.5-523284",
  "org.scalablytyped" %%% "next" % "8.0-dt-20190501Z-219439",
  "org.scalablytyped" %%% "next-server" % "8.1-dt-20190629Z-c3197e",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190708Z-e1e986",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190616Z-499c3a",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-5fe923",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-2d71fc",
  "org.scalablytyped" %%% "source-map" % "0.7.3-11ec74",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-a00acf",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8dc4d2",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190624Z-ec19b6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        