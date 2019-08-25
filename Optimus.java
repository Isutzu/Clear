import java.io.*;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class Optimus {

  public static List<String> targetFiles;
  public static List<String> sourceFiles;

  /************************** search() ************************/
  public static void search(String target) {
    System.out.println("-------------------------------------");
    System.out.println("NUMBER OF FILES :" + sourceFiles.size());
    System.out.println("-------------------------------------");
     
  
    for (String fname : sourceFiles) {

      try {
        File file = new File(target);
        Scanner scanner = new Scanner(file);
        String line = "";
        boolean used = false;
        while (scanner.hasNextLine()) {
          line = scanner.nextLine();
          if (line.contains('/' + fname)) {
            used = true;
            sourceFiles.remove(fname);
            scanner.close();
            break;
          }
        }
       
      } catch (FileNotFoundException e) {

      }
    }
  

  }
  /************************* getFiles() ************************/
  public static List<String> getFiles(String path) {

    File folder = new File(path);
    List<String> result = new CopyOnWriteArrayList<>();
    File[] files = null;
    if (folder.isDirectory()) {
      files = folder.listFiles();
      for (File f : files) {
        if (f.isFile()) {
          result.add(f.getName());
        }
      }
    }
    return result;
  }


 /************************* printResult() ************************/
  public static void printResult(List<String> result) {

    for (String s : result) {
      System.out.println(s + "\n");
    }
  }


  /************************* main() ************************/ 
  public static void main(String[] args) {
    if(args == null || args.length < 1 ){
      System.out.println("usage: java Optimus [source directory][target directory] ");
      System.exit(0);
    }
    String pathNeedle = "/Users/Oscar/vagrant/scotch-box/public/bella/public/img/";

    String targetPath = "/Users/Oscar/vagrant/scotch-box/public/bella/app/views/inc/";

    targetFiles = getFiles(targetPath);
    sourceFiles = getFiles(pathNeedle);

    for( String target : targetFiles){
        search(targetPath + target);
    }
    
    System.out.println("No used files:" + sourceFiles.size());
    System.out.println("-------------------");

    printResult(sourceFiles);

   /* for(String fname: sourceFiles){
      File file = new File(pathNeedle + "/" + fname);
      file.delete();
  }
*/


  }

}
