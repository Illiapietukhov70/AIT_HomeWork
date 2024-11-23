package HomeWork21;

import lesson_19.MyStrBuild;

public class Autopilot {
    private String softwareVersion;
    private Autobus autobus;

    public Autopilot(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }

    @Override
    public String toString() {
        MyStrBuild msb = new MyStrBuild("Autopilot: {");
        msb.append("SV: '");
        msb.append(softwareVersion);
        msb.append("}");
        return msb.toString();

    }

    public Autobus getAutobus() {
        return autobus;
    }

    public void setAutobus(Autobus autobus) {
        this.autobus = autobus;
    }

    public String getSoftwareVersion() {
        return softwareVersion;
    }

    public void setSoftwareVersion(String softwareVersion) {
        this.softwareVersion = softwareVersion;
    }
}
