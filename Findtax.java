import java.util.Scanner;

public class Findtax {
    double inctax, income;
    void case1(){
        inctax = 0;
    }
    void case2(){
        inctax = (income - 250000) * 5 / 100;
    }
    void case3(){
        inctax = ((income - 500000) * 10 / 100) + 12500;
    }
    void case4(){
        inctax = ((income - 1000000) * 15 / 100) + 62500;
    }

    public static void main(String[] args) {

        Findtax i = new Findtax();
        System.out.println("Enter your income");
        Scanner sc = new Scanner(System.in);
        i.income = sc.nextInt();
        if(i.income <= 250000){
            i.case1();
        }
        else if(i.income > 250000 && i.income <= 500000){
            i.case2();
        }
        else if(i.income > 500000 && i.income <= 1000000){
            i.case3();
        }
        else {
            i.case4();
        }
        System.out.println("Your Tax is " + i.inctax);

    }
}