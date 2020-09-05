package tw.org.tcca.apps.ftest2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.os.Handler;
import android.os.Message;
import android.provider.Contacts;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import java.util.Timer;
import java.util.TimerTask;

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
        FListener flistener = new FListener();
        f1.setOnClickListener(flistener);
        f2.setOnClickListener(flistener);
        f3.setOnClickListener(flistener);
        f4.setOnClickListener(flistener);

        timer.schedule(new MyTask(), 1000, 1000);
        return mainView;
    }

    private class FListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            viewFlipper.showNext();
        }
    }
    private UIHandler uiHandler = new UIHandler();
    private Timer timer = new Timer();
    private class MyTask extends TimerTask {
        @Override
        public void run() {
            uiHandler.sendEmptyMessage(0);
        }
    }

    private class UIHandler extends Handler {
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            viewFlipper.showNext();
        }
    }
}