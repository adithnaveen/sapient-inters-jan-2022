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


# Day 4 

1. working with junit 
2. junit with jenkins 
3. what is this all about assertxxxx 
4. why/ when are we using pipeline and parameters 
5. where are we using jenkins in realtime 
6. why there is versioning in jenkins file 


- create a runnable jar 
- 

```
	write a program to say hi to user 

// development will come later 
	public String sayHi(String name) {
		return "Hi " + name; 
	}

// first test 
	public void testSayHi() {
		String name ="Adil"; 
		String expectedReturn = "Hi " + name; 
		assertEqulas(expectedReturn , sayHi(name));
	}

```


SDET -> Software Developer Enginer & Tester 



- in our class we had used junit -> 4.12 
- in adil pom.xml ther jutni is 3.8.x 
  ```
	class MyTestCase extends Testcase  {

	}
  ```



## Core Java, Java Introduction	
  

- Java Basics 
- Classes 
- Abstract Classes 
- Mutable Immtable classess 
- Interfaces 
- Compilers  - Javac
- JRE/JDK 
- Constructors, default ,paremetric
- Methods 
- Packaging
- Encapsulation - with Access Specifiers 
- Abstraction
- Inheritence 
  - is-a  - Car is a vehicle, human is a animal - verticle inheritance 
  - has-a - car has a streeing, human has a eye - horizontal 

```
	class Employee {
		private int empId;
		private Name name; 
		private double epmSal;
	}

	class Customer {
		private int custId; 
		private double custIncome; 
		private Name name;
	}
	class Student {
		private int sId; 
		private Name name; 
	}

	class Name {
		private String firstName; 
		private String lastName; 
		private String middleName; 

	}
```


- Polymorphism 
- static (block, variable, method )



- c program 
- native programming language 
- in Windows it works only in windows - .exe file 
- in mac it works only in mac - a.out 
- there are different set of libraries / implementation for diff operating system 
- 1972 - Dennis Ritches wrote C programming - Unix 
- C language is very fast 
- in 1992 - Games Gostling - OAK - Semiconductor devices (unfortunately failed)
- 1993 - java C++ (bjarne Strustrap)
```
	#define main mymain
	int * function () {}
	
	void mymain(int *p, char * args) { -> the main function will always return to underlying OS 
		printf("Hi"); 
	}
```


## Java  
- Platform Independent 
- Threads 
- Collections 
- Excpetion 
- OOPS 



```
	public class Hello  {
		public static void main(String [] args) {
			System.out.println("Hello"); 
		}
	}
```


```
	scanf("%d", &n);   -> hi("hello", "peter"); 
	#include <iostream>
	cin >> n; 
```

- destructor 

```	
	-  in C

	main() {
		int *ptr; 
		ptr = int * malloc(sizeof(int)* 44); 

		.. 
		free(ptr); 
	}

	- in C++ 
	class Employee {
		Employee() {}
		~Employee() {}
	};

```


- in C we call it as function 
  - will always return value 
- in Java we call it as method
  - methods are inside the class  
  - may, may not return value when needed it can return more than 1 value 




## conventions 

1. All variables shall be camel case  -> empId, empName, empSalary,storeDataBaseFlag
2. all methods shall be in cambel case -> getEmployeeRecord(), setEmployeeRecord(), viewBalance() 
3. all package names shall be in lower case -> com.sapeint, com.yourcompany 
4. all constants in uppercase -> PI, COMPANY_NAME 


## Specifiers and modifiers 
1. Specifiers 
   1. public 
   2. private - varibles or mehtods are only visible inside the class 
   3. protected
   4. default(package)

2. Modifiers 
   1. static
   2. abstract
   3. synchronized 

## class vs object 
1. class is a blue print 
2. Object is instance of blue print 

## OO Behaviour -Java 
- Every class in java has a implicit super class called Object 


- Types of memory 
	- Heap Memory - expadable and shrinkable memory 
	- Mehtod Section - this memory section is "singleton" and will be associated with the methods - stack
	- Static section - this is kept in static section and this is also singleton many times 
		static variables are called as class level variables 
	- Local variable section - this section only resides in the memory till the enclsing bracket and 
		and there is no garbage collection concept here 



<hr >

# Project Statement  - CLI 
1. Trainer Module 
   1. Shall have profile 
      1. Trainer Name, Qualification, number of years of exp, [technologies known], [companies trained], 
      2. Register 
         - Given the application is laoded on the system 
         - When the trainer enter firstname, email, password, confirm password 
         - And pressess '0' to save
         - Then save the details to the database 
         
      3. Login 
      4. Dashboard 
      5. Forgot password 
      6. Trainer Calendar
      7. Update personal profile  
      8. ....
2. Toc Module 
   1. Subject, Pre-requisites, Duration, course oucome, [line item [ sub-line-itme ]] - is done by trainer / SME 
   2. Type of program (Technical, Domain , Softskills, Behavioural... )
   3. 
3. Employee Module - calendar,Trainers details, TOC, class room 
   1. class room name 
   2. class room trainer 
   3. Trainer feedback 
   4. Class Room 

- Functional Techno 
- NFR - Non Functional Requirement 
	- The system should always exit gracefully 
	- The system should respond in stipulated time 
	- The system shall not have the failover min promise uptime 99.99 
	- 

- BDD  - Given When Then And But 



-- 


# Day 5 

- [x]  Java Basics 
- [x] Classes 
- Abstract Classes 
- [x] Mutable Immtable classess 
- [x] Interfaces 
- [x] Compilers  - Javac
- [x] JRE/JDK 
- [x] Constructors, default ,paremetric
- [x] Methods 
- [x] Packaging
- [x] Encapsulation - with Access Specifiers 
- [x] Abstraction
- [x] Inheritence 
  - is-a  - Car is a vehicle, human is a animal - verticle inheritance 
  - has-a - car has a streeing, human has a eye - horizontal 
- [x] Polymorphism 
  - Compile Time  - Overloading - same method name diffrent signature in same class 
  - Run Time - Overriding - same method name, same signatures, different classes 
