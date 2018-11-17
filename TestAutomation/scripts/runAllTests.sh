#!/bin/bash
#^ Should always be at top of file
#Team Correct Script
#Members: Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga
#runAllTests.sh

#If you get an error that says '/bin/bash^M: bad interpreter', use the following line in the terminal
#sed -i -e 's/\r$//' runAllTests.sh
#This replaces Windows carriage returns with Linux carriage returns

#Begin Html file
# > directs output to file and overwrites it
#Next two lines from Team TBD
file=$(readlink -f "$0")
filepath=$(dirname "$file")


cd ../testCases

report="<html>"

cd ..



report="$report <title>"
report="$report Test Results"
report="$report </title>"
report="$report </head>"
report="$report <body>"
report="$report <strong>Team Correct - Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga</strong><br />"
report="$report <br />"
report="$report Top Level Directory<br />"
report="$report Folder: ${PWD##*/}<br />"
report="$report <br />"

#checks if file and executable
#if [ -f $d -a -x $d ] 

cd testCases
for d in `ls $PWD`; do
if [ $d != "testResults.html" ];
	then
	report="$report <br /><strong> $d </strong><br />"
	for line in $d; do
		while read LINE; do
		report="$report $LINE<br />"
		done < "$line"
	done < "$d"
	fi
done
cd ..

cd testCasesExecutables

testAutomationPath=$PWD

cd org/glucosio/android/TeamCorrectTestExecutables
javac -classpath $testAutomationPath/joda-time-2.10.1.jar *.java 


for file in *.class; do
	if grep -q TestCase "$file"; then
	
	report="$report <br /> <strong> ${file%.*} </strong><br />"
	

	report="$report $(java -classpath $testAutomationPath:$testAutomationPath/joda-time-2.10.1.jar org.glucosio.android.TeamCorrectTestExecutables.${file%.*})" 

	fi
	
	
done


cd ..
cd ..
cd ..
cd ..
cd ..

report="$report </body>"
report="$report </html>"
#File creation complete output message

cd reports
echo $report > testResults.html
echo "testResults.html file created"
#Open file
xdg-open testResults.html






