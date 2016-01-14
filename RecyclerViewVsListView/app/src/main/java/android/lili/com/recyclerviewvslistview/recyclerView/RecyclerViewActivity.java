package android.lili.com.recyclerviewvslistview.recyclerView;

import android.lili.com.recyclerviewvslistview.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerAdapter;
    private ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
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

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }

    private void setRecycleView() {

        recyclerAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerAdapter);

    }
}
