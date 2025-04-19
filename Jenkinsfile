pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
Post{
always{
emailext body : 'Summary' , subject : 'Pipeline status' , to : 'Sagarw094@gmail.com'
}

}
    }
}
