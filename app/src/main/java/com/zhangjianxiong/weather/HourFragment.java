package com.zhangjianxiong.weather;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by 91593 on 2016/5/28.
 */
public class HourFragment extends Fragment {
    //列表
    ListView listView;
    //数据
    ArrayList<String > data
    //适配器
    ArrayAdapter<String> adapter;


    public HourFragment(){

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return super.onCreateView(R.layout.fragment_hour, container, false);

        initView();

    }

    private void initView() {
        listView = (ListView) listView.findViewById();

        data = new ArrayList<>();
        data.add();
        data.add();
        data.add());
        data.add();


        // 创建适配器
        adapter = new ArrayAdapter<String>();

        listView.setAdapter(adapter);
    }
    }

