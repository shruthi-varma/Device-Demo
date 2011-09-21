package conm.tli.DeviceDemo;

import android.app.Activity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.TextView;

public class DeviceDemo extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView text = (TextView) findViewById(R.id.size);
        
        int ht;
        int wt;
        DisplayMetrics displaymetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displaymetrics);
        ht = displaymetrics.heightPixels;
        wt = displaymetrics.widthPixels;
        String s = wt+" x " +ht;
        text.setText(s);

    }
}