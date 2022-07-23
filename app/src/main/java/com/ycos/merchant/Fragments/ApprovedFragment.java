package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.ApprovedAdapter;
import com.ycos.merchant.Model.ApprovedModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class ApprovedFragment extends Fragment {

    private RecyclerView approvedRecyclerview;
    ArrayList<ApprovedModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_approved, container, false);

        //approved recyclerview
        approvedRecyclerview = view.findViewById(R.id.approved_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        approvedRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for approved recyclerview
        dataHolder = new ArrayList<>();

        ApprovedModel appMod1 = new ApprovedModel(R.drawable.ic_logo, R.drawable.ic_edit_services, R.drawable.ic_delete,
                "Car Wash Services", "800", "Approved");
        dataHolder.add(appMod1);
        ApprovedModel appMod2 = new ApprovedModel(R.drawable.ic_logo, R.drawable.ic_edit_services, R.drawable.ic_delete,
                "Car Wash Services", "800", "Approved");
        dataHolder.add(appMod2);

        approvedRecyclerview.setAdapter(new ApprovedAdapter(dataHolder));
        return view;
    }
}