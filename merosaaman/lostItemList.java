package com.example.merosaaman;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class lostItemList extends ArrayAdapter<lostSomethingData> {

    private Activity context;
    private List<lostSomethingData> lostItemLists;

    public lostItemList(Activity context, List<lostSomethingData> lostItemLists){
        super(context,R.layout.activity_lost_item_list,lostItemLists);
        this.context= context;
        this.lostItemLists=lostItemLists;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate( R.layout.activity_lost_item_list,null,true );

        lostSomethingData lostSomethingData = lostItemLists.get( position );



            TextView mainCat = listViewItem.findViewById( R.id.t11 );
            TextView subCat = listViewItem.findViewById( R.id.t22 );
            TextView colorSel = listViewItem.findViewById( R.id.t33 );
            TextView dateSel = listViewItem.findViewById( R.id.t44 );
            TextView loclatlong = listViewItem.findViewById( R.id.t55 );
            TextView Rewardp = listViewItem.findViewById( R.id.t66 );

            mainCat.setText( lostSomethingData.getLmain_category() );
            subCat.setText( lostSomethingData.getLsub_category() );
            colorSel.setText( lostSomethingData.getLitem_color() );
            dateSel.setText( lostSomethingData.getDay() + " / " + lostSomethingData.getMonth() + " / " + lostSomethingData.getYear() );
            loclatlong.setText( lostSomethingData.getLlatititude() + ", " + lostSomethingData.getLlongnitude() );
            Rewardp.setText( lostSomethingData.getLreward_point() );

        return listViewItem;
    }



}
