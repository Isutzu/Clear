## Clear.java
----

 **usage: java Optimus[source folder] [target folder]**

## Description

Search and delete all assets(images, icons, etc)not being used in your project folder.

It opens and search each line of code in the files of the target folder and check if the file names in the source folder are being used .  At the end of the search all files not being used are stored in an ArrayList and delete it. This line of code was commented for safety.

_Basically it is just a string search . It coud be accomplished with a shell script too._

I used it to delete all images and icons not used in my website project. I couldn't find an extension in my VScode editor to eliminate all unused reources. Similar to the optimization ProGuard does on Android.




### TODO
- [ ] Input validation
- [ ] Multilevel search of files

