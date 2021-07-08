package MyApp;

public class Dollar {

    public int amount;
    

    public Dollar(int amount) {
        this.amount = amount;
    }

    public Dollar times(int multiplier) {
          return  new Dollar(this.amount*multiplier);  
    }
    public boolean equals(Object object){
        var dollar = (Dollar)object;
        return dollar.amount == this.amount;
    }

}
