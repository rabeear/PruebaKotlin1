package com.pruebaskotlin.test1

import java.util.*

class persona {
    private lateinit var nombre: String
    private lateinit var apellido: String
    private lateinit var fecha: Date
    private var sexo: Boolean //True -> hombre False -> Mujer
    private lateinit var mail: String
    private lateinit var user: String
    private lateinit var password: String

    constructor(n: String,a: String,f:Date,s:Boolean,m:String,u:String,p:String) {
        nombre = n
        apellido = a
        fecha = f
        sexo = s
        mail = m
        user = u
        password = p
    }

    fun getNombre():String {
        return this.nombre
    }

    fun getApellido():String {
        return this.apellido
    }

    fun getFecha():Date {
        return this.fecha
    }

    fun getSexo():Boolean {
        return this.sexo
    }

    fun getMail():String {
        return this.mail
    }

    fun getUser():String {
        return this.user
    }

    fun getPassword():String {
        return this.password
    }

    fun setNombre(n:String) {
        this.nombre = n
    }

    fun setApellido(a:String) {
        this.apellido = a
    }

    fun setFecha(f:Date) {
        this.fecha = f
    }

    fun setSexo(s:Boolean) {
        this.sexo = s
    }

    fun setMail(m:String) {
        this.mail = m
    }

    fun setUser(u:String) {
        this.user = u
    }

    fun setPassword(p:String) {
        this.password = p
    }
}