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
cd ..
echo "<html>" > /reports/testResults.html
echo "<title>" >> /reports/testResults.html
echo "Test Results" >> /reports/testResults.html
echo "</title>" >> /reports/testResults.html
echo "</head>" >> /reports/testResults.html
echo "<body>" >> /reports/testResults.html
echo "<strong>Team Correct - Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga</strong><br />" >> /reports/testResults.html
echo "<br />" >> /reports/testResults.html
echo "Top Level Directory<br />" >> /reports/testResults.html
echo "Folder: ${PWD##*/}<br />" >> /reports/testResults.html
echo "<br />" >> /reports/testResults.html
#For loop to run through directory

cd /testCases

for d in `ls $filepath`; do
if [ -f $d -a -x $d ] && [ $d != "runAllTests.sh" ] && [ $d != "testResults.html" ];
	then
		sh ./$d
	fi
	#echo "$d<br  />" >> testResults.html
done

#Working Directory is now /testCases
for d in `ls $PWD`; do
if [ $d != "testResults.html" ];
	then
	echo "<strong> $d </strong><br />" >> testResults.html
	for line in $d; do
		while read LINE; do
		echo "$LINE<br />" >> testResults.html
		done < "$line"
	done < "$d"
	fi
done 

#cd ..
#cd /testCasesExecutables
#echo $PWD
#compile and run tests

echo "</body>" >> testResults.html
echo "</html>" >> testResults.html
#File creation complete output message
echo "testResults.html file created"
#Open file
xdg-open testResults.html





