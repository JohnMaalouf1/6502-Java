public class Memory extends Hardware implements ClockListener{
    private int mem[] = new int[0x14];
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
}
