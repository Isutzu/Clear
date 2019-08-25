## Clear.java

### usage: java Optimus[source folder] [target folder]

## Description

Search and delete all assets(images, icons, etc)not being used in your project folder
It opens each file on the target folder  and search for the occurance of the files listed in the source folder . If the file is found it means it is being used so it won't delete . At the end of the search all files not being used will be stored in an ArrayList and delete it. This line of code was commented for safety.
Basically it is just a string search . It coud be accomplished with a shell script too.
###TO DO
[] input validation
[] multilevel search of files

