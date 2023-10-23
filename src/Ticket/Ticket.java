package Ticket;
import Movie.FilmManagement;
import Movie.Film;


import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//购票
public class Ticket {
    static Map<Integer ,Order> order=new HashMap<>();

    public int buy(Map<Integer, Film> fm){
        //订单编号
        LocalDateTime date=LocalDateTime.now();
        // 定义单号格式 年 月 日 时间 分钟 秒 毫秒（3位）
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMddhhmmssSSS");
        // 接收数据
        String format = date.format(formatter);
//        System.out.println(format);

        Scanner sc=new Scanner(System.in);


        FilmManagement film = new FilmManagement();
         System.out.println("请选择场次");
            int which=sc.nextInt();
            // entry遍历Map
            for (Map.Entry<Integer, Film> entries : film.fm.entrySet()){
                // 判断输入id是否与数据库查询返回的Map的id相同
                if(entries.getValue().getMovieId()==which){
//                    System.out.println("请选择座位:");
//                    int seat=sc.nextInt();
                    // 票数-10
                    entries.getValue().setTicket(entries.getValue().getTicket()-1);
                    // 方便起见直接使用余票设为座位号
                    Order temp=new Order(format,1,entries.getValue().getTicket()+1,entries.getValue().getMovieChiName(),entries.getValue().getCinemaName(),entries.getValue().getCinemaHall(),entries.getValue().getShowTime());

                    // 传入Map order
                    order.put(entries.getValue().getMovieId(),temp);

                    // 提示用户
                    System.out.println("购票成功！");
                    // 输出订单信息
                    System.out.println(temp + ", 结束时间=" + LocalTime.parse(entries.getValue().getShowTime(), DateTimeFormatter.ofPattern("H:mm")).plusMinutes(entries.getValue().getMovieLength()));
                    // 返回购票的电影id
                    return entries.getValue().getMovieId();
                }
            }
            // 返回非传入Map数据
        System.out.println("无此电影!");

            // 返回0
        return 0;
    }

    public void showOrder(Map<String ,Order> order){
        for (Map.Entry<String, Order> entry : order.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}

