package State_Table;
public class State {
    private String present;
    private String[] nextState;
    private String[] stateOutput;
    
    protected State(String present, String[] nextStates, String[] outputs) {
        this.present = present;
        this.nextState = nextStates;
        this.stateOutput = outputs;
    }

    protected String getPresent() {
        return present;
    }
    protected String[] getNextState() {
        return nextState;
    }
    protected String[] getStateOutput() {
        return stateOutput;
    }

}
