package IkeaTable;

public class IkeaTable {

    public  static String Model = "Taranova";
    private static int yearOfProduction = 2020;

    public static String getModel() {
        return Model;
    }

    public static class Drawing {

        private static String instructions =
                " 1. Открыть коробку " +
                " 2. Собрать стол";

        public static String getInstructions() {
            return instructions;
        }

        public static int getyearOfProduction() {
            return yearOfProduction;
        }

        public String getFactoryAdress() {
            return "Моссква, ул. Звенигородская";
        }

    }
}
