package entity;

import java.util.Stack;

public class Tank {
    private Stack<String> liquids;

    public Tank(){
        this.liquids = new Stack<>();
    }

    public void addToTank(String liquid){
        this.liquids.push(liquid);
    }

    public String emptyTank(){
        if(!this.liquids.isEmpty()){
            return this.liquids.pop();
        }
        else{
            return null;
        }
    }

    public boolean isEmpty(){
        return this.liquids.isEmpty();
    }


    @Override
    protected void finalize() {
        this.finalizeTank();
    }

    private void finalizeTank() {
        if (!this.isEmpty()) {
            System.out.println("Error: entity.Tank was not empty upon cleanup.");
        } else {
            System.out.println("entity.Tank is clean and empty.");
            //call finalize method from parent
        }
    }

}
