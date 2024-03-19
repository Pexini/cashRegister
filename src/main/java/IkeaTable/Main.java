package IkeaTable;

public class Main {
    public static void main(String[] args) {


        String instructions = IkeaTable.Drawing.getInstructions();
        int yearOfProduct = IkeaTable.Drawing.getyearOfProduction();
        String model = IkeaTable.getModel();

        System.out.println(instructions);
        System.out.println(yearOfProduct);
        System.out.println(model);

        IkeaTable.Drawing drawing = new IkeaTable.Drawing();
        String factoruAdress = drawing.getFactoryAdress();
        System.out.println(factoruAdress);
    }
}
