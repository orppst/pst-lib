
plugins {
    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}
group = "org.orph2020.pst"
version = "1.0"




java {
    withSourcesJar()
}
dependencies {
    implementation(enforcedPlatform("io.quarkus.platform:quarkus-bom:3.33"))
    api("org.javastro.ivoa.dm:proposaldm:0.7.1-SNAPSHOT")
    api("org.javastro.ivoa.dm:proposaldm:0.7.1-SNAPSHOT:test") // FIXME will want to remove for deployment
    implementation("io.quarkus:quarkus-jackson")
    implementation("io.quarkus:quarkus-rest-client-oidc-filter")
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
