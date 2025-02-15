package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class implementing the IObservable interface.
 * This class maintains a list of observers and notifies them of changes.
 */
public class AbstractObservable implements IObservable {

  /** 
   * List of observers (listeners)
   */
  private List<IObserver> observers;

  /**
   * Constructor initializes the list of observers.
   */
  public AbstractObservable() {
    observers = new ArrayList<>();
  }

  /**
   * Adds an observer (listener) to the list.
   * @param observer the observer to add
   */
  @Override
  public void addObserver(IObserver observer) {
    if (observer != null && !observers.contains(observer)) {
      observers.add(observer);
    }
  }

  /**
   * Removes an observer (listener) from the list.
   * @param observer the observer to remove
   */
  @Override
  public void removeObserver(IObserver observer) {
    observers.remove(observer);
  }

  /**
   * Notifies all registered observers when a change occurs.
   */
  protected void fireChange() {
    for (IObserver observer : observers) {
      observer.update(this);
    }
  }
}
