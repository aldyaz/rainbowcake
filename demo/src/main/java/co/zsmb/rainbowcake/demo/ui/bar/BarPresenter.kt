package co.zsmb.rainbowcake.demo.ui.bar

import co.zsmb.rainbowcake.withIOContext
import javax.inject.Inject

class BarPresenter @Inject constructor() {

    suspend fun getData(): String = withIOContext {
        ""
    }

}
