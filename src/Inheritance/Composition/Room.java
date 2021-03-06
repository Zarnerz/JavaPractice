package Inheritance.Composition;

public class Room {
    private Bed bed;
    private Desk desk;
    private TV tv;
    private Walls walls;

    public Room(Bed bed, Desk desk, TV tv, Walls walls) {
        this.bed = bed;
        this.desk = desk;
        this.tv = tv;
        this.walls = walls;
    }

    public void willTvFit(){
        tvFitTest();
    }

    private boolean tvFitTest(){
        System.out.println(walls.getArea() + " , " + tv.getSize());
        if(walls.getArea() > tv.getSize()){
            System.out.println("FITS");
            return true;
        } else {
            System.out.println("DOESN'T FIT");
            return false;
        }
    }

    public Bed getBed() {
        return bed;
    }

    public Desk getDesk() {
        return desk;
    }

    public TV getTv() {
        return tv;
    }

    public Walls getWalls() {
        return walls;
    }
}
