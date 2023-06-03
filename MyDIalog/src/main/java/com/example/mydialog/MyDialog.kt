package com.example.mydialog

import android.app.AlertDialog
import android.content.Context
import android.text.method.HideReturnsTransformationMethod
import android.text.method.PasswordTransformationMethod
import android.text.method.TransformationMethod
import android.view.LayoutInflater
import android.widget.CheckBox
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintSet.Transform
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomsheet.BottomSheetDialog
import javax.xml.transform.Transformer

class MyDialog(var context: Context)  {

    fun createSimpleDialog(){
        var dialog = AlertDialog.Builder(context)
        dialog.setTitle("Use Google's Location Services")
        dialog.setPositiveButton("AGREE"){aa,which->{

        }}
        dialog.setNegativeButton("DISAGREE"){aa,which->{

        }}
        dialog.setMessage("Let Google help apps detected location I'm sorry, I do not understand what you are asking. Can you please provide more context or detail?")
        dialog.show()


    }


    fun creatSocialNetworkDialog(){
        var alertDialog  = AlertDialog.Builder(context)
        alertDialog.setPositiveButton("CHOOSE"){aa,which->{

        }}
        alertDialog.setTitle("Social Network's")
        alertDialog.setView(R.layout.social_layout)
        alertDialog.show()

    }
    fun createDatapickerDialog(){
        var alertDialog =  AlertDialog.Builder(context)
        alertDialog.setView(R.layout.datapicker_layout)
        alertDialog.setPositiveButton("OK"){aa,which->{

        }}
        alertDialog.setNegativeButton("cancel"){
            aa,which->
        }
        alertDialog.setTitle("Select Date and Time")
        alertDialog.show()


    }

    fun creatGoogleWifi(){
        var bottomSheetDialog  =BottomSheetDialog(context)
        bottomSheetDialog.setTitle("Google Wifi")
        bottomSheetDialog.setContentView(R.layout.googlewifi_layout)
        var cansel  = bottomSheetDialog.findViewById<TextView>(R.id.concel)
        var connect  = bottomSheetDialog.findViewById<TextView>(R.id.connect)
        var checkBox:CheckBox   = bottomSheetDialog.findViewById<CheckBox>(R.id.checkbox)!!
        var editText  = bottomSheetDialog.findViewById<EditText>(R.id.edittext)
        cansel!!.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        connect!!.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        checkBox.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked){
                editText!!.transformationMethod  = HideReturnsTransformationMethod.getInstance()
            }
            else{
                editText!!.transformationMethod  = PasswordTransformationMethod.getInstance()
            }

        }



        bottomSheetDialog.show()


    }



    fun createRoundColorsDialog(){
        var bottomSheetDialog   =BottomSheetDialog(context)

        bottomSheetDialog.setTitle("Custom ARGB")

        bottomSheetDialog.setContentView(R.layout.roun_color_layout)
        var rv  = bottomSheetDialog.findViewById<RecyclerView>(R.id.recycler)
        rv!!.layoutManager   = GridLayoutManager(context,4)
        var select  = bottomSheetDialog.findViewById<TextView>(R.id.selectbtn)
        var cancel  = bottomSheetDialog.findViewById<TextView>(R.id.cancelbtn)
        select!!.setOnClickListener {
            bottomSheetDialog.dismiss()
        }
        cancel!!.setOnClickListener {
            bottomSheetDialog.dismiss()
        }

        var adapter   = RecyclerAdapter(createList())
        rv.adapter = adapter

        bottomSheetDialog.show()
    }

    private fun createList():List<Int> {
        var list   = ArrayList<Int>()
        list.add(R.color.black)
        list.add(R.color.blue)
        list.add(R.color.green)
        list.add(R.color.grey)
        list.add(R.color.lime)
        list.add(R.color.red)
        list.add(R.color.yellow)
        list.add(R.color.pink)
        list.add(R.color.black)
        list.add(R.color.blue)
        list.add(R.color.green)
        list.add(R.color.grey)
        list.add(R.color.lime)
        list.add(R.color.red)
        list.add(R.color.yellow)
        list.add(R.color.pink)
        list.add(R.color.blue)
        list.add(R.color.green)
        list.add(R.color.grey)
        list.add(R.color.lime)
        list.add(R.color.red)
        list.add(R.color.yellow)
        list.add(R.color.pink)

        return list

    }


}