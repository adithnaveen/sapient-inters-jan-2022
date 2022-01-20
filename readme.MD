- MD - Mark Down 

- Adil - from MSRIT, blr - E&C - wathcing animies 
- Anurag - MSRIT - Computer science - Sketching 
- Ashish - MANIT Bhopal, MCA, - playing video games 
- Chetan - MCA - IP university, delhi - reading books and travelling 
- Gaurav - MCA - guru gobind singh delhi, playing cricket, and does web development 
- Gurpreet - MCA in thapar univerity patiyala, playing criket & volley ball 
- Kushal - MCA, Mulana Azad university, playing cricket and chess 
- Sumanth - MSRIT BLR, final year - playing criket, football 
- Manshu - MCA ip univerity delhi playing football 
- Mohit - Btech from srm univerity, playing cricket and watching TV's shows 
- Nischal - MCA, dheradhun univerity, playing piano, TT 
- ojasvi - MCA, NIT raipur, singing 
- Priya - Btech from manipal univerity, playing badminton & gardening 
- Pulkit - MCA from thaphar, patiala , plays foot ball and doodling 
- Rahul - BE in IT, from chadigargh university, watch disnep movies, play criket and kabaddi 
- Ritu - final sem of MCA, nit jameshdpur - keep herself healthy 
- Roshni - MCA, USICT, robotics, dancing and yoga 
- Sangita - MCA from nit raipur, developing web application, paiting and travelling 
- Satyaa - Btech srm university, computers, playing video games 
- Sneha - PES University, did inter on robotic project, dancing and swim
- Sumedh - MCA nit kurukshektra, web development, reading and painting 
- Vibhanshu - jaipur, BIT college, ui ux development, playing piano 
- Yashika - MCA, USICT, reading and painting 
- Yuvraj - MCA, from kurukshektra, riding bike, travelling, webseries 


Ojasvi and Vibhanshu are the batch POC.


BitBucket, Jira Access 
MS Teams (Good)


C - BCA 
Java - 

> Approach 
	- Left to Right - You learn programming and then think to apply it 
	- Right to Left - You know what are you trying to solve and learn the right programming language to solve 

### List Of Softwares 

1. Jdk 11 - https://www.oracle.com/in/java/technologies/javase/jdk11-archive-downloads.html
2. Eclipse - https://www.eclipse.org/downloads/packages/
3. GitBash - https://git-scm.com/downloads
4. VS Code - https://code.visualstudio.com/download
5. Jenkins - https://www.jenkins.io/download/
6. Docker - https://www.docker.com/products/docker-desktop
7. Maven - https://maven.apache.org/download.cgi


# Day 1 
- DevOps

```
Git for SCM
Introduction and Key Concepts
Setup Overview
Installing Git on a Mac via the Command Line
Git Configuration
Configuration Commands
Setup and Configuration
First Commit Commands
Working Locally
Gitting Historical
Removing Files
Moving Files
Ignoring Files
History and File Management Commands
Collaborating with Others -- Git Remotes and GitHub
Git Remote Commands
Going Remote 

```


> Programming paradim 
 
- Low Code 
- No Code 


> git repo styles 

-  Mono Repo 
-  Branching Stratergy 

- Git is a tool to checking and checkout the code 
- GitHub is a cloud storage mechanism 

-- 


- Git Commands

> git config user.name "Harry"  - this will be applicable only to the folder you are in 


> git config --global user.name "Harry"  - this will be applicable to the user you have logged in 


> git config --system user.name "Harry"  - this will be applicable to entire system 

>  git config --global --edit 

> git log --oneline --decorate --graph

> git clone https://github.com/adithnaveen/delete-gitworks-inters-2022.git

> git branch naveen-works main 

> create a file and put some content -> save -> Esc :wq 

> git add . 

> git ci -m "created new file "

> git push origin <branch-name> 



<hr >


###  Git command in class room 


