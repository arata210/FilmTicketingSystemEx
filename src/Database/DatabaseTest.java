package Database;

import Movie.Film;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class DatabaseTest {
    public static void init() throws SQLException {
        Map<Integer, Film> films = new HashMap<>();
        // 初始化
        init a = new init();
        a.insert();
        // 关闭
        DBManager.getConn().close();
//        Scanner s = new Scanner(System.in);
//        String name = s.next();
//        query q = new query();
//        name = "%" + name + "%";
//        System.out.println(q.select(name));
//        DBManager.getConn().close();

    }
}