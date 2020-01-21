package com.example.przygotowaniedokolosa

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.fragment_moj.*

class Main3Activity : AppCompatActivity(), MojFragment.OnFragmentInteractionListener {


    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var int = intent.extras!!
        var Imie = int.getString("Imie")
        tvf.text = this.resources.getString(
            R.string.formatka, Imie)


    }
}
