organization := "wiii"

name := "example-akka-http"

version := "0.1"

scalaVersion := "2.11.7"

scalacOptions += "-target:jvm-1.8"

libraryDependencies ++= {
    val akkaVersion = "2.4.1"
    val akkaStreamVersion = "2.0.1"

    Seq(
        "org.scala-lang" % "scala-library" % "2.11.7",
        "org.scala-lang" % "scala-reflect" % "2.11.7",

        "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
        "com.typesafe.akka" %% "akka-actor" % "2.4.0",
        "com.typesafe.akka" %% "akka-slf4j" % "2.4.0" % Runtime,

        "com.typesafe.akka" %% "akka-actor" % akkaVersion,
        "com.typesafe.akka" %% "akka-stream-experimental" % akkaStreamVersion,
        "com.typesafe.akka" %% "akka-http-experimental" % akkaStreamVersion,
        "com.typesafe.akka" %% "akka-http-core-experimental" % akkaStreamVersion,
        "com.typesafe.akka" %% "akka-http-xml-experimental" % akkaStreamVersion,
        "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaStreamVersion,
        "com.typesafe.akka" %% "akka-slf4j" % akkaVersion % Runtime,

        "org.scalatest" %% "scalatest" % "2.2.5" % Test,
        "com.typesafe.akka" %% "akka-testkit" % akkaVersion % Test,
        "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % Test
    )
}