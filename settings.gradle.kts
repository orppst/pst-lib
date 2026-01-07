pluginManagement {
    includeBuild("../build-logic")
}

dependencyResolutionManagement {
//this does not always seem to be inherited?
    repositories {
        mavenCentral()
        mavenLocal()
        /*
        add this repository to pick up the SNAPSHOT version of the IVOA base library - in the future  this
        will not be necessary when this library is released as a non-SNAPSHOT version.
         */
        maven {
            url= uri("https://central.sonatype.com/repository/maven-snapshots/")
        }
        maven {
            url= uri("https://repo.dev.uksrc.org/repository/maven-public/")
        }


    }
}


rootProject.name = "pst-lib"



