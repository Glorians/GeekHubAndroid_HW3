package com.geekhub_android.hw3_beliaev;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{

    public interface OnItemClickListener {
        void onItemClick(Phone phone);
    }

    private LayoutInflater inflater;
    private List<Phone> phones;


    Adapter(Context context, List<Phone> phones) {
        this.phones = phones;
        this.inflater = LayoutInflater.from(context); // создаем view элемент с layout
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder holder, int position) {
        Phone phone = phones.get(position);

        holder.imageView.setImageResource(phone.getImage());
        holder.brandView.setText(phone.getBrand());
        holder.modelView.setText(phone.getModel());
    }

    @Override
    public int getItemCount() {
        return phones.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView brandView, modelView;


        ViewHolder(View view){
            super(view);

//Пытался сделать обработку клика (Неудачно) Help

//            itemView.setOnClickListener(new View.OnClickListener() {
//               @Override
//               public void onClick(View v) {
//                   Toast.makeText(context,"clicked="+ getPosition(),Toast.LENGTH_SHORT).show();
//               }
//            });

            imageView = (ImageView)view.findViewById(R.id.image);
            brandView = (TextView) view.findViewById(R.id.brand);
            modelView = (TextView) view.findViewById(R.id.model);
        }
    }


}
