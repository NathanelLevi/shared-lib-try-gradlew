def call(Map stageParams) {
    sh '''
       git tag -a someVersion -m \"somecomment\"+
       git push origin someVerion
    '''
}