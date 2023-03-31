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
    int getOverallLevel() {
        int levelInt=0;
        if (this.level.equals("Easy"))
            levelInt=1;
        else if (this.level.equals("Medium"))
            levelInt=3;
        else if (this.level.equals("Hard"))
            levelInt=5;
        return levelInt * this.number;
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
        return 0;
    }

}
public class AssassinsOperation {

    private Soldier[] soldiers = new Soldier[0];
    private Target[] targets = new Target[0];
    private String name;
    public String getName(){
        return this.name;
    }
    AssassinsOperation(String name){
        this.name=name;
    }
    public void addTarget(Target t) {
        Target[] newTargets = new Target[this.targets.length+1];
        System.arraycopy(this.targets,0,newTargets,0,this.targets.length);
        newTargets[newTargets.length-1]=t;
        this.setTargets(newTargets);
    }
    public void addSoldier(Soldier s) {
        Soldier[] newSoldiers = new Soldier[this.soldiers.length+1];
        System.arraycopy(this.soldiers,0,newSoldiers,0,this.soldiers.length);
        newSoldiers[newSoldiers.length-1]=s;
        this.setSoldiers(newSoldiers);
    }
    public Target[] getTargets() {
        return this.targets;
    }
    public Soldier[] getSoldiers() {
        return this.soldiers;
    }
    public void setTargets(Target[] targets) {
        this.targets=targets;
    }
    public void setSoldiers(Soldier[] soldiers) {
        this.soldiers=soldiers;
    }
    public boolean predictOperation() {
        int sumOfLevel=0,sumOfPower=0;
        for (int i=0 ; i < this.targets.length ; i++)
            sumOfLevel+=this.targets[i].getOverallLevel();
        for (int i=0 ; i < this.soldiers.length ; i++)
            sumOfPower+=this.soldiers[i].getPower();
        if (sumOfPower > sumOfLevel)
            return true;
        else
            return false;
    }
}