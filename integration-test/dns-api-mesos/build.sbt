enablePlugins(JavaAppPackaging)
name := "bootstrap-demo-dns-api"

scalaVersion := "2.13.10"

def akkaManagementVersion(version: String) = version.split('+')(0)

libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-bootstrap" % akkaManagementVersion(
  version.value)

libraryDependencies += "com.lightbend.akka.management" %% "akka-management-cluster-http" % akkaManagementVersion(
  version.value)

libraryDependencies += "com.typesafe.akka" %% "akka-discovery" % "2.8.2"
