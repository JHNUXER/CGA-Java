package john.data;

import java.util.*;

public class HexID {
  private static final String HXCH = "0123456789abcdef";
  private static final char chx() {
    return HXCH.charAt(new Random(new Random().nextInt()).nextInt(HXCH.length));
  }
  private static final String strx(int len) {
    String s0 = "";
    for (int i = 0; i < len; i++) {
      s0 += chx();
    }
    return s0;
  }

  private String value;

  public HexID() {
    this.value = strx(3)+"-"+strx(13)+"-"+strx(4)+"-"+strx(4)+"-"+strx(8)+"-"+strx(2);
  }

  public String toString() {
    return value;
  }
}
