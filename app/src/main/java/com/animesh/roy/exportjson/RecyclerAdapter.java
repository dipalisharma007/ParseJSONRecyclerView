package com.animesh.roy.exportjson;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.text.BreakIterator;
import java.util.List;

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static final int TYPE = 1;
    private final Context context;
    private final List<Object> listRecyclerItem;

    public RecyclerAdapter(Context context, List<Object> listRecyclerItem) {
        this.context = context;
        this.listRecyclerItem = listRecyclerItem;
    }

    public class ItemViewHolder extends RecyclerView.ViewHolder {

        public TextView qualification;
        public ImageView profileImage;
        private final TextView name;
        private final TextView subject;

        public ItemViewHolder(@NonNull View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            subject = (TextView) itemView.findViewById(R.id.subject);
            qualification = (TextView) itemView.findViewById(R.id.qualification);
            profileImage = (ImageView) itemView.findViewById(R.id.imageView);
            Log.d("ItemViewHolder: image", "ItemViewHolder: image"+profileImage);
        }
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        switch (i) {
            case TYPE:

                default:

                    View layoutView = LayoutInflater.from(viewGroup.getContext()).inflate(
                            R.layout.list_item, viewGroup, false);

                    return new ItemViewHolder((layoutView));
        }

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int i) {

        int viewType = getItemViewType(i);

        switch (viewType) {
            case TYPE:
                default:

                    ItemViewHolder itemViewHolder = (ItemViewHolder) viewHolder;
                    Holidays holidays = (Holidays) listRecyclerItem.get(i);

                    itemViewHolder.name.setText(holidays.getName());
                    itemViewHolder.subject.setText(holidays.getSubject());
                    itemViewHolder.qualification.setText(holidays.getQualification());
                    Log.d("getImage()", ""+holidays.getProfileImage());
//                    Glide.with(context)
//                            .load("https://d2bps9p1kiy4ka.cloudfront.net/5eb393ee95fab7468a79d189/019d5525-c906-4697-b8d1-7b9ed235abe6.png")
//                            .into(itemViewHolder.profileImage);
                    Picasso.get()
                            .load(holidays.getProfileImage())
                            .resize(100, 100)
                            .centerCrop()
                            .into(itemViewHolder.profileImage);

                  //  itemViewHolder.profileImage.setText(holidays.getProfileImage());
        }

    }

    @Override
    public int getItemCount() {
        return listRecyclerItem.size();
    }
}
