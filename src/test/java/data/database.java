package data;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class database
{
    String url = "jdbc:mysql://localhost:3306/Amazon";
    String username = "root";
    String passowrd = "kaarthik@27";
    public List<String> getdata()
    {
        List<String> list = new ArrayList<>(

        );
        try
        {
            // create connection to db
            Connection connection = DriverManager.getConnection(url,username,passowrd);
            // query
            String query = "SELECT user_name,user_password FROM credentials";
            // load query in db
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            //after load get daat from db
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next())
            {
                String ph = rs.getString("phNumber");
                String passowrd = rs.getString("password");
                list.add(ph
                );
                list.add(passowrd);
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
