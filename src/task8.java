import java.util.Random;
public class task8 {
    public static void main(String[] args) {
        Random Die1=new Random();

        Random Die2=new Random();

        Random Die3=new Random();

        int die1=Die1.nextInt(6)+1;

        int die2=Die2.nextInt(6)+1;

        int die3=Die3.nextInt(6)+1;

        int roll=0;
        int maxroll=0;
        int maxrolltwo=0;

        maxroll = roll+1;
        maxrolltwo = roll+1;

        System.out.println(die1);

        System.out.println(die2);

        System.out.println(die3);

        System.out.format("%10s   %10s   %10s   %10s   %10s", "Roll","Die1","Die2","Die3","Sum\n");

        System.out.format("%10s   %10s   %10s   %10s   %10s", maxroll,die1,die2,die3,die1+die2+die3);

    }
}