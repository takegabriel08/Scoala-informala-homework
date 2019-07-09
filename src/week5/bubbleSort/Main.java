package week5.bubbleSort;

import java.util.ArrayList;

/**As fi putut sa setez ca parametrii instantelor de clase sa fie setate de la tastatura
 * insa consider a fost mai simplu sa sortez o lista deja existenta printr-un apel
 * de functie "bubblesort"
 */
public class Main {
    public static void main(String[] args) {

        SalesRepresentative salesRepresentativeObj = new SalesRepresentative("Radu", 15, 5600);
        SalesRepresentative salesRepresentativeObj2 = new SalesRepresentative("Claudiu", 12, 3000);
        SalesRepresentative salesRepresentativeObj3 = new SalesRepresentative("Mihai", 13, 6000);
        SalesRepresentative salesRepresentativeObj4 = new SalesRepresentative("Gabriel", 10, 4000);
        SalesRepresentative salesRepresentativeObj5 = new SalesRepresentative("Georgel", 1, 20000);
        SalesRepresentative salesRepresentativeObj6 = new SalesRepresentative("George", 16, 3600);
        SalesRepresentative salesRepresentativeObj7 = new SalesRepresentative("David", 6, 5100);
        SalesRepresentative salesRepresentativeObj8 = new SalesRepresentative("Pahontu", 5, 300);
        SalesRepresentative salesRepresentativeObj9 = new SalesRepresentative("Viorel", 11, 4200);
        SalesRepresentative salesRepresentativeObj10 = new SalesRepresentative("Nea Gigi", 9, 1000);

        Bubblesort bubbleobj = new Bubblesort();

        SalesRepresentative[] reps = new SalesRepresentative[10];
        reps[0] = salesRepresentativeObj;
        reps[1] = salesRepresentativeObj2;
        reps[2] = salesRepresentativeObj3;
        reps[3] = salesRepresentativeObj4;
        reps[4] = salesRepresentativeObj5;
        reps[5] = salesRepresentativeObj6;
        reps[6] = salesRepresentativeObj7;
        reps[7] = salesRepresentativeObj8;
        reps[8] = salesRepresentativeObj9;
        reps[9] = salesRepresentativeObj10;

        System.out.println("non sorted array: ");
        for (int i = 0; i < reps.length; i++) {
            System.out.println(reps[i].name + " " + reps[i].salesNumber * reps[i].salesQuota);
        }

        SalesRepresentative[] sortedReps = bubbleobj.sort(reps);

        System.out.println("\n" + "sorted array: ");

        for (int i = 0; i < sortedReps.length; i++) {
            System.out.println(sortedReps[i].name + " " + sortedReps[i].salesNumber * sortedReps[i].salesQuota);
        }
    }
}