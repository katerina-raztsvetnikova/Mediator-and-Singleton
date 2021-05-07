public class SingletonBot {

    private static SingletonBot instance;
    private static Chat chat;


    private SingletonBot(){

    }

    public static SingletonBot getInstance(){
        if(instance == null){
            instance = new SingletonBot();
            chat = new Chat();
        }
        return  instance;
    }

    public void removeUser(User user){
        this.chat.removeUser(user);
    }


}
