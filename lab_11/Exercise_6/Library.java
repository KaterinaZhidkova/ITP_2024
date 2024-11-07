package lab_11.Exercise_6;
import java.util.*;

public class Library {
    private Map<String, String> books;
    public Library() {
        books = new HashMap<>();
        books.put("Philip K. Dick: Do Androids Dream of Electric Sheep?", "The novel tells the story of 'bounty hunter' Rick Deckard, who pursues androids — creatures almost indistinguishable from humans, outlawed on Earth. The action takes place in the radiation-poisoned San Francisco of the future. Gradually, Rick begins to wonder: are androids really different from humans? And where is the border that separates them");
        books.put("Sergey Lukyanenko: A maze of reflections", "The novel takes place in a virtual world — the depths. Only some people — divers — were free to leave the depths, while the rest used special timers. Diver Leonid needs to rescue a user stuck in a computer game.");
        books.put("Evgeny Zamyatin: We", "The novel describes a society of the distant future, in which the personality is subject to strict totalitarian control. The action takes place approximately in the thirty-second century, in a fictional Unified State, where names and surnames are replaced by letters and numbers");
    }
    public boolean isBookAvailable(String title) {
        return books.containsKey(title);
    }
    public String getBookContent(String title) {
        return books.getOrDefault(title, "Book not found");
    }
    public void showBooks() {
        for (Map.Entry<String, String> entry : books.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
