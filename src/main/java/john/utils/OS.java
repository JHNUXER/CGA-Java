package john.utils;

public class OS {
  public static OS instance;

  public String archID;
  public String sPath;
  public char dirChar;
  
  public OS() {
    String[] k = System.getProperty("os.name").toLowerCase().split(" ");
    this.archID = k[0];
    k = null;
    this.sPath = System.getProperty("user.dir");
    this.dirChar = this.archID == "windows"?'\\':'/';
  }
  
  public static void init() {
    instance = new OS();
  }
  
  public st
}
