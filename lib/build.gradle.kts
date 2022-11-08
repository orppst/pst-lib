
plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}
group = "org.orph2020.pst"
version = "0.1-SNAPSHOT"

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
    mavenLocal()
}
java {
    withSourcesJar()
}
dependencies {
    api("org.javastro.ivoa.dm:proposaldm:0.3-SNAPSHOT:quarkus")//IMPL special dependency that does not include the
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