- [x] comparable interface 
- [x] static (block, variable, method )



### EXCEPTION HANDLING 	
-  Using Efficient Exception Handling 
-  Resource Clean up Rules and Finally. 
-  Custom Exception Hierarchy 
-  Exception Wrapper 
-  Exception Loggings
-  partial deligation 


### Mutable Immtable classess

```
	public class Device {
		private int dId; 
		private String dName; 

		Device() {}
		public void setDId(int dId) {
			this.dId = dId;
		}
		.. getter 
		public void setdName(String dName) {
			this.dName = dName;
		}
		.. getter 
	}

	Devide d = new Device();
	d.setDId(101); 
	d.setDName("Laptop"); 
	System.out.println(d); 
	
	d.setDId(102); 
	d.setDName("Key Board"); 
	System.out.println(d); 
	
	--

	public class Device {
		private int dId; 
		private String dName; 

		Device(int dId, String dName) {
			this.dId = dId; 
			this.dName = dName; 
		}
	 
		.. getter 
		.. getter 
	}

	Devide d = new Device(101, "Laptop");
	 
	System.out.println(d); 
	
 
	System.out.println(d); 
```


- Abstract method 
  - If you dont hav the implementation then mark the class with ;, and method shall have abstract as access modifier 
  - if a class has atleast 1 abstract method then the class should be marked as abstract 
  - if the class is marked as abstract then you cannot create an object of the abstract class but you can hold the reference 
  - reference -> is a pointer to instance  vs instance  -> memory allocation is done 
  - the abstract can have implementation if needed 
  - In java Multiple inheritence is not allowed 


- Interfaces 
  - Interfaces are 100% abstract
  - In interfaces you cannot have any concrete implementation 
  - In interfaces you cannot have variables -> final 
  - Minimum access specifier in interfaces is public 
  - Interfaces has nothing to with classes so nothing to do with Object 
  - A class can implement an interface/s 
  - An interface can extends interface / s
  - An interface cannot extend or implement the class 


- comprable 

```
	Emp
		empId (asc/desc)
		empName
		empSal

	- Sneha - Nischal  -> 1, 0, -1 
```



### EXCEPTION HANDLING 	
  - try - catch 
  - try - (try - (try - (try - (try - catch) catch)  catch) catch) - catch 
  - try (open the file / db connection ) - catch (handle the case ) - finally 100% (close)
  - try - finally 
  - throw - is at statement level 
  - throws - is at method level 


- NameTooShortException 
  - Surround It With try-catch 
  - throws 

1. Need to complete the user stories 
2. Create Bean classes for the project 


-- 
# Day 6 
--
Core Java -> GENERICS 
- IO 
  - [x] Reader / Writer Classess - .txt 
  - [x] InputStream / OutputStream Classess - non text class (.mp4, .docx, .jpg...) -> .ser 
  - Scanner 
- Generics basics and implementation

- How to Submit in Assessment 
  > git clone https://tools.publicis.sapient.com/bitbucket/scm/batch/testing-assessment.git
  
  > git checkout main 

  > git checkout -b navks-naveen main 

  > CODE 

  > git add . 

  > git commit -m "completed assessment"

  > git push origin navks-naveen

- How to write code for Project 

```
	scanf("%d", &i); 

	cin >> i; 
```

List of Topics For Tech Connect: 
1. 5g Edge Computing 
2. TRIE Algorithm 
3. Memory Managment in C, C++, Java 
4. Need of Cloud Native Application in Today's world 
5. Data Structures and Best Practices 
6. Diff between SQL / NoSQL 
7. A AA AAA Compliance 
8. OSWAP 
9. Open API 3.0 
10. Library V/S Framework (React vs angular)
11. AWS And its application 
12. Virtualization / Hypervisor 
13. Generation Of Network 
14. BlockChain 
15. Containarization and Orchestraction 
16. RPA 
17. NFT 



- Generics 
- 1.5 jdk 
- (Employee, TeamLeader, Project Manager, CEO, COO, LND, Director ) -> Person 

class MyArray{
	Object [] emp; 
}
 


# Day 7 

- Generics basics and implementation

T []  -  1,2,3,4,5,6 - and find the average 
T []  -  1.4,2.6,3.3,4.1,5.8,65.5 - and find the average 
T []  -  "Harish", "sumedh", "Vibhanshu".... 
T []  - new Emp("Harish"), new Emp("Sumedh"), new Emp("Vibhanshu"), 


1,2 = 1.5 -> float or double 

- sorting min / max 
- 10,2,3,4,5,6

[0] = 2
[1] = 10 
[2] = 3 

- to pass generic object 
-  Gen<?>  genObject; 
-  Gen<Object> genObject 
-  Gen<Emp> genEmp; 
-  Gen<Integer> genInteger; 
-  Gen<? extends Number> getNumberType; 

## COLLECTIONS 	
- Collection Interface
- Iterator Interface
- Set Interface
- List Interface
- Map Interface
- List Iterator Interface
- Sorted Set Interface
- Sorted Map Interface
- Unmodifiable Collection
- Synchronized Wrappers
- Thread Safety
- Collections Utility Classes add more topics to cover Collection framework in depth


```
	int arr[]= new int[4]; 
	arr[0] = 10; 
	arr[1] = 20; 
	arr[2] = 30; 
	arr[3] = 40; 

	int arr1[] = new int[10]; 
	// copy all the elements of arr -> arr1
	arr[4] = 50; 
	// rename arr1 -> arr 
```

- Queue 
- Set
  - HashSet - store first strategy  
  - TreeSet - in sorted order - retrive first strategy 


-- before overriding hashcode / equals 
Laptop [laptopId=102, laptopName=Dell -Yoga, laptopPrice=2200.0], Stored @ 1705929636
Laptop [laptopId=102, laptopName=Dell -Yoga, laptopPrice=2200.0], Stored @ 1297685781
Laptop [laptopId=101, laptopName=Apple MacBookPro, laptopPrice=2000.0], Stored @ 511833308

