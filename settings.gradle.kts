
rootProject.name = "pst-lib"
includeBuild("../build-logic")

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        mavenLocal()
        /*
        add this repository to pick up the SNAPSHOT version of the IVOA base library - in the future this
        will not be necessary when this library is released as a non-SNAPSHOT version.
         */
        maven {
            url= uri("https://central.sonatype.com/repository/maven-snapshots/")
        }

    }

}
