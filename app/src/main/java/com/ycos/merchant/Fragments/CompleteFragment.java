package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.CompleteAdapter;
import com.ycos.merchant.Model.CompleteModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class CompleteFragment extends Fragment {

    private RecyclerView completeRecyclerview;
    ArrayList<CompleteModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_complete, container, false);

        completeRecyclerview = view.findViewById(R.id.complete_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        completeRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for complete recyclerview
        dataHolder = new ArrayList<>();

        CompleteModel comMod1 = new CompleteModel(R.drawable.ic_eye, "Mr.Dashrath Singh", "+91-7357775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(comMod1);
        CompleteModel comMod2 = new CompleteModel(R.drawable.ic_eye, "Mr.Vishnu", "+91-7257775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(comMod2);

        completeRecyclerview.setAdapter(new CompleteAdapter(getActivity(), dataHolder));
        return view;
    }
}