package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class ConfiguracaoActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_configuracao)
    }

    fun redirecionarLogin(v: View) {
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }

    fun redirecionarCadastro(v: View) {
        startActivity(Intent(this, CadatroContaActivity::class.java))
        finish()
    }
}