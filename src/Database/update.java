package Database;

import java.sql.PreparedStatement;

public class update {
    public void Up(int id){
        // 通过传入电影ID更新余票数
        String sql="update MOVIE set ticket=ticket-1 where movieID=?";
        try(PreparedStatement ps = DBManager.getConn().prepareStatement(sql)){
            // 设置ID
            ps.setInt(1, id);
            // 执行更新操作
            ps.executeUpdate();
        } catch (Exception e) {
            // 抛出异常
            e.printStackTrace();
        }
    }
}
