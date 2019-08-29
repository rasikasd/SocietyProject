package com.example.retroclient;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class OwnerAdapter extends BaseAdapter {

    private List<Owner> owners;
    private Context context;
    public OwnerAdapter(Context context,List<Owner> owners){
        this.context = context;
        this.owners = owners;
    }

    @Override
    public int getCount() {
        return owners.size();
    }

    @Override
    public Object getItem(int i) {
        return owners.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
