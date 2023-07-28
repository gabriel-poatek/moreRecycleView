package com.example.recycleviewlearning

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


// sempre extende de recyclerview.adapter<"nomeDaClasse.MyViewHolder>
// extende os 3 métodos, onCreate será para inflar o layout do item, onBind para popular os dados pela position, get item o tamanho sempre da list utilizada
// na classe MyViewHolder será onde pegaremos os itens, neste exemplo estamos pegando o textView, mas poderia ter uma image view, ou algo do gen
class ListAdapter(
    private val myList: List<String>,
    val nameSelected:(String) -> Unit

    ) :RecyclerView.Adapter<ListAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
    val itemView = LayoutInflater.from(parent.context).inflate(R.layout.item_adapter, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val name = myList[position]
        holder.textName.text = name

        //tornando um componente do itemView clicável, poderia usar .itemView para ser a linha inteira!
        holder.textName.setOnClickListener{nameSelected(name)}
    }

    override fun getItemCount() = myList.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val textName: TextView = itemView.findViewById(R.id.textName)
    }


}
