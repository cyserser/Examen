package es.ulpgc.eite.cleancode.advclickcounter.cells;

import android.util.Log;
import android.content.Intent;
import android.content.Context;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class CellListRouter implements CellListContract.Router {

    public static String TAG = CellListRouter.class.getSimpleName();

    private AppMediator mediator;

    public CellListRouter(AppMediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public void navigateToNextScreen() {
        Context context = mediator.getApplicationContext();
        Intent intent = new Intent(context, CellListActivity.class);
        context.startActivity(intent);
    }

    @Override
    public void passDataToNextScreen(CellListState state) {
        mediator.setCellListState(state);
    }

    @Override
    public CellListState getDataFromPreviousScreen() {
        CellListState state = mediator.getCellListState();
        return state;
    }
}
