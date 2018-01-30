package com.jarzasa.madridshops.domain.interactor

import com.jarzasa.madridshops.domain.model.Shops

typealias SuccessClosure = (shops: Shops) -> Unit
typealias ErrorClosure = (msg: String) -> Unit
typealias CodeClosure = () -> Unit
