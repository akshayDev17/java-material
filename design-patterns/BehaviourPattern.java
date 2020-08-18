public class BehaviourPattern{
    public static void main(String[] args){
        StockGrabber stockGrabber = new StockGrabber();
        // stockGrabber.setIbmPrice(197.20);
        // stockGrabber.setGooglePrice(247.80);
        // stockGrabber.setApplePrice(517.50);

        StockObserver observer1 = new StockObserver(stockGrabber);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIbmPrice(197.20);
        stockGrabber.setGooglePrice(247.80);
        stockGrabber.setApplePrice(517.50);

        stockGrabber.unregister(observer1);

        // only observer2 receives updates
        stockGrabber.setIbmPrice(157.20);
        stockGrabber.setGooglePrice(257.80);
        stockGrabber.setApplePrice(487.50);

        // stocks using threading
        Runnable getIBM = new GetTheStock(
            stockGrabber,
            2,
            "IBM",
            197.00
        );
        Runnable getApple = new GetTheStock(
            stockGrabber,
            2,
            "Apple",
            257.00
        );
        Runnable getGoogle = new GetTheStock(
            stockGrabber,
            2,
            "Google",
            200.50
        );

        new Thread(getIBM).start();
        new Thread(getApple).start();
        new Thread(getGoogle).start();

    }
}