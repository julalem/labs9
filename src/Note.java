
import java.util.Scanner;

public class Note {
    private int id;
    private String title;
    private String content;

    public Note() {

    }

    public Note(int id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    
    public static Note createNewNote() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter note title:");
        String title = scanner.nextLine();

        System.out.println("Enter note content:");
        String content = scanner.nextLine();

        return new Note(-1, title, content); // -1 for placeholder ID
    }
}
