package Varios;
public class DB_Test1 {
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:dbTest1.db");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from Persona");
        while(resultSet.next())
            System.out.println(resultSet.getString("nombre"));
    }
}