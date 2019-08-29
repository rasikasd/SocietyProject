package com.example.retroclient;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OwnerDisplay extends AppCompatActivity {

    ListView listview;
    TextView textView;
    String[] mobileArray = {};
    ArrayAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_owner_display);

        listview = (ListView) findViewById(R.id.lv);
        textView=(TextView)findViewById(R.id.textView);

        LoginService loginService =
                ServiceGenerator.createService(LoginService.class);


        Call<List<Owner>> call = loginService.getOwner();



        call.enqueue(new Callback<List<Owner>>() {
            @Override
            public void onResponse(Call<List<Owner>> call, Response<List<Owner>> response) {
                //adapter = new OwnerAdapter(response.body().getOwners(), getActivity());
                List<Owner> ownerList = response.body();
                String[] owners = new String[ownerList.size()];

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < ownerList.size(); i++) {
                    owners[i] = ownerList.get(i).getFirstname();
                }
                listview.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, owners));

            }

            @Override
            public void onFailure(Call<List<Owner>> call, Throwable t) {

            }
        });


    }
}
