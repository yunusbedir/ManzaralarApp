package com.example.yunus.manzaralar

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.tek_satir.view.*

class ManzaraAdapter(tumManzaralar : ArrayList<Manzara>) : RecyclerView.Adapter<ManzaraAdapter.ManzaraViewHolder>() {

    var manzaralar = tumManzaralar

    override fun onCreateViewHolder(parent: ViewGroup, position: Int): ManzaraViewHolder {
        //tek_satir.xml dosyasını java sınıfına dönüştüreceğiz.Ardından ViewHolder oluşturup geri döndüreceğiz
        var inflater = LayoutInflater.from(parent.context)
        var tekSatirManzara = inflater.inflate(R.layout.tek_satir,parent,false)

        return ManzaraViewHolder(tekSatirManzara)

    }

    override fun getItemCount(): Int {
        //item sayısı
        return manzaralar.size
    }

    override fun onBindViewHolder(holder: ManzaraViewHolder, position: Int) {
        holder.setData(manzaralar.get(position),position)
    }

    //setOnClickListener dan 'manzaralar' ArrayListine erişmek için inner class yapıyoruz
    inner class ManzaraViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tekSatirManzara = itemView as CardView
        var manzaraBaslik =  tekSatirManzara.tvManzaraBaslik
        var manzaraAciklama = tekSatirManzara.tvManzaraAciklama
        var manzaraResim = tekSatirManzara.imgManzara
        var btnCopy = tekSatirManzara.imgCopy
        var btnTrash = tekSatirManzara.imgTrash

        fun setData(manzara : Manzara ,position:Int){
            //holderı listeye atayacağız
            manzaraBaslik.text = manzara.baslik
            manzaraAciklama.text = manzara.aciklama
            manzaraResim.setImageResource(manzara.resim)

            btnCopy.setOnClickListener {
                manzaralar.add(position,manzara)
                //RecyclerView a posisyondaki elemanı ekleme
                notifyItemInserted(position)
                //indexleri Güncelleme
                notifyItemChanged(position,manzaralar.size)
            }
            btnTrash.setOnClickListener {
                manzaralar.removeAt(position)
                //RecyclerView dan posisyondaki elemanı silme
                notifyItemRemoved(position)
                //indexleri Güncelleme
                notifyItemChanged(position,manzaralar.size)
            }



        }
    }
}