#!/bin/bash
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
echo "<html>" > testResults.html
echo "<title>" >> testResults.html
echo "Test Results" >> testResults.html
echo "</title>" >> testResults.html
echo "</head>" >> testResults.html
echo "<body>" >> testResults.html
echo "Team Correct - Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga<br />" >> testResults.html
echo "<br />" >> testResults.html
echo "Top Level Directory<br />" >> testResults.html
echo "Folder: ${PWD##*/}<br />" >> testResults.html
echo "<br />" >> testResults.html
#For loop to run through directory
for d in `ls $filepath`; do
if [ -f $d -a -x $d ] && [ $d != "runAllTests.sh" ] && [ $d != "myList.sh" ];
	then
		sh ./$d
	fi
	echo "$d<br  />" >> testResults.html
done
echo "</body>" >> testResults.html
echo "</html>" >> testResults.html
#File creation complete output message
echo "testResults.html file created"
#Open file
xdg-open testResults.html





