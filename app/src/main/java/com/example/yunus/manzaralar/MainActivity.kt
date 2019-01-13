package com.example.yunus.manzaralar

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var tumManzaralar = ArrayList<Manzara>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        manzaraDoldur()

        var myAdapter = ManzaraAdapter(tumManzaralar)

        rvManzaralar.adapter = myAdapter
        //RecyclerView ın görüntüleme tarzını belirliyoruz.burada linearLayout Vertical olsun diyoruz istersek
        //GridView vb. yapılabilir
        var linearLayoutManager = LinearLayoutManager(this,LinearLayout.VERTICAL,false)
        rvManzaralar.layoutManager = linearLayoutManager
    }

    fun manzaraDoldur() : ArrayList<Manzara>{
        var manzaralar = arrayOf(R.drawable.t_1_0 , R.drawable.t_1_1 ,R.drawable.t_1_2 ,R.drawable.t_1_3 ,R.drawable.t_1_4,R.drawable.t_1_5,R.drawable.t_1_6
                ,R.drawable.t_2_0,R.drawable.t_2_1,R.drawable.t_2_3
            ,R.drawable.t_3_0,R.drawable.t_3_1,R.drawable.t_3_2,R.drawable.t_3_4,R.drawable.t_3_6
            ,R.drawable.t_4_0,R.drawable.t_4_1)

        for (i in 0..(manzaralar.size - 1)){
            var atanacakManzara = Manzara("MANZARA " + i , "Açıklama " + i , manzaralar[i])
            tumManzaralar.add(atanacakManzara)
        }
        return tumManzaralar
    }
}
