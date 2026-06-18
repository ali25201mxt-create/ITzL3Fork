still working on it guys please wait
package com.movtery.zalithlauncher.game.renderer.renderers

import com.movtery.zalithlauncher.game.renderer.RendererInterface

object F3LBetaRenderer : RendererInterface {
    override fun getRendererId(): String = "opengles3"

    override fun getUniqueIdentifier(): String = "8b52d82d-8f6d-4d3a-a767-dc93f8b72fc7"

    override fun getRendererName(): String = "F3Lbeta"

    override fun getMaxMCVersion(): String = "1.26"

    override fun getRendererEnv(): Lazy<Map<String, String>> = lazy { mapOf("MESA_GL_VERSION_OVERRIDE" to "4.6", "MESA_GLSL_VERSION_OVERRIDE" to "460") }

    override fun getDlopenLibrary(): Lazy<List<String>> = lazy { emptyList() }

    override fun getRendererLibrary(): String = "libgl4es_114.so"
}
