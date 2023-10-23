import java.util.*;
import java.util.Random;
import Movie.*;
import Ticket.*;
import Database.*;


public class Main {
    static Map<String, Account> hm = new HashMap<>();


    // 初始账户
    public static void initAccounts()
    {
        hm.put("0001", new Account("0001","Mark","1234","17712345678"));
        hm.put("0002", new Account("0002","Piggie","1234","18712345678"));
        hm.put("0003", new Account("0003","Judy","1234","17812345678"));
        hm.put("0004", new Account("0004","Jack","1234","13912345678"));

    }
    public static String checkIn(){
        System.out.println("请输入账户：");
        Scanner s = new Scanner(System.in);
        String acc = s.next();
        for (Map.Entry<String, Account> entry: hm.entrySet()){
            if (entry.getValue().getphnum().equalsIgnoreCase(acc)){
                System.out.println(entry.getValue().getUserName() + "先生/女士您好，请输入密码：");
                String password = s.next();
                if(entry.getValue().getPassWord().equals(password)){
                    return entry.getKey();
                }else{
                    System.out.print("密码输入错误。");
                    return null;
                }
            }
        }
        System.out.print("本系统无此账户。");
        return null;
    }

    public static void submenu(){
        while (true) {
            System.out.println(" ");

//            System.out.println("---欢迎使用电影购票系统---");
            System.out.println(" **** 1.查询\t****");
            System.out.println(" **** 2.购票\t****");
            System.out.println(" **** 0.退出\t****");
            System.out.println("");
            System.out.println("请选择您的操作：");

            Scanner s=new Scanner(System.in);
            int choice = s.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("请稍等，正在为您查询中......");
                    MovieTest.query();
                    break;
                case 2:
                    System.out.println("请稍等，正在为您购票中......");
                    TicketTest.select();
                    break;
                case 0:
                    System.out.println("谢谢使用本系统！");
                    return;
                default:
                    System.out.println("您的输入有误，请重新输入：");
                    break;
            }
        }
    }

    private static void mainMenu() {
        int choice;
        Scanner s = new Scanner(System.in);
        // 数据库初始化
        try {
            DatabaseTest.init();
        }catch (Exception e){
            e.printStackTrace();
        }
        while (true) {
            System.out.println("---欢迎使用电影购票系统---");
            System.out.println("登录 - 1");
            System.out.println("注册 - 2");
            System.out.println("退出 - 0");
            System.out.println("");
            System.out.print("请输入：");
            choice = s.nextInt();
            switch (choice) {
                case 1:
                    // checkIn返回账户ID，为空则登录失败
                    String currentAccount = checkIn();
                    if (currentAccount!=null){
                        System.out.println("登录成功！");
                        submenu();
                    }else{
                        System.out.println("登录失败！");
                    }
                    break;

                case 2:
                    // 注册
                    System.out.println("请输入手机号：");
                    String phnum = s.next();
                    System.out.println("请输入姓名：");
                    String name = s.next();
                    System.out.println("请输入密码：");
                    String password = s.next();

                    // 账户Map的key取四位随机数值
                    Random r = new Random();
                    int RR = r.nextInt(9999 - 1) + 1000;
                    // int转为String
                    String strNumber = String.valueOf(RR);
                    // 存入账户Map
                    hm.put(strNumber, new Account(strNumber, name, password, phnum));
                    System.out.println("注册成功！");
                    break;
                case 0 :
                    System.out.println("谢谢使用本系统！");
                    return;
                default:
                    System.out.println("您的输入有误，请重新输入：");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        initAccounts();
        mainMenu();
    }
}
