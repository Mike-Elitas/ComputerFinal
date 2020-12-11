import java.util.ArrayList;

public class OperatingSystem {
    private String osName;
    private String osVersion;
    private String osArchitecture;
    private boolean osOnlyCommand;
    private int osSpaceRequirement;
    private int osRamMemmoryRequirement;
    private ArrayList<Software> osSoftwares = new ArrayList<Software>();
    private int swInstalado=0;

    //Builder


    public OperatingSystem(String osName, String osVersion, String osArchitecture, boolean osOnlyCommand, int osSpaceRequirement, int osRamMemmoryRequirement) {
        this.osName = osName;
        this.osVersion = osVersion;
        this.osArchitecture = osArchitecture;
        this.osOnlyCommand = osOnlyCommand;
        this.osSpaceRequirement = osSpaceRequirement;
        this.osRamMemmoryRequirement = osRamMemmoryRequirement;
    }

    //Getters
    public String getOsName() {
        return osName;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public String getOsArchitecture() {
        return osArchitecture;
    }

    public int getOsSpaceRequirement() {
        return osSpaceRequirement;
    }

    public int getOsRamMemmoryRequirement() {
        return osRamMemmoryRequirement;
    }
    public boolean isOsOnlyCommand() {
        return osOnlyCommand;
    }
    public int getSwInstalado() {
        return swInstalado;
    }

    //Setters
    public void setOsName(String osName) {
        this.osName = osName;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public void setOsArchitecture(String osArchitecture) {
        this.osArchitecture = osArchitecture;
    }

    public void setOsOnlyCommand(boolean osOnlyCommand) {
        this.osOnlyCommand = osOnlyCommand;
    }

    public void setOsSpaceRequirement(int osSpaceRequirement) {
        this.osSpaceRequirement = osSpaceRequirement;
    }

    public void setOsRamMemmoryRequirement(int osRamMemmoryRequirement) {
        this.osRamMemmoryRequirement = osRamMemmoryRequirement;
    }
    public void setSwInstalado(int swInstalado) {
        this.swInstalado = swInstalado;
    }


    public void installSoftware(Software osSoftware) {
        this.osSoftwares.add(osSoftware);
    }
    public void uninstallSoftware(Software osSoftware) {
        this.osSoftwares.remove(osSoftware);

    }
}