package State_Table;
public class NextState {
    private String[] nextStates;

    protected NextState(int numOfVariables) {
        this.nextStates = new String[(int) Math.pow(2, numOfVariables)];
    }

    protected NextState(String[] nextStates) {
        this.nextStates = nextStates;
    }

    protected void setNextState(int index, String state) {
        this.nextStates[index] = state;
    }
}
