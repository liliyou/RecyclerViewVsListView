package android.lili.com.recyclerviewvslistview.listView;

import android.lili.com.recyclerviewvslistview.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class ListViewActivity extends AppCompatActivity {

    private ListAdapter listAdapter;
    private ArrayList<String> arrayList = new ArrayList<String>();
    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        initView();
        getData();
        setRecycleView();
    }

    private void getData() {

        for (int i = 0; i < 300; i++) {
            String stringValue = Integer.toString(i);
            arrayList.add(stringValue);
        }
    }

    private void initView() {

        listView = (ListView) findViewById(R.id.listView);
    }

    private void setRecycleView() {

        listAdapter = new ListAdapter(this, arrayList);
        listView.setAdapter(listAdapter);

    }
}
