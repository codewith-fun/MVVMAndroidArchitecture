package com.codeblogs.mvvmandroidarchitecture.data.error.mapper

import android.content.Context
import com.codeblogs.mvvmandroidarchitecture.R
import com.codeblogs.mvvmandroidarchitecture.data.error.*
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject

class ErrorMapper @Inject constructor(@ApplicationContext val context: Context)
    :ErrorMapperSource{

    override fun getErrorString(errorId: Int): String {
        TODO("Not yet implemented")
    }

    override val errorMap: Map<Int, String>
        get() = mapOf(
            Pair(NO_INTERNET_CONNECTION,getErrorString(R.string.network_error)),
            Pair(NETWORK_ERROR,getErrorString(R.string.network_error)),
            Pair(PASS_WORD_ERROR,getErrorString(R.string.password_error)),
            Pair(USER_NAME_ERROR,getErrorString(R.string.user_error)),
            Pair(CHECK_YOUR_FIELDS,getErrorString(R.string.field_error)),
            Pair(SEARCH_ERROR,getErrorString(R.string.search_error)),
        ).withDefault { getErrorString(R.string.network_error) }

}