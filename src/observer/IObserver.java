package observer;

/**
 * Interface for observer objects.
 * Observers implementing this interface will receive updates from the Observable.
 */
public interface IObserver {
    /**
     * Called when an observable object changes state.
     * @param observable the object that changed
     */
    public void update(Object observable);
}
