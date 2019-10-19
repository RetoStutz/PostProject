package post;

public class Letter extends PostItem {

   private final String receiver;
    private final double weight;
    //Versandart (A = A-post, B = B-post, E = Express)
    private final char dispatchMode;
    public Letter (String receiver, double weight, char dispatchMode){
        this.receiver = receiver;
        this.weight = weight;
        this.dispatchMode = dispatchMode;
    }

    @Override
    public String getReceiver() {
        return receiver;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public char getDispatchMode() {
        return dispatchMode;
    }


}
