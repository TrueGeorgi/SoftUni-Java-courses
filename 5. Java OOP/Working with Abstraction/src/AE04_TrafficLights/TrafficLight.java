package AE04_TrafficLights;

public class TrafficLight {

    Signal currentSignal;

    public TrafficLight(Signal currentSignal) {
        this.currentSignal = currentSignal;
    }

    public Signal getCurrentSignal() {
        return currentSignal;
    }

    public void changeSignal () {
        switch (currentSignal) {

            case RED : {
                this.currentSignal = Signal.GREEN;
                break;
            }
            case GREEN : {
                this.currentSignal = Signal.YELLOW;
                break;
            }
            case YELLOW : {
                this.currentSignal = Signal.RED;
                break;
            }
        }
    }
}
