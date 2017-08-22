package john.software;

public class FileSystem {
  public static byte b(int i) {
    return (byte) i;
  }

  public static char getChar(byte b) {
    return BYTECHARS.charAt((int) b);
  }
  public static byte getByte(char c) {
    return b(BYTECHARS.indexOf(c));
  }

  // 97 / 255
  public static final String BYTECHARS = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ()[]{}<>+-*/=%@#!&|\\/:;'`\".,?~_^ \t\n\r";
  public static final byte start_sector = b(98);
  public static final byte end_sector = b(99);
  public static final byte start_file = b(100);
  public static final byte end_file_name = b(102);
  public static final byte end_file = b(101);
  public static final byte start_directory = b(103);
}
