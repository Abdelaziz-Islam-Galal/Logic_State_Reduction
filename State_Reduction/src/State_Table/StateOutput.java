package State_Table;
public class StateOutput {
    private String[] outputs;

    protected StateOutput(int numOfVariables) {
        this.outputs = new String[(int) Math.pow(2, numOfVariables)];
    }

    protected StateOutput(String[] outputs) {
        this.outputs = outputs;
    }

    protected void setOutput(int index, String output) {
        this.outputs[index] = output;
    }

}
