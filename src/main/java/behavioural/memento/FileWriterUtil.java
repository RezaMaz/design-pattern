package behavioural.memento;

// Originator class
// We can use Serialization to achieve memento pattern implementation that is more generic
// rather than Memento pattern where every object needs to have it’s own Memento class implementation.
// Memento design pattern is used when we want to save the state of an object so that we can restore later on.
// Memento pattern is used to implement this in such a way that the saved state data of the object is not accessible outside of the object.
public class FileWriterUtil {

    private String fileName;
    private StringBuilder content;

    public FileWriterUtil(String file) {
        this.fileName = file;
        this.content = new StringBuilder();
    }

    @Override
    public String toString() {
        return this.content.toString();
    }

    public void write(String str) {
        content.append(str);
    }

    public Memento save() {
        return new Memento(this.fileName, this.content);
    }

    public void undoToLastSave(Object obj) {
        Memento memento = (Memento) obj;
        this.fileName = memento.fileName;
        this.content = memento.content;
    }


    private class Memento {
        private String fileName;
        private StringBuilder content;

        public Memento(String file, StringBuilder content) {
            this.fileName = file;
            //notice the deep copy so that Memento and FileWriterUtil content variables don't refer to same object
            this.content = new StringBuilder(content);
        }
    }
}
