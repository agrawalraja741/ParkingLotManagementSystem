package Models;

public class Operator {

    private int id;
    private int operatorId;
    private String operatorName;


    public Operator(int id, int operatorId, String operatorName) {
        this.id = id;
        this.operatorId = operatorId;
        this.operatorName = operatorName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }
}
