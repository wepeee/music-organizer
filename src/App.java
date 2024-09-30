import java.util.Scanner;


public class App{
    public static void main(String[] args) {
        music music = new music();
        Scanner input = new Scanner(System.in);
        boolean x = true;
        while (x) { 
            music.showOption();

            int choice = input.nextInt();
            switch (choice) {
                case 1 -> {
                    System.out.println("Enter Music Name");
                    String title = input.next();
                    music.add(title);
                }
                case 2 -> {
                    if(!music.isKosong()){
                        music.show();
                    }else {
                        System.out.println("Music List is Empty");
                    }
                }
                case 3 -> {
                    music.showTotal();
                }
                case 4 -> {
                    if(!music.isKosong()){
                        System.out.println("Enter Index Music");
                        int index = input.nextInt();
                        music.remove(index);
                    }else{
                        System.out.println("theres nothing to remove");
                    }
                }
                case 5 -> {
                    System.out.println("Thanks have a nice day :p");
                    System.out.println("Exit..");
                    x = false;
                }
                default -> System.out.println("Invalid choice");
            }
        }
    }
}