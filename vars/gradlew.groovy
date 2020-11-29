def call(String directory, String cmd) {
    dir (${directory}){
        sh "./gradlew ${cmd} -s"
    }
}