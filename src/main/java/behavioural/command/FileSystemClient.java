package behavioural.command;

import behavioural.command.commands.CloseFileCommand;
import behavioural.command.commands.OpenFileCommand;
import behavioural.command.commands.WriteFileCommand;
import behavioural.command.receiver.FileSystemReceiver;

// Command design pattern is used to implement loose coupling in a request-response model.
public class FileSystemClient {
    public static void main(String[] args) {
        //Creating the receiver object
        FileSystemReceiver fs = FileSystemReceiverUtil.getUnderlyingFileSystem();

        //creating command and associating with receiver
        OpenFileCommand openFileCommand = new OpenFileCommand(fs);

        //Creating invoker and associating with Command
        FileInvoker file = new FileInvoker(openFileCommand);

        //perform action on invoker object
        file.execute();

        WriteFileCommand writeFileCommand = new WriteFileCommand(fs);
        file = new FileInvoker(writeFileCommand);
        file.execute();

        CloseFileCommand closeFileCommand = new CloseFileCommand(fs);
        file = new FileInvoker(closeFileCommand);
        file.execute();
    }
}
