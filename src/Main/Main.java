package Main;

import static Util.MenuUtil.*;

public class Main {
    public static void main(String[] args) {
        while (true) {
            
            int menuNumber = requiredNumber("Please select menu:" +
                    "\n 1. Register Student" +
                    "\n 2. Show All Student" +
                    "\n 3. Find Student" +
                    "\n 4. Update Student" +
                    "\n 5. Exit Systen");

            if (menuNumber == 1) {
                registerStudent();
            } else if (menuNumber == 2) {
                showALlStudent();
                System.out.println("--------------");
            } else if (menuNumber == 3) {
                findStudents();
                System.out.println("--------------");
            } else if (menuNumber == 4) {
                updateStudent();
            } else if (menuNumber == 5) {
                System.exit(0);
            } else System.out.println("Please entered correct number");
            showALlStudent();
        }

    }
}

/*
 * 1. Register
 * 2. Show
 * Find
 * Update
 *
 * */