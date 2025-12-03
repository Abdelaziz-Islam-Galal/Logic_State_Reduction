package State_Table;

public class Table {
    private static Table instance = null;
    private static int numOfVariables;
    private static String type; // mealy or moore
    private static State[] states;
    private static int counter = 0;

    private Table(int numOfVariables, int numOfStates, String type) {
        this.numOfVariables = numOfVariables;
        this.type = type;
        this.states = new State[numOfStates];
    }

    public static Table getInstatce() {
        return instance;
    }

    public static Table createTable(int numOfVariables, int numOfStates, String type) {
        if (instance == null) {
            instance = new Table(numOfVariables, numOfStates, type);
        }
        return instance;
    }

    public void addState(String present, String[] nextStates, String[] outputs) {
        if (counter >= states.length) {
            throw new IndexOutOfBoundsException("State Table is full. Cannot add more states.");
        }
        if (nextStates.length != (1 << numOfVariables)) { // 2^numOfVariables
            throw new IllegalArgumentException("Number of next states does not match number of variables.");
        }
        if (outputs.length != (type.equals("mealy") ? (1 << numOfVariables) : 1)) {
            throw new IllegalArgumentException("Number of outputs does not match state type.");
        } // if mealy number of outputs = 2^numOfVariables else moore number of outputs =
          // 1

        State state = new State(present, nextStates, outputs);
        states[counter++] = state;
    }

    public State[] getStates() {
        if (counter == states.length) {
            return states;
        } else {
            return null; // tabel incomplete
        }
    }

    public int getNumOfVariables() {
        return numOfVariables;
    }

}
