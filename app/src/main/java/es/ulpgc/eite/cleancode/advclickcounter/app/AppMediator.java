package es.ulpgc.eite.cleancode.advclickcounter.app;

import android.app.Application;

import es.ulpgc.eite.cleancode.advclickcounter.clicks.ClickListState;
import es.ulpgc.eite.cleancode.advclickcounter.counters.CounterListState;

public class AppMediator extends Application {

  private CounterListState counterListState;
  private ClickListState clickListState;

  @Override
  public void onCreate() {
    super.onCreate();

    counterListState =new CounterListState();
    clickListState = new ClickListState();
  }

  public CounterListState getCounterListState() {
    return counterListState;
  }

  public ClickListState getClickListState() {
    return clickListState;
  }

  public void setNextCounterScreenState(CounterToClickState state) {

  }

  public ClickToCounterState getNextCounterScreenState() {
    return null;
  }

  public void setPreviousClickScreenState(ClickToCounterState state) {

  }

  public CounterToClickState getPreviousClickScreenState() {
    return null;
  }
}
