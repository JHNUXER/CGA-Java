package john.hardware;

public class Drive implements Hardware,Memory {
  public byte[] data;
  private HexID id;

  public String getDeviceName() {
    return "Hard Drive";
  }
  public String getShortDeviceName() {
    return "HDD";
  }
  public int getCapacity() {
    return data.length;
  }
  public HexID getID() {
    return this.id;
  }
}
