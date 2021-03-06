package com.example.dell.foodapp;

import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FoodCategory extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView listfood = getListView();
        ArrayAdapter<Food> listAdapter=new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Food.ourFood);
        listfood.setAdapter(listAdapter);

    }

    @Override
    protected void onListItemClick(ListView listView, View itemView, int position, long id) {
        super.onListItemClick(listView, itemView, position, id);
        Intent intent =new Intent(this,FoodActivity.class);
        intent.putExtra(FoodActivity.Extra_FoodNo,(int) id);
        startActivity(intent);

    }
}





