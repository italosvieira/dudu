package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class LoginActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun redirecionarListarPets(v : View) {
        startActivity(Intent(this, ListarPetsActivity::class.java))
        finish()
    }

    fun redirecionarCadastroDeLogin(v: View) {
        startActivity(Intent(this, CadatroContaActivity::class.java))
        finish()
    }
}