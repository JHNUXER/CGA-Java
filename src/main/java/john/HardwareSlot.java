package john;

public class HardwareSlot {
  private Hardware device;

  public Hardware getDevice() {
    return device;
  }
  public boolean canInstall(Hardware h) {
    return true;
  }
  public boolean installDevice(Hardware h) {
    if (this.device != null) return false;
    this.device = h;
    return true;
  }
  public Hardware uninstallDevice() {
    Hardware d0 = this.getDevice();
    this.device = 0;
    return d0;
  }
}
