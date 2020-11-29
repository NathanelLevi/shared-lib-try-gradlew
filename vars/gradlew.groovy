def call(String... args) {
    sh "./kenshoo/java/gradlew ${args.join(' ')} -s"
}