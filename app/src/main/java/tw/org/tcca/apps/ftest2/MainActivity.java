package tw.org.tcca.apps.ftest2;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private F1 f1;
    private F2 f2;
    private F3 f3;
    private Fragment[] fs = new Fragment[3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager);
        f1 = new F1(); f2 = new F2(); f3 = new F3();
        fs[0] = f1;fs[1] = f2;fs[2] = f3;
        viewPager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));

    }

    public void gotoF1(View view) {
        viewPager.setCurrentItem(0);
    }
    public void gotoF2(View view) {
        viewPager.setCurrentItem(1);
    }
    public void gotoF3(View view) {
        viewPager.setCurrentItem(2);
    }

    private class MyPagerAdapter extends FragmentStatePagerAdapter {

        public MyPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return fs[position];
        }

        @Override
        public int getCount() {
            return fs.length;
        }
    }

}