package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.UnapprovedAdapter;
import com.ycos.merchant.Model.UnapprovedModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class UnapprovedFragment extends Fragment {

    private RecyclerView unapprovedRecyclerview;
    ArrayList<UnapprovedModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_unapproved, container, false);

        //unapproved recyclerview
        unapprovedRecyclerview = view.findViewById(R.id.unapproved_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        unapprovedRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for unapproved recyclerview
        dataHolder = new ArrayList<>();

        UnapprovedModel unSerMod1 = new UnapprovedModel(R.drawable.ic_logo, R.drawable.ic_edit_services, R.drawable.ic_delete,
                "Car Wash Services", "800", "Unapproved");
        dataHolder.add(unSerMod1);
        UnapprovedModel unSerMod2 = new UnapprovedModel(R.drawable.ic_logo, R.drawable.ic_edit_services, R.drawable.ic_delete,
                "Car Wash Services", "800", "Unapproved");
        dataHolder.add(unSerMod2);

        unapprovedRecyclerview.setAdapter(new UnapprovedAdapter(dataHolder));
        return view;
    }
}