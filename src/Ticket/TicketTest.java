package Ticket;

import Movie.Film;
import Movie.FilmManagement;

import java.util.Map;
import java.util.Scanner;

import Database.update;

public class TicketTest {
    public static void select(){
        System.out.println("请输入需要查询的电影：");
        FilmManagement film = new FilmManagement();
        Scanner s = new Scanner(System.in);
        String name = s.next();
        Map<Integer, Film> fm = film.getInfoByCName(name);

        Ticket ticket=new Ticket();
        update u = new update();
        // 购票
        int x =ticket.buy(fm);
        // 接收值为0 购票失败 否则传回数据库更改余票 购票成功
        if (x == 0) {
            System.out.println("购票失败");
        }else{
            u.Up(x);
        }
//		System.out.println(fm);
    }
    public static void main(String[] args){
//        FilmManagement.initFilms();

//        ticket.showOrder(order);
    }
}