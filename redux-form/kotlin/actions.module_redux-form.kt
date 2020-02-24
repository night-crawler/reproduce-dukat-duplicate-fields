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

external interface FormAction : Action {
    var meta: Any?
        get() = definedExternally
        set(value) = definedExternally
    var payload: Any?
        get() = definedExternally
        set(value) = definedExternally
    var error: Any?
        get() = definedExternally
        set(value) = definedExternally
}

external fun arrayInsert(form: String, field: String, index: Number, value: Any): FormAction

external fun arrayMove(form: String, field: String, from: Number, to: Number): FormAction

external fun arrayPop(form: String, field: String): FormAction

external fun arrayPush(form: String, field: String, value: Any): FormAction

external fun arrayRemove(form: String, field: String, index: Number): FormAction

external fun arrayRemoveAll(form: String, field: String): FormAction

external fun arrayShift(form: String, field: String): FormAction

external fun arraySplice(form: String, field: String, index: Number, removeNum: Number, value: Any): FormAction

external fun arraySwap(form: String, field: String, indexA: Number, indexB: Number): FormAction

external fun arrayUnshift(form: String, field: String, value: Any): FormAction

external fun autofill(form: String, field: String, value: Any): FormAction

external fun blur(form: String, field: String, value: Any, touch: Boolean = definedExternally): FormAction

external fun change(form: String, field: String, value: Any, touch: Boolean = definedExternally, persistentSubmitErrors: Boolean = definedExternally): FormAction

external fun destroy(vararg form: String): FormAction

external fun focus(form: String, field: String): FormAction

external interface InitializeOptions {
    var keepDirty: Boolean
    var keepSubmitSucceeded: Boolean
    var updateUnregisteredFields: Boolean
    var keepValues: Boolean
}

external interface InitializeOptionsPartial {
    var keepDirty: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepSubmitSucceeded: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var updateUnregisteredFields: Boolean?
        get() = definedExternally
        set(value) = definedExternally
    var keepValues: Boolean?
        get() = definedExternally
        set(value) = definedExternally
}

external fun initialize(form: String, data: Any, keepDirty: Boolean = definedExternally, options: InitializeOptionsPartial = definedExternally): FormAction

external fun initialize(form: String, data: Any, options: InitializeOptionsPartial = definedExternally): FormAction

external fun registerField(form: String, name: String, type: FieldType): FormAction

external fun reset(form: String): FormAction

external fun resetSection(form: String, vararg sections: String): FormAction

external fun startAsyncValidation(form: String): FormAction

external fun stopAsyncValidation(form: String, errors: FormErrors<Any, Any> = definedExternally): FormAction

external fun setSubmitFailed(form: String, vararg fields: String): FormAction

external fun setSubmitSucceeded(form: String, vararg fields: String): FormAction

external fun startSubmit(form: String): FormAction

external fun stopSubmit(form: String, errors: FormErrors<Any, Any> = definedExternally): FormAction

external fun submit(form: String): FormAction

external fun clearSubmit(form: String): FormAction

external fun clearSubmitErrors(form: String): FormAction

external fun clearAsyncError(form: String, field: String): FormAction

external fun clearFields(form: String, keepTouched: Boolean, persistentSubmitErrors: Boolean, vararg fields: String): FormAction

external fun touch(form: String, vararg fields: String): FormAction

external fun unregisterField(form: String, name: String): FormAction

external fun untouch(form: String, vararg fields: String): FormAction

external fun <T> updateSyncErrors(from: String, syncErrors: FormErrors<Any, T>, error: T): FormAction

external fun <T> updateSyncWarnings(form: String, syncWarnings: FormWarnings<Any, T>, warning: T): FormAction

external object actions {
    var arrayInsert: Any
    var arrayMove: Any
    var arrayPop: Any
    var arrayPush: Any
    var arrayRemove: Any
    var arrayRemoveAll: Any
    var arrayShift: Any
    var arraySplice: Any
    var arraySwap: Any
    var arrayUnshift: Any
    var autofill: Any
    var blur: Any
    var change: Any
    var clearSubmit: Any
    var clearSubmitErrors: Any
    var clearAsyncError: Any
    var clearFields: Any
    var destroy: Any
    var focus: Any
    var initialize: Any
    var registerField: Any
    var reset: Any
    var startAsyncValidation: Any
    var startSubmit: Any
    var stopAsyncValidation: Any
    var stopSubmit: Any
    var submit: Any
    var setSubmitFailed: Any
    var setSubmitSucceeded: Any
    var touch: Any
    var unregisterField: Any
    var untouch: Any
    var updateSyncErrors: Any
    var updateSyncWarnings: Any
}