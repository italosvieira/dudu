package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class CadatroContaActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadatro_conta)
    }

    fun redirecionarTelaListarPetsDaTelaDeCadastro(v : View) {
        startActivity(Intent(this, ListarPetsActivity::class.java))
        finish()
    }
}