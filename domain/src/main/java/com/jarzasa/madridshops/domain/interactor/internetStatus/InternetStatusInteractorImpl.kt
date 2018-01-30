package com.jarzasa.madridshops.domain.interactor.internetStatus

import com.jarzasa.madridshops.domain.interactor.CodeClosure
import com.jarzasa.madridshops.domain.interactor.ErrorClosure

class InternetStatusInteractorImpl : InternetStatusInteractor {
    override fun execute(success: CodeClosure, error: ErrorClosure) {
        success()
    }
}