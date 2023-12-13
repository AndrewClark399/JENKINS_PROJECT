pipeline {
  agent any
  stages {
    stage('Build React') {
            steps {
              dir('front') {
                git url: 'https://github.com/agray998/simple-node-js-react-npm-app'
                
                bat "npm install"
                // bat "npm test"
                bat "npm pack"
              }
            }
        }
        stage('Build Maven') {
            steps {
              dir('back') {
                git url: 'https://github.com/agray998/SpringBoot-Jenkins',
                    branch: 'main'

                withMaven(maven: 'M3') {
                    // Run the maven build
                    bat "mvn clean package"
                } // withMaven will discover the generated Maven artifacts, JUnit Surefire & FailSafe & FindBugs & SpotBugs reports...
            }
          }
        }
        stage('Selenium Test') {
            steps {
                dir('front') {
                  bat 'npm install my-app-0.1.0.tgz'
                  bat 'npm start my-app'
                }
                withMaven(maven: 'M3') {
                  bat '''
                  mvn clean install
                  java -cp target/selenium-1.0-SNAPSHOT.jar SeleniumTests
                  '''
                }
            }
        }
    }
}
