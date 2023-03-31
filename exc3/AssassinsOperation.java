class Target {
    private String level;
    private int number ;
    Target(String level , int number) {
        this.level=level;
        this.number=number;
    }
    String getLevel() {
        return this.level;
    }
    int getNumber() {
        return this.number;
    }
}
class Soldier {
    private String name ;
    private String weapon ;
    Soldier(String name , String weapon) {
        this.name=name;
        this.weapon=weapon;
    }
    String getName() {
        return this.name;
    }
    int getPower(){
        if (this.weapon.equals("hidden knife"))
            return 1;
        else if (this.weapon.equals("sword"))
            return 2;
        else if (this.weapon.equals("gun"))
            return 4;
    }

}
class AssassinsOperation {

    private Soldier[] soldiers = new Soldier[0];
    private Target[] targets = new Target[0];
    private String name;
    String getOperationName(){
        return this.name;
    }
    AssassinsOperation(String name){
        this.name=name;
    }
    void addTarget(Target t1) {
        
    }
    void addSoldier(Soldier s1)
    Target[] getTargets()
    Soldier[] getSoldiers()
    boolean predictOperation() 
}