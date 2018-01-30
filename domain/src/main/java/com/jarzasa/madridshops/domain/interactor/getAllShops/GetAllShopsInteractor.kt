package com.jarzasa.madridshops.domain.interactor.getAllShops

import com.jarzasa.madridshops.domain.interactor.ErrorCompletion
import com.jarzasa.madridshops.domain.interactor.SuccessCompletion
import com.jarzasa.madridshops.domain.model.Shops

interface GetAllShopsInteractor {
    fun execute(success: SuccessCompletion<Shops>, error: ErrorCompletion)

}
