package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.AllServicesAdapter;
import com.ycos.merchant.Model.AllServicesModel;
import com.ycos.merchant.R;

import java.util.ArrayList;


public class AllServicesFragment extends Fragment {


    private RecyclerView allServicesRecyclerview;
    ArrayList<AllServicesModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all_services, container, false);

        //allServices recyclerview
        allServicesRecyclerview = view.findViewById(R.id.allServices_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        allServicesRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for allServices recyclerview
        dataHolder = new ArrayList<>();

        AllServicesModel allSerMod1 = new AllServicesModel(R.drawable.ic_logo, R.drawable.ic_edit_services, R.drawable.ic_delete,
                "Car Wash Services", "800", "Approved");
        dataHolder.add(allSerMod1);
        AllServicesModel allSerMod2 = new AllServicesModel(R.drawable.ic_logo, R.drawable.ic_edit_services, R.drawable.ic_delete,
                "Car Wash Services", "800", "Approved");
        dataHolder.add(allSerMod2);

        allServicesRecyclerview.setAdapter(new AllServicesAdapter(dataHolder));

        return view;
    }
}