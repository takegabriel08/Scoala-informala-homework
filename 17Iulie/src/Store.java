import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

public class Store {
    private Map<Integer, Product> storeMap = new HashMap<Integer, Product>();
    private List<SoldItem> soldItemList = new ArrayList<SoldItem>();

    public void setProdus(Product produs) {
        this.produs = produs;
    }

    private Product produs;

    public Product getProdus() {
        return produs;
    }
    public void setProduct(Product produs){
        produs = produs;
    }

    public Store(Map<Integer, Product> storeMap) {
        this.storeMap = storeMap;
    }

    public void addProduct(Product prod) {
        storeMap.put(this.generateProductId(storeMap.keySet()), prod);
    }
    public int generateProductId(Set<Integer> keys) {
        if (keys.size() == 0){
            return 1;
        }else {
        return Collections.max(keys) + 1;
        }
    }
    public int generateIdForArrayList(List<SoldItem> list){
        if (list.size() == 0){
            return 1;
        }else {
            return list.size() + 1;
        }
    }

//    declare init set properties solditems and then add it to list
    public void sellProducts(int id, int stockNumber) {
        if (storeMap.get(id) != null)
            // caz 1 clientul cumpara mai putin decat avem si noi setam noua valoare a stock nr
            if (storeMap.get(id).getStockNumber() - stockNumber > 0) {
                storeMap.get(id).setStockNumber(storeMap.get(id).getStockNumber() - stockNumber);
//to put this to a function
                SoldItem solditemOBJ = new SoldItem();
                solditemOBJ.setSoldItem(storeMap.get(id));
                solditemOBJ.setDate(this.getTodayDateAsString());
                solditemOBJ.setID(id);
                solditemOBJ.getSoldItem().setStockNumber(stockNumber);
                soldItemList.add(solditemOBJ);

                // caz 2 clientul cumpara tot, iar noi stergem produsul din store..
            } else if (storeMap.get(id).getStockNumber() - stockNumber == 0) {
                storeMap.remove(id);
                // caz 3 clientul este prost :)))
            } else {
                System.out.println("We dont have that many items on the stock!");
            }
        else
            System.out.println("Product does not exists!");
    }

    public String getTodayDateAsString(){
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public void displayProducts() {
        for (Map.Entry<Integer, Product> prod : this.storeMap.entrySet()) {
            System.out.println("ID,Name,Quantity,Validity");
            System.out.println("==========================================");
            System.out.print(prod.getKey() + ", ");
            System.out.print(prod.getValue().getName() + ", ");
            System.out.print(prod.getValue().getStockNumber() + ", ");
            System.out.print(prod.getValue().getValidityDate() + " ");
            System.out.println("==========================================");
        }
    }
//    Create function to display solditems based on input date
    public void displaySoldItemsFromDate(String inputDate){
//        Parcurgem lista si afisam elementele daca au data aleasa de noi, adica inputDate
//          For (tipArrayList numeVariabila : denumire lista){
//         }

        for (SoldItem myItem : soldItemList) {
            System.out.println(myItem.getDate());
            if (myItem.getDate().equals(inputDate)){
                System.out.println(myItem.getSoldItem().getName());
                System.out.println(myItem.getSoldItem().getStockNumber());
            }
        }
    }
}
