package week5.bubbleSort;

public class Bubblesort implements IBubblesort {
    public SalesRepresentative[] sort(SalesRepresentative[] reps) {
/**
 * functia sort o sa parcurga array-ul prin intermediul a 2 for-uri.
 * cu fiecare iteratie parcursa valorile mai mari vor fii sortate in partea opusa valorilor mici
 * cu primul for se parcurg pozitiile arrayului si prin intermediul celui de-al doilea for sunt comparate pozitiile intre ele
 * astfel incat daca pozitia array[j] < array[j+1] valorile se vor interschimba si la finalul fiecarei iteratie
 * vom avea valoarea dorita pe prima pozitie a array-ului.
 */
        int i = 0;
        SalesRepresentative n;
        for (i = 0; i < reps.length; i++) {
            for (int j = 0; j < reps.length - 1 - i; j++) {
                if (reps[j].salesNumber * reps[j].salesQuota < reps[j + 1].salesNumber * reps[j + 1].salesQuota) {
                    n = reps[j];
                    reps[j] = reps[j + 1];
                    reps[j + 1] = n;
                }
            }
        }
        return reps;
    }
}
//    SalesRepresentative [ ] reps = ...

//    SalesRepresentative [ ] sortedReps = sort(reps);

// you need to implement the sort(SalesRepresentative [ ] reps) method. This can not be a static method.

