package com.example.recuperacionandroid.data

import com.example.recuperacionandroid.R
import com.example.recuperacionandroid.model.Contactos

public class Datasource {
    fun loadContactos(): List<Contactos> {
        return listOf<Contactos>(
            Contactos(
                R.string.contacto1_nombre,
                R.string.contacto1_apellido,
                R.string.contacto1_mail,
                R.string.contacto1_year,
                R.string.contacto1_numero
            ), Contactos(
                R.string.contacto2_nombre,
                R.string.contacto2_apellido,
                R.string.contacto2_mail,
                R.string.contacto2_year,
                R.string.contacto2_numero
            ), Contactos(
                R.string.contacto3_nombre,
                R.string.contacto3_apellido,
                R.string.contacto3_mail,
                R.string.contacto3_year,
                R.string.contacto3_numero
            ), Contactos(
                R.string.contacto4_nombre,
                R.string.contacto4_apellido,
                R.string.contacto4_mail,
                R.string.contacto4_year,
                R.string.contacto4_numero
            ), Contactos(
                R.string.contacto5_nombre,
                R.string.contacto5_apellido,
                R.string.contacto5_mail,
                R.string.contacto5_year,
                R.string.contacto5_numero
            )
        )
    }

}