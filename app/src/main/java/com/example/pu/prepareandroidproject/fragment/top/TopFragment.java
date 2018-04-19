package com.example.pu.prepareandroidproject.fragment.top;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.pu.prepareandroidproject.R;

import java.util.ArrayList;

public class TopFragment extends Fragment {

    private ArrayList<String> mNames = new ArrayList<>();
    private ArrayList<String> mImageUrls = new ArrayList<>();

    private void getImages(){

        mImageUrls.add("https://d1af89beukha9h.cloudfront.net/wp-content/uploads/2017/11/Global-Organic-Dried-Fruit-Market-256x256.jpg");
        mNames.add("AAA");

        mImageUrls.add("https://s3.eu-west-2.amazonaws.com/venues-images/app/uploads/2016/09/13329379_10154286358302276_1907543960938907760_o-256x256.jpg");
        mNames.add("GGG");

        mImageUrls.add("https://hamiltonfarmersmarket.ca/public/uploads/thumbnail/vendor_latinfoods_gallery1.jpg");
        mNames.add("HHH");

        mImageUrls.add("https://hamiltonfarmersmarket.ca/public/uploads/thumbnail/vendor_latinfoods_gallery1.jpg");
        mNames.add("AAA");

        mImageUrls.add("https://assets-cdn.mrhyde.com/app/uploads/2018/03/21120459/get-50-off-food-at-arepa-co-4-256x256.jpg");
        mNames.add("BBB");

        mImageUrls.add("http://www.travelto5.com/wp-content/uploads/food-in-galicia-mussels-corn-bread-empanada-zamburi%C3%B1as-256x256.jpg");
        mNames.add("CCC");

        mImageUrls.add("https://d1af89beukha9h.cloudfront.net/wp-content/uploads/2017/12/iStock-598223378-256x256.jpg");
        mNames.add("DDD");

        mImageUrls.add("https://static.wixstatic.com/media/7dd205_b85c839d33ae4b069ba704f32a7e01ba~mv2.jpg_256");
        mNames.add("EEE");

        mImageUrls.add("https://d1af89beukha9h.cloudfront.net/wp-content/uploads/2017/11/Global-Organic-Dried-Fruit-Market-256x256.jpg");
        mNames.add("FFF");

        mImageUrls.add("https://s3.eu-west-2.amazonaws.com/venues-images/app/uploads/2016/09/13329379_10154286358302276_1907543960938907760_o-256x256.jpg");
        mNames.add("GGG");

        mImageUrls.add("https://hamiltonfarmersmarket.ca/public/uploads/thumbnail/vendor_latinfoods_gallery1.jpg");
        mNames.add("HHH");

        //initRecyclerView();
    }

/*    private void initRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(this,mNames,mImageUrls);
        recyclerView.setAdapter(adapter);

    }*/

    public static TopFragment newInstance() {
        Bundle args = new Bundle();
        TopFragment fragment = new TopFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_top,container,false);
        getImages();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity(),LinearLayoutManager.HORIZONTAL,false);
        RecyclerView recyclerView = rootView.findViewById(R.id.recyclerViewTop);
        recyclerView.setLayoutManager(layoutManager);
        TopRecyclerView adapter = new TopRecyclerView(this.getActivity(),mNames,mImageUrls);
        recyclerView.setAdapter(adapter);
        return rootView;
    }
}
