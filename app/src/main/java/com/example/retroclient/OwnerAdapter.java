package com.example.retroclient;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;

import java.util.List;

public class OwnerAdapter extends ArrayAdapter<Owner> {

    private Context context;
    private List<Owner> owners;

    public OwnerAdapter(@NonNull Context context, @LayoutRes int resource,@NonNull List<Owner> objects) {
        super(context, resource, objects);
        this.context = context;
        this.owners = objects;
    }

    @Override
    public View getView(final int pos, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate( R.layout.list_owner, parent, false);

        TextView txtUserId = (TextView) rowView.findViewById(R.id.txtUserId);
        TextView txtUsername = (TextView) rowView.findViewById(R.id.txtUsername);
        TextView txtUFlatno = (TextView) rowView.findViewById(R.id.txtUFlatno);

        txtUserId.setText(String.format("#ID: %d", owners.get(pos).getId()));
        txtUFlatno.setText(String.format("FlatNo: %s", owners.get(pos).getFlatno()));
        txtUsername.setText(String.format("NAME: %s", owners.get(pos).getFirstname()+" "+owners.get(pos).getLastname()));


      //  Log.d("Owner info:- ",owners.get(1).getFirstname());

        rowView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //start Activity User Form
                Intent intent = new Intent(context, OwnerActivity.class);
                intent.putExtra("Owner_id", String.valueOf(owners.get(pos).getId()));
                intent.putExtra("Owner_Firstname", owners.get(pos).getFirstname());
                intent.putExtra("Owner_Lastname", owners.get(pos).getLastname());
                intent.putExtra("Owner_Flatno", owners.get(pos).getFlatno());
                context.startActivity(intent);
            }
        });

        return rowView;
    }
}
