parameters {
        string(name: 'branch', defaultValue: 'master', description: 'branch to test')		
		string(name: 'testServerUrl', defaultValue: 'https://api-qa.aspose.cloud', description: 'server url')		
}

def runtests(directory)
{
    dir(directory){
        try {
            stage('checkout'){
                checkout([$class: 'GitSCM', branches: [[name: params.branch]], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'LocalBranch', localBranch: "**"]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '361885ba-9425-4230-950e-0af201d90547', url: 'https://git.auckland.dynabic.com/words-cloud/words-cloud-java.git']]])
                withCredentials([usernamePassword(credentialsId: '6839cbe8-39fa-40c0-86ce-90706f0bae5d', passwordVariable: 'AppKey', usernameVariable: 'AppSid')]) {
					sh 'mkdir -p Settings'
                    sh 'echo "{\\"AppSid\\": \\"$AppSid\\",\\"AppKey\\": \\"$AppKey\\", \\"BaseUrl\\": \\"$testServerUrl\\"}" > Settings/servercreds.json'
                }
            }
            
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
        } finally {
			deleteDir()
        }
    }
}

node('words-linux') {
	cleanWs()
    if (!params.branch.contains("release")) {
	    runtests("java-sdk")

        stage('wait for publish confirmation'){
            timeout(time:1, unit:'DAYS') {
                input message:'Publish packet?'
            }
        }

        stage('Merge master to release'){
            if (params.branch.contains("master")) {
                    checkout([$class: 'GitSCM', branches: [[name: '*/release']], doGenerateSubmoduleConfigurations: false, extensions: [[$class: 'LocalBranch', localBranch: "**"]], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '361885ba-9425-4230-950e-0af201d90547', url: 'https://git.auckland.dynabic.com/words-cloud/words-cloud-java.git']]])
                    sh "git config user.email 'jenkins.aspose@gmail.com'"
			        sh "git config user.name 'jenkins'"
                    sh "git checkout --merge release"
                    sh "git reset --hard origin/release"
                    sh "git merge --no-ff --allow-unrelated-histories origin/master"
                    sh "git diff --name-status"			
                    sh 'git commit -am "Merged master branch to release" || exit 0'
                    withCredentials([usernamePassword(credentialsId: '361885ba-9425-4230-950e-0af201d90547', passwordVariable: 'gitPass', usernameVariable: 'gitUsername')]) {
                        sh "git push https://$gitUsername:$gitPass@git.auckland.dynabic.com/words-cloud/words-cloud-java.git release"
                    }
            }  
        }
    }

}