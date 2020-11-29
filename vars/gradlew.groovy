def call(String... args) {
    sh "./gradlew ${args.join(' ')} -s"
}