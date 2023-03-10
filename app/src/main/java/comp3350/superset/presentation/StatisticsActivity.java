package comp3350.superset.presentation;


import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import comp3350.superset.R;
import comp3350.superset.business.Statistics;

public class StatisticsActivity extends Activity {

    Statistics statistics;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        statistics = new Statistics();
        int awdValue = statistics.averageWorkoutDurationMin();

        TextView editText = (TextView)findViewById(R.id.averageWorkoutDurValue);
        editText.setText(Integer.toString(awdValue));

    }


}