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
test_cases_directory=$PWD



report="<html>"

cd ..


report="$report \n<title>"
report="$report \nTest Results"
report="$report \n</title>"
report="$report \n</head>"
report="$report \n<body>"
report="$report \n<strong>Team Correct - Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga</strong><br />"
report="$report \n<br />"
report="$report \nTop Level Directory<br />"
report="$report \nFolder: ${PWD##*/}<br />"
report="$report \n<br />"

#checks if file and executable
#if [ -f $d -a -x $d ] 

cd testCases
for d in `ls $PWD`; do
if [ $d != "testResults.html" ];
	then
	report="$report \n<strong> $d </strong><br />"
	for line in $d; do
		while read LINE; do
		report="$report \n$LINE<br />"
		done < "$line"
	done < "$d"
	fi
done
cd ..

cd testCasesExecutables
for t in `ls $PWD`; do
	#compile if necessary
	#run
done
cd ..

report="$report \n</body>"
report="$report \n</html>"
#File creation complete output message

cd reports
echo $report > testResults.html
echo "testResults.html file created"
#Open file
#xdg-open report





