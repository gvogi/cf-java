package gr.aueb.cf.ch15.seminarinherit;

public class SeminarResponse extends Message {
    private Participant sender;

    public SeminarResponse() {
    }

    public Participant getSender() {
        return sender;
    }

    public void setSender(Participant sender) {
        this.sender = sender;
    }
}
