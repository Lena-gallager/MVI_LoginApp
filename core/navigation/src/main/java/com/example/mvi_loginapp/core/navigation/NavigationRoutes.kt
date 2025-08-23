package com.example.mvi_loginapp.core.navigation

//TODO хрень. Оосбенно если у нас будет 100 экранов. Но это было сделано потому что изначально
// каждый route задавался в модуле :feature:**:api но если например :feature:loginscreen:api должен навигироваться на registerscreen (:feature:registerscreen:api)
// иии :feature:registerscreen:api должен навигироваться на логин (:feature:loginscreen:api) то получается циклическая зависимость...
object NavigationRoutes {

    const val LOGIN = "LOGIN"
    const val REGISTER = "REGISTER"
    const val ON_BOARDING = "ON_BOARDING"
    const val SPLASH = "SPLASH"
}