- after overriding hashcode 
Laptop [laptopId=101, laptopName=Apple MacBookPro, laptopPrice=2000.0], Stored @ 65
Laptop [laptopId=102, laptopName=Dell -Yoga, laptopPrice=2200.0], Stored @ 68
Laptop [laptopId=102, laptopName=Dell -Yoga, laptopPrice=2200.0], Stored @ 68

- after overriding hashcode / equals 
Laptop [laptopId=101, laptopName=Apple MacBookPro, laptopPrice=2000.0], Stored @ 65
Laptop [laptopId=102, laptopName=Dell -Yoga, laptopPrice=2200.0], Stored @ 68


- OLTP - Online Transaction Processing  
- OLAP - Online Analytical Processing - Informatica, Tableu, BI Report, PowerBI etc... 

- Map 

```
- <K, V> -> Map<String, Account>, Map<String, Integer>, Map<String, List<String>>

```


# Day 8 - 28-Jan-2022


## MULTI THREADING AND PARALLEL COMPUTE	
- Concurrency API For java 
- Executors Framework 
- Lambda and threads 
- Futures and Callable , Completable




## Intrim Demo  - Deliverables
1. create a CLI application which shall have the complete application (TMS) running with the DBMS 
2. Expose to have test driven development approach 
3. Write unit test cases for the code written coverage should be min 60% - SonarQube 
4. The application shall have error handling mechanism (should use explicit errors) 
5. Application should be deployed with CI/CD - Jenkins 
6. application building should be done using Maven 
7. Java doc to be generated 
   1. // single line 
   2. /*  multi line */ 
   3. /** java doc */ 
   4. /Applications/Eclipse.app/Contents/Eclipse/plugins/org.eclipse.justj.openjdk.hotspot.jre.full.macosx.x86_64_15.0.2.v20210201-0955/jre/bin/javadoc
8. Plant UML 
9.  multithreading to be shown atleast 1 use case (with executor prefer) + syncronizers
10. Create a jar file and import 
11. Use of loggers - slf4j (logback / log4j)

- app 
  - src/main 
    - com.impl
      - shall have only main 
    - com.beans
      - shall have all beans also called as re-usable component 
    - com.service
      - all validation code shall go here 
    - com.controller 
      - will talk to file / db 
    - com.exception 
      - create all you custom exception's here 
    - com.util
      - accept number 
```
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	System.out.println("Enter Your Name" ); 
	String name = br.readLine();
	// start processing 


	class ReadUserData{
		static BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
	
		public static String getStringValue(String title) {
			System.out.println("Enter " + title); 
			return br.readLine();
		}

		public static Integer getStringValue(String title) throws InvalidNumberException{
			System.out.println("Enter " + title); 
			return Integer.parseInt(br.readLine());
		}
	}

	class Impl {
		void hi() {
			String userName = ReadUserData.getStringValue("Name");
		}
	}

```


```
- Map<String, String>
- Map<String , List<String>>
- Map<String, Map<String, List<String>>>
```

-- threads 
- 300000000000 person invoking it -> 2nd person have to wait for 24 ms, 3rd person have to wait for 48ms 
- Aging - piling up, each person in the queue starts looking for opportunity 
```
	main() {	- 5ms 
		hi(); 
	}
	hi(){ - 7ms 
		hello();
	}

	hello(){- 10 ms 
	.. 
		cya();
		... 
	}
	cya(){ - 2 ms 
		// some BL 
	}
```

- 2.4 ghz - 2400000000 * 4
1. synchrounous
2. Asynchronous
3. Reactive 
4. 



# Day 9 


# Teams 

- Satyaa, Mohit, Anurag - Chethan   - t1  - will show intrim demo today 
- Gaurav, Chethan - Adil - t2 - bean classes are created 
- Adil, Sumanth - Ayushi -t3 - need to work nothing much to show 
- Ayushi, Yashika - Ritu  - t4 - sent pull req, menu driven part is done, bean classes are completed 
- Ritu, Ashish - Vibhanshu - t5 - bean classes are done, reg, login is done, there are some changed, PR Raised 
- Vibhansu , Ojasvi - Sumedh - t6 - maven project is created, basic navigation functionality, need to create bean classes 
- Sumedh, Yuvraj - Gurpreet - t7 - there 
- Gurpreet, Kushal - Nischal - t8 - bean classes are created, login part 
- Nischal, Priya - Rahul - t9 - could not show much 
- Rahul, Sangita - Pulkit - t10 - created maven project, employee module added, completed main file, wokring on login module 
- Sneha, Pulkit - Roshini - t11 - its is still at conceptual leve 
- Roshini, Manshu - Satyaa - t12 - working on bean classes, and has exam's 


- Lambda 

- x -> x * x -> y -> y * y 
- (int x, int y) -> {return x +y ;}

- any interface which has exactly 1 instance method then that interface is called as funcational interface 

```
	interface Consumer <T> {
		void accept(T t);
	}

	interface Predicate<T> {
		boolean test(T t);
	}


	Consumer c = new Customer(){
		void accept(T t){
			// your implemenation goes here 
		}
	}


	Consumer  c = (t) -> {}
```



# Day 10 

STREAMS AND CONCURRENCY	
- Introduction on Streams
- Map, List, Set 
- Filter 
- Sorted
- Collect 
- for Each
- reduce
	- Parallel Computing using Streams.
	- New String methods
	- New File Methods 
	- HTTP Client in Java 11


-- with map 
trainer.ser
target
pom.xml
.classpath
project
.settings
.project
trainer.txt
src


-- without map 
./trainer.ser
./target
./pom.xml
./.classpath
./project
./.settings
./.project
./trainer.txt
./src


-- 
Create a list of Trainers 
	tId, tName, tSalary 
	using stream display only tName in upper case 


-- 
> select * from emp; 

> select empname, salary from emp; 

> select empname, salary from emp where empsalary > 3000; 

> select empname, salary from emp where empsalary > 3000 and city = 'blr'; 


> select city, count(*), sum(salary), min(salary), max(salary), avg(salary)
	 from emp where empsalary > 3000 and city = 'blr' 
	 group by city; 

