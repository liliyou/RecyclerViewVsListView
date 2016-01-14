package android.lili.com.recyclerviewvslistview.listView;

import android.lili.com.recyclerviewvslistview.R;
import android.lili.com.recyclerviewvslistview.TestListView;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;

public class LV1EditTextActivity extends AppCompatActivity {

    private ListAdapter listAdapter;
    private ArrayList<String> arrayList = new ArrayList<String>();
    private TestListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lv_edittext);
        initView();
        getData();
        setRecycleView();
    }

    private void getData() {

        for (int i = 0; i < 30; i++) {
            String stringValue = Integer.toString(i);
            arrayList.add(stringValue);
        }
    }

    private void initView() {

        listView = (TestListView) findViewById(R.id.listView);
    }

    private void setRecycleView() {

        listAdapter = new ListAdapter(this, arrayList);
        listView.setAdapter(listAdapter);

    }
}
