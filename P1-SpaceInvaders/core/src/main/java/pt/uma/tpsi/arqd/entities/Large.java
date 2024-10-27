package pt.uma.tpsi.arqd.entities;

import pt.uma.tpsi.arqd.game.Animator;

public class Large extends Ship{
    public Large(int posX, int posY, Animator animator){
        super(posX, posY, animator);
    }

    @Override
    public void shoot(){
        System.out.println("Large ship shooting...");
    }
}