- TODO 
- Product 
	- name, qty, price 

1. for the name get the sum of qty 
2. Group by qty / price 
{
	3=[Product [name=keyboard, qty=3, price=78.0]], 
	23=[Product [name=laptop, qty=23, price=1200.0]], 
	56=[Product [name=mouse, qty=56, price=9.0]], 
	10=[
		Product [name=laptop, qty=10, price=1500.0], 
		Product [name=mouse, qty=10, price=45.0], 
		Product [name=adapter, qty=10, price=65.0]
	]
}

3. by any chance if there are repeated product then only unique to be stored 


{65.0=[adapter], 9.0=[mouse], 1200.0=[laptop], 78.0=[keyboard], 45.0=[mouse], 1500.0=[laptop]}

3. by any chance if there are repeated product then only unique to be stored only qty 



# Day 11 
-- 

- Satyaa, Mohit, Anurag - Chethan   - t1  - will show intrim demo today, 
	- not much progrees need to work on IO  
- Gaurav, Chethan - Adil - t2 - bean classes are created 
	- not much progress 
- Adil, Sumanth - Ayushi -t3 - need to work nothing much to show 
	- No Progress 
- Ayushi, Yashika - Ritu  - t4 - sent pull req, menu driven part is done, bean classes are completed 
	- registration, employee registration is done 
	- code is not push still 
	- has raised the PR 
- Ritu, Ashish - Vibhanshu - t5 - bean classes are done, reg, login is done, there are some changed, PR Raised 
	- View profile employee and trainer 
	- registration is completed 
	- validation is pending 
- Vibhansu , Ojasvi - Sumedh - t6 
	- maven project is created, basic navigation functionality, need to create bean classes 
	- not much progress from yesterday - vibhanshu was off 
- Sumedh, Yuvraj - Gurpreet - t7 - 
	- new code PR is not raise still 
- Gurpreet, Kushal - Nischal - t8 
	- bean classes are created, login part 
	- working on login part 
	- have got some code errors and working 
- Nischal, Priya - Rahul - t9 
	- could not show much 
	- reg part is done 
	- working on login part 
	- some code problem to validate the data from the file 
- Rahul, Sangita - Pulkit - t10 
	- created maven project, employee module added, completed main file, wokring on login module 
	- working on refractoring 
	- working on employee login 
	- need to raise the PR 
- Sneha, Pulkit - Roshini - t11 - its is still at conceptual leve 
	- not present 
- Roshini, Manshu - Satyaa - t12 
	- working on bean classes, and has exam's 
	- not much progress due to exams 
	- has exams till 5th feb 




## topics 
- HTTP Client in Java 11



- JDBC and ORM (Hibernate)	
- JDBC Architecture
- Connection
- Statement, PreparedStatement & CallableStatement
- ResultSet
- Difficulties in JDBC
- Overview of ORM
- Hibernate basics
- Hibernate setup
- CRUD operations


## jdbc working 

>  create database sapientdb;

> use sapientdb; 

> create table employee(
	empid int primary key, 
	empname varchar(30), 
	empsal decimal(9,2), 
	empemail varchar(50)
	); 

> show tables; 

> desc employee;





Statement -> only for sql statement 
PreapredStatement -> statement + batch updates 
CallableStatement -> preparedstatement + invokes functions / procedures 

- arrays starts from 0 
- positional paramener starts from 1 
- result set starts from -1 


-- hibernate 

```
	@Entity 
	class Employee{}
	Employee emp = new Employee(); - life span is only with in java 
```


```
<?xml version='1.0' encoding='utf-8'?>
<!DOCTYPE hibernate-configuration PUBLIC
        "-//Hibernate/Hibernate Configuration DTD 3.0//EN"
        "http://hibernate.sourceforge.net/hibernate-configuration-3.0.dtd">

<hibernate-configuration>

    <session-factory>

        <!-- Database connection settings -->
        <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>
        <property name="connection.url">jdbc:mysql://localhost/navdb</property>
        <property name="connection.username">root</property>
        <property name="connection.password">kanchan@1</property>

        <!-- JDBC connection pool (use the built-in) -->
        <property name="connection.pool_size">2</property>

        <!-- SQL dialect --> 
        <property name="hibernate.dialect">org.hibernate.dialect.MySQL8Dialect</property>

        <!-- Enable Hibernate's current session context -->
        <property name="current_session_context_class">thread</property>

        <!-- Disable the second-level cache  -->
        <property name="cache.provider_class">org.hibernate.cache.NoCacheProvider</property>

        <!-- Echo all executed SQL to stdout -->
        <property name="show_sql">true</property>

        <!-- Drop and re-create the database schema on startup -->
        <property name="hbm2ddl.auto">create</property>
     

     
    </session-factory>

</hibernate-configuration>
```



# Day 12

-   Hibernate basics
- Hibernate setup
- CRUD operations
- Association mapping 
- 1:N, N:1, 1:1, N:M Querying
- Inheritance 
- Criteria / HQL 


- confirugation 
	- hibernate.cfg.xml 

- for selecting the record in hibernate 
	- Criteria  - POJO 
	- hql 
	- native (sql)	

- in Data base we have constrains 
	- name 
	- not null 
	- uniue 
	- min val and max val etc 



# Day 13 


DESIGN PATTERNS	 
- Functional Programming Design principles 
- Immutability v/s Mutable 
- Disciplined state
- Pure functions and no side effects/disciplined states
- First class functions and high order functions
- Type systems
- Referential transparency
- Patterns in java for the functional Programmer 

-  [x] Factory method pattern
-  [x] Abstract Factory method pattern - TODO 
- Template method pattern
- [x] Builder pattern
- [x] Singleton
- [x] Chain of responsibility pattern
- [x] Command Pattern


-  programming started 
	- 197x - Cobol IBM 
	- 1972 - Unix, C 
	- 1980 - C++ OOPS 
	- 1993 - Java 
	- 1995 - GOF 

