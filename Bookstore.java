import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        String[] books = {"Science", "Math", "Technology", "Space"};
        while (true) {
            java.util.Scanner sc = new Scanner(System.in);
            System.out.println("Choose your action, 1 - Check list of books, 2 - Take a book, 3 - Return a book, 0 - Exit");
            // based on user

            int action = sc.nextInt();
            if (action == 0)
                break;

        }
        switch (action) {

            case 1:
                System.out.println(books.length);


// add book
            case 2:
                System.out.println("Choose which book to buy");
                System.out.println(books.length);
                System.out.println("Press 4 for Science, 5 for Math, 6 for Technology, and 7 for Space ");
            case 4:
                System.out.println("Your purchase was successful. You have purchased Science.");
            case 5:
                System.out.println("Your purchase was successful. You have purchased Math.");
            case 6:
                System.out.println("Your purchase was successful. You have purchased Technology.");
            case 7:
                System.out.println("Your purchase was successful. You have purchased Space.");

                break;
// sell book

            // balance inquiry
            case 3:
                System.out.println("Choose which book to return.");
                System.out.println(books.length);
                System.out.println("Press 8 for Science, 9 for Math, 10 for Technology, and 11 for Space ");
            case 8:
                System.out.println("You have successfully sold Science.");
            case 9:
                System.out.println("You have successfully sold Math.");
            case 10:
                System.out.println("You have successfully sold Technology.");
            case 11:
                System.out.println("You have successfully sold Space.");
                break;

        }


    }
    }


