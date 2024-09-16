package polimorfismo;

public class Company  extends TaxPayer{
    private Integer numberOfEmployers;
    public Company(String name , Double anunalIncome , Integer numberOfEmployers){
        super(name , anunalIncome);
        this.numberOfEmployers = numberOfEmployers;
    }
    public Company(){
        
    }

    public Integer getNumberOfEmployees(){
        return numberOfEmployers;
    }
    public void setNumberOfEmployers(Integer numberOfEmployers){
        this.numberOfEmployers = numberOfEmployers;
    }
    @Override
    public double tax() {
        if (numberOfEmployers > 10){
            return getAnualIncome() * 0.14;
        }
        else{
            return getAnualIncome() * 0.16;
        }
        // TODO Auto-generated method stub
        return 0;
    }
}