```
// singleton 
class Company {
	////
}

Employee emp = new Employee(); 
emp.setEmpId(101); 
emp.setEmpName("Nischal")
... 
emp.setLocation("Blr"); 
emp.setLicence("some licence"); 
emp.setCompany(company); 
.... 


Employee emp1 = emp.clone();
emp1.setCompany(company); 


- composite pattern 

class Employee {
	private int empId; 
	private String empName; 
	private List<Employees> manages; 

}


DispatcherServlet 

```


- Singleton
	- for the class you can have only 1 instance 
	- Eager 
	- Lazy 

-  factory dp 
```
	enum Cars {
			MARUTI, MERCEDES, HYUNDAI 
	}
	class Car {
		public static getCar(Cars car){
			if(car.equlas(Cars.MARUTI)) {
				return new Maruti();
			} else if(car.equals(Cars.MERCEDES)){
				return new Mercdes();
			}else if(car.equals(Cars.HYUNDAI)){
				return new Hyundai();
			}
			return null; 
		}
	}
	class Maruti {
		 Maruti(){
			// constructin maruti 
		}
		public void bl() {}
	}
	class Mercedes{
		 Mercedes(){
			// constructin maruti 
		}
		public void bl() {}
	}
	class Hyundai{
		 Hundai(){
			// constructin maruti 
		}
		public void bl() {}
	}
	... 

	implementation 
	
	Car car = Car.getCar(Cars.MARUTI); 
	car = Car.getCar(Cars.MERCEDES); 

```



-  Builder pattern
- select empname, empsal, empemail 
	from employee 
	where empsal > 3000 
	and empcity ='blr' 
	or empdesign in ('mgr', 'tl');


- Referential transparency


```
	x = 10; 
	x = x+1; 
	x = x+1; 

	class Hi {
		main(){
			yy = doSomething(10)
		}
		public int doSomething(final int x) {
			return x +1; 
		}
	}
```

- Abstract Factory Design pattern 
- Stratergy  Design Pattern 




# Day 14 



- Satyaa, Mohit, Anurag - Chethan   - t1  - will show intrim demo today, 
	- not much progrees need to work on IO  
	- TOC part is left 
	- hibernate is not done because of assessment - anurag 
	- 
- Gaurav, Chethan - Adil - t2 - bean classes are created 
	- not much progress 
	- reg, login  of emp and trainer 
	- working on dashboard 
	- still have not incorportated hibernate 
	- custom excpetions are handled 

- Adil, Sumanth - Ayushi -t3 - need to work nothing much to show 
	- No Progress 
	- employee, trainer and dashboard is done 
	- have not connected with hibernate 
	- no pr is raised 

- Ayushi, Yashika - Ritu  - t4 - sent pull req, menu driven part is done, bean classes are completed 
	- registration, employee registration is done 
	- code is not push still 
	- has raised the PR 
	- app working with hibernate 
	- login and reg module is done 
	- working on TOC module 
	- need to raise PR 
- Ritu, Ashish - Vibhanshu - t5 - bean classes are done, reg, login is done, there are some changed, PR Raised 
	- View profile employee and trainer 
	- registration is completed 
	- validation is pending 
	- app with hibernate 
	- working on dashboard 
	- trainer and emp profile can be viewed 
	- PR not raise 
- Vibhansu , Ojasvi - Sumedh - t6 
	- maven project is created, basic navigation functionality, need to create bean classes 
	- not much progress from yesterday - vibhanshu was off 
	- completed with login and reg (emp, trainer)
	- error with hibernate integration 
	- working on dashboard 
	- PR is raised 
- Sumedh, Yuvraj - Gurpreet - t7 - 
	- new code PR is not raise still 
	- trainer reg with hibernate 
	- error while auth 
	- yuvraj working on emp part with hibernate 
	- PR is not raised 
- Gurpreet, Kushal - Nischal - t8 
	- bean classes are created, login part 
	- working on login part 
	- have got some code errors and working 
	- working on hibernate part 
	- working on reg emp and trainer 
	- in login there is some error 
	- PR not raised 
- Nischal, Priya - Rahul - t9 
	- could not show much 
	- reg part is done 
	- working on login part 
	- some code problem to validate the data from the file 
	- trainer login and registeration is done 
	- working on hibernate 
	- some fixes to be done in hibernate 
	- PR is not raised 
- Rahul, Sangita - Pulkit - t10 
	- created maven project, employee module added, completed main file, wokring on login module 
	- working on refractoring 
	- working on employee login 
	- need to raise the PR 
	- emp and trainer reg is done 
	- working with TOC of trainer 
	- raised PR 
- Sneha, Pulkit - Roshini - t11 - its is still at conceptual leve 
	- not present 
	- done with trainer and emp registration 
	- and working with hibernate + dashboard 
	- PR is not raised 
- Roshini, Manshu - Satyaa - t12 
	- working on bean classes, and has exam's 
	- not much progress due to exams 
	- has exams till 5th feb 
	- login and reg is done 
	- working on fixes 
	- need to work on hibernate part 



UNIT TESTING AND BEHAVIOR DRIVEN DEVELOPMENT	
- Junit (Unit & Integration)
- BDD (Cucumber)



- junit 4 
	>  Annotation 

```
	@Test - which will execute the test case 
	@Before - which shall execute before each test case (n test case n number time it is invoked)
	@After - will exeucte after each test case (n test case n number time it is invoked)
	@BeforeClass - this is a static mehtod and shall be executed only once for entire class 
	@AfterClass - will shall be executed only once after all test cases / class 
```


- junit 5 

- BDD  - Behaviour Driven Development 
- most times by non technical guys 

```
	1. 
		As a Trainer 
		I want to login to system 
		So that i can update my profile 

		As a Trainer 
		I want to login to system 
		So that i can create a toc 

		As a User 
		I Want to register 
		So that i can login 

	2. Given When Then But And 

	Given the application is loaded on the site http://localhost:8080 
	When the user clicks on the register button on top right corner 
	And enters valid username and password 
	Then clicks on "submit" button 
	And the user is validated 
	Then the user is taken to home page / dashboard 


	Given the application is loaded on the site http://localhost:8080 
	When the user clicks on the register button on top right corner 
	And enters invalid username (less than 6 chars ) and password 
	Then clicks on "submit" button 
	And the user is validated 
	Then the user is shown with error message 
```

