public class Cpu extends Hardware implements ClockListener{
    int cpuClockCount = 0;
    public Cpu(String name, int idNum, boolean debug)  {
        super(name, idNum, debug);
    }

    @Override
    public void pulse() {
        cpuClockCount++;
        log("received clock pulse - CPU: Clock Count: " + this.cpuClockCount);

    }
}
