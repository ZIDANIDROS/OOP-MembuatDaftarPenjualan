public class Main {
    public static void main(String[] args) {
        //pembuatan object nya
        CPU myKomputer = new CPU(15000000, "ASUS");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i9");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk(1000, "Seagate",539,"SSD");
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("ROG", "ASUS",790);
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply("Corsair", 750,"5");
        CPU.VGACard myVGACard = myKomputer.new VGACard("RTX 3060", "NVIDIA","RTX");


        //print objek nya
        myKomputer.getCPUInfo();
        System.out.println("  ");

        i7.getProcessorInfo();
        System.out.println(" ");

        rs32GB.getInfoRAM();
        System.out.println(" ");

        myHarddisk.getHarddiskInfo();
        System.out.println(" ");

        myMotherboard.getMotherboardInfo();
        System.out.println(" ");

        myPowerSupply.getPowerSupplyInfo();
        System.out.println(" ");

        myVGACard.getVGACardInfo();
        System.out.println(" ");
    }
}
