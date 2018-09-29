package OOps;

public class TestinPiggyBank {

	public static void main(String[] args) {

		if (PiggyBank.test1() && PiggyBank.test2() && PiggyBank.test3()) {
			PiggyBank.statement();
		} else {
			System.out.println("Program Success");
		}
	}
}

class PiggyBank {

    

    private static int balance;

    private static int lt;

    

    static void deposit(int v) {

        if(v > 0)

        {

            balance = balance + v;

            lt = v;

        }

        

    }


    static void withdraw(int v) {

        if ( v>0 && balance >= v) {

            balance = balance - v;

            lt = -v;

        }

    }


    static void statement() {

        System.out.println("Balance = " + balance);

        System.out.println("Last Transaction = " + lt);

    }

    

     static boolean test1() {

        deposit(50);

        return balance == 50 && lt == 50;


    }

    static boolean test2() {

        deposit(40);

        withdraw(10);

        return balance == 80 && lt == -10;


    }

    static boolean test3() {

        deposit(-10);

        withdraw(-30);

        return balance == 80 && lt == -10;

    }


}
