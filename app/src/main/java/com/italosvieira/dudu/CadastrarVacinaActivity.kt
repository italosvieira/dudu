package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class CadastrarVacinaActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_vacina)
    }

    fun redirecionarListagemVacinas(v : View) {
        val myIntent = Intent(this, DetalharPetActivity::class.java)
        myIntent.putExtra("fragment", "2")
        startActivity(myIntent)
    }
}