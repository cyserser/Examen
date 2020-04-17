package es.ulpgc.eite.cleancode.advclickcounter.cells;

import android.util.Log;

public class CellListModel implements CellListContract.Model {

    public static String TAG = CellListModel.class.getSimpleName();

    public CellListModel() {

    }

    @Override
    public String fetchData() {
        // Log.e(TAG, "fetchData()");
        return "Hello";
    }
}
