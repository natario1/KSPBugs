package io.deepmedia.tools.testing

import com.google.devtools.ksp.processing.*

class AnGeneratorProvider : SymbolProcessorProvider {
    override fun create(environment: SymbolProcessorEnvironment): SymbolProcessor {
        return AnGenerator(environment.codeGenerator, environment.logger)
    }
}