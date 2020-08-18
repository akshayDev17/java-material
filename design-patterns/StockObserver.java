public class StockObserver implements Observer{
    
    private double ibmPrice;
    private double googlePrice;
    private double applePrice;

    private static int observerIDTracker = 0;
    
    private int observerID;

    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;

        System.out.println("New Observer " + this.observerID);

        stockGrabber.register(this);
    }

    public void update(
        double ibmPrice,
        double applePrice,
        double googlePrice
    ){
        this.ibmPrice = ibmPrice;
        this.applePrice = applePrice;
        this.googlePrice = googlePrice;

        System.out.println(
            "Observer : " + observerID + "\n" +
            "IBM - " + ibmPrice + "\n" +
            "Apple - " + applePrice + "\n" +
            "Google - " + googlePrice + "\n"
        );
    }
}