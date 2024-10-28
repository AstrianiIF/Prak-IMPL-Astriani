class StandardCinema extends Cinema{
    
    public StandardCinema(double price){
        this.price = price;
    }

    Double calculateAdminFee(){
        return price * 10 / 100;
    }
}