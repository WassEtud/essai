/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videoShowSolution;

import java.awt.Graphics;

/**
 */
public class AnimationForme implements IObjetAnimable {
    
    private Forme forme;
    private IFormeAnimable formeAnimable;

    public AnimationForme(Forme forme, IFormeAnimable formeAnimable) {
        this.forme = forme;
        this.formeAnimable = formeAnimable;
    }

    @Override
    public void deplacer() {
        this.formeAnimable.deplacer(this.forme);
    }

    @Override
    public void dessiner(Graphics g) {
        this.forme.dessiner(g);
    }
    
    
    
}
