package io.github.easy.prompt.core.api.fake

import io.github.easy.prompt.core.api.model.invoke.PromptInvokeParam
import io.github.easy.prompt.core.api.model.template.ChatCompletion
import io.github.easy.prompt.core.api.model.template.HistoryChats
import io.github.easy.prompt.core.infrastructure.provider.ILLMClient
import io.github.easy.prompt.core.infrastructure.provider.StreamingHandler

class FakeLLMChatClient : ILLMClient {

    override fun invoke(
        systemPrompts: List<String>,
        fullPrompt: String,
        historyChats: HistoryChats,
        promptInvokeParam: PromptInvokeParam,
        streamingHandler: StreamingHandler
    ): ChatCompletion {

        return ChatCompletion(
            chatModel = "model name", prompt = fullPrompt,
            answer = "fake answer", reasoning = "fake reasoning", images = emptyList()
        )
    }

    override fun providerName() = "fake"

}