package es.ulpgc.eite.cleancode.advclickcounter.cells;

import android.util.Log;

import java.lang.ref.WeakReference;

public class CellListPresenter implements CellListContract.Presenter {

    public static String TAG = CellListPresenter.class.getSimpleName();

    private WeakReference<CellListContract.View> view;
    private CellListState state;
    private CellListContract.Model model;
    private CellListContract.Router router;

    public CellListPresenter(CellListState state) {
        this.state = state;
    }


    @Override
    public void fetchData() {
        // Log.e(TAG, "fetchData()");

        // initialize the state if is necessary
        if (state == null) {
            state = new CellListState();
        }

        // use passed state if is necessary
        CellListState savedState = router.getDataFromPreviousScreen();
        if (savedState != null) {

            // update view and model state
            state.data = savedState.data;

            // update the view
            view.get().displayData(state);

            return;
        }

        // call the model
        String data = model.fetchData();

        // set view state
        state.data = data;

        // update the view
        view.get().displayData(state);

    }

    @Override
    public void injectView(WeakReference<CellListContract.View> view) {
        this.view = view;
    }

    @Override
    public void injectModel(CellListContract.Model model) {
        this.model = model;
    }

    @Override
    public void injectRouter(CellListContract.Router router) {
        this.router = router;
    }
}
