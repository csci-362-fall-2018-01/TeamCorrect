#Team Correct Script
#Members: Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga
#runAllTests.sh

#!/bin/bash

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
	if [ -f $d -a -x $d]
	then 
		$d
	fi
	echo "$d<br  />" >> testResults.html
done
echo "</body>" >> testResults.html
echo "</html>" >> testResults.html

#File creation complete output message
echo "testResults.html file created"

#Open file
xdg-open testResults.html





