import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    private int startTime; // thread upadted using this
    private String stock;
    private double price;

    private StockGrabber stockGrabber;

    public GetTheStock(
        StockGrabber stockGrabber,
        int newStartTime,
        String newStock,
        double newPrice
    )
    {
        this.stockGrabber = stockGrabber;
        startTime = newStartTime;
        stock = newStock;
        price = newPrice;
    }

    public void run(){
        for(int i = 0;i<= 10; i++){
            try{
                // pause the code for 2s
                // for the update to take place
                Thread.sleep(2000);
            } catch (InterruptedException e){}

            // generate random numbers in the range
            // -0.03 to 0.03
            // Math.random() gives numbers in the range [0, 1.0)
            double random = (Math.random()*0.06) - 0.03;

            // same as numberformat, which was used to format
            // currency, here we print money-value 
            // only upto decimals
            DecimalFormat df = new DecimalFormat("#.##");

            price = Double.valueOf(df.format(price + random));

            if(stock == "IBM"){stockGrabber.setIbmPrice(price);}
            if(stock == "Apple"){stockGrabber.setApplePrice(price);}
            if(stock == "Google"){stockGrabber.setGooglePrice(price);}

            System.out.println(
                stock + " : " + 
                df.format(price - random) + " " +
                df.format(random) + " = " +
                df.format(price) + "\n"
            );
        }
    }



}