def sonarAnalysis(String Project_Key, String Project_Name, String Sonar_URL, String Sonar_login){
      sh "mvn sonar:sonar \
      -Dsonar.projectKey=${Project_Key}	\
      -Dsonar.projectName=${Project_Name}  \
      -Dsonar.host.url=${Sonar_URL}  \
      -Dsonar.login=${Sonar_login}"
}
