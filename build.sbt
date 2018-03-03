

lazy val root = (project in file(".")).
  settings(
    name := "scala-pearls",
    description := "Pearls of Functional Algorithm Design, in Scala",
    version := "0.0.1",
    scalaVersion := "0.6.0-RC1",
    libraryDependencies ++= {
      "ch.epfl.scala" %% "collection-strawman" % "0.9.0" ::
      "org.typelevel" %% "cats-core"           % "1.0.1" ::
      "com.lihaoyi"   %% "utest"               % "0.6.3" :: Nil
    }.map(_.withDottyCompat())
  )
