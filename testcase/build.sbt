name := "testcase"

version := "0.0.1"

scalaVersion := "2.11.8"

autoCompilerPlugins := true

lazy val pluginPath = "../demoplug/target/scala-2.11/demoplug_2.11-0.0.1.jar"

scalacOptions ++= Seq(
  s"-Xplugin:$pluginPath"
)



