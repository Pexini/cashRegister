package DataBaseManager;

public class Main {
    public static void main(String[] args) {
        DatabaseManager.connect("dsfsfsfs", "Sveta", "gftr522");
        DatabaseManager.executeQuery("test");
        DatabaseManager.DatabaseConnection dbConnection = new DatabaseManager.DatabaseConnection("hdbsa", "skdsadk", "safasfa");
        dbConnection.innerMethod();
    }
}

class DatabaseManager {
    private static DatabaseConnection connection;

    public static void connect(String url, String usermane, String password) {
        connection = new DatabaseConnection(url, usermane, password);
        System.out.println("Подключение к базе данных установленно");
    }

    public static void executeQuery(String query) {
        if (connection == null) {
            System.out.println("Ошибка соединения не установленно");
        } else {
            System.out.println("Запрос выполняется" + query);
        }
    }


    public static class DatabaseConnection {

        private String url;
        private String username;
        private String password;

        public DatabaseConnection(String url, String username, String password) {
            this.url = url;
            this.username = username;
            this.password = password;
        }

        public void innerMethod() {

        }
    }

}
