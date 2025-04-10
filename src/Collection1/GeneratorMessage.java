package Collection1;

import java.util.*;

public class GeneratorMessage {
    private static final String[] TEXTS = {
            "мб", "я хз", "давай по новой, яеще по думаю", "лол, думай", "нашел у кого спросить",
            "хахахах,очивидно нет", "да, ахахаха очевидно же"
    };
    private static final Random RANDOM = new Random();

    public static List<Message> generateMessages(int count) {
        Set<Message> messages = new LinkedHashSet<>();
        while (messages.size() < count) {
            String code = "код" + RANDOM.nextInt(100);
            String text = TEXTS[RANDOM.nextInt(TEXTS.length)];
            Message.Priority priority = Message.Priority.values()[RANDOM.nextInt(Message.Priority.values().length)];
            messages.add(new Message(code, text, priority));
        }
        return new ArrayList<>(messages);
    }
}

