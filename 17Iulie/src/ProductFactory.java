public class ProductFactory {
    public Animal getAnimalProduct (String productKey){
        Animal animalProd = null;

        switch (productKey) {
            case "Egg":
                animalProd = new Egg();
                break;
            case "Milk":
                animalProd = new Milk();
                break;
            case "Yogurt":
                animalProd = new Yogurt();
                break;
            case "Cheese":
                animalProd = new Cheese();
                break;
            case "Sour Cream":
                animalProd = new SourCream();
                break;
            default:
                return null;
        }
        return animalProd;
    }
    public Vegetable getVegetalProduct (String productKey) {
        Vegetable vegetalProd = new Vegetable("");
        vegetalProd.setName(productKey);
        return vegetalProd;
    }
}