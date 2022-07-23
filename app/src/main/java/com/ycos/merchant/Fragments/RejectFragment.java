package com.ycos.merchant.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.ycos.merchant.Adapter.RejectAdapter;
import com.ycos.merchant.Model.RejectModel;
import com.ycos.merchant.R;

import java.util.ArrayList;

public class RejectFragment extends Fragment {

    private RecyclerView rejectRecyclerview;
    ArrayList<RejectModel> dataHolder;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_reject, container, false);

        rejectRecyclerview = view.findViewById(R.id.reject_recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 1);
        rejectRecyclerview.setLayoutManager(gridLayoutManager);

        //initialize dataHolder for reject recyclerview
        dataHolder = new ArrayList<>();

        RejectModel rejMod1 = new RejectModel(R.drawable.ic_eye, "Mr.Dashrath Singh", "+91-7357775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(rejMod1);
        RejectModel rejMod2 = new RejectModel(R.drawable.ic_eye, "Mr.Vishnu", "+91-7257775815", "17/07/2022", "5:40 PM", "Online");
        dataHolder.add(rejMod2);

        rejectRecyclerview.setAdapter(new RejectAdapter(getActivity(), dataHolder));
        return view;
    }
}