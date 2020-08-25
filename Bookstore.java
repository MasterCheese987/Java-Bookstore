import java.util.HashMap;
import java.util.Scanner;

public class Bookstore {
    public static void main(String[] args) {
        HashMap<String, Integer> books = new HashMap<String, Integer>();

        HashMap<String, Integer> booksAdded = new HashMap<>();
        System.out.println("Choose your action, 1 - Check list of books, 4 - New book, 0 - Exit");
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
                    System.out.println("Your book is now in the store. Please press 1 to confirm, 13 to change quantity(type name of book and number changed,");
                    break;
// add book

                case 14:
                    int qty = 0;
                    if(books.get(name) != null){
                        qty = (Integer)booksAdded.get(name)+(Integer)books.get(name);
                        books.put(name,qty);
                        System.out.println("Updated quantity:" + qty);

                    }
                    else {
                        qty = booksAdded.get(name);
                        books.put(name, booksAdded.get(name));
                    }
                    if (qty < 0)
                    {
                        throw new ArithmeticException("Error, not enough books in store. Please enter book again.");
                    }
                    break;
// sell book



            }

        }


    }
}


