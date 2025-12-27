package DTN2508.com.vti.entity;

public class TypeQuestion {
    private static int counter = 0;
    private int typeID;
    private typeName typeName;
    public TypeQuestion(){
        this.typeID = ++counter;
    }
    public int getTypeID() {
        return typeID;
    }

    public typeName getTypeName() {
        return typeName;
    }

    public void setTypeName(typeName typeName) {
        this.typeName = typeName;
    }
}
