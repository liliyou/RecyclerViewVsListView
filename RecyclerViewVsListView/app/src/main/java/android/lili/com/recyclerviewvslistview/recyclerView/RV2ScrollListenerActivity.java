package android.lili.com.recyclerviewvslistview.recyclerView;

import android.lili.com.recyclerviewvslistview.R;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import java.util.ArrayList;

public class RV2ScrollListenerActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerAdapter;
    private ArrayList<String> arrayList = new ArrayList<String>();
    LinearLayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rv_edittext);
        initView();
        getData();
        setRecycleView();
    }

    private void getData() {

        for (int i = 0; i < 20; i++) {
            String stringValue = Integer.toString(i);
            arrayList.add(stringValue);
        }
    }

    private void initView() {

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }

    private void setRecycleView() {
         layoutManager=new LinearLayoutManager(this);
        recyclerAdapter = new RecyclerViewAdapter(this, arrayList);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(recyclerAdapter);
        recyclerView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int dx, int dy) {

                int pastVisiblesItems, visibleItemCount, totalItemCount;
                visibleItemCount = layoutManager.getChildCount();
                totalItemCount = layoutManager.getItemCount();
                pastVisiblesItems = layoutManager.findFirstVisibleItemPosition();

                if (dy > 0) //check for scroll down
                {
                    if ((visibleItemCount + pastVisiblesItems) > (totalItemCount-1)) {
                        //最底
                        Log.e("recyclerView","最底");
                    } else {
                        Log.e("recyclerView","不是最底");
                    }

                } else if (dy < 0) {
                    if (pastVisiblesItems <= 1) {
                        Log.e("recyclerView","最高");
                    } else {
                        Log.e("recyclerView","不是最高");
                    }
                } else {

                    Log.e("recyclerView","其他");
                }
            }
        });

    }
}