<hr >


 - 1017  git status 
 - 1018  git add Hello.html
 - 1019  git status 
 - 1020  git commit -m "initial commit"
 - 1021  git status 
 - 1022  clear
 - 1023  git st
 - 1024  git config --global alias.st status 
 - 1025  git st
 - 1026  git config --global alias.ci commit 
 - 1027  git config --edit 
 - 1028  git config --global --edit 
 - 1029  git config --global --edit 
 - 1030  vi Hello.html
 - 1031  git add Hello.html
 - 1032  git ci -m "added head and body tags"
 - 1033  git st
 - 1034  vi Hello.html
 - 1035  git st
 - 1036  git add . 
 - 1037  git st
 - 1038  git ci -m "added h2 tag"
 - 1039  git st
 - 1040  git logs
 - 1041  git log
 - 1042  git log --oneline 
 - 1043  git st
 - 1044  clear
 - 1045  git status
 - 1046  git log --oneline
 - 1047  git status
 - 1048  git branch 
 - 1049  git br
 - 1050  git br -a 
 - 1051  git branch pulkit-footer-branch
 - 1052  git br -a 
 - 1053  code . 
 - 1054  clear
 - 1055  git br
 - 1056  git checkout pulkit-footer-branch
 - 1057  git st
 - 1058  git add . 
 - 1059  git ci -m "added footer code"
 - 1060  git log --oneline
 - 1061  git co main
 - 1062  git add . 
 - 1063  git ci -m "added script tag"
 - 1064  git co pulkit-footer-branch
 - 1065  git co main
 - 1066  clear
 - 1067  git br
 - 1068  man git checkout 
 - 1069  git checkout --help
 - 1070  git co -b nischal-css-works main 
 - 1071  git br
 - 1072  git add . 
 - 1073  git ci -m "added style tag"
 - 1074  git co main 
 - 1075  git add . 
 - 1076  git ci -m "added h3 "
 - 1077  git st
 - 1078  git br
 - 1079  ls -la
 - 1080  clear
 - 1081  ls
 - 1082  pwd
 - 1083  mkdir styles
 - 1084  cd styles
 - 1085  touch sample.css
 - 1086  git br
 - 1087  pwd
 - 1088  cd ..
 - 1089  git add . 
 - 1090  git ci -m "added styles folder"
 - 1091  git br
 - 1092  git merge pulkit-footer-branch
 - 1093  git st
 - 1094  git add .
 - 1095  git ci -m "merged footer works"
 - 1096  clear
 - 1097  git br
 - 1098  git co nischal-css-works
 - 1099  git co main 
 - 1100  git merge nischal-css-works
 - 1101  git log --oneline --decorate --graph
 - 1102  cat .git/HEAD
 - 1103  clear
 - 1104  cat .git/HEAD
 - 1105  git br
 - 1106  git co nischal-css-works
 - 1107  git branch --merged
 - 1108  git branch --no-merged
 - 1109  clear
 - 1110  git br
 - 11- 11  git co main 
 - 1112  clear
 - 1113  git br
 - 1114  git log --oneline
 - 1115  git co -b new-html-dev acdc52f
 - 1116  git br
 - 1117  git add . 
 - 1118  git ci -m "added para"
 - 1119  clear
 - 1120  git br
 - 1121  git branch --merged
 - 1122  git co main
 - 1123  git branch --merged
 - 1124  git branch --no-merged
 - 1125  git branch -d nischal-css-works
 - 1126  git branch -d pulkit-footer-branch
 - 1127  git log --oneline -5 
 - 1128  git log --oneline -6
 - 1129  git log --oneline -7
 - 1130  git log --oneline -3
 - 1131  clear
 - 1132  pwd
 - 1133  git remote -v 
 - 1134  git remote add origin https://github.com/adithnaveen/delete-gitworks-inters-2022.git
 - 1135  git remote -v 
 - 1136  git st
 - 1137  git push origin main
 - 1138  git branch -a 
 - 1139  git push origin new-html-dev
 - 1140  clear
 - 1141  git br
 - 1142  git co -b naveen-works main
 - 1143  git br
 - 1144  ls
 - 1145  vi Header.html
 - 1146  git add . 
 - 1147  git ci -m "added header.html\n"
 - 1148  git push origin naveen-works
 - 1149  git br -a 
 - 1150  clear
 - 1151  git pull 
 - 1152  git br -a 
 - 1153  git co sumant-branch
 - 1154  git co sumanth-branch
 - 1155  clear
 - 1156  git br
 - 1157  ls
 - 1158  cat Hello.
 - 1159  cat Hello.txt
 - 1160  vi Hello.txt
 - 1161  git add . 
 - 1162  git ci -m "updated sumanth file"
 - 1163  git push origin sumant-branch
 - 1164  git push origin sumanth-branch





### in the class room 
1. Classroom Works - mono repo (dont create branches)
2. Project 
3. Assessment 


1. TDD - Test Driven Development 
2. BDD - Behavioural Driven Development 
3. DDD - Domain Driven Development 
4. MDD - Model Driven Development 



