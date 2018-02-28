# scala_plugin_demo
A scalac plugin checking div-by-zero expressions and raise errors.

# Overview

'demoplug' is a scalac plugin, which is also a scala sbt project. 

Run `sbt package` in this directory, then you get the compiled jar file in 'demoplug/target/scala-2.11/fast-translator_2.11-0.0.1.jar'.

Now you can use the plugin in your scala projects.

The project 'testcase' demonstrates how to add a plugin dependency in built.sbt which contains contents like:

```
name := "testcase"

version := "0.0.1"

scalaVersion := "2.11.8"

autoCompilerPlugins := true

lazy val pluginPath = "../demoplug/target/scala-2.11/fast-translator_2.11-0.0.1.jar"

scalacOptions ++= Seq(
  s"-Xplugin:$pluginPath"
)
```

Compile the 'testcase' project you'll get an error as expected:

```
Exception in thread "main" java.lang.ArithmeticException: / by zero
```
