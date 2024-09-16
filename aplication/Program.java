package aplication;

import java.util.Locale;
import java.util.Scanner;

import polimorfismo.Individual;
import polimorfismo.TaxPayer;

public class Program {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Tax Payers :");
        int N = sc.nextInt();

        TaxPayer x = new Individual();

        List<TaxPayer> list = new ArrayList<TaxPayer>();
    }
}
