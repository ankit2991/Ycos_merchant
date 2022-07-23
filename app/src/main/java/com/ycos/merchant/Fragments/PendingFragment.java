package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.PendingAdapter;
import com.ycos.merchant.Model.PendingModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class PendingFragment extends Fragment {

    private RecyclerView pendingRecyclerview;
    ArrayList<PendingModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_pending, container, false);


        pendingRecyclerview = view.findViewById(R.id.Pending_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        pendingRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for pending recyclerview
        dataHolder = new ArrayList<>();

        PendingModel penMod1 = new PendingModel(R.drawable.ic_eye, R.drawable.ic_check, R.drawable.ic_unchecked,
                "Mr.Dashrath Singh", "+91-7357775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(penMod1);
        PendingModel penMod2 = new PendingModel(R.drawable.ic_eye, R.drawable.ic_check, R.drawable.ic_unchecked,
                "Mr.Vishnu", "+91-7257775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(penMod2);

        pendingRecyclerview.setAdapter(new PendingAdapter(getActivity(), dataHolder));

        return view;
    }
}