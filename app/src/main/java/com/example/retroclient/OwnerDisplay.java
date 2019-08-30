package com.example.retroclient;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
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

        Button btnAddUser = (Button) findViewById(R.id.btnAddUser);

        LoginService loginService =
                ServiceGenerator.createService(LoginService.class);

        btnAddUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OwnerDisplay.this, OwnerActivity.class);
                intent.putExtra("user_name", "");
                startActivity(intent);
            }
        });

        Call<List<Owner>> call = loginService.getOwner();

        call.enqueue(new Callback<List<Owner>>() {
            @Override
            public void onResponse(Call<List<Owner>> call, Response<List<Owner>> response) {
                //adapter = new OwnerAdapter(response.body().getOwners(), getActivity());
                List<Owner> ownerList = response.body();
                String[] owners = new String[ownerList.size()];

                //looping through all the heroes and inserting the names inside the string array
                for (int i = 0; i < ownerList.size(); i++) {
                    owners[i] = ownerList.get(i).getFirstname()+" "+ownerList.get(i).getLastname()+" flatno= "+ownerList.get(i).getFlatno();

                }
                listview.setAdapter(new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, owners));


            }

            @Override
            public void onFailure(Call<List<Owner>> call, Throwable t) {

            }
        });


    }
}