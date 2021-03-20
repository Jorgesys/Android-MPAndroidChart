package com.jorgesys.mpandroidchart;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;

public class BarChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barchart);
        BarChart chart = findViewById(R.id.barchart);

        ArrayList Chartentry = new ArrayList();

        Chartentry.add(new BarEntry(320f, 0));
        Chartentry.add(new BarEntry(455f, 1));
        Chartentry.add(new BarEntry(650f, 2));
        Chartentry.add(new BarEntry(723f, 3));
        Chartentry.add(new BarEntry(948f, 4));
        Chartentry.add(new BarEntry(1122f, 5));
        Chartentry.add(new BarEntry(1345f, 6));
        Chartentry.add(new BarEntry(1512f, 7));
        Chartentry.add(new BarEntry(1789f, 8));
        Chartentry.add(new BarEntry(1965f, 9));
        Chartentry.add(new BarEntry(2143f, 10));
        Chartentry.add(new BarEntry(2254f, 11));

        BarDataSet bardataset = new BarDataSet(Chartentry, "Earnings by Year.");
        chart.animateY(2000);
        BarData data = new BarData(bardataset);
        bardataset.setColors(ColorTemplate.COLORFUL_COLORS);
        chart.setData(data);

        chart.setTouchEnabled(true);
        chart.setDragEnabled(true);
        chart.setScaleEnabled(true);
        chart.setFitBars(true);
        Description description = new Description();
        description.setText("Earnings by Year.");
        chart.setDescription(description);


    }

    private ArrayList<String> getXAxisValues() {
        ArrayList<String> xAxis = new ArrayList<>();
        xAxis.add("2014");
        xAxis.add("2015");
        xAxis.add("2016");
        xAxis.add("2017");
        xAxis.add("2018");
        xAxis.add("2019");
        xAxis.add("2020");
        xAxis.add("2021");
        xAxis.add("2022");
        xAxis.add("2023");
        xAxis.add("2024");
        xAxis.add("2025");
        return xAxis;

    }

}