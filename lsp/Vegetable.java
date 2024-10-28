class Vegetable extends Product{

    String getName(){
        return "Broccoli";
    }

    Date getExpiredDate(){
        return new Date();
    }
}