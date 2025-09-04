import java.util.Scanner;
import java.math.*;
public class Task1
{
    public static void main(String[] args)
    {
        Task1();
    }
    public static void Task1()
    {
        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        Scanner input = new Scanner(System.in);
        System.out.print("Введите сумму юаней: ");
        yuan = input.nextInt();
        roubles = ROUBLES_PER_YUAN * yuan;
        System.out.print("Сумма в рублях равна " + Math.ceil(roubles));
    }
}
