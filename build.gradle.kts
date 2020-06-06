import org.jetbrains.grammarkit.tasks.GenerateLexer
import org.jetbrains.grammarkit.tasks.GenerateParser
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.3.72"
    id("org.jetbrains.grammarkit") version "2020.2.1"
    id("org.jetbrains.intellij") version "0.4.21"
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

intellij {
    version = "2020.1"
    pluginName = "Example"
    updateSinceUntilBuild = false
}

sourceSets {
    main {
        java.srcDir("gen")
    }
}

tasks.withType<JavaCompile> {
    sourceCompatibility = "1.8"
    targetCompatibility = "1.8"
}

listOf("compileKotlin", "compileTestKotlin").forEach {
    tasks.getByName<KotlinCompile>(it) {
        kotlinOptions.jvmTarget = "1.8"
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
}

//compileKotlin {
//    dependsOn generateCode
//}

task("generateLexer", GenerateLexer::class) {
//    source = "src/main/grammars/Racket.flex"
    source = "src/main/grammars/Racket.flex"
    targetDir = "gen/org/racket/lang/core/lexer/"
    targetClass = "_RacketLexer"
    purgeOldFiles = true
    skeleton = "src/main/grammars/idea-flex.skeleton"
}

task("generateParser", GenerateParser::class) {
    source = "src/main/grammars/Racket.bnf"
    targetRoot = "gen"
    pathToParser = "/org/racket/lang/core/parser/RacketParser.java"
    pathToPsiRoot = "/org/racket/lang/core/psi"
    purgeOldFiles = true
}

task("generateCode") {
    dependsOn("generateLexer")
    dependsOn("generateParser")
}

tasks.compileKotlin {
    dependsOn("generateCode")
}

tasks.compileJava {
    dependsOn("generateCode")
}
