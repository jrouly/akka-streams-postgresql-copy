name := "akka-streams-postgresql-copy"
organization := "ru.arigativa"


version := "0.8.1"

scalaVersion := "2.12.2"
crossScalaVersions := Seq("2.12.2", "2.11.8")


libraryDependencies ++= {
  val akkaVer = "2.5.12"

  Seq(
     "com.typesafe.akka" %% "akka-stream"         % akkaVer    % "provided,test"
    ,"com.typesafe.akka" %% "akka-stream-testkit" % akkaVer    % "provided,test"
    ,"org.postgresql"    %  "postgresql"          % "9.4.1212" % "provided,test"

    // testing
    ,"org.scalatest" %% "scalatest"    % "3.0.1" % "test"
    ,"org.mockito"   %  "mockito-core" % "2.6.5" % "test"
  )
}


