public class FlexString {
    private String stringComponent;
    private StringBuffer bufferComponent;

    public FlexString(){
        this.stringComponent = "";
        this.bufferComponent = new StringBuffer(this.stringComponent);
    }
    public FlexString(String origin){
        this.stringComponent = origin;
        this.bufferComponent = new StringBuffer(origin);
    }
    public FlexString(StringBuffer origin){
        this.stringComponent = origin.toString();
        this.bufferComponent = origin;
    }
    public FlexString(char[] origin){
        this.stringComponent = new String(origin);
        this.bufferComponent = new StringBuffer(this.stringComponent);
    }



    public void collate(boolean str){
        if (str){
            this.bufferComponent = new StringBuffer(this.stringComponent);
        }else {
            this.stringComponent = this.bufferComponent.toString();
        }
    }

    public String stringFormat(){
        return this.stringComponent;
    }
    public StringBuffer bufferFormat(){
        return this.bufferComponent;
    }
    public char[] charFormat(){
        return this.stringComponent.toCharArray();
    }
}

