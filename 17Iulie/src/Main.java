import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Store storeObj = new Store(new HashMap<Integer, Product>());
        ProductFactory pf = new ProductFactory();
        Product prodObj = null;
        Animal animalObj = null;
        Vegetable vegetableObj = null;

        int choice = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("-----------------------");
            System.out.println("Menu\n 1 Create product and add it to store\n 2 Sell Product\n 3 Display daily sales report\n 4 Exit\n");
            System.out.println("-----------------------");
            choice = sc.nextInt();
            int choice2 = 0;
            int choice3 = 0;
            switch (choice){
                case 1:
                    do {
                        System.out.println("Product type (1 - Milk; 2 - Cheese; 3 - Egg; 4 - Yogurt; 5 - Sour Cream; 6 - vegetable; 7 - back to menu): ");
                        choice2 = sc.nextInt();
                        switch(choice2){
                            case 1:
                                System.out.println("Input: price, validity date, weight, storage temperature and Quantity: ");
                                animalObj = pf.getAnimalProduct("Milk");
                                animalObj.setName("Milk");
                                animalObj.setPrice(sc.nextInt());
                                animalObj.setValidityDate(sc.next());
                                animalObj.setWeight(sc.nextInt());
                                animalObj.setStorageTemperature(sc.nextDouble());
                                animalObj.setStockNumber(sc.nextInt());
                                storeObj.addProduct(animalObj);
                                break;
                            case 2:
                                System.out.println("Input: price, validity date, weight, storage temperature and Quantity: ");
                                animalObj = pf.getAnimalProduct("Cheese");
                                animalObj.setName("Cheese");
                                animalObj.setPrice(sc.nextInt());
                                animalObj.setValidityDate(sc.next());
                                animalObj.setWeight(sc.nextInt());
                                animalObj.setStorageTemperature(sc.nextDouble());
                                animalObj.setStockNumber(sc.nextInt());
                                storeObj.addProduct(animalObj);
                                break;
                            case 3:
                                System.out.println("Input: price, validity date, weight, storage temperature and Quantity: ");
                                animalObj = pf.getAnimalProduct("Egg");
                                animalObj.setName("Egg");
                                animalObj.setPrice(sc.nextInt());
                                animalObj.setValidityDate(sc.next());
                                animalObj.setWeight(sc.nextInt());
                                animalObj.setStorageTemperature(sc.nextDouble());
                                animalObj.setStockNumber(sc.nextInt());
                                storeObj.addProduct(animalObj);
                                break;
                            case 4:
                                System.out.println("Input: price, validity date, weight, storage temperature and Quantity: ");
                                animalObj = pf.getAnimalProduct("Yogurt");
                                animalObj.setName("Yogurt");
                                animalObj.setPrice(sc.nextInt());
                                animalObj.setValidityDate(sc.next());
                                animalObj.setWeight(sc.nextInt());
                                animalObj.setStorageTemperature(sc.nextDouble());
                                animalObj.setStockNumber(sc.nextInt());
                                storeObj.addProduct(animalObj);
                                break;
                            case 5:
                                System.out.println("Input: price, validity date, weight, storage temperature and Quantity: ");
                                animalObj = pf.getAnimalProduct("Sour Cream");
                                animalObj.setName("Sour Cream");
                                animalObj.setPrice(sc.nextInt());
                                animalObj.setValidityDate(sc.next());
                                animalObj.setWeight(sc.nextInt());
                                animalObj.setStorageTemperature(sc.nextDouble());
                                animalObj.setStockNumber(sc.nextInt());
                                storeObj.addProduct(animalObj);
                                break;
                            case 6:
                                System.out.println("Input: price, validity date, weight, Quantity and list of vitamins: ");
                                vegetableObj = pf.getVegetalProduct(sc.next());
                                vegetableObj.setName(vegetableObj.getName());
                                vegetableObj.setPrice(sc.nextInt());
                                vegetableObj.setValidityDate(sc.next());
                                vegetableObj.setWeight(sc.nextInt());
                                vegetableObj.setStockNumber(sc.nextInt());
                                List<String> vitaminList = new ArrayList<String>();

                                String vitamin;
                                do {
                                    vitamin = sc.next();
                                    if (!vitamin.equals("exit")) {
                                        vitaminList.add(vitamin);
                                        System.out.println("Type exit to Stop");
                                    }

                                } while (!vitamin.equals("exit"));;
                                storeObj.addProduct(vegetableObj);
                                break;
                            case 7:
                                System.out.println("Main menu/Home!");
                                break;
                            default:
                                System.out.println("Choice must bee between 1 and 7");
                                break;
                        }
                    }while(choice2 != 7);
                    break;
                case 2:
                    System.out.println("Products in stock: ");
                    storeObj.displayProducts();
                    System.out.println("Input product's ID and quantity: ");
                    storeObj.sellProducts(sc.nextInt(),sc.nextInt());
                    break;
                case 3:
                    System.out.println("Display orders from date: mm/dd/yyyy");
                    System.out.println(storeObj.getTodayDateAsString());
                    String inputDate = sc.next();
                    storeObj.displaySoldItemsFromDate(inputDate);
                    break;
                case 4:
                    continue;
                default:
                    System.out.println("Choice must be between 1 and 4");
                    break;
            }
        }while (choice != 4);
    }
}
