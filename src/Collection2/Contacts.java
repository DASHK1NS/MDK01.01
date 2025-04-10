package Collection2;

import java.util.*;

public class Contacts {
    private Map<String, String> nameToPhoneMap; // Имя затем номер телефона
    private Map<String, String> phoneToNameMap; // Номер телефона затем Имя

    public Contacts() {
        nameToPhoneMap = new HashMap<>();
        phoneToNameMap = new HashMap<>();
    }

    public void addContact(String name, String phone) {
        nameToPhoneMap.put(name, phone);
        phoneToNameMap.put(phone, name);
        System.out.println("Контакт добавлен: " + name + " - " + phone);
    }

    public void findContactByName(String name) {
        if (nameToPhoneMap.containsKey(name)) {
            System.out.println("Контакт: " + name + " - " + nameToPhoneMap.get(name));
        } else {
            System.out.println("Контакт не найден: " + name);
        }
    }

    public void findContactByPhone(String phone) {
        if (phoneToNameMap.containsKey(phone)) {
            System.out.println("Контакт: " + phoneToNameMap.get(phone) + " - " + phone);
        } else {
            System.out.println("Контакт не найден: " + phone);
        }
    }

    public void listContacts() {
        if (nameToPhoneMap.isEmpty()) {
            System.out.println("Телефонная книга пуста.");
            return;
        }

        List<String> sortedNames = new ArrayList<>(nameToPhoneMap.keySet());
        Collections.sort(sortedNames);

        System.out.println("Список абонентов:");
        for (String name : sortedNames) {
            System.out.println(name + " - " + nameToPhoneMap.get(name));
        }
    }

    public static void main(String[] args) {
        Contacts phoneBook = new Contacts();
        Scanner scanner = new Scanner(System.in);
        String command;

        System.out.println("Введите команды:");
        System.out.println("Команда 'add <name> <phone>' - для добавления контакта");
        System.out.println("Команда 'find <name>' - для поиска по имени");
        System.out.println("Команда 'findPhone <phone>' - для поиска по номеру");
        System.out.println("Команда 'list' - для вывода списка контактов");
        System.out.println("Команда 'exit' - для выхода");

        while (true) {
            System.out.print("> ");
            command = scanner.nextLine();

            if (command.equalsIgnoreCase("Exit")) {
                break;
            } else if (command.startsWith("add ")) {
                String[] parts = command.split(" ");
                if (parts.length == 3) {
                    String name = parts[1];
                    String phone = parts[2];
                    phoneBook.addContact(name, phone);
                } else {
                    System.out.println("Неправильная команда. введите 'add <name> <phone>'.");
                }
            } else if (command.startsWith("find ")) {
                String name = command.substring(5);
                phoneBook.findContactByName(name);
            } else if (command.startsWith("findPhone ")) {
                String phone = command.substring(10);
                phoneBook.findContactByPhone(phone);
            } else if (command.equalsIgnoreCase("list")) {
                phoneBook.listContacts();
            } else {
                System.out.println("Неправильная команда.");
            }
        }

        scanner.close();
        System.out.println("Выход.");
    }
}