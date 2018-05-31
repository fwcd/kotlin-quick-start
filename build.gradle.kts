plugins {
	application
	kotlin("jvm") version "1.2.31"
}

application {
	mainClassName = "AppKt"
}

dependencies {
	compile(kotlin("stdlib"))
	testCompile("junit:junit:4.10")
}

repositories {
	jcenter()
}
