package behavioural.mediator;

// Notice that send() method is using mediator to send the message to the users and it has no idea how it will be handled by the mediator.
public class UserImpl extends User {

    public UserImpl(ChatMediator med, String name) {
        super(med, name);
    }

    @Override
    public void send(String msg) {
        System.out.println(this.name + ": Sending Message=" + msg);
        mediator.sendMessage(msg, this);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.name + ": Received Message:" + msg);
    }

}
