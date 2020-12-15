

public class Hardware {
    String name;
    int idNum;
    boolean debug = true;

    public Hardware(String name, int idNum, boolean debug) {
        this.name = name;
        this.idNum = idNum;
        this.debug = debug;
    }

    public void log(String message){
        System.out.println("[HW - " + this.name + " id: " + this.idNum + " - " + java.time.LocalDateTime.now()+ "]: " + message);
    }

    public int hexVal(int val, int len){
        String fin = Integer.toString(val, 16);
        while (fin.length() < len){
            fin = "0" + fin;
        }
        return Integer.parseInt(fin);
    }
}
