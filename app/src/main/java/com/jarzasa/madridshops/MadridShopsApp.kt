package com.jarzasa.madridshops

import android.support.multidex.MultiDexApplication
import android.util.Log
import com.jarzasa.madridshops.domain.interactor.ErrorCompletion
import com.jarzasa.madridshops.domain.interactor.getAllShops.GetAllShopsInteractorFakeImplementation
import com.jarzasa.madridshops.domain.interactor.SuccessCompletion
import com.jarzasa.madridshops.domain.model.Shops
import com.jarzasa.madridshops.repository.DB.build
import com.jarzasa.madridshops.repository.DB.dao.ShopDAO
import com.jarzasa.madridshops.repository.model.ShopEntity


class MadridShopsApp: MultiDexApplication() {

    override fun onCreate() {
        super.onCreate()

        // init code application wide
        Log.d("App", "onCreate")

        val allShopsInteractor = GetAllShopsInteractorFakeImplementation()
        allShopsInteractor.execute(
                success = object: SuccessCompletion<Shops> {
                    override fun successCompletion(shops: Shops) {
                        Log.d("Shops", "Count: " + shops.count())
                    }
                },
                error = object: ErrorCompletion {
                    override fun errorCompletion(errorMessage: String) {

                    }
                }
        )

        test()


    }

    private fun test() {
        //NEVER DO THIS!!!
        val dbHelper = build(this, "mydb.sqlite", 1)

        val shopEntityDao = ShopDAO(dbHelper)

        val deleteAll = shopEntityDao.deleteAll()

        val shop = ShopEntity(1,
                1,
                "MyShop 1",
                "desc 1",
                1.0f,
                2.0f,
                "",
                "",
                "",
                "")

        val shop2 = ShopEntity(2,
                1,
                "MyShop 2",
                "desc2",
                1.0f,
                2.0f,
                "",
                "",
                "",
                "")



        val id = shopEntityDao.insert(shop)
        val id2 = shopEntityDao.insert(shop2)

        shopEntityDao.query().forEach {
            Log.d("Shop", it.name)
        }


    }

    override fun onLowMemory() {
        super.onLowMemory()

    }
}