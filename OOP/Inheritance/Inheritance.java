class System1{ //base class

    int volume = 65;
    int brightness = 30;
    int battery = 90;
    private String unlockPassword = "re45@dmdkmfkdf"; // sub class cannot inherit private property

    public int VolumeLevel(){
        return volume;
    }

    public int BrightnessLevel(){
        return brightness;
    }
}

class GameApp extends System1{ // GameApp extends the System1

    
    public void startGame(GameApp game){
        System.out.println("Getting battery Level.."+game.battery);
        System.out.println("Getting brightness Level.."+game.BrightnessLevel());// calling base class method
        System.out.println("Getting Volume Level.."+game.VolumeLevel());// calling base class method
        System.out.println("Game Started .."); 
    }

    public void getCoins(){
        System.out.println("You have 50 coins left");
    }

   
}


class GameVirtualShop extends GameApp{//extending GameApp

    public void buy(){
        super.getCoins();// accessing method in GameApp(Parent)
    }
}

class ChatApp extends System1 { // ChatApp extends the System1

    public void getNotification(ChatApp chat) {
        System.out.println("Notification received..");
        System.out.println("Getting Volume Level.." + chat.VolumeLevel());// calling base class method
    }

    static void playSound() {
        System.out.println("Playing Notification Ringtone..");
    }
}


public class Inheritance {
    
    public static void main(String[] args) {

        GameApp game = new GameApp();
        ChatApp chat = new ChatApp();
        GameVirtualShop shop = new GameVirtualShop();
        
        game.startGame(game);

        chat.getNotification(chat);
        ChatApp.playSound();// calling static method inside subclass ChatApp

        shop.buy();
        
    }
}
