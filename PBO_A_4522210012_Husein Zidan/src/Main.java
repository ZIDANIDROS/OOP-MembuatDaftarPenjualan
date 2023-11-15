public class Main {
    public static void main(String[] args) {
        //pembuatan object nya
        CPU myKomputer = new CPU(15000000, "Lenovo");

        CPU.Processor i7 = myKomputer.new Processor(8, "Intel", "i7");
        CPU.RAM rs32GB = myKomputer.new RAM(32, "Samsung");
        CPU.Harddisk myHarddisk = myKomputer.new Harddisk(1000, "Seagate");
        CPU.Motherboard myMotherboard = myKomputer.new Motherboard("ROG", "ASUS");
        CPU.PowerSupply myPowerSupply = myKomputer.new PowerSupply("Corsair", 750);
        CPU.VGACard myVGACard = myKomputer.new VGACard("RTX 3060", "NVIDIA");


        //print objek nya
        myKomputer.getCPUInfo();

        i7.getProcessorInfo();

        rs32GB.getInfoRAM();

        myHarddisk.getHarddiskInfo();

        myMotherboard.getMotherboardInfo();

        myPowerSupply.getPowerSupplyInfo();

        myVGACard.getVGACardInfo();
    }
}
