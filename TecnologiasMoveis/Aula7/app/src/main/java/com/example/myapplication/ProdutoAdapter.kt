package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R.layout.produto_item

class ProdutoAdapter(
    private val itens: MutableList<Produto>,
    private val irParaDetalhe: (item: Produto) -> Unit
) : RecyclerView.Adapter<ProdutoAdapter.ViewHolder>() {

    lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        context = parent.context
        val view = LayoutInflater.from(parent.context).inflate(produto_item, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProdutoAdapter.ViewHolder, position: Int) {
        holder.itemView.rootView.setOnClickListener {
            irParaDetalhe(itens[position])
        }
        holder.itemView.rootView.setOnLongClickListener{
            showPopupMenu(holder.itemView, position)
            true
        }
        holder.priceProduto.text = itens[position].price
        holder.nameProduto.text = itens[position].name

        Glide.with(context).load(itens[position].urlImage).into(holder.imageProduto)
    }

    override fun getItemCount() = itens.size
    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageProduto: ImageView = view.findViewById(R.id.imgProduto)
        val nameProduto: TextView = view.findViewById(R.id.tvProdutoNome)
        val priceProduto: TextView = view.findViewById(R.id.tvProdutoPreco)
    }

    private fun showPopupMenu(view: View, position: Int) {
        PopupMenu(context, view).apply {
            setOnMenuItemClickListener { item ->
                when (item.itemId) {
                    R.id.remover-> {
                        removeItem(itens[position])
                        true
                    }

                    else -> false
                }
            }
            inflate(R.menu.menu_popup)
            show()
        }
    }

    fun removeItem(produto: Produto) {
        this.itens.remove(produto)
        notifyDataSetChanged()
    }
}