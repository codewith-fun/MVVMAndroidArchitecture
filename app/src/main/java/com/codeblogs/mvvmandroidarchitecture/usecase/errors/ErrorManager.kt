package com.codeblogs.mvvmandroidarchitecture.usecase.errors

import com.codeblogs.mvvmandroidarchitecture.data.error.Error
import com.codeblogs.mvvmandroidarchitecture.data.error.mapper.ErrorMapper
import javax.inject.Inject

class ErrorManager @Inject constructor(private val errorMapper: ErrorMapper) :ErrorUseCase{
    override fun getError(errorCode: Int): Error {
        return Error(code = errorCode, description = errorMapper.errorMap.getValue(errorCode))
    }
}