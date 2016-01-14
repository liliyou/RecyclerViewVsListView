package android.lili.com.recyclerviewvslistview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * Created by lili on 2016/1/13.
 */
public class TestListView extends ListView {


    public TestListView(Context context) {

        super(context);
    }

    public TestListView(Context context, AttributeSet attrs) {

        super(context, attrs);
    }

    public TestListView(Context context, AttributeSet attrs, int defStyleAttr) {

        super(context, attrs, defStyleAttr);
    }

    public TestListView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {

        super(context, attrs, defStyleAttr, defStyleRes);
    }

    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {

//        int x = getScrollX();
//        int y = getScrollX();
//
//        Log.e("TestRecyclerView", "x " + x);
//        Log.e("TestRecyclerView", "y " + y);
//        Log.e("TestRecyclerView", "w " + w);
//        Log.e("TestRecyclerView", "h " + h);
//        Log.e("TestRecyclerView", "oldw " + oldw);
//        Log.e("TestRecyclerView", "oldh " + oldh);
        super.onSizeChanged(w, h, oldw, oldh);

        setSelection(getCount());
    }


}
