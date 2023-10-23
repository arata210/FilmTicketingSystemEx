package Database;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.sql.*;


public class init {
    public void insert(){
        // 插入数据

        // csv外部库文件导入
        try (CSVParser parser = CSVParser.parse(new FileReader("src/2023年上海国际电影节排片表-2023.csv"), CSVFormat.DEFAULT)) {
            //跳过前2行数据
            parser.iterator().next();
            parser.iterator().next();

            // 设置sql语句
            String sql = "INSERT IGNORE INTO MOVIE (movieId, movieChiName, movieEngName, movieDirector, movieCountry_Region, movieLength, showData, showTime, cinemaName, cinemaHall, cinemaAddress, ticket) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) ";
            // 执行语句
            PreparedStatement ps = DBManager.getConn().prepareStatement(sql);

            //遍历CSV
            for (CSVRecord record : parser) {
                // 设置每行各列的index
                int index = 1;
                // 读取每行元素
                for (String field : record) {
                    if (index == 1 || index == 6 || index == 12) {
                        ps.setInt(index, Integer.parseInt(field)); // 转换为int并传入数据
                    } else {
                        // 传入数据
                        ps.setString(index, field);
                    }
                    index++;
                }
                ps.addBatch(); // 添加到批处理中
            }
            ps.executeBatch(); // 执行批处理
            System.out.println("数据库初始化成功。");
        } catch (Exception e) {
            // 抛出异常
            e.printStackTrace();
        }
    }
}