   import java.sql.*;

    public class StockExchangeDB {
        // Блок объявления констант
        public static final String DB_URL = "jdbc:h2:~/test";
        public static final String DB_Driver = "org.h2.Driver";
        private static final String DB_USERNAME = "sa";
        private static final String DB_PASSWORD = "";

        public static void main(String[] args) {
            try {
               // Class.forName(DB_Driver); //Проверяем наличие JDBC драйвера для работы с БД
                Connection connection = DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);//соединениесБД
                System.out.println("Соединение с СУБД выполнено.");
                connection.close();       // отключение от БД
                System.out.println("Отключение от СУБД выполнено.");

            } catch (SQLException e) {
                e.printStackTrace(); // обработка ошибок  DriverManager.getConnection
                System.out.println("Ошибка SQL !");
            }
        }
    }

