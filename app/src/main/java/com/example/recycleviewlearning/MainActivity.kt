package com.example.recycleviewlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recycleviewlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView (){
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        binding.recyclerView.setHasFixedSize(true)
        binding.recyclerView.adapter = ListAdapter(getList()){
            name -> Toast.makeText(this,name,Toast.LENGTH_SHORT).show()
        }
    }


    //criando a lista aqui com o método para depois passar isso ao adapter
    private fun getList() = listOf(
        "Enzo Erick Breno Carvalho",
        "Jaqueline Amanda Natália",
        "Isabella Jennifer Aragão",
        "Benedita Eliane",
        "Calebe Mário Aragão",
        "Enzo Leonardo Melo",
        "Mariane Esther",
        "Benedito Mateus Melo",
        "Geraldo Marcos Nascimento",
        "Ayla Agatha Emilly",
        "Henrique Mário Nascimento",
        "Oliver Thiago Arthur Ramos",
        "Helena Letícia Letícia",
        "Lucca Levi Ramos",
        "Ricardo Enrico Rezende",
        "Lorena Alícia Stefany",
        "Nelson Benjamin Rezende"
    )
}