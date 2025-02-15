package observer;

/**
 * Interface for observable objects.
 * Defines methods to add and remove observers.
 */
public interface IObservable {
    public void addObserver(IObserver observer);
    public void removeObserver(IObserver observer);
}
