name := "sbttest"

version := "1.0"

scalaVersion := "2.11.8"



lazy val module1 = project in file("module1")

lazy val module2 = (project in file("module2")).dependsOn(module1)

lazy val root = (project in file(".")).aggregate(module1, module2)
