package oop.bad;

public class Bird {
    private final String name;
    private Boolean isFlying;

    public Bird(String name){
        this.name = name;
        isFlying = false;
    }

    public String getName(){
        return name;
    }

    public Boolean isFlying(){
        return isFlying;
    }

    public void feed(){
        if (name.equals("Blackbidr")){
            isFlying = true;
        }
        else { isFlying = false; }
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFlying=" + isFlying +
                '}';
    }
}
