package com.codeblogs.mvvmandroidarchitecture.data.error.mapper

interface ErrorMapperSource {
    fun getErrorString(errorId:Int) :String
    val errorMap: Map<Int,String>
}