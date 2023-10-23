package Movie;

public class Film {
	private int movieId;
	private String movieChiName;
	private String movieEngName;
	private String movieDirector;
	private String movieCountry_Region;
	private int movieLength;
	private String showData;
	private String showTime;
	private String cinemaName;
	private String cinemaHall;
	private String cinemaAddress;
	private int ticket;

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieChiName() {
		return movieChiName;
	}

	public void setMovieChiName(String movieChiName) {
		this.movieChiName = movieChiName;
	}

	public String getMovieEngName() {
		return movieEngName;
	}

	public void setMovieEngName(String movieEngName) {
		this.movieEngName = movieEngName;
	}

	public String getMovieDirector() {
		return movieDirector;
	}

	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}

	public String getMovieCountry_Region() {
		return movieCountry_Region;
	}

	public void setMovieCountry_Region(String movieCountry_Region) {
		this.movieCountry_Region = movieCountry_Region;
	}

	public int getMovieLength() {
		return movieLength;
	}

	public void setMovieLength(int movieLength) {
		this.movieLength = movieLength;
	}

	public String getShowData() {
		return showData;
	}

	public void setShowData(String showData) {
		this.showData = showData;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public String getCinemaName() {
		return cinemaName;
	}

	public void setCinemaName(String cinemaName) {
		this.cinemaName = cinemaName;
	}

	public String getCinemaHall() {
		return cinemaHall;
	}

	public void setCinemaHall(String cinemaHall) {
		this.cinemaHall = cinemaHall;
	}

	public String getCinemaAddress() {
		return cinemaAddress;
	}

	public void setCinemaAddress(String cinemaAddress) {
		this.cinemaAddress = cinemaAddress;
	}

	public int getTicket() {
		return ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	@Override
	public String toString() {
		return "场次" + movieId +
				", 余票" + ticket +
				", " + movieChiName  +
				", 导演：" + movieDirector +
				", 制作国/地区：" + movieCountry_Region +
				", " + movieLength + "分钟, "+ showData+ showTime + ", "+ cinemaName +"-"+cinemaHall+
				", 地址：" + cinemaAddress;
	}

	public Film(int movieId, String movieChiName, String movieEngName, String movieDirector, String movieCountry_Region, int movieLength, String showData, String showTime, String cinemaName, String cinemaHall, String cinemaAddress, int ticket) {
		this.movieId = movieId;
		this.movieChiName = movieChiName;
		this.movieEngName = movieEngName;
		this.movieDirector = movieDirector;
		this.movieCountry_Region = movieCountry_Region;
		this.movieLength = movieLength;
		this.showData = showData;
		this.showTime = showTime;
		this.cinemaName = cinemaName;
		this.cinemaHall = cinemaHall;
		this.cinemaAddress = cinemaAddress;
		this.ticket = ticket;
	}
}
