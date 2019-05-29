package com.italosvieira.dudu

import android.content.Intent
import android.os.Bundle
import android.view.View

class CadastrarPetActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastrar_pet)
    }

    fun listPets(v: View) {
        startActivity(Intent(this, ListarPetsActivity::class.java))
        finish()
    }
}