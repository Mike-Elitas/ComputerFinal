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


    public void installSoftware(Software sw,Computer c) {
        if (c.getHardDisk() >= sw.getSoftwareSpaceRequirement() && c.getRamMemory() >= sw.getSoftwareRamMemoryRequirement()) {
            this.osSoftwares.add(sw);
            c.setRamMemory(c.getRamMemory() - sw.getSoftwareRamMemoryRequirement());
            c.setHardDisk(c.getHardDisk() - sw.getSoftwareSpaceRequirement());
            System.out.println("Instalado correctamente " + sw.getSoftwareName() + ".\n Actualmente hay un espacio en el disco de: " + c.getHardDisk() + " y una RAM de " + c.getRamMemory() + "\n");
            swInstalado++;
        } else {
            System.out.println("No hay suficiente espacio en el disco o no hay suficiente RAM" + "\n");
        }
    }
    public void uninstallSoftware(Software sw,Computer c) {
        this.osSoftwares.remove(sw);
        c.setRamMemory(c.getRamMemory() + sw.getSoftwareRamMemoryRequirement());
        c.setHardDisk(c.getHardDisk() + sw.getSoftwareSpaceRequirement());
        System.out.println("Desnstalado correctamente " + sw.getSoftwareName() + ".\n Actualmente hay un espacio en el disco de: " + c.getHardDisk() + " y una RAM de " + c.getRamMemory() + "\n");
        swInstalado--;
    }
    public void viewSoftware(Computer c){
        for (int i = 0; i < swInstalado ; i++) {
            c.getOs().osSoftwares.get(i);
            System.out.println("Los softwares instalados son: ");
            System.out.println( osSoftwares.get(i).getSoftwareName() + " ");

        }
        System.out.println("\n");
    }
}