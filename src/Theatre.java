public class Theatre {
    private int price;
    private double profit = 0;
    private User[] seats;

    public Theatre(int param1, int nOfPlaces) {
        this.price = param1;
        this.seats = new User[nOfPlaces];
    }

    public void assignPlace(User user, int place) {
        if (user.getAge() > 5 && user.getAge() < 10) {
            this.profit += this.price * 0.3;
        } else if (user.getAge() >= 65) {
            this.profit +=  this.price * 0.7;
        } else if (user.getAge() >= 10 && user.getAge() < 65){
            this.profit += this.price;
        }
        this.seats[place] = user;
    }

    public String getArchive(){
        String archive = "";
        for (int i=0; i< seats.length; i++) {
            archive += i +" " + seats[i] + "\n";
        }
        return archive;
    }

    public double getProfit(){
        return this.profit;
    }
}
