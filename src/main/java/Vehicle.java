public class Vehicle {

    public int mYear;
    public String mBrand;
    public String mModel;
    public int mMiles;
    public int mPrice;

    public boolean budget(Integer BUDGET){
        return (mPrice<BUDGET);
    }

    public void print(String name , int times){
        for (int i = 0 ; i < times ; i++){
            System.out.println(name);
        }
    }


}
