import java.util.ArrayList;

public class Clock extends Hardware {
    ArrayList<ClockListener> ClockListeners = new ArrayList<ClockListener>();


    public Clock(String name, int idNum, boolean debug) {
        super(name, idNum, debug);
    }

    public void addListener(ClockListener newListener){
        ClockListeners.add(newListener);
    }

    public void clockCycle(){
        log("Clock Pulse Init");
        for (int i = 0; i < ClockListeners.size(); i++){
            ClockListeners.get(i).pulse();
        }
    }
}
