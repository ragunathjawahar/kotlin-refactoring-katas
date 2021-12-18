plugins {
  kotlin("jvm") version "1.6.10"
}

repositories {
  mavenCentral()
}

dependencies {
  implementation(kotlin("stdlib"))

  testImplementation(kotlin("test-junit5"))
  testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
  testImplementation("org.junit.jupiter:junit-jupiter-params:5.8.2")
  testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.2")
}

tasks.test {
  useJUnitPlatform()
}
