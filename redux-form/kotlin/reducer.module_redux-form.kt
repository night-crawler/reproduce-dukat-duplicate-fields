@file:JsModule("redux-form")
@file:JsNonModule
@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS", "EXTERNAL_DELEGATION")

import kotlin.js.*
import kotlin.js.Json
import org.khronos.webgl.*
import org.w3c.dom.*
import org.w3c.dom.events.*
import org.w3c.dom.parsing.*
import org.w3c.dom.svg.*
import org.w3c.dom.url.*
import org.w3c.fetch.*
import org.w3c.files.*
import org.w3c.notifications.*
import org.w3c.performance.*
import org.w3c.workers.*
import org.w3c.xhr.*

external interface FormReducer : Reducer<FormStateMap> {
    fun plugin(reducers: FormReducerMapObject): Reducer<FormStateMap>
}

@JsName("default")
external var reducer: FormReducer

external interface FormReducerMapObject {
    @nativeGetter
    operator fun get(formName: String): Reducer<Any>?
    @nativeSetter
    operator fun set(formName: String, value: Reducer<Any>)
}

external interface FormStateMap {
    @nativeGetter
    operator fun get(formName: String): FormState?
    @nativeSetter
    operator fun set(formName: String, value: FormState)
}

external interface `T$4` {
    @nativeGetter
    operator fun get(name: String): FieldState?
    @nativeSetter
    operator fun set(name: String, value: FieldState)
}

external interface `T$5` {
    @nativeGetter
    operator fun get(fieldName: String): String?
    @nativeSetter
    operator fun set(fieldName: String, value: String)
}

external interface FormState {
    var registeredFields: Array<RegisteredFieldState>
    var fields: `T$4`?
        get() = definedExternally
        set(value) = definedExternally
    var values: Json?
        get() = definedExternally
        set(value) = definedExternally
    var active: String?
        get() = definedExternally
        set(value) = definedExternally
    var anyTouched: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var error: Any?
        get() = definedExternally
        set(value) = definedExternally
    var submitting: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var submitErrors: `T$5`?
        get() = definedExternally
        set(value) = definedExternally
    var submitFailed: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external interface FieldState {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var touched: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var visited: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}