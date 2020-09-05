package tw.org.tcca.apps.ftest2;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

public class F1 extends Fragment {
    private View mainView;
    private ViewFlipper viewFlipper;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        mainView = inflater.inflate(R.layout.fragment_f1, container, false);
        viewFlipper = mainView.findViewById(R.id.viewFlipper);
        View f1 = viewFlipper.getChildAt(0);
        View f2 = viewFlipper.getChildAt(1);
        View f3 = viewFlipper.getChildAt(2);
        View f4 = viewFlipper.getChildAt(3);


        return mainView;
    }
}