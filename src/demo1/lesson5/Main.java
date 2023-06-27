package demo1.lesson5;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Main {
    public static void main(String[] args)  {
String url = "jdbc:mysql://127.0.0.1:3306/testjava1";
String name = "root";
String password = "Rose0969019229";

        try {
            Connection connection = DriverManager.getConnection(url,name,password);
            System.out.println("connect");
//            PreparedStatement preparedStatement = connection.prepareStatement("insert into user values (null, 'Oksana', 'Peugeot', 43)");
//            preparedStatement.executeUpdate();
//            connection.close();

            PreparedStatement preparedStatement1 = connection.prepareStatement("select * from user where age >20");
            ResultSet resultSet = preparedStatement1.executeQuery();

            List<User> userList = new ArrayList<>();
            while (resultSet.next()) {
               if (resultSet.getString(2).equals("Dasha")){
                   userList.add(new User(resultSet.getInt("id"), resultSet.getString(2), resultSet.getString(3), resultSet.getInt(4)));
                   System.out.println(userList);
               }
            }

////            System.out.println(userList);
//            List<User> collect = userList.stream()
//                    .filter(user -> user.age >= 21)
//                    .collect(Collectors.toList());
//
//            for (User user : collect) {
//                System.out.println(user);
//            }

            connection.close();
        } catch (SQLException e) {
            System.out.println("Err");
        }




    }
}
