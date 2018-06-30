import java.awt.*;

public class ChatClient extends Frame{
    public static void main(String[] args){
        ChatClient cc=new ChatClient();
        cc.launchFrame();
    }

    public void launchFrame(){
        setLocation(400,300);
        this.setSize(300,400);
        setVisible(true);
    }
}
