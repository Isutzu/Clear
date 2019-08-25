 
## Description

Search and delete all assets(images, icons, etc)not being used in your project folder.

It opens and search each line of code in the files of the target folder and check if the file names in the source folder are being used .  At the end of the search all files not being used are stored in an ArrayList and delete it. This line of code was commented for safety.

_Basically it is just a string search . It coud be accomplished with a shell script too._

I used it to delete all images and icons not used in my website project. I couldn't find an extension in my VScode editor to eliminate all unused reources. Similar to the optimization ProGuard does on Android.

**usage: java Optimus[source folder] [target folder]**

### Example

```
  /app
    /css
      styles.css
    /js
      scripts.js  
    /img
      uno.png
      dos.png
      tres.png
      favicon.ico

  /public
      /views 
          foother.php
          header.php
          navbar.php
          slider.php
          contact.php
```             

*usage: java Optimus [source folder]  [target folder]*

All images in the `img` folder not being used by the scripts in the `views` folder will be deleted.

`$ java Optimus /Users/Oscar/public/img/  /Users/Oscar/app/views/`





### TODO
- [ ] Input validation
- [ ] Multilevel search of files

