package com.example.merosaaman;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class foundItemList extends ArrayAdapter<foundSomethingData> {

    private Activity context;
    private List<foundSomethingData> foundItemLists;

    public foundItemList(Activity context, List<foundSomethingData> foundItemLists) {
        super( context, R.layout.activity_found_item_list, foundItemLists );
        this.context = context;
        this.foundItemLists = foundItemLists;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate( R.layout.activity_found_item_list, null, true );

        TextView mainCat = listViewItem.findViewById( R.id.t1 );
        TextView subCat = listViewItem.findViewById( R.id.t2 );
        TextView colorSel = listViewItem.findViewById( R.id.t3 );
        TextView dateSel = listViewItem.findViewById( R.id.t4 );
        TextView loclatlong = listViewItem.findViewById( R.id.t5 );
        TextView quest = listViewItem.findViewById( R.id.t6 );

        foundSomethingData foundSomethingData = foundItemLists.get( position );

            mainCat.setText( foundSomethingData.getFmain_category() );
            subCat.setText( foundSomethingData.getFsub_category() );
            colorSel.setText( foundSomethingData.getFitem_color() );
            dateSel.setText( foundSomethingData.getDay() + " / " + foundSomethingData.getMonth() + " / " + foundSomethingData.getYear() );
            loclatlong.setText( foundSomethingData.getFlatititude() + ", " + foundSomethingData.getFlongnitude() );
            quest.setText( foundSomethingData.getFquestion() );

            return listViewItem;

    }
}
