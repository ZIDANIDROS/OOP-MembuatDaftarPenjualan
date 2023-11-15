import java.text.NumberFormat;
import java.util.Locale;
public class CPU {
    private double harga;
    private String merek;

    public CPU(double harga, String merek) {
        this.harga = harga;
        this.merek = merek;
    }
    public class Processor {
        int cores;
        String manufacturer;
        String name;

        Processor(int cores, String manufacturer, String name) {
            this.cores = cores;
            this.manufacturer = manufacturer;
            this.name = name;
        }

        public void getProcessorInfo() {
            System.out.println("Jumlah core: " + this.cores);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Processor: " + this.name);
        }
    }

    public class RAM {
        int jumlahRAM;
        String manufacturer;

        RAM(int jumlahRAM, String manufacturer) {
            this.jumlahRAM = jumlahRAM;
            this.manufacturer = manufacturer;
        }

        public void getInfoRAM() {
            System.out.println("Jumlah RAM: " + this.jumlahRAM);
            System.out.println("Pabrik: " + this.manufacturer);
        }
    }

    public void getCPUInfo() {
        Locale localeID = new Locale("in", "ID");
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(localeID);

        System.out.println("Komputer Merek: " + this.merek);

        // menuliskan harga yang double ke dalam format rupiah
        System.out.println("Harga: " + formatRupiah.format(this.harga));
    }

    public class Harddisk {
        int capacityGB;
        String manufacturer;
        int RPM;
        String tipe;

        public Harddisk(int capacityGB, String manufacturer, int RPM, String tipe) {
            this.capacityGB = capacityGB;
            this.manufacturer = manufacturer;
            this.RPM = RPM;
            this.tipe=tipe;
        }

        public void getHarddiskInfo() {
            System.out.println("Harddisk Capacity : " + this.capacityGB + "GB");
            System.out.println("Pabrik : " + this.manufacturer);
            System.out.println("Tipe : "+this.tipe);
            System.out.println("kecepatan : " + this.RPM +" MB/s");
        }
    }

    public class Motherboard {
        String model;
        String manufacturer;
        int PCB;
        public Motherboard(String model, String manufacturer,int PCB) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.PCB=PCB;
        }

        public void getMotherboardInfo() {
            System.out.println("Motherboard Model: " + this.model);
            System.out.println("Pabrik: " + this.manufacturer);
            System.out.println("Kecepatan: " + this.manufacturer+" PCB");
        }
    }

    public class PowerSupply {
        String brand;
        int watt;
        String garansi;

        public PowerSupply(String brand, int watt, String garansi) {
            this.brand = brand;
            this.watt = watt;
            this.garansi = garansi;
        }

        public void getPowerSupplyInfo() {
            System.out.println("Brand Power Supply: " + this.brand);
            System.out.println("Watt: " + this.watt + "W");
            System.out.println("garansi : " + this.garansi + "Tahun");
        }
    }

    public class VGACard {
        String model;
        String manufacturer;
        String tipe;


        public VGACard(String model, String manufacturer,String tipe) {
            this.model = model;
            this.manufacturer = manufacturer;
            this.tipe = tipe;
        }

        public void getVGACardInfo() {
            System.out.println("VGA Card Model : " + this.model);
            System.out.println("Pabrik : " + this.manufacturer);
            System.out.println("Tipe : "+this.tipe);
        }
    }

}
