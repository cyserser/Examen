package es.ulpgc.eite.cleancode.advclickcounter.cells;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import es.ulpgc.eite.cleancode.advclickcounter.R;

public class CellListActivity
        extends AppCompatActivity implements CellListContract.View {

    public static String TAG = CellListActivity.class.getSimpleName();

    private CellListContract.Presenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cell_list);

        // do the setup
        CellListScreen.configure(this);
    }

    @Override
    protected void onResume() {
        super.onResume();

        // load the data
        presenter.fetchData();
    }

    @Override
    public void displayData(CellListViewModel viewModel) {
        //Log.e(TAG, "displayData()");

        // deal with the data
        ((TextView) findViewById(R.id.data)).setText(viewModel.data);
    }

    @Override
    public void injectPresenter(CellListContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
