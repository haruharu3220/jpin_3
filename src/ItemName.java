public class ItemName {

    private final String value;
    public ItemName(String value){
        super();
        if(value == null || "".equals(value)){
            throw new IllegalArgumentException();
        }
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
