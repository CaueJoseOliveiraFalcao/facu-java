package polimorfismo;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual() {
        
    }
    public Individual(String name , Double aunalIncome , Double healthExpeditures){
        super(name , aunalIncome);
        this.healthExpenditures = healthExpeditures;
    }
    public Double getHeathExpenditures(){
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures){
        this.healthExpenditures = healthExpenditures;
    }
    @Override
    public double tax() {
        // TODO Auto-generated method
        double BASICTAX; 
        if (getAnualIncome() < 20000.0){
            BASICTAX = getAnualIncome() * 0.15;
        }
        else{
            BASICTAX = getAnualIncome() * 0.25;
        }
        BASICTAX -= getHeathExpenditures() * 0.5;
        if (BASICTAX < 0.0) {
            BASICTAX = 0.0;
        }
        return BASICTAX;
    }
    
}
