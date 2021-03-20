package com.jorgesys.mpandroidchart;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Description;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

public class PieChartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_piechart);
        PieChart pieChart = findViewById(R.id.piechart);
        List<PieEntry> Chartentry = new ArrayList();

        Chartentry.add(new PieEntry(320f, 0));
        Chartentry.add(new PieEntry(455f, 1));
        Chartentry.add(new PieEntry(650f, 2));
        Chartentry.add(new PieEntry(723f, 3));
        Chartentry.add(new PieEntry(948f, 4));
        Chartentry.add(new PieEntry(1122f, 5));
        Chartentry.add(new PieEntry(1345f, 6));
        Chartentry.add(new PieEntry(1512f, 7));
        Chartentry.add(new PieEntry(1789f, 8));
        Chartentry.add(new PieEntry(1965f, 9));
        Chartentry.add(new PieEntry(2143f, 10));
        Chartentry.add(new PieEntry(2254f, 11));

        PieDataSet dataSet = new PieDataSet(Chartentry, "Earnings by Year.");
        PieData data = new PieData(dataSet);

        pieChart.setData(data);
        dataSet.setColors(ColorTemplate.COLORFUL_COLORS);
        dataSet.setFormLineWidth(50f);
        pieChart.animateXY(3000, 3000);

        pieChart.setTouchEnabled(true);
        Description description = new Description();
        description.setText("Earnings by Year.");
        pieChart.setDescription(description);

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
