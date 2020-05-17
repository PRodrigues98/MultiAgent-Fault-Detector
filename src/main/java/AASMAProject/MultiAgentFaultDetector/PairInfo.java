package AASMAProject.MultiAgentFaultDetector;

import java.io.Serializable;

public class PairInfo implements Serializable {

    private String faultDetectorID;
    private String serverID;

    private State state;

    private int currentInvulnerabilityTime;

    public PairInfo(String faultDetectorID, String serverID, int currentInvulnerabilityTime){
        this.faultDetectorID = faultDetectorID;
        this.serverID = serverID;

        this.state = State.HEALTHY;

        this.currentInvulnerabilityTime = currentInvulnerabilityTime;
    }


    public String getFaultDetectorID() {
        return faultDetectorID;
    }

    public String getServerID() {
        return serverID;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int decrementAndGet(){
        currentInvulnerabilityTime = currentInvulnerabilityTime == 0 ? 0 : currentInvulnerabilityTime - 1;
        return currentInvulnerabilityTime;
    }

    public int getCurrentInvulnerabilityTime(){
        return currentInvulnerabilityTime;
    }

    public void setCurrentInvulnerabilityTime(int currentInvulnerabilityTime){
        this.currentInvulnerabilityTime = currentInvulnerabilityTime;
    }
}
