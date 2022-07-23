package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.AllAdapter;
import com.ycos.merchant.Model.AllModel;
import com.ycos.merchant.R;

import java.util.ArrayList;


public class All extends Fragment {

    private RecyclerView allRecyclerview;
    ArrayList<AllModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_all, container, false);

        //all recyclerview
        allRecyclerview = view.findViewById(R.id.all_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        allRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for all recyclerview
        dataHolder = new ArrayList<>();

        AllModel allMod1 = new AllModel(R.drawable.ic_eye, R.drawable.ic_check, R.drawable.ic_unchecked,
                "Mr.Dashrath Singh", "+91-7357775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(allMod1);
        AllModel allMod2 = new AllModel(R.drawable.ic_eye, R.drawable.ic_check, R.drawable.ic_unchecked,
                "Mr.Vishnu", "+91-7257775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(allMod2);

        allRecyclerview.setAdapter(new AllAdapter(getActivity(), dataHolder));

        return view;
    }
}