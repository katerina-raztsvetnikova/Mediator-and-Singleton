public class Main {
    public static void main(String[] args) {
        MessageMediator chat = new Chat();

        User user1 = new ChatUser(chat, "Georgi ");
        User user2 = new ChatUser(chat, "Victoria ");
        User user3 = new ChatUser(chat, "Silvia ");

        user1.send("AddBot");

        user2.send("cat");
        SingletonBot bot = SingletonBot.getInstance();
        bot.removeUser(user2);
        System.out.println("Bot remove Victoria from chat room.");





    }
}
