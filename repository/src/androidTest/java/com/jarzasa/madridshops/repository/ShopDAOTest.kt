package com.jarzasa.madridshops.repository

import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import com.jarzasa.madridshops.repository.DB.build
import com.jarzasa.madridshops.repository.DB.dao.ShopDAO
import com.jarzasa.madridshops.repository.model.ShopEntity
import org.junit.Assert.assertTrue
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class ShopDAOTest {

    val appContext = InstrumentationRegistry.getTargetContext()
    val dbHelper = build(appContext, "mydb.sqlite", 1)

    @Test
    @Throws(Exception::class)
    fun given_valid_shop_it_gets_inserted_correctly() {

        val shop = ShopEntity(1,
                1,
                "MyShop",
                "",
                1.0f,
                2.0f,
                "",
                "",
                "",
                "")

        val shopEntityDao = ShopDAO(dbHelper)

        val id = shopEntityDao.insert(shop)

        assertTrue( id > 0 )

    }
}
