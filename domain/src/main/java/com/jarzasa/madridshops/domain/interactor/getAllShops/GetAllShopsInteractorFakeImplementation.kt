package com.jarzasa.madridshops.domain.interactor.getAllShops

import com.jarzasa.madridshops.domain.interactor.ErrorClosure
import com.jarzasa.madridshops.domain.interactor.ErrorCompletion
import com.jarzasa.madridshops.domain.interactor.SuccessClosure
import com.jarzasa.madridshops.domain.interactor.SuccessCompletion
import com.jarzasa.madridshops.domain.model.Shop
import com.jarzasa.madridshops.domain.model.Shops

class GetAllShopsInteractorFakeImplementation: GetAllShopsInteractor {
    override fun execute(success: SuccessCompletion<Shops>, error: ErrorCompletion) {
        var allOk = true
        // connect to the repository

        if (allOk) {
            val shops = createFakeListOfShops()
            success.successCompletion(shops)
        } else {
            error.errorCompletion("Error while accessing the repository")
        }
    }

    fun execute(success: SuccessClosure, error: ErrorClosure) {
        var allOk = true
        // connect to the repository

        if (allOk) {
            val shops = createFakeListOfShops()
            success(shops)
        } else {
            error("Error while accessing the repository")
        }
    }

    fun createFakeListOfShops(): Shops {
        val list = ArrayList<Shop>()

        for ( i in 0..100 ) {
            val shop = Shop(i, "Shop " + i, "Address " + i)
            list.add(shop)
        }
        val shops = Shops(list)
        return shops
    }
}
