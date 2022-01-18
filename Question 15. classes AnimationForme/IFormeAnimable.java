package videoShowSolution;

/**
 * Un objet IFormeAnimable est capable d'animer (de déplacer) une forme.
 * 
 */
public interface IFormeAnimable {
    
    /**
     * fait faire un déplacement élémentaire à une forme.
     *
     * @param f la forme à déplacer
     */
    public void deplacer(Forme f);
    
}
