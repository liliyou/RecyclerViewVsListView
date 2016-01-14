package android.lili.com.recyclerviewvslistview.listView;

import android.content.Context;
import android.lili.com.recyclerviewvslistview.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class ListAdapter extends BaseAdapter {

    private final LayoutInflater mLayoutInflater;
    private final Context context;
    private ArrayList<String> arrayList;

    public ListAdapter(Context context, ArrayList<String> arrayList) {

        this.context = context;
        this.arrayList = arrayList;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public int getCount() {

        return arrayList.size();
    }

    public Object getItem(int position) {

        return this.arrayList.size();
    }

    public long getItemId(int position) {

        return position;
    }

    // create a new ImageView for each item referenced by the Adapter
    public View getView(final int position, View convertView, ViewGroup parent) {
        //        View vi = convertView;
        final ViewHolder holder;
        if (mLayoutInflater != null) {
            if (convertView == null) {
                convertView = LayoutInflater.from(context).inflate(R.layout.item_1, parent, false);
                holder = new ViewHolder(convertView);
                convertView.setTag(holder);

            } else {
                holder = (ViewHolder) convertView.getTag();
            }


            holder.txtNotice.setText(arrayList.get(position));

        }
        return convertView;
    }

    // references to our images

    public static class ViewHolder {

        TextView txtNotice;

        public ViewHolder(View view) {
            txtNotice = (TextView) view.findViewById(R.id.txtNotice);
        }
    }

}
