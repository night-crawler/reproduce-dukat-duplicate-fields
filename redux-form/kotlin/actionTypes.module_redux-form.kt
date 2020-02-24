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

external interface ActionTypes {
    var ARRAY_INSERT: String
    var ARRAY_MOVE: String
    var ARRAY_POP: String
    var ARRAY_PUSH: String
    var ARRAY_REMOVE: String
    var ARRAY_REMOVE_ALL: String
    var ARRAY_SHIFT: String
    var ARRAY_SPLICE: String
    var ARRAY_UNSHIFT: String
    var ARRAY_SWAP: String
    var AUTOFILL: String
    var BLUR: String
    var CHANGE: String
    var CLEAR_SUBMIT: String
    var CLEAR_SUBMIT_ERRORS: String
    var CLEAR_ASYNC_ERROR: String
    var CLEAR_FIELDS: String
    var DESTROY: String
    var FOCUS: String
    var INITIALIZE: String
    var REGISTER_FIELD: String
    var RESET: String
    var RESET_SECTION: String
    var SET_SUBMIT_FAILED: String
    var SET_SUBMIT_SUCCEEDED: String
    var START_ASYNC_VALIDATION: String
    var START_SUBMIT: String
    var STOP_ASYNC_VALIDATION: String
    var STOP_SUBMIT: String
    var SUBMIT: String
    var TOUCH: String
    var UNREGISTER_FIELD: String
    var UNTOUCH: String
    var UPDATE_SYNC_ERRORS: String
    var UPDATE_SYNC_WARNINGS: String
}

external var actionTypes: ActionTypes