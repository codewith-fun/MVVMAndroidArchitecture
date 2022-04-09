package com.codeblogs.mvvmandroidarchitecture.usecase.errors

import com.codeblogs.mvvmandroidarchitecture.data.error.Error

interface ErrorUseCase {
    fun getError(errorCode:Int):Error
}