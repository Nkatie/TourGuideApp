package com.example.mikatekonkatie.tourguideapp;

import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import android.provider.ContactsContract;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Mikateko (Nkatie) on 2017/08/16.
 */

    public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder>  {

    Context context;
    List<MalaTouring> contactList;


    public RecycleAdapter(Context context, List<MalaTouring> contactList) {
        this.context = context;
        this.contactList = contactList;
    }

    @Override
    public RecycleAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.contect_layout,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        final MalaTouring contact = contactList.get(position);
        holder.tvName.setText(contact.getName());
        holder.tvDeccribe.setText(contact.getDescribe());
        holder.image.setImageResource(contact.getImage());

        holder.card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent =new Intent(context,Main3Activity.class);
                intent.putExtra("name",contact);
               context.startActivity(intent);
            }
        });


    }


    @Override
    public int getItemCount() {
        return contactList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName,tvDeccribe;
        ImageView image;
        CardView card;
        public ViewHolder(View itemView) {

            super(itemView);

            tvName=(TextView)itemView.findViewById(R.id.textView2);
            tvDeccribe=(TextView)itemView.findViewById(R.id.textView3);
            image= (ImageView) itemView.findViewById(R.id.imageView);
            card=(CardView)itemView.findViewById((R.id.cardview));
        }
    }
}

