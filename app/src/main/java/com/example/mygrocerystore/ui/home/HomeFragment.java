package com.example.mygrocerystore.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mygrocerystore.R;
import com.example.mygrocerystore.adapters.PopularAdapters;
import com.example.mygrocerystore.databinding.FragmentHomeBinding;
import com.example.mygrocerystore.models.PopularModel;

import java.util.List;

public class HomeFragment extends Fragment {

    RecyclerView popularRec;

    List<PopularModel> popularModelList;
    PopularAdapters popularAdapters;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        popularRec = root.findViewById(R.id.pop_rec);

        return root;
    }
}

