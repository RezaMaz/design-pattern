package behavioural.memento;

// one of the thing needs to take care is that Memento class should be accessible only to the Originator object
// Also in client application, we should use caretaker object for saving and restoring the originator state.
public class FileWriterClient {

    public static void main(String[] args) {

        FileWriterCaretaker caretaker = new FileWriterCaretaker();

        FileWriterUtil fileWriter = new FileWriterUtil("data.txt");
        fileWriter.write("First Set of Data\n");
        System.out.println(fileWriter + "\n\n");

        // lets save the file
        caretaker.save(fileWriter);
        //now write something else
        fileWriter.write("Second Set of Data\n");

        //checking file contents
        System.out.println(fileWriter + "\n\n");

        //lets undo to last save
        caretaker.undo(fileWriter);

        //checking file content again
        System.out.println(fileWriter + "\n\n");

    }

}
