class StudentCinema extends Cinema{

    public StudentCinema(double price){
        this.price = price;
    }

    Double calculateAdminFee(){
        return price * 2 / 100;
    }
}