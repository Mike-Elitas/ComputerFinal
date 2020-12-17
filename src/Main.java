public class Main {

    public static void main(String[] args) {
        OperatingSystem os1=new OperatingSystem("Windows", "7.2", "RISC",true , 100, 1024);
        Computer c1=new Computer("Carlos", 2048, 500, os1);
        c1.install(os1);
        System.out.println("Instalado correctamente " + os1.getOsName() + ".\n Actualmente hay un espacio en el disco de: " + c1.getHardDisk() + " y una RAM de " + c1.getRamMemory());;
        Software sw1=new Software("Paint", "1.0", 10, 20);
        Software sw2=new Software("Paint2", "1.0", 10, 20);
        c1.getOs().installSoftware(sw1,c1);
        c1.getOs().installSoftware(sw2,c1);
        c1.getOs().viewSoftware(c1);
        c1.getOs().uninstallSoftware(sw1,c1);
        c1.getOs().uninstallSoftware(sw2,c1);
        c1.reformat(os1);
    }
}
