package com.example.jawadmughalfinalmadhpractice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;

import com.example.jawadmughalfinalmadhpractice.databinding.ActivityMainBinding;
import com.google.android.material.tabs.TabLayoutMediator;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    // use binding so there i add setup of the binding
    ActivityMainBinding binding;
    ModelAdapter adapter ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


//        ArrayList<Model> dummyDataList = new ArrayList<>();
//
//        dummyDataList.add(new Model("Sleek and Modern Chair", "A stylish chair with a sleek design, perfect for modern interiors.", R.drawable.jawad));
//        dummyDataList.add(new Model("Elegant Dining Table Set", "An elegant dining table set that adds sophistication to any dining room.", R.drawable.jawad));
//        dummyDataList.add(new Model("Cozy Sofa with Ottoman", "A cozy sofa with an accompanying ottoman, ideal for relaxation and comfort.", R.drawable.jawad));
//        dummyDataList.add(new Model("Vintage Bookshelf", "A vintage-style bookshelf that adds charm to any living space.", R.drawable.jawad));
//        dummyDataList.add(new Model("Minimalist Desk Lamp", "A minimalist desk lamp with adjustable brightness settings, perfect for study or work.", R.drawable.jawad));
//        dummyDataList.add(new Model("Contemporary Coffee Table", "A contemporary coffee table with a sleek glass top and modern design elements.", R.drawable.jawad));
//        dummyDataList.add(new Model("Rustic Wooden Bed Frame", "A rustic wooden bed frame with intricate details, bringing warmth to any bedroom.", R.drawable.jawad));
//        dummyDataList.add(new Model("Chic Side Table", "A chic side table with a marble top and gold accents, adding a touch of luxury to any room.", R.drawable.jawad));
//        dummyDataList.add(new Model("Modern TV Stand", "A modern TV stand with storage compartments and a minimalist aesthetic, perfect for entertainment centers.", R.drawable.jawad));
//        dummyDataList.add(new Model("Comfortable Lounge Chair", "A comfortable lounge chair with plush cushions, providing relaxation and style.", R.drawable.jawad));
//
//
//
//
//
//        binding.modelRecyclerView.setLayoutManager(new LinearLayoutManager(this ));
//        adapter = new ModelAdapter(this , dummyDataList);
//        binding.modelRecyclerView.setAdapter(adapter);


        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentAdapter fragmentAdapter = new FragmentAdapter(fragmentManager , getLifecycle());
        binding.viewPager2.setAdapter(fragmentAdapter);
        String[] tabTitles = {"Jawad", "Mughal",}; // Add more titles as needed

        new TabLayoutMediator(binding.tabLayout, binding.viewPager2, (tab, position) -> {

            tab.setText(tabTitles[position]);
        }).attach();

    }
}