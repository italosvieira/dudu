package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class CadastrarMedicamentoActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_medicamento)
    }

    fun redirecionarListagemMedicamentos(v : View) {
        val myIntent = Intent(this, DetalharPetActivity::class.java)
        myIntent.putExtra("fragment", "1")
        startActivity(myIntent)
    }
}