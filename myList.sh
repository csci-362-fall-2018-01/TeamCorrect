#Team Correct Script
#Members: Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga
#myList.sh

#!/bin/bash

#Begin Html file
# > directs output to file directory.html and overwrites it
echo "<html>" > directory.html

# >> directs output to file director.html and appends it
echo "<head>" >> directory.html
echo "<title>" >> directory.html
echo Top Level Directory >> directory.html
echo "</title>" >> directory.html
echo "</head>" >> directory.html

echo "<body>" >> directory.html
echo "Team Correct - Hannah Posch, Daniel Lee, Alex Thropp, Daniel Baczmaga<br />" >> directory.html
echo "<br />" >> directory.html
echo "Top Level Directory<br />" >> directory.html
echo "Folder: ${PWD##*/}<br />" >> directory.html
echo "<br />" >> directory.html

#For loop to run through directory
for d in *; do
	echo "$d<br  />" >> directory.html
done
echo "</body>" >> directory.html
echo "</html>" >> directory.html

#File creation complete output message
echo "Directory.html file created"

#Open file
xdg-open directory.html





