public class CompSystem extends Hardware {

    private static Cpu CPU = null;
    private static Memory MEM = null;
    public boolean running = true;
    int CLOCK_INTERVAL = 500;

    public CompSystem(String name, int idNum, boolean debug) {
        super(name, idNum, debug);
        this.log("Created");

    }


    public static void main(String[] args){
            CPU = new Cpu("CPU", 0 , true);
            CPU.log("Created");
            MEM = new Memory("RAM", 0 ,true);
            MEM.log("Created");
            System.out.println("\n");

            MEM.displayMemory(0x12);
            MEM.displayMemory(0x17);
        }


}
