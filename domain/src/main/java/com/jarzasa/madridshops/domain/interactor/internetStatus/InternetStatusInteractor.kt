package com.jarzasa.madridshops.domain.interactor.internetStatus

import com.jarzasa.madridshops.domain.interactor.CodeClosure
import com.jarzasa.madridshops.domain.interactor.ErrorClosure

interface InternetStatusInteractor {
    fun execute(success: CodeClosure, error: ErrorClosure)
}
