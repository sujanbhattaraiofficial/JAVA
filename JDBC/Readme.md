# Fundamental Steps in JDBC
- Import JDBC packages.
  
          import java.sql.*;

- Load and register the JDBC driver.
  
      Class.forName("com.jdbc.mysql.Driver");

- Open a connection to the database.
  
      Connection conn = DriverManager.getConnection(URL, username, passwd);

- Create a statement object to perform a query.

      Statement myStmt = conn.createStatement();

- Execute the statement object and return a query resultset.

      ResultSet rset = myStmt.executeQuery
      ("SELECT * FROM tablename");

- Process the resultset.

      while (rset.next())
      {
         READ DATA 
      }

- Close the resultset and statement objects.

      myStmt.close();
      rset.close();

- Close the connection.

      conn.close();




# Connection Pooling in JAVA
The connection pooling helps to utilize and efficiently re-use the database connection in a multithreading environment. The idea is to share the database connections (limited connections) with the users (unlimited numbers) in the most efficient way.


> -  A Sample Implemented Code

Attached is the complete implemented code using the jar file AviConPool.jar which you can include in your project and start re-using it. The following set of methods needs to be called to utilize this jar file.

First (and only once) Call should be,

      ConnectionPool.getInstance().setup(
                    String DBDriver, String DBURL, String username, String password, int maxConnections);

- This needs to be called from the application central component for once.

- Subsequently, the calls to the connection pool would be something like this,
 

public void functionABC

{



     Connection con = ConnectionPool.getInstance().getConnection();


  try {

  <<< Write Your Code Here >>>

                       

     Statement stmt = con.createStatement();

  ResultSet rs = stmt

     stmt.executeQuery(“select ……”);


  if (rs.next()) {

  // Read Data

  }

 

  // Help GC

  rs.close();

  stmt.close();

  rs = null;

  stmt = null;

  } catch (Exception ex) {

  // Log Errors

  }

  finally

  {

    ConnectionPool.getInstance().releaseConnection(con);

  }

}

