import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        String book,author,name,university;
        int year;
        double price;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Book name : ");
        book = input.nextLine();
        System.out.println("Enter author name : ");
        author = input.nextLine();
        System.out.println("Year : ");
        year = input.nextInt();
        System.out.println("Price : ");
        price = input.nextDouble();
        input.nextLine();

        System.out.println("name : ");
        name = input.nextLine();

        System.out.println("University : ");
        university = input.nextLine();

        System.out.println(book+" "+author+" "+year+" "+price+" "+name+" "+university);
    }

}