package Movie;

import Database.DBManager;
import Database.query;

import java.sql.SQLException;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;

public class FilmManagement {

	public static Map<Integer, Film> fm = new HashMap<>();

	public Map<Integer, Film> getInfoByCName(String name){
		// 创建对象
		query q = new query();
		// 增加模糊查询
		name = "%" + name + "%";
		// 接收数据库传入Map数据
		fm = q.select(name);

		// Map为空跳出
		if(fm.isEmpty()) {
			System.out.println("未找到该电影");
		}else{
			// Map不为空输出结果
			System.out.println("查询结果：");
//			System.out.println("ID\t中文名\t英文名\t导演\t制作地\t时长\t日期\t时间\t电影院\t影厅\t地址\t余票");
			// foreach循环输出结果
			Set<Integer> id = fm.keySet();
			for(Integer i: id) {
				System.out.println(fm.get(i).toString());
			}
		}
		// 返回结果给购票
		return fm;
//		DBManager.getConn().close();
	}
}