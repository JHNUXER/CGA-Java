package john;

public class Computer {
  public String label;
  private HexID id;
  public Screen screen;
  
  public String getIDString() {
    return id.toString();
  }
  public HexID getID() {
    return id;
  }
}
