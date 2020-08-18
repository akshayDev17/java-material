public interface Flys {
    String fly();
}

class itFlys implements Flys {
    public String fly(){
        return "flying high";
    }
}

class cantFly implements Flys {
    public String fly(){
        return "not flying";
    }
}
