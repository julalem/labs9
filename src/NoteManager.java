import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class NoteManager {
    private List<Note> noteList;
    private int nextId;

    public NoteManager() {
        noteList = new ArrayList<>();
        nextId = 1;
    }

    public void addNote() {
        Note note = Note.createNewNote();
        note.setId(nextId++);
        noteList.add(note);
        System.out.println("Note added successfully with ID: " + note.getId());
    }

    public void displayAllNotes() {
        if (noteList.isEmpty()) {
            System.out.println("No notes available.");
            return;
        }

        System.out.println("List of Notes:");
        for (Note note : noteList) {
            System.out.println("ID: " + note.getId());
            System.out.println("Title: " + note.getTitle());
            System.out.println("Content: " + note.getContent());
            System.out.println();
        }
    }

    public void deleteNoteById(int id) {
        Iterator<Note> iterator = noteList.iterator();
        while (iterator.hasNext()) {
            Note note = iterator.next();
            if (note.getId() == id) {
                iterator.remove();
                System.out.println("Note with ID " + id + " deleted successfully.");
                return;
            }
        }
        System.out.println("Note with ID " + id + " not found.");
    }
}
