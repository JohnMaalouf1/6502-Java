import java.util.Timer;
import java.util.TimerTask;

public class CompSystem extends Hardware {

    private static Cpu CPU = null;
    private static Memory MEM = null;
    public boolean running = true;
    public static Clock CLK = null;
    static int CLOCK_INTERVAL = 500;

    public CompSystem(String name, int idNum, boolean debug) {
        super(name, idNum, debug);
        this.log("Created");

    }


    public static void main(String[] args) {
        CPU = new Cpu("CPU", 0, true);
        CPU.log("Created");


        MEM = new Memory("RAM", 0, true);
        MEM.log("Created");
        System.out.println("\n");

        CLK = new Clock("Clock", 0, true);
        CLK.log("Created");

        MEM.setMAR(1);
        MEM.read();
        MEM.write();
        MEM.reset();
        MEM.read();
        MEM.write();
        MEM.displayMemory(0x14);
        MEM.displayMemory(0x17);

        CLK.addListener(MEM);
        CLK.addListener(CPU);


//        Timer t = new Timer();
//        t.schedule(new TimerTask() {
//            public void run() {
//                CLK.clockCycle();
//            }
//        }, 0, CLOCK_INTERVAL);
//
//        }

    }
}
