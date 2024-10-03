package com.example.collectasstate

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch

class CounterViewModel : ViewModel() {

    private val _counter = MutableStateFlow(0)
    val counter: Flow<Int> = _counter

//    init {
//        // Simulating an increment every second
//        viewModelScope.launch {
//            while (true) {
//                delay(1000)
//                _counter.update { it + 1 }
//            }
//        }
//    }

    fun incrementCounter() {
        _counter.value++
    }
}