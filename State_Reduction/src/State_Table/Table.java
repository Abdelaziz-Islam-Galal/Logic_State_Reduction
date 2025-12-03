package State_Table;

public class Table {
    private int numOfVariables;
    private String type; // mealy or moore
    private State[] states;
    private int counter = 0;

    private Table(int numOfVariables, int numOfStates, String type) {
        this.numOfVariables = numOfVariables;
        this.type = type;
        this.states = new State[numOfStates];
    }

    private Table(int numOfVariables, State[] states, String type) {
        this.states = states;
        this.numOfVariables = numOfVariables;
        this.type = type;
        counter = states.length;
    }

    public static Table getInstatce(int numOfVariables, int numOfStates, String type) {
        return new Table(numOfVariables, numOfStates, type);
    }
    public static Table getInstatce(int numOfVariables, State[] states, String type) {
        return new Table(numOfVariables, states, type);
    }

    public void addState(State state) {
        this.states[counter++] = state;
    }

    public void addState(int numOfVariables, String present) {
        State state = new State(numOfVariables, present, this.type);
        this.states[counter++] = state;
    }

    public State[] getStates() {
        return states;
    }

    public int getNumOfVariables() {
        return numOfVariables;
    }

}
