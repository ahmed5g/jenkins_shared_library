def call() {
    sh 'trivy image ahmeddocer/youtube:latest > trivyimage.txt'
}
