
plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}
group = "org.orph2020.pst"
version = "0.1-SNAPSHOT"


//TODO would be nice to factor even repositories into build logic
repositories {
    mavenCentral()
    mavenLocal()
    /*
    add this repository to pick up the SNAPSHOT version of the IVOA base library - in the future when this
    will not be necessary when this library is released as a non-SNAPSHOT version.
     */
    maven {
        url= uri("https://oss.sonatype.org/content/repositories/snapshots/")
    }

}

java {
    withSourcesJar()
}
dependencies {
    implementation(platform("org.orph2020.pst.platforms:quarkus-base"))
    implementation(platform("org.orph2020.pst.platforms:pst-dm"))
    implementation("io.quarkus:quarkus-rest-client-reactive-jackson")
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
