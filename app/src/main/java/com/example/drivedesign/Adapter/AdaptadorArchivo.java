package com.example.drivedesign.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.drivedesign.Model.Archivo;
import com.example.drivedesign.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class AdaptadorArchivo extends RecyclerView.Adapter<AdaptadorArchivo.ViewHolderArchivo> {

    ArrayList<Archivo> listaArchivos;

    public AdaptadorArchivo(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    @Override
    public ViewHolderArchivo onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ly_archivos,null,false);
        return new ViewHolderArchivo(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorArchivo.ViewHolderArchivo holder, int position) {
        Archivo archivo = listaArchivos.get(position);
        holder.lblNombre.setText(listaArchivos.get(position).getNombre());
        holder.lblDescripcion.setText(listaArchivos.get(position).getDescripcion());
        holder.imgIcono.setImageResource(listaArchivos.get(position).getIcono());
        holder.imgImagen.setImageResource(listaArchivos.get(position).getImagen());
        holder.cvFoto.setImageResource(listaArchivos.get(position).getFoto());
    }

    @Override
    public int getItemCount() {
        return listaArchivos.size();
    }

    public class ViewHolderArchivo extends RecyclerView.ViewHolder {

        TextView lblNombre, lblDescripcion;
        ImageView imgIcono, imgImagen;
        CircleImageView cvFoto;

        public ViewHolderArchivo(View itemView) {
            super(itemView);
            lblNombre = (TextView) itemView.findViewById(R.id.lblNombre);
            lblDescripcion = (TextView) itemView.findViewById(R.id.lblDescripcion);
            imgIcono = (ImageView) itemView.findViewById(R.id.imgIcono);
            imgImagen = (ImageView) itemView.findViewById(R.id.imgImagen);
            cvFoto = (CircleImageView) itemView.findViewById(R.id.cvFoto);
        }
    }

}
