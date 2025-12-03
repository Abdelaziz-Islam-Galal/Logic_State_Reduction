package State_Table;
public class State {
    private String present;
    private NextState nextState;
    private StateOutput stateOutput;
    
    public State(int numOfVariables, String present, String type) {
        this.present = present;
        this.nextState = new NextState(numOfVariables);

        if(type.equals("mealy")) {
            this.stateOutput = new StateOutput(numOfVariables);
        } else if(type.equals("moore")) {
            this.stateOutput = new StateOutput(1);
        } else {
            throw new IllegalArgumentException("Invalid state type: " + type);
        }
    }

    public String getPresent() {
        return present;
    }
    public NextState getNextState() {
        return nextState;
    }
    public StateOutput getStateOutput() {
        return stateOutput;
    }

}
