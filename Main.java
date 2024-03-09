package ContactManagementSystems;

//import java.sql.SQLException;
//
//public class Main {
//	
//	
//	public static void main(String[] args) throws SQLException {
//		
//		
//		new ContactsList(new Database());
//	}
//
//}




import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            new ContactsList(new Database());
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            // Handle the exception appropriately, for example, display an error message
        }
    }
}
