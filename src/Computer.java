public class Computer {
    private String name;
    private int ramMemory;
    private int hardDisk;
    private OperatingSystem os;

    //Builder
    public Computer(String name, int ramMemory, int hardDisk, OperatingSystem os) {
        this.name = name;
        this.ramMemory = ramMemory;
        this.hardDisk = hardDisk;
        this.os = os;
    }

    //Getters
    public String getName() {
        return name;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public int getHardDisk() {
        return hardDisk;
    }

    public OperatingSystem getOs() {
        return os;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }

    public void setOs(OperatingSystem os) {
        this.os = os;
    }

    //Methods

    public void install(OperatingSystem os){
        if (this.os!=null && hardDisk>os.getOsSpaceRequirement() && ramMemory>os.getOsRamMemmoryRequirement()) {
            hardDisk -= os.getOsSpaceRequirement();
            ramMemory-= os.getOsRamMemmoryRequirement();
        }
        else
        {
            System.out.println("No hay espacio en el disco o suficiente memoria RAM");
        }
    }
    public void reformat(OperatingSystem os){
        hardDisk += os.getOsSpaceRequirement();
        ramMemory += os.getOsRamMemmoryRequirement();
        System.out.println("El disco ha sido reformateado y su espacio es: "+ getHardDisk() + " y la memoria RAM disponible es: "+ getRamMemory());
    }
}
