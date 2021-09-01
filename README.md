To Run test from terminal:
Requirements for running tests (Java 9 version, Selenium ,Webdrivermanager, TestNg)
To change Operating System  
On Configuration properties file change browser = (Select any Driver On Driver Utilities class) 
mvn clean compile test -q

clean - will delete targer folder. in target folder, you will find reports, compiled
         classes and project jar file.
compile - will check any code error

test   - if maven is installed on computer it will run the test other option 
Run from maven options select test on Lifecycle

-q     - quite, to reduce output from maven in console.
