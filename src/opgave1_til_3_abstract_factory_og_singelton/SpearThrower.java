/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opgave1_til_3_abstract_factory_og_singelton;

public class SpearThrower extends InfantryUnit {

    public SpearThrower() {super(10,5,5,1);}

    public SpearThrower(int range, int armor, int hits, int damage) {
        super(range, armor, hits, damage);
    }

}
