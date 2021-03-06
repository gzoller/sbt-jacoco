name := "jacocoTest"
organization := "com.navetas"

scalaVersion := "2.10.4"
scalacOptions ++= Seq("-deprecation", "-optimize", "-unchecked", "-Xlint", "-language:_")

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.4" % "test"

unmanagedResourceDirectories in Compile += sourceDirectory.value / "unmanaged"