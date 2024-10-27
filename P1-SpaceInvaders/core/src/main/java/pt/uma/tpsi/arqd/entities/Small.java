package pt.uma.tpsi.arqd.entities;

import pt.uma.tpsi.arqd.game.Animator;

public class Small extends Ship {
    public Small(int posX, int posY, Animator animator){
        super(posX, posY, animator);
    }

    @Override
    public void shoot(){
        System.out.println("Small ship shooting...");
    }
}
