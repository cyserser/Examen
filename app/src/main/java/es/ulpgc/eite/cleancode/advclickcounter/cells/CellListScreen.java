package es.ulpgc.eite.cleancode.advclickcounter.cells;

import java.lang.ref.WeakReference;

import androidx.fragment.app.FragmentActivity;

import es.ulpgc.eite.cleancode.advclickcounter.app.AppMediator;

public class CellListScreen {

    public static void configure(CellListContract.View view) {

        WeakReference<FragmentActivity> context =
                new WeakReference<>((FragmentActivity) view);

        AppMediator mediator = (AppMediator) context.get().getApplication();
        CellListState state = mediator.getCellListState();

        CellListContract.Router router = new CellListRouter(mediator);
        CellListContract.Presenter presenter = new CellListPresenter(state);
        CellListContract.Model model = new CellListModel();
        presenter.injectModel(model);
        presenter.injectRouter(router);
        presenter.injectView(new WeakReference<>(view));

        view.injectPresenter(presenter);

    }
}
