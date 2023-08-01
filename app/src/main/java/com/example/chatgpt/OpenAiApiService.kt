package com.example.chatgpt

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface OpenAiApiService {
    @Headers("Content-Type: application/json")
    @POST("engines/davinci-codex/completions")
    suspend fun getCompletion(
        @Header("Authorization") apiKey: String,
        @Body request: CompletionRequest
    ): Response<CompletionResponse>
}

data class CompletionRequest(val prompt: String, val maxTokens: Int)
data class CompletionResponse(val choices: List<CompletionChoice>)
data class CompletionChoice(val text: String)
