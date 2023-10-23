package Movie;

import java.util.Map;
import java.util.Scanner;


public class MovieTest {
	public static void query(){
		System.out.println("请输入需要查询的电影：");
		FilmManagement film = new FilmManagement();
		Scanner s = new Scanner(System.in);
		String name = s.next();
		Map<Integer, Film> fm = film.getInfoByCName(name);
//		System.out.println(fm);
	}
	public static void main(String args[]) {

	}

}