```

? - 0 or 1 
* - o or more 
+ - 1 or more 
```

Tomorrow 
MOCKING	
- Mocks, Stubs  
- Using Mock Effectively and Test Suites
- Metrics and Code Coverage and Unit Testing
- Code smells and refactoring
- Test Data and Best Practices
- Tooling Support
- Virtualization and mock servers"
- log4j, logback - Naveen 
- SonarQube setup 



# Day 15 


- Scope of the project (Technical) 
	- the application should be working with Eclipse 
	- Error Managment to be taken care, and there is no abrupt exit 
	- Layered Approach App -> Service+(Validation) -> Controller (dao)-> Hibernate -> DB 
	- junit Test cases to be written for service 
	- Code quality with sonar qube to be show cased 
	- Use Loggers where ever application, especially in exception 
	- Merging strategy should be shown cleanly 
	- connecting jira with bitbucket 

- Scope of the project (Business) 
	- Registration of Trainer and employee 
	- Login of Trainer and employee 
	- The application shall show dashboard for each type of user 
	- Updating profile of Trainer / Employee 
	- Trainer should be able to create TOC (Optional)

- Good to have 
	- Application should be deployed with jenkins 
	- Sequence Diagram 


<br>



- Satyaa, Mohit, Anurag - Chethan   - t1  - will show intrim demo today, 
	- not much progrees need to work on IO  
	- TOC part is left 
	- hibernate is not done because of assessment - anurag 
	- 
- Gaurav, Chethan - Adil - t2 - bean classes are created 
	- not much progress 
	- reg, login  of emp and trainer 
	- working on dashboard 
	- still have not incorportated hibernate 
	- custom excpetions are handled 

- Adil, Sumanth - Ayushi -t3 - need to work nothing much to show 
	- No Progress 
	- employee, trainer and dashboard is done 
	- have not connected with hibernate 
	- no pr is raised 

- Ayushi, Yashika - Ritu  - t4 - sent pull req, menu driven part is done, bean classes are completed 
	- registration, employee registration is done 
	- code is not push still 
	- has raised the PR 
	- app working with hibernate 
	- login and reg module is done 
	- working on TOC module 
	- need to raise PR 
- Ritu, Ashish - Vibhanshu - t5 - bean classes are done, reg, login is done, there are some changed, PR Raised 
	- View profile employee and trainer 
	- registration is completed 
	- validation is pending 
	- app with hibernate 
	- working on dashboard 
	- trainer and emp profile can be viewed 
	- PR not raise 
- Vibhansu , Ojasvi - Sumedh - t6 
	- maven project is created, basic navigation functionality, need to create bean classes 
	- not much progress from yesterday - vibhanshu was off 
	- completed with login and reg (emp, trainer)
	- error with hibernate integration 
	- working on dashboard 
	- PR is raised 
- Sumedh, Yuvraj - Gurpreet - t7 - 
	- new code PR is not raise still 
	- trainer reg with hibernate 
	- error while auth 
	- yuvraj working on emp part with hibernate 
	- PR is not raised 
	- login return's null object while fetching from DB 
- Gurpreet, Kushal - Nischal - t8 
	- bean classes are created, login part 
	- working on login part 
	- have got some code errors and working 
	- working on hibernate part 
	- working on reg emp and trainer 
	- in login there is some error 
	- PR not raised 
- Nischal, Priya - Rahul - t9 
	- could not show much 
	- reg part is done 
	- working on login part 
	- some code problem to validate the data from the file 
	- trainer login and registeration is done 
	- working on hibernate 
	- some fixes to be done in hibernate 
	- PR is not raised 
- Rahul, Sangita - Pulkit - t10 
	- created maven project, employee module added, completed main file, wokring on login module 
	- working on refractoring 
	- working on employee login 
	- need to raise the PR 
	- emp and trainer reg is done 
	- working with TOC of trainer 
	- raised PR 
- Sneha, Pulkit - Roshini - t11 - its is still at conceptual leve 
	- not present 
	- done with trainer and emp registration 
	- and working with hibernate + dashboard 
	- PR is not raised 
- Roshini, Manshu - Satyaa - t12 
	- working on bean classes, and has exam's 
	- not much progress due to exams 
	- has exams till 5th feb 
	- login and reg is done 
	- working on fixes 
	- need to work on hibernate part 





MOCKING	
- Mocks, Stubs  
- Using Mock Effectively and Test Suites
- Metrics and Code Coverage and Unit Testing
- Code smells and refactoring
- Test Data and Best Practices
- Tooling Support
- Virtualization and mock servers"
- log4j, logback - Naveen 
- SonarQube setup 
- sequence diagram 


```
	public class Hello {
		psvm(String [] args) {
			// BL 
			// bl 

			System.out.println("testing"); 
			try {

			}catch(Exception e){
				System.out.println(e); -> file (BW) -> db 
			}
		}

	}
```

- Loggers 
	- Log4j
	- Logback 
	- Logger - java.util 



- Sonar Details 

> sapient-project: 01d7422c5fd06e43200df280d24f5d8aac5db158	

```

> mvn clean sonar:sonar -Dsonar.projectKey=java-interns-works   -Dsonar.host.url=http://localhost:9000  -Dsonar.login=01d7422c5fd06e43200df280d24f5d8aac5db158 -Dsonar.java.binaries=target
  
> mvn clean sonar:sonar -Dsonar.projectKey=java-interns-works   -Dsonar.host.url=http://localhost:9000  -Dsonar.login=01d7422c5fd06e43200df280d24f5d8aac5db158  
  
```


- first publish the report and jacoco exec file 
>  mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install site 

> mvn sonar:sonar 


