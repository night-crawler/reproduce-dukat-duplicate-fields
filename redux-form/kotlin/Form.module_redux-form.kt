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

external interface FormSubmitProp<FormData, P, ErrorType> {
    var onSubmit: FormSubmitHandler<FormData, P, ErrorType>?
        get() = definedExternally
        set(value) = definedExternally
}

external open class GenericForm<FormData, P, ErrorType> : Component<Omit<FormHTMLAttributes<HTMLFormElement>, String /* "onSubmit" */> /* Omit<FormHTMLAttributes<HTMLFormElement>, String /* "onSubmit" */> & FormSubmitProp<FormData, P, ErrorType> */>

external open class Form<FormData, P, ErrorType> : Component<Omit<FormHTMLAttributes<HTMLFormElement>, String /* "onSubmit" */> /* Omit<FormHTMLAttributes<HTMLFormElement>, String /* "onSubmit" */> & FormSubmitProp<FormData, P, ErrorType> */>, GenericForm<FormData, P, ErrorType>