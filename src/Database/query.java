package Database;

import Movie.Film;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

public class query {
    public Map<Integer, Film> select(String name){
        Map<Integer, Film> filmMap = new HashMap<>();
        // 查询有余票且符合模糊关键词的结果
        String sql = "select DISTINCT * from MOVIE where movieChiName like ? and ticket > 0";
        try(PreparedStatement ps = DBManager.getConn().prepareStatement(sql)){
            // 执行sql语句 ↑     ↓ 设置传入关键词
            ps.setString(1,name);
            // 执行更新操作 结果集存入rs
            ResultSet rs=ps.executeQuery();
            // 直到结果集为空跳出
            while(rs.next())
            {
                // 新建对象 放入film
                Film film = new Film(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4), rs.getString(5), rs.getInt(6),
                        rs.getString(7), rs.getString(8), rs.getString(9),
                        rs.getString(10), rs.getString(11), rs.getInt(12));
                // 放入MAP, 设movieid为key
                filmMap.put(rs.getInt(1),film);
            }

        } catch (Exception e) {
            //抛出异常
            e.printStackTrace();
        }

        // 返回Map
        return filmMap;
    }
}