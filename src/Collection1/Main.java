package Collection1;

import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<Message> generatedMessages = GeneratorMessage.generateMessages(20);
        CollectionMessage messageCollection = new CollectionMessage(generatedMessages);

        // разные сообщения
        List<Message> uniqueMessages = messageCollection.getUniqueMessages();
        System.out.println("уникальное сообщение: " + uniqueMessages);

        // удалить сообщения с заданным приоритетом
        messageCollection.removeMessagesByPriority(Message.Priority.HIGH);

        // удалить все сообщения, кроме тех, кто имеет заданный приоритет
        messageCollection.retainMessagesByPriority(Message.Priority.LOW);

        // количество сообщений для каждого приоритета
        Map<Message.Priority, Long> priorityCount = messageCollection.countMessagesByPriority();
        System.out.println("количество сообщение по приоритету: " + priorityCount);

        // количество сообщений для каждого кода
        Map<String, Long> codeCount = messageCollection.countMessagesByCode();
        System.out.println("количество сообщение по коду: " + codeCount);

        // количество уникальных сообщений
        long uniqueCount = messageCollection.countUniqueMessages();
        System.out.println("количество уникальных сообщение: " + uniqueCount);

    }
}
