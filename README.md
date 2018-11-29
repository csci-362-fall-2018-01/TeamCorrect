# TeamCorrect
The GitHub repo for TeamCorrect CSCI 362 Project

# Team Members
Daniel Lee, Hannah Posch, Alex Thropp, Daniel Baczmaga

# Project Description
This repository contains test materials for the project Glucosio. We have built a test script, runAllTests.sh, that automates the testing of the Glucosio system.

# Requirements
Ubuntu, Clone of Team Correct Repository, Java

# Instructions to run tests
1) Open Terminal
2) git clone https://github.com/csci-362-fall-2018-01/TeamCorrect
3) cd TeamCorrect/TestAutomation/scripts 
4) ./runAllTests.sh | sh runAllTests.sh | bash runAllTests.sh
5) Output will be stored in an html file which should open automatically in the default browser.

*If any of the above commands return permission denied, use 'sudo' in front of the command.

*If the ./runAllTests.sh returns command not found, use 'sudo chmod 755 runAllTests.sh', then './runAllTests.sh'

# Instructions to add tests
1) Add testCaseXX.txt to the folder /TestAutomation/testCases
2) Add testCaseXX.java to the folder /testCasesExecutables/org/glucosio/android/TeamCorrectTestExecutables
3) Add XXXXXX.java (java file to test) to the folder /testCasesExecutables/org/glucosio/android/TeamCorrectTestExecutables
4) Add "package org.glucosio.android.TeamCorrectTestExecutables;" to both java files
5) Add any relevant input to TestCasesInput.txt (found in /testCasesExecutables/org/glucosio/android/TeamCorrectTestExecutables)
6) Add a input file reader to testCaseXX.java (examples of string, double and int type input file readers in other testCaseXX.java files)
7) Open terminal and follow instructions to run tests as written above.

# Testing Framework Architecture
/TestAutomation

    /project (Holds Glucosio repository)
    
        /glucosio-android-develop
        
    /scripts
    
        runAllTests.sh
        
    /testCases
    
        testCase01.txt
        
        testCase02.txt
        
        ...
        
    /testCasesExecutables 
    
        /TeamCorrectTestExecutables
    
            testCase01.java
        
            testCase02.java
        
            ...
            
            TestCasesInput.txt
           
        /TeamCorrectFaultInjection
        
            testCase10.java
            
            ...
    
    /temp
    
    /oracles
    
    /docs
    
      README.md
      
    /reports
    
        testResults.html
 
# List of CS 362 Deliverables
# Deliverable #1
This deliverable contains our test results from the Glucosio project we are working with.

Files:
[team-correct]_deliverable1.pdf

# myList script
The script  lists the top-level directory contents of its containing directory in an html file displayed in a browser.

Files:
myList.sh,
directory.html

# Deliverable #2
This deliverable contains our test plan and test cases for Glucosio.

Files:
[team-correct]_deliverable2.pdf

# Deliverable #3
This deliverable contains our testing framework and 5 of 25 test cases to run.

Files:
[team-correct]_deliverable3.pdf

# Deliverable #4
This deliverable contains our updated testing framework and 25 test cases to run.

Files:
[team-correct]_deliverable4.pdf

# Deliverable #5
This deliverable contains our 5 fault injections.

Files:
[team-correct]_deliverable5.pdf

# Deliverable #6
This deliverable contains our final report.

Files:
[team-correct]_finalReport.pdf
