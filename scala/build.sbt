ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.1.2"

lazy val root = (project in file("."))
  .settings(
    name := "λ-scala",
    idePackagePrefix := Some("io.github.grigala"),
    libraryDependencies ++= Seq(
      "org.typelevel" %% "cats-core" % "2.7.0",
      "org.typelevel" %% "cats-mtl" % "1.2.1",
      "org.typelevel" %% "cats-collections-core" % "0.9.3",
      "org.typelevel" %% "shapeless3-deriving" % "3.0.4"
    )
)
