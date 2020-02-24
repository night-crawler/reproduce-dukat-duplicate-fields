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

typealias Normalizer = (value: Any, previousValue: Any, allValues: Any, previousAllValues: Any) -> Any

typealias Formatter = (value: Any, name: String) -> Any

typealias Parser = (value: Any, name: String) -> Any

typealias Validator = (value: Any, allValues: Any, props: Any, name: Any) -> Any

typealias EventHandler<Event> = (event: Event, name: String) -> Unit

typealias EventWithDataHandler<Event> = (event: Event, newValue: Any, previousValue: Any, name: String) -> Unit

external interface EventOrValueHandler<Event> : EventHandler<Event> {
    @nativeInvoke
    operator fun invoke(value: Any)
}

external interface CommonFieldInputProps {
    var name: String
    var onDragStart: EventHandler<DragEvent<Any>>
    var onDrop: EventHandler<DragEvent<Any>>
    var onFocus: EventHandler<FocusEvent<Any>>
}

external interface CommonFieldProps : CommonFieldInputProps {
    var onBlur: EventWithDataHandler<FocusEvent<Any>>
    var onChange: EventWithDataHandler<ChangeEvent<Any>>
}

external interface BaseFieldProps<P> : Partial<CommonFieldProps> {
    var name: String
    var component: dynamic /* ComponentType<WrappedFieldProps /* WrappedFieldProps & P */> | "input" | "select" | "textarea" */
        get() = definedExternally
        set(value) = definedExternally
    var format: Formatter?
        get() = definedExternally
        set(value) = definedExternally
    var normalize: Normalizer?
        get() = definedExternally
        set(value) = definedExternally
    var props: P?
        get() = definedExternally
        set(value) = definedExternally
    var parse: Parser?
        get() = definedExternally
        set(value) = definedExternally
    var validate: dynamic /* Validator | Array<Validator> */
        get() = definedExternally
        set(value) = definedExternally
    var warn: dynamic /* Validator | Array<Validator> */
        get() = definedExternally
        set(value) = definedExternally
    var forwardRef: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var immutableProps: Array<String>?
        get() = definedExternally
        set(value) = definedExternally
}

external interface GenericField<P> : Component<BaseFieldProps<P> /* BaseFieldProps<P> & P */> {
    var dirty: Boolean
    var name: String
    var pristine: Boolean
    var value: Any
    fun getRenderedComponent(): Component<WrappedFieldProps /* WrappedFieldProps & P */>
}

external open class Field<P> : Component<P> {
    open var dirty: Boolean
    open var name: String
    open var pristine: Boolean
    open var value: Any
    open fun getRenderedComponent(): Component<WrappedFieldProps /* WrappedFieldProps & P */>
}

external interface WrappedFieldProps {
    var input: WrappedFieldInputProps
    var meta: WrappedFieldMetaProps
}

external interface WrappedFieldInputProps : CommonFieldInputProps {
    var checked: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var value: Any
    var onBlur: EventOrValueHandler<FocusEvent<Any>>
    var onChange: EventOrValueHandler<ChangeEvent<Any>>
}

external interface WrappedFieldMetaProps {
    var active: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var autofilled: Boolean
    var asyncValidating: Boolean
    var dirty: Boolean
    var dispatch: Any
    var error: Any?
        get() = definedExternally
        set(value) = definedExternally
    var form: String
    var initial: Any
    var invalid: Boolean
    var pristine: Boolean
    var submitting: Boolean
    var submitFailed: Boolean
    var touched: Boolean
    var valid: Boolean
    var visited: Boolean
    var warning: Any?
        get() = definedExternally
        set(value) = definedExternally
}