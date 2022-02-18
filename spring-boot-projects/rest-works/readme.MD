> docker pull sonarqube 

> docker run --name sapient-sonar -p 9000:9000 -d sonarqube 

> create a project in sonar qube, default user name and password : admin 

> mvn clean  test  sonar:sonar \
  -Dsonar.projectKey=spring-works \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=affe4264d869c9642c6a22271c4cda60e23c49ae



