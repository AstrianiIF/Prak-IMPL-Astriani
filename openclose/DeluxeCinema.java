class DeluxeCinema extends Cinema{

    public DeluxeCinema(double price){
        this.price = price;
    }

    Double calculateAdminFee(){
        return price * 12 / 100;
    }
}