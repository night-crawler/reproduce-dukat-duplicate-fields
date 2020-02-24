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

external interface `T$1` {
    @nativeGetter
    operator fun get(name: String): dynamic /* Validator | Array<Validator> */
    @nativeSetter
    operator fun set(name: String, value: Validator)
    @nativeSetter
    operator fun set(name: String, value: Array<Validator>)
}

external interface BaseFieldsProps<P> {
    var names: Array<String>
    var component: Any?
        get() = definedExternally
        set(value) = definedExternally
    var format: Formatter?
        get() = definedExternally
        set(value) = definedExternally
    var props: P?
        get() = definedExternally
        set(value) = definedExternally
    var parse: Parser?
        get() = definedExternally
        set(value) = definedExternally
    var forwardRef: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var validate: dynamic /* Validator | Array<Validator> | `T$1` */
        get() = definedExternally
        set(value) = definedExternally
    var warn: dynamic /* Validator | Array<Validator> | `T$1` */
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenericFields<P> : Component<BaseFieldsProps<P> /* BaseFieldsProps<P> & P */> {
    var dirty: Boolean
    var names: Array<String>
    var pristine: Boolean
    var values: Json
    fun getRenderedComponent(): Component<BaseFieldsProps<Any> /* BaseFieldsProps<Any> & WrappedFieldsProps & P */>
}

external open class Fields<P> : Component<BaseFieldsProps<P> /* BaseFieldsProps<P> & P */>, GenericFields<P> {
    override var dirty: Boolean
    override var names: Array<String>
    override var pristine: Boolean
    override var values: Json
    override fun getRenderedComponent(): Component<BaseFieldsProps<Any> /* BaseFieldsProps<Any> & WrappedFieldsProps & P */>
}

external interface WrappedFieldsProps {
    @nativeGetter
    operator fun get(name: String): WrappedFieldsProps /* WrappedFieldsProps & WrappedFieldProps */
    @nativeSetter
    operator fun set(name: String, value: WrappedFieldsProps /* WrappedFieldsProps & WrappedFieldProps */)
}