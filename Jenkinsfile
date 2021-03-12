properties([
	gitLabConnection('gitlab'),
	[$class: 'ParametersDefinitionProperty', 
		parameterDefinitions: [
			[$class: 'StringParameterDefinition', name: 'branch', defaultValue: 'master', description: 'the branch to build'],
			[$class: 'StringParameterDefinition', name: 'apiUrl', defaultValue: 'https://api-qa.aspose.cloud', description: 'api url'],
			[$class: 'BooleanParameterDefinition', name: 'debugMode', defaultValue: 'false', description: 'debug mode'],
            [$class: 'BooleanParameterDefinition', name: 'ignoreCiSkip', defaultValue: false, description: 'ignore CI Skip'],
            [$class: 'StringParameterDefinition', name: 'credentialsId', defaultValue: '6839cbe8-39fa-40c0-86ce-90706f0bae5d', description: 'credentials id'],
		]
	]
])

def needToBuild = false

def runtests(directory)
{
    dir(directory){
        try {
            stage('checkout'){
                checkout([$class: 'GitSCM', branches: [[name: params.branch]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '361885ba-9425-4230-950e-0af201d90547', url: 'https://git.auckland.dynabic.com/words-cloud/words-cloud-java.git']]])
                
                sh 'git show -s HEAD > gitMessage'
                def commitMessage = readFile('gitMessage').trim()
                echo commitMessage
                needToBuild = params.ignoreCiSkip || !commitMessage.contains('[ci skip]')               
                sh 'git clean -fdx'
                
                if (needToBuild) {
                    withCredentials([usernamePassword(credentialsId: params.credentialsId, passwordVariable: 'ClientSecret', usernameVariable: 'ClientId')]) {
                        sh 'mkdir -p Settings'
                        sh 'echo "{\\"ClientId\\": \\"$ClientId\\",\\"ClientSecret\\": \\"$ClientSecret\\", \\"BaseUrl\\": \\"$apiUrl\\", \\"Debug\\" : \\"$debugMode\\" }}" > Settings/servercreds.json'
                    }
                }
            }
            
            if (needToBuild) {
                docker.image('maven').inside{
                    stage('build'){
                        sh "mvn compile"
                    }
                
                    stage('tests'){
                        try{
                            sh "mvn test"
                        } finally{
                            junit 'target/surefire-reports/*.xml'
                        }
                    }
                
                    stage('bdd-tests'){
                        
                    }
                    
                    stage('clean-compiled'){
                        sh "rm -rf %s"
                    }
                }  
            }            
        } finally {
			deleteDir()
        }
    }
}

node('words-linux') {
	cleanWs()
    if (!params.branch.contains("release")) {
	    runtests("java-sdk")
    }

}