def call() {
    withSonarQubeEnv('sonarqube_Server') {
                        sh "sonar-scanner -Dsonar.projectName=youtube_clone -Dsonar.projectKey=youtube_clone"
                    }
}