```
	interface List {
		public boolean add(Employee e); 
	}

	class EmployeeList implements List {
		public boolean add(Employee e) {
			// some implementation -> mysql, oralce, db2 .... 
		}
	}

	EmployeeList list= new EmployeeList();
	list.add(new Employee()); 


	// this is something i want to test 
	interface List {
		public boolean add(Employee e); 
	}

	mockito give me a proxy 

```



public interface IEmployeeService {
	
	public boolean login(String userEmail, String userPassword) throws Exception;
	
	public Employee employeeHomePage(Employee employee); 
	
	public void displayEmployeeInformation(Employee employee);
	
	public boolean registerEmployee(Employee employee);
}





# Day 16 

+ Will show list of jira stories 

- Satyaa, Mohit, Anurag - Chethan   - t1   
	- custom error to be created 
	- need to write more test cases 
	- need to incorporate sonarqube 
	- 
- Gaurav, Chethan - Adil - t2  
	- write test cases 
	- need to incorporate logger 
	- some part of hibernate 
	- integrate sonarqube 
	- 
- Adil, Sumanth - Ayushi -t3  
	- need to do exception handling 
	- need to write junit 
	- code quality with sonar 
	- branching strategy is not clear 

- Ayushi, Yashika - Ritu  - t4  
	- need to write junit 
	- exception handling 
	- BL - dashboard 

- Ritu, Ashish - Vibhanshu - t5  
	- need to write junit 
	- loggers to be done 
	- code merge pr
	- exception hadling few are left 
- Vibhansu , Ojasvi - Sumedh - t6 
	- sonar qube, loggers to be done 
	- some part of code merge 
	- exception handling 
	- update profile for logged in user 
- Sumedh, Yuvraj - Gurpreet - t7 - 
	-  sonarqube logger custom exception few are left 
	- PR - merge 
- Gurpreet, Kushal - Nischal - t8 
	- junit, sonar, loggers, exception handling + some validation 

- Nischal, Priya - Rahul - t9 
	-  junit, sonar, loggers, exception handling + some validation 
- Rahul, Sangita - Pulkit - t10 
	- junit, sonar, loggers, exception handling + some validation + update trainer profile 
	- 
- Sneha, Pulkit - Roshini - t11  
 - junit, sonar, loggers, some part of dashboard BL 

- Roshini, Manshu - Satyaa - t12 
	- junit, sonar, loggers,	 some part of dashboard BL + hibernate 







logger.error- try{}catch(){error }
logger.warn - Enter a number 1a 
logger.info - 
logger.fatal - 
logger.trace 
off
All

9:10 
- We will be in zoom breakout room 
- Raise PR - which is the main 
- all scrum master look at the PR 10 min 
- we will fix the gap 
- scrum master by 2:00 PM today do a dry run 
-  by 2:30  no work, 


Order 
- T1 
- T2
- T3
..... 
- T12 


# Day 17 


INSTRUMENTATION, LOGGING, TOOLS DEBUGGING 
AND TROUBLESHOOTING"	"•	Troubleshooting
•	Load and CPU Usage 
•	Basics of Thread dumps 
•	Heap and other metrics 
•	Log and Log file understanding (log4j2)
•	Connection and Network Troubleshooting Basics 
•	Instrumentations, Micro meter and JMX Basics (jconsole + jvisual), visual VM 
•	Monitoring Java applications 
•	Checklist on trouble shooting

```
	int x =100; 
	boolean b; 
```

System.gc();
System.getRuntime().gc(); 
Graphana (UI) -> Prometheus 



## Spring	

- Overview of Spring framework
- IOC and DI
- Wiring - Manual (xml) and Auto(Annotation)
- Autowired 
- Component



Employee e = new Employee();
 
- management the object e 
- or taking care of life cycele 
- 1998 - EJB (EMB, SMB, BMC)
	- Glassfish (Oralce)
	- jboss(REDHAD)
	- weblogic(ORACL)
	- web sphere (IBM)
- struts (1.x, 2.x )
- IOC / DI 


> 2nd version project 
- 4 team size  



> sample xml file for spring 
```
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xsi:schemaLocation="http://www.springframework.org/schema/beans 
	   http://www.springframework.org/schema/beans/spring-beans.xsd">
</beans>

```

- Assignment - how autowire can be implemented with annotation  
	- Manufacturing Mobile 
		- Camera
			- type -> vga, x mp 
		- Display 
			- amloed, super amloed, ips 
		- Battery 
			- lithim, hydrogen 
		- Processor
			- type 
			- core 
				- amd, intel... 


- Mobile mobile = context.getBean("mobile", Mobile.class); 

- BeanPostProcessor 






- Version 2 Teams 

- Team 1 - Yashika, Gaurav, Chetan, Manshu, Sumanth 
- Team 2 - Ayushi, Sumedh, Ojasvi, Sangita, Priya 
- Team 3 - Satya, Ashish, Kushal, Yuvraj, Adil 
- Team 4 - Vibhanshu, Rahul, Ritu, Pulkit , Roshini 
- Team 5 - Nischal, Gurpreet, Sneha, Mohit, Anurag 


S D E T  
30 % programming 
70% other things 




> git clone https://tools.publicis.sapient.com/bitbucket/scm/batch/team-1.git

> git branch -a 

> git checkout naveen-test 

> continue your coding 

> git ci -m "BATCH-144: updated code for"

> git push origin naveen-test 


- Maven project 
- Build it with jenkins 
- new repoisotiry for version 2 application 

<br>

# Day 18 

<br>



Web / MVC	

- Web basics
- Understanding HTTP protocol
- Java Servlet API
- Handling HTTP requests
- JavaServer Pages
- MVC pattern


- CGI - Dynamic Content 
	- native progroam langaugel 
- HTTP 
	- 1.0 - Statefull protocol 
	- 1.1 - Stateless protocol 
		- session 
		- pull 
	- 2.0 
		- no session 
		- push 
		- full duplex communication 
- servlets
	- 1.1 - Stateless protocol 
		- session 
		- pull 



- GET - www.sumedh.com/articles/this-is-new-topic.html 
	- Sneha 
	- Mohit 
	.... 
- POST - www.sumedh.com/login 


