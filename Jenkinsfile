parameters {
        string(name: 'branch', defaultValue: 'master', description: 'branch to test')		
		string(name: 'testServerUrl', defaultValue: 'https://auckland-words-cloud-staging.dynabic.com', description: 'server url')		
}

node('billing-qa') {
	try {
		stage('checkout'){
                checkout([$class: 'GitSCM', branches: [[name: '*/' + params.branch]], doGenerateSubmoduleConfigurations: false, extensions: [], submoduleCfg: [], userRemoteConfigs: [[credentialsId: '9d6c4dfa-042c-4ed1-81c7-9175179dddda', url: 'https://github.com/aspose-words-cloud/aspose-words-cloud-java.git/']]])
                withCredentials([usernamePassword(credentialsId: '6839cbe8-39fa-40c0-86ce-90706f0bae5d', passwordVariable: 'AppKey', usernameVariable: 'AppSid')]) {
                    bat 'md Settings & echo {"AppSid": "%AppSid%","AppKey": "%AppKey%", "BaseUrl": "%testServerUrl%"} > Settings/servercreds.json'
                }
            }
	
		stage('build'){
			bat 'mvn compile'
        }
            
        stage('tests'){   
			try {
				bat "mvn test"
			} finally {
				junit "target\surefire-reports\*.xml"
			}
        }
        
        stage('bddtests'){
        }
                    
	} finally {                       
         deleteDir()
    }		
}