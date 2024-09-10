package polimorfismo;

public class Individual extends TaxPayer {
    private Double healthExpenditures;

    public Individual(String name , Double aunalIncome , Double healthExpeditures){
        super(name , aunalIncome);
        this.healthExpenditures = healthExpeditures;
    }
    @Override
    public double tax() {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
