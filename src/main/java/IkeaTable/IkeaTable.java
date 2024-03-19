package IkeaTable;

public class IkeaTable {

    private String Model = "Taranova";
    private static int yearOfProduction = 2020;

    public static class Drawing{
        private static String instructions =
                " 1. Открыть коробку " +
                        " 2. Сщбрать стол";
        public static String getInstructions(){
            return  instructions;
        }
        public static int getyearOfProduction(){
            return yearOfProduction;
        }
        public String getFactoryAdress(){
            return "Моссква, ул. Звенигородская";
        }

    }
}
