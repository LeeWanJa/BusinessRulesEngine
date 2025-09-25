package main;

public class Mailer {
    public static void sendMail(String target, String content){
        System.out.println("Sending email to " + target);
        System.out.println("[" + content + "] 전송완료!");
    }
}
