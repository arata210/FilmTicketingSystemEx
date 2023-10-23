package Ticket;

public class Order {
    private String OrderId;
    private int ticket;
    private int seat;
    private String movieName;
    private String cinemaName;
    private String cinemaHall;
    private String showTime;
    private static int price=70;

    public Order(String orderId, int ticket, int seat, String movieName, String cinemaName,String cinemaHall, String showTime) {
        OrderId = orderId;
        this.ticket = ticket;//票数
        this.seat = seat;
        this.movieName = movieName;
        this.cinemaName=cinemaName;
        this.cinemaHall = cinemaHall;
        this.showTime = showTime;
    }

    public String getOrderId() {
        return OrderId;
    }

    public void setOrderId(String orderId) {
        OrderId = orderId;
    }

    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getCinemaHall() {
        return cinemaHall;
    }

    public void setCinemaHall(String cinemaHall) {
        this.cinemaHall = cinemaHall;
    }

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "订单号=" + OrderId +
//                ", ticket=" + ticket +
                ", 座位号=" + seat +
                ", 影片名=" + movieName +
                ", 影院=" + cinemaName +
                ", 影厅=" + cinemaHall +
                ", 开始时间=" + showTime +
                ", 价格=" + price +
                '元';
    }
}
