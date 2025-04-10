package Collection2;

import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class Emails {
    private Set<String> emailSet;

    public Emails() {
        emailSet = new java.util.HashSet<>();
    }

    public void addEmail(String email) {
        if (isValidEmail(email)) {
            if (emailSet.add(email)) {
                System.out.println("Email добавлен: " + email);
            } else {
                System.out.println("Этот email уже есть: " + email);
            }
        } else {
            System.out.println("Неправильный email: " + email);
        }
    }

    public void listEmails() {
        if (emailSet.isEmpty()) {
            System.out.println("Список email пуст.");
        } else {
            System.out.println("Список email:");
            for (String email : emailSet) {
                System.out.println(email);
            }
        }
    }

    private boolean isValidEmail(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        Pattern pattern = Pattern.compile(emailRegex);
        return pattern.matcher(email).matches();
    }

    public static void main(String[] args) {
        Emails emailManager = new Emails();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Введите команды:");
        System.out.println("Команда 'add <email>' - для добавления email");
        System.out.println("Команда 'list' - для вывода списка email");
        System.out.println("Команда 'exit' - для выхода");
        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("exit")) {
                break;
            } else if (command.startsWith("add ")) {
                String email = command.substring(4);
                emailManager.addEmail(email);
            } else if (command.equalsIgnoreCase("list")) {
                emailManager.listEmails();
            } else {
                System.out.println("Неправильная команда. введите 'add <email>' или 'list'.");
            }
        }

        scanner.close();
        System.out.println("Выход.");
    }
}
