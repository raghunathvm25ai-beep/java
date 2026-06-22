public class day14_factory{

    interface Notification {
        void send(String to, String message);
    }

    static class EmailNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Email: " + message + ", to " + to);
        }
    }

    static class WhatsappNotification implements Notification {
        @Override
        public void send(String to, String message) {
            System.out.println("Sending Whatsapp: " + message + ", to " + to);
        }
    }

    static Notification getNotification(String type) {
        return switch (type) {
            case "Email" -> new EmailNotification();
            case "Whatsapp" -> new WhatsappNotification();
            default -> throw new IllegalArgumentException(
                    "Invalid notification type: " + type);
        };
    }

    public static void main(String[] args) {
        String type = "Email";
        getNotification(type).send("ragu@gmail.com", "Hello World");
    }
}