import java.util.HashMap;
import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        Bookstore bookstore = new Bookstore();
        HashMap<String, Integer> books = new HashMap<String, Integer>();
        books.put("Science", 58);
        books.put("Math", 47);
        books.put("Technology", 48);
        books.put("Space", 57);
        HashMap<String, Integer> booksAdded = new HashMap<>();
        System.out.println("Choose your action, 1 - Check list of books, 2 - Take a book, 3 - Return a book(Must buy before adding), 4 - New book, 0 - Exit");
        String name=null;

        while (true) {
            java.util.Scanner sc = new Scanner(System.in);

            // based on user

            int action = sc.nextInt();
            if (action == 0)
                break;

            switch (action) {


                case 1:
                    for (String i : books.keySet()) {
                        System.out.println("Book: " + i + "     Quantity: " + books.get(i));
                    }

                    for (String i : booksAdded.keySet()) {
                        System.out.println("Book added: " + i + "     Quantity: " + booksAdded.get(i));
                    }
                    break;


                case 4:
                    System.out.println("Type 13 and then enter the name of the book and quantity(Press enter each time after typing name and number)");
                    break;
                case 13:
                    java.util.Scanner newBook = new Scanner(System.in);
                    name = newBook.nextLine();
                    java.util.Scanner bookQuantity = new Scanner(System.in);
                    int number = bookQuantity.nextInt();
                    booksAdded.put(name, number);
                    System.out.println("Your book is now in the store. Please press 1 to confirm, 14 to change quantity");
                    break;
// add book
                case 2:
                    System.out.println("Choose which book to buy");
                    for (String i : books.keySet()) {
                        System.out.println("Book: " + i + "     Quantity: " + books.get(i));
                    }
                    System.out.println("Press 12 for Science, 5 for Math, 6 for Technology, and 7 for Space ");
                    break;
                case 12:
                    books = sellBooks("Science", books);
                    System.out.println("Your purchase was successful. You have purchased Science.");
                    break;
                case 5:
                    books = sellBooks("Math", books);
                    System.out.println("Your purchase was successful. You have purchased Math.");
                    break;
                case 6:
                    books = sellBooks("Technology", books);
                    System.out.println("Your purchase was successful. You have purchased Technology.");
                    break;
                case 7:
                    books = sellBooks("Space", books);
                    System.out.println("Your purchase was successful. You have purchased Space.");

                    break;
                case 14:
                    if(books.get(name) != null){
                        int qty = (Integer)booksAdded.get(name)+(Integer)books.get(name);
                        books.put(name,qty);
                        System.out.println("Updated quantity:" + qty);
                    }
                    else
                        books.put(name,booksAdded.get(name));
                    break;
// sell book


                case 3:
                    System.out.println("Choose which book to return.");
                    for (String i : books.keySet()) {
                        System.out.println("Book: " + i + "     Quantity: " + books.get(i));
                    }
                    System.out.println("Press 8 for Science, 9 for Math, 10 for Technology, and 11 for Space ");
                    break;
                case 8:
                    returnBooks("Space", books);
                    System.out.println("You have successfully sold Science.");
                    break;
                case 9:
                    returnBooks("Space", books);
                    System.out.println("You have successfully sold Math.");
                    break;
                case 10:
                    returnBooks("Space", books);
                    System.out.println("You have successfully sold Technology.");
                    break;
                case 11:
                    returnBooks("Space", books);
                    System.out.println("You have successfully sold Space.");
                    break;

            }
        }


    }

    public static HashMap sellBooks(String bookType, HashMap books) {
        int nummBooks = (Integer) books.get(bookType);


        books.put(bookType, --nummBooks);

        return books;
    }

    public static HashMap returnBooks(String bookType, HashMap books) {
        int nummBooks = (Integer) books.get(bookType);

        books.put(bookType, ++nummBooks);


        return books;

    }


}


