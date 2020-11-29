def call(Map stageParams) {
    dir (stageParams.dir){
        sh "./gradlew ${stageParams.gradleCmd}"
    }
}