http://localhost:8080/web-works/hello

```
	- Mapping 

	<servlet>
		<servlet-name>hello</servlet-name>
		<servlet-class>com.naveen.HelloWorldController</servlet-class>
	</servlet>

	<servlet-mapping>
		<servlet-name>hello</servlet-name>
		<url-pattern>/hello</url-pattern>
	</servlet-mapping>
```


Codes to Rememter 
1XX - 100, 101
2xx - 200, 201
3xx - 307 
4xx - 404, 405, 403 
5xx - 501, 500



- JSP - Java Server Pages 
- Servlet - is a class you can have html code / JSP - is html kind of file where you can have java snippets 
- <%... %> - Java Snippets 
- <%! .. %> - declaration 
- <%@ ... %> directives - imports 
- <%= ... %> - expressions - variable declaration 


<br>

# Day 19 

<br>


Spring MVC	
- Spring MVC architecture
- DispatcherServlet
- HandlerMapping
- Controllers and request handlers
- ViewResolver
- Handling GET and POST requests 




```
	- Controller 
		- client data request (req, res)
		- @WebServlet("/")
		- request.getParameter("city"); 
	- Model 
		- POJO, WORM, DAO+Service+
	- View 
		- GUI (HTML/JS/CSS)
```

- Project Structure 
- web-application 
	- WEB-INF
		- web.xml 
		- pages 
			- .jsp 



> end-user -> Invokes the application -> web.xml -> finds and loads index.jsp -> page is displayed 
> end-user -> web.xml -> DispatcherServlet -> shall take all the requests (/) -> understands the URI -> Contrller (@Controller) -> return String 
		-> View Resolver -> shall call the view -> /WEB-INF/pages/hello.jsp 

> end-user -> web.xml -> DS (/) ->  Controller (Give me a form + Template Model) -> for the bean to be filled and  to be sent to server 


http://localhost:8080/spring-application/hello-mvc 

- Version 2 Teams 

- Team 1 - Yashika, Gaurav, Chetan, Manshu, Sumanth 
- Team 2 - Ayushi, Sumedh, Ojasvi, Sangita, Priya 
- Team 3 - Satya, Ashish, Kushal, Yuvraj, Adil 
- Team 4 - Vibhanshu, Rahul, Ritu, Pulkit , Roshini 
- Team 5 - Nischal, Gurpreet, Sneha, Mohit, Anurag 



# Day 20 

Spring boot	

Spring boot - what, why and how
Creating REST endpoints
Best practices to be followed
Spring boot and MongoDB
CRUD operations via REST API


- Orchestration tools 
	- Kubernetees
	- Rancher
	- Docker Swarm 


- In Memory DB's 
	- Redis 
	- MemCache 



- Rest 
	- Representation Style 


- RESTLET 
- REST EASY 
- JERSEY 
- SpringBoot 


- Web Server
	- Tomcat (Default)
	- Jetty - Light Server For Java 
	- Netty - Reactive Server
	- Application Server 
		- Web Logic 
		- Web Sphere 
		- Jboss 
		- glassfish 


## Spring Boot project 
>  https://start.spring.io/#!type=maven-project&language=java&platformVersion=2.6.3&packaging=jar&jvmVersion=11&groupId=com.naveen&artifactId=rest-works&name=rest-works&description=Demo%20project%20for%20Spring%20Boot&packageName=com.naveen.rest.works&dependencies=web,data-mongodb,devtools,lombok



# Day 21 
- DBMS 
	- storage is atomic 
	- ACID 
- DB 
	- java object 
	- No Concept of ACID 
	- json 
	- MongoDB, Dynamodb, redis, mem cahce, cauch db, cockroach, ... 
```
WS - DOM / SAX / StAX 

<?xml version="1.0"?>

<employees>
	<employee id="101">
		<name>
			<firstName>Sneha</firstName>
			<lastName>Banda</lastName>
		</name>

		<address>
			<hno>111</hno>
			<street>American Dream Blvd</street>
			<city>Reston</city>
			<state>Virginia</state>
			<country>USA</country>
		</address>

	</employee>
</employees>


RS - JSON - 2005 W3C Accepted this -> JS, 
{
	"employees":[
		{
			"id":"101", 
			"name":{
				"firstName":"Sneha", 
				"lastName":"Banda"
			}, 
			"address":{
				"address":111, 
				"street":"American Dream Blvd", 
				"city":"Reston", 
				"state":"Virginia",
				"country":"USA"
			}
		},{
			"id":"102", 
			"name":{
				"firstName":"Satyaa", 
				"lastName":"Goyal"
			}
		}, {},{}	
	]
}

employees.address.hno=111
```




9200 RPM - HDD 
1.33 x 2 mhz 

2.4ghz 


- starting mongodb 

- create a folder 
- open terminal in that folder 
- mongo --dbpath . <enter>
- open another terminal anywhere 
- mongo <enter>


- save - will look for the ID if the ID is matching then it updates if not it insertes (UPSPERT)
- insert - will just insert 




{
  "timestamp": "2022-02-16T06:15:41.676+00:00",
  "status": 500,
  "error": "Internal Server Error",
  "trace": "trace goes here",
  "message": "No message available",
  "path": "/user/106"
}


{
	"message":"your message", 
	"details":"details", 
	"date":"date/time"
}


- complete the methods 
- actuator -> HAL Browser 






- Team 1 - Yashika, Gaurav, Chetan, Manshu, Sumanth 
- Team 2 - Ayushi, Sumedh, Ojasvi, Sangita, Priya 
- Team 3 - Satya, Ashish, Kushal, Yuvraj, Adil 
- Team 4 - Vibhanshu, Rahul, Ritu, Pulkit , Roshini 
- Team 5 - Nischal, Gurpreet, Sneha, Mohit, Anurag 

- trainer registration 
{
	"trainer-name":String, 
	"years-of-exp":Integer, 
	"technologies":[
		{
			"name":String, 
			"years-of-exp":Integer, 
			"expert-handle":enum(Freshers/Laterals/Consultancy)
		}
	]
}