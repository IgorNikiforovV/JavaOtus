package oop.good;

public abstract class Bird {
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

    public void setFlying(Boolean flying) {
        isFlying = flying;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", isFlying=" + isFlying +
                '}';
    }

    public abstract void feed();
}
