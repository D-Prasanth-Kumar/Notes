package hibernate.CompositePrimaryKey_NamedQueries_Mappings.CompositePrimaryKey;

@Embeddable  // -> as this is not a table, it is a composite key class
public class CarId {
    private int modelNum;

    private int engineNum;

    public CarId() {

    }

    public CarId(int modelNum, int engineNum) {
        this.modelNum = modelNum;
        this.engineNum = engineNum;
    }

    public int getModelNum() {
        return modelNum;
    }

    public void setModelNum(int modelNum) {
        this.modelNum = modelNum;
    }

    public int getEngineNum() {
        return engineNum;
    }

    public void setEngineNum(int engineNum) {
        this.engineNum = engineNum;
    }
}
