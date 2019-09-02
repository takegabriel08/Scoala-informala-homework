package Comparator;

import java.util.Comparator;

/**
 * Acest factory pattern mi-a fost sugerat de cineva pentru tema precedenta cu product store.
 * si poate ca nu este absolut necesar sa fie folosita aici insa eu am considerat ca ideea de
 * factory design poate fii foarte utile.
 *
 */
public class ComparatorFactory {
    public Comparator getComparator (String comparator){
        Comparator comp = null;


        if (comparator == "Name"){
            comp = new ComparatorName();
        }else if (comparator == "Age"){
            comp = new ComparatorAge();
        }else return null;

        return comp;
    }
}
