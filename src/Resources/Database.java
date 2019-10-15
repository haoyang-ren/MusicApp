
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//TODO: Add Import Statements

public class Database {
    
    public static Connection conn;

	/* NO NEED TO CALL THIS METHOD OUTSIDE THE DATABASE CLASS */
    public static void openConnection() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection("jdbc:sqlite:indiefyDB.db");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

	/* Pass an SQL String into this method when querying the database */
    public ResultSet getResultSet(String sqlstatement) throws SQLException {
        openConnection();
        java.sql.Statement statement = conn.createStatement();
        ResultSet RS = statement.executeQuery(sqlstatement);
        return RS;
    }

	/* Pass an SQL String into this method when inserting data into the database */
    public void insertStatement(String insert_query) throws SQLException {
        java.sql.Statement stmt = null;
        openConnection();
        try {
            System.out.println("Database opened successfully");
            stmt = conn.createStatement();
            System.out.println("The query was: " + insert_query);
            stmt.executeUpdate(insert_query);
            stmt.close();
            conn.commit();
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        stmt.close();
    }
    
    public static void createLoginTable() throws SQLException {
       //TODO: Fill in this method
       //create connection
        Connection conn = DriverManager.getConnection("jdbc:sqlite:indiefyDB.db");
        System.out.println("Database Connected");
        //create statement
        Statement st = conn.createStatement();
        //create your table
        String createStatement = "CREATE TABLE IF NOT EXISTS USER "
                + "(ID INTEGER PRIMARY KEY autoincrement, "
                + "USERNAME TEXT NOT NULL, "
                + "PASSWORD TEXT NOT NULL, "
                + ");";
        System.out.println(createStatement);

        st.execute(createStatement);
        //cleanup code (close statement and connection objects)
        st.close();
        conn.close();
    }
    
    
    public static void createMusicTable() throws SQLException {
     //TODO: Fill in this method
     //create connection
        Connection conn = DriverManager.getConnection("jdbc:sqlite:indiefyDB.db");
        System.out.println("Database Connected");
        //create statement
        Statement st = conn.createStatement();
        //create your table
        String createStatement = "CREATE TABLE IF NOT EXISTS MUSIC "
                + "(ID INTEGER PRIMARY KEY autoincrement, "
                + "ALBUM TEXT NOT NULL, "
                + "ARTIST TEXT NOT NULL, "
                + "GENRE TEXT NOT NULL, "
                + "YEAR TEXT NOT NULL"
                + ");";
        System.out.println(createStatement);

        st.execute(createStatement);
        //cleanup code (close statement and connection objects)
        st.close();
        conn.close();
    }
    
}

