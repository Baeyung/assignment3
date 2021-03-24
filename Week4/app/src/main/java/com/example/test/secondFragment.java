package com.example.test;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.test.models.UsersResponse;



/**
 * A simple {@link Fragment} subclass.
 * Use the {@link secondFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class secondFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private UsersResponse mParam1;
    private String mParam2;
    private RecyclerView recyclerView;




    public secondFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment secondFragment.
     */
    // TODO: Rename and change types and number of parameters
    public static secondFragment newInstance(UsersResponse param1, String param2) {
        secondFragment fragment = new secondFragment();
        Bundle args = new Bundle();
        args.putSerializable(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = (UsersResponse) getArguments().getSerializable(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_second, container, false);

        recyclerView = v.findViewById(R.id.recyclerview);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(v.getContext()));
        recyclerView.setAdapter(new adapter(mParam1));

        return v;
    }

//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
//        TextView tx2 = (TextView) getView().findViewById(R.id.textView2);
//        TextView tx3 = (TextView) getView().findViewById(R.id.textView3);
//        TextView tx4 = (TextView) getView().findViewById(R.id.textView4);
//        ImageView i1 = (ImageView) getView().findViewById(R.id.imageView);
//        tx2.setText(mParam1.getResults().get(0).getName().getFirst());
//        tx3.setText(mParam1.getResults().get(0).getName().getLast());
//        tx4.setText(mParam1.getResults().get(0).getEmail());
//        Picasso.get().load(mParam1.getResults().get(0).getPicture().getLarge()).into(i1);
//    }



    }

//    @Override
//    public void onViewCreated(View view, Bundle savedInstanceState) {
////        TextView tx2 = (TextView) getView().findViewById(R.id.textView2);
////        TextView tx3 = (TextView) getView().findViewById(R.id.textView3);
////        TextView tx4 = (TextView) getView().findViewById(R.id.textView4);
////        ImageView i1 = (ImageView) getView().findViewById(R.id.imageView);
////        tx2.setText(mParam1.getResults().get(0).getName().getFirst());
////        tx3.setText(mParam1.getResults().get(0).getName().getLast());
////        tx4.setText(mParam1.getResults().get(0).getEmail());
////        Picasso.get().load(mParam1.getResults().get(0).getPicture().getLarge()).into(i1);
//    }



