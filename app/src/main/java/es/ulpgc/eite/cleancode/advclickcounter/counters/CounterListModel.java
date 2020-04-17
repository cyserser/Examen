package es.ulpgc.eite.cleancode.advclickcounter.counters;

import java.util.ArrayList;
import java.util.List;

import es.ulpgc.eite.cleancode.advclickcounter.data.CounterData;

public class CounterListModel implements CounterListContract.Model {

  public static String TAG = CounterListModel.class.getSimpleName();

  private String data;

  private final List<CounterData> itemList = new ArrayList<>();

  public CounterListModel(String data) {
    this.data = data;

  }

  @Override
  public String getStoredData() {
    // Log.e(TAG, "getStoredData()");
    return data;
  }

  @Override
  public void onRestartScreen(String data) {
    // Log.e(TAG, "onRestartScreen()");
    this.data=data;
  }

  @Override
  public void onDataFromNextScreen(String data) {
    // Log.e(TAG, "onDataFromNextScreen()");
    this.data=data;

  }
  @Override
  public void onDataFromPreviousScreen(String data) {
    // Log.e(TAG, "onDataFromPreviousScreen()");
    this.data=data;
  }


}