## Day 1 Quick Assignement  (30 Mins )

1. Create 1 github repo 
2. Add Collaborators 2-3 
3. 1 person shall create the main branch 
4. from there all others will create a branch 
5. you will code in respective branch (small code is enough)
6. Then merge your code to main branch 
7. You should show the git graph to the class room 
8. Have a .gitignore file 


Question: 
Satyaa - when conflits occur ? 


<hr >

#Day 2 

### Tools and Packages	
APPLICATION PACKAGING AND BUILD TOOLS 
(MAVEN/GRADLE)


Introduction
Why Maven?
Introduction to debugging
Install Java(Latest)
Install Eclipse(Latest)
Configure Tomcat in eclipse
Web projects and eclipse settings
Maven Installation and Setup
POM XML
Building the project from commandline
Plugins, Repositories, Maven lifecycle goals
Create a Maven Project in Eclipse, Writing Unit Tests
Building from the Command Line
Skipping Tests
Skipping tests in eclipse
Dependency Management
Build the project
Create the Parent POM, Update the Child POMs, Build the multi module project, The Six Scopes



- Project Management Tool 
  - Maven 
  - Gradle 
  - ivy 
  - sbt... 



```
	class Hello {}
```

> mvn validate 

> mvn install 

> mvn package 

> mvn clean package 


- Working on Maven 
	- IDE (Eclipse)
	- Command line 
    	- mvn --version  		

>  mvn archetype:generate -DgroupId=com.naveen -DartifactId=java-works-testing1 -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

> cd java-works-testing 

> mvn install 

> java -cp ./target/java-works-testing-1.0-SNAPSHOT.jar com.naveen.App

> mvn install -> it will compile -> test -> then only only install will take place if there are any error / test case failure 
  then install is not completed you can ignore tests by below command 

> mvn -DskipTests=true install 

```
-- to set path 

/Volumes/Kanchan/Softwares/maven/maven-3.8/bin
d:\somefolder\somefolder\maven\maven-3.8\bin
setting the path 
1. hit start -> type env -> look for environment variable -> user variable -> look for path -> add the copied text 

```


1. log4j 
2. slf4j 
3. lockback 




1. Create a maven project in bitbucket where the repository is create 
2. 


<hr >

# Day 3 

<hr >



## Tools and Packages - Jenkins	
- Introduction to Jenkins UI
- Keep playing with your first Job
- Redirect your first Job's output
- Learn how to execute a bash script from Jenkins
- Learn how to create a Jenkins list parameter with your script
- Introduction to Pipeline
- Introduction to Jenkinsfile
- Install the Jenkins Pipeline Plugin
Create your first Pipeline
- Add multi-steps to your Pipeline
- Retry
- Timeouts
Environment variables
- Credentials
- Post actions 



# Teams 

- Satyaa, Mohit, Anurag - Chethan   - t1 
- Gaurav, Chethan - Adil - t2 
- Adil, Sumanth - Ayushi -t3 
- Ayushi, Yashika - Ritu  - t4 
- Ritu, Ashish - Vibhanshu - t5 
- Vibhansu , Ojasvi - Sumedh - t6 
- Sumedh, Yuvraj - Gurpreet - t7 
- Gurpreet, Kushal - Nischal - t8 
- Nischal, Priya - Rahul - t9 
- Rahul, Sangita - Pulkit - t10
- Sneha, Pulkit - Roshini - t11 
- Roshini, Manshu - Satyaa - t12


Scurm Master 
- Pull Request 
- Validate what is expected and delivery 
- Do a dry run for the team 


- zip 
- rar 
- jar 
- war 



$PROJECT_NAME - Build # $BUILD_NUMBER - $BUILD_STATUS:

Check console output at $BUILD_URL to view the results.


```
pipeline {
    agent any

    stages {
        stage('build') {
            steps {
                echo 'i can do some building here '
            }
        }
        stage('test') {
            steps {
                echo 'test stage goes here '
            }
        }
        stage('deployment') {
            steps {
                echo 'deployment stage '
            }
        }

    }
}

```


1. create maven project in the branch called "maven-jenkins-works"
2. in the source main write a method 
   
   ```
		public class Hello {
			public String hi() { return "Sapient";}
		}
   ```   
3. Write a test case to assert "Sapient" with "Sapient" 
4. Create a Jenkinsfile in the server and build the application 
5. install blue ocean 
6. 

