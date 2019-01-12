package com.example.yunus.manzaralar

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup

class ManzaraAdapter : RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ManzaraViewHolder {
        //tek_satir.xml dosyasını java sınıfına dönüştüreceğiz.Ardından ViewHolder oluşturup geri döndüreceğiz

    }

    override fun getItemCount(): Int {
        //item sayısı
        return 0
    }

    override fun onBindViewHolder(holder: ManzaraViewHolder, position: Int) {
        //holderı listeye atayacağız
    }

    class ManzaraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }
}