class PremiumCinema extends Cinema{

    public PremiumCinema(double price){
        this.price = price;
    }

    Double calculateAdminFee(){
        return price * 20 / 100;
    }
}