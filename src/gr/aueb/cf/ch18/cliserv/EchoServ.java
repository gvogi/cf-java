package gr.aueb.cf.ch18.cliserv;

/**
 * A simple pojo class that acts as a server.
 */
public class EchoServ {

    /**
     * Echoes a <code>message</code> carried by a <code>String</code>
     * argument
     * @param message
     *        the token that contains the message to be echoed.
     * @return
     *        the echoed message.
     */
    public String echo(String message) {
        return message;
    }
}
