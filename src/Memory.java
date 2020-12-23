public class Memory extends Hardware implements ClockListener{
    private int mem[] = new int[0xffff];
    private int MAR = 0x0000;
    private int MDR = 0x00;

    public Memory(String name, int idNum, boolean debug) {
        super(name, idNum, debug);
        for (int i = 0x00; i < mem.length; i++){
            mem[i] = 0x01;
        }
    }

    public void displayMemory(int index){
        if (!(index < 0x00 || index > 0x14)){
            log(Integer.toString(hexVal(mem[index], 2)));
        } else {
            log("Address : 0x" + Integer.toString(index) + "  Contains Value: ERR [hexValue conversion]: number undefined");
        }
    }

    @Override
    public void pulse() {
        log("received clock pulse - MEMORY");
    }
    public void reset(){
        for (int i = 0x00; i < this.mem.length; i++){
            this.mem[i] = 0x00;
        }
        this.MAR = 0x00;
        this.MDR = 0x00;
    }

    public void read(){
        setMDR(getMAR());
        //System.out.println(getMAR());
        System.out.println((getMDR()));
    }
    public void write(){
        mem[getMAR()] = getMDR();
        System.out.println(mem[getMAR()]);
    }


    public int getMAR() {
        return MAR;
    }

    public void setMAR(int MAR) {
        this.MAR = MAR;
    }

    public int getMDR() {
        return MDR;
    }

    public void setMDR(int MDR) {
        this.MDR = MDR;
    }
}
