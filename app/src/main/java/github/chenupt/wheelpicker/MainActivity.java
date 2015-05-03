package github.chenupt.wheelpicker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;

import antistatic.spinnerwheel.AbstractWheel;
import antistatic.spinnerwheel.adapters.ArrayWheelAdapter;
import antistatic.spinnerwheel.adapters.NumericWheelAdapter;

/**
 * Created by chenupt@gmail.com on 2015/5/3.
 * Description TODO
 */
public class MainActivity extends ActionBarActivity{

    private String[] testArray = new String[] {"Paris", "Bordeaux", "Le Mans", "Orleans", "Valence", "Amiens", "Rouen", "Touluse", "La Rochelle"};

    private AbstractWheel abstractWheel;
    private AbstractWheel wheel2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        abstractWheel = (AbstractWheel) findViewById(R.id.wheel1);
        wheel2 = (AbstractWheel) findViewById(R.id.wheel2);
        abstractWheel.setVisibleItems(5);
        wheel2.setVisibleItems(5);


        ArrayWheelAdapter<String> arrayWheelAdapter = new ArrayWheelAdapter<>(this, testArray);
        abstractWheel.setViewAdapter(arrayWheelAdapter);

        NumericWheelAdapter adapter = new NumericWheelAdapter(this, 0, 23, "%02d");
        wheel2.setViewAdapter(adapter);
    }


}
