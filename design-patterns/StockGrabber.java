import java.util.ArrayList;

public class StockGrabber implements Subject{
    
    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver){
        observers.add(newObserver);
    }
    public void unregister(Observer deleteObserver){
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        observers.remove(observerIndex);
    }
    public void notifyObserver(){
        for(Observer observer : observers){
            observer.update(ibmPrice, applePrice, googlePrice);
        }
    }

    public void setIbmPrice(double newIbmPrice){
        this.ibmPrice = newIbmPrice;
        notifyObserver();
    }

    public void setApplePrice(double newApplePrice){
        this.applePrice = newApplePrice;
        notifyObserver();
    }

    public void setGooglePrice(double newGooglePrice){
        this.googlePrice = newGooglePrice;
        notifyObserver();
    }
}
