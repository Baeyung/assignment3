package com.example.test;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.test.models.Result;
import com.example.test.models.UsersResponse;
import com.squareup.picasso.Picasso;

public class adapter extends RecyclerView.Adapter<adapter.viewholder> {

    private UsersResponse m_user;

    public adapter(UsersResponse user){

        m_user = user;
    }



    public class viewholder extends RecyclerView.ViewHolder{

        TextView t1,t2,t3;
        ImageView i1;
        public viewholder(View itemView)
        {
            super (itemView);
            t1 = (TextView) itemView.findViewById(R.id.textView_RV);
            t2 = (TextView) itemView.findViewById(R.id.textView_rv_2);
            t3 = (TextView) itemView.findViewById(R.id.textView_rv_3);
            i1 = (ImageView) itemView.findViewById(R.id.imageView_rv);

        }
    }


    @Override
    public viewholder onCreateViewHolder(ViewGroup parent,int viewType){
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.layout_resource_file,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(viewholder holder,int position){
        Result u = m_user.getResults().get(position);
        TextView textView = holder.t1;
        textView.setText(u.getName().getFirst());
        TextView textView1 = holder.t2;
        textView1.setText(u.getName().getLast());
        TextView textView2 = holder.t3;
        textView2.setText(u.getEmail());
        Picasso.get().load(u.getPicture().getLarge()).into(holder.i1);
    }

    @Override
    public int getItemCount() {
        return m_user.getResults().size();
    }
}
