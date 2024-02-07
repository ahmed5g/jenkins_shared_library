def call() {
    withSonarQubeEnv('sonarqube_Server') {
                        sh "${SCANNER_HOME}/bin/sonar-scanner -Dsonar.projectName=youtube_clone -Dsonar.projectKey=youtube_clone"
                    }
}